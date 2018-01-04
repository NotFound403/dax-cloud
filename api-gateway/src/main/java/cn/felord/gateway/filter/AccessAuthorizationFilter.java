package cn.felord.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import cn.felord.common.entity.jwt.Claims;
import cn.felord.feign.api.securityserver.Auth;
import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 调用鉴权过滤器
 *
 * @author dax.
 * @version v1.0
 * @see FilterConstants#PRE_TYPE FilterConstants
 * @since 2017 /11/22 10:13
 */
@Component
public class AccessAuthorizationFilter extends ZuulFilter {


    private static final long REFRESH_TIME = 1000 * 60 * 30;
    @Resource
    private Auth auth;

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String token = request.getHeader("Authorization");

        if (StringUtils.isNotEmpty(token) && auth.verify(token)) {
            Claims claims = auth.claims(token);

            long iat = claims.getIat();
            long expired = claims.getExpired();
//            不失效
            if (expired == 0) {
                reqContext(requestContext, true, HttpStatus.OK, true);
                return null;
            }
            long now = System.currentTimeMillis();
            long exp = iat + expired;
            if (exp > now) {
                //                 过期
                reqContext(requestContext, HttpStatus.REQUEST_TIMEOUT);
                return null;
            }
            String uri = request.getRequestURI();

//todo


        } else {
            // 过滤该请求，不对其进行路由
            reqContext(requestContext, HttpStatus.UNAUTHORIZED);
        }

        return null;
    }


    /**
     * Req context.
     *
     * @param requestContext the request context
     * @param isResponse     是否要进行路由
     * @param httpStatus     http 状态码
     * @param isSuccess      设值，让下一个Filter看到上一个Filter的状态
     */
    private void reqContext(RequestContext requestContext, boolean isResponse, HttpStatus httpStatus, boolean isSuccess) {
        requestContext.setSendZuulResponse(isResponse);
        // 返回错误码
        requestContext.setResponseStatusCode(httpStatus.value());
        // 返回错误内容
        requestContext.setResponseBody(httpStatus.getReasonPhrase());
        requestContext.set("isSuccess", isSuccess);
    }

    private void reqContext(RequestContext requestContext, HttpStatus httpStatus) {
        reqContext(requestContext, false, httpStatus, false);
    }
}

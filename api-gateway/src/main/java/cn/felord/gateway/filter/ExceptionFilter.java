package cn.felord.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import cn.felord.gateway.enums.ErrorEnums;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;

/**
 * 异常
 *
 * @author dax.
 * @version v1.0
 * @since 2017/11/22 11:54
 */
@Component
public class ExceptionFilter extends ZuulFilter {
    private static final Logger log = LoggerFactory.getLogger(ExceptionFilter.class);


    @Override
    public String filterType() {
//        ERROR 阶段 无法处理 POST阶段异常  POST异常单独处理
        return FilterConstants.ERROR_TYPE;
    }

    @Override
    public int filterOrder() {
        return 10;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext= RequestContext.getCurrentContext();
        Throwable e = requestContext.getThrowable();

        log.debug("api gateway request error: {}", e.getCause().getMessage());

        requestContext.set(ErrorEnums.ERROR_STATUS_CODE.getKey(), HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        requestContext.set(ErrorEnums.ERROR_EXCEPTION.getKey(), e.getCause());
        return null;
    }
}

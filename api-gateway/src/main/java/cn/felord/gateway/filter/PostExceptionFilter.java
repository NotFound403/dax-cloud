package cn.felord.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.cloud.netflix.zuul.filters.post.SendErrorFilter;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import java.util.Objects;

import static cn.felord.gateway.filter.ExpandProcessZuulFilter.POST_FAIL_FILTER_KEY;

/**
 * POST阶段异常处理过滤器
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/22 14:29
 */
@Component
public class PostExceptionFilter extends SendErrorFilter {


    @Override
    public String filterType() {
        return FilterConstants.ERROR_TYPE;
    }

    @Override
    public int filterOrder() {
        return 30;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext requestContext= RequestContext.getCurrentContext();

//        用来处理POST阶段异常
           ZuulFilter  failedFilter= (ZuulFilter) requestContext.get(POST_FAIL_FILTER_KEY);
        return Objects.nonNull(failedFilter) && FilterConstants.POST_TYPE.equals(failedFilter.filterType());
    }
}

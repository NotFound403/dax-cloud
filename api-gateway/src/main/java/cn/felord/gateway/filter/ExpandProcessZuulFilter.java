package cn.felord.gateway.filter;

import com.netflix.zuul.FilterProcessor;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * 扩展 过滤器处理器
 *
 * @author dax.
 * @version v1.0
 * @since 2017/11/22 14:37
 */
@Component
public class ExpandProcessZuulFilter extends FilterProcessor {
    static final String POST_FAIL_FILTER_KEY = "post.failedFilter";



    @Override
    public Object processZuulFilter(ZuulFilter filter) throws ZuulException {
        RequestContext requestContext= RequestContext.getCurrentContext();
        try {
            return super.processZuulFilter(filter);
        } catch (ZuulException e) {
            if (FilterConstants.POST_TYPE.equals(filter.filterType())) {
                requestContext.set(POST_FAIL_FILTER_KEY, filter);
            }
            throw e;
        }

    }
}

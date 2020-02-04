package com.imooc.ad.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * Created by Qinyi.
 */
@Slf4j
@Component
public class PreRequestFilter extends ZuulFilter {

    //确定过滤器的执行位置
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }
    //确定过滤器的执行顺序，数字越小越早执行
    @Override
    public int filterOrder() {
        return 0;
    }
    //确定过滤器是否执行
    @Override
    public boolean shouldFilter() {
        return true;
    }
    //执行的具体内容
    @Override
    public Object run() throws ZuulException {

        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.set("startTime", System.currentTimeMillis());

        return null;
    }
}

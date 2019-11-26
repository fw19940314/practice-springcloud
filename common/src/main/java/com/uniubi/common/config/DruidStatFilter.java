package com.uniubi.common.config;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/20
 * @Description:
 */
@WebFilter(filterName="druidWebStatFilter",urlPatterns="/*",
        initParams={
                @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")// 忽略资源
        })
public class DruidStatFilter extends WebStatFilter {
}

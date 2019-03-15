/**
 * Copyright (c) 2018 今遇良缘 All rights reserved.
 *
 * https://www.jylyhj.cn
 *
 * 版权所有，侵权必究！
 */package com.jyly.commons.dynamic.datasource.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 多数据源
 *
 * @author zhouhua
 * @since 1.0.0
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicContextHolder.peek();
    }

}

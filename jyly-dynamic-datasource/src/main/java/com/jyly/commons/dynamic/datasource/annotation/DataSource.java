/**
 * Copyright (c) 2018 今遇良缘 All rights reserved.
 *
 * https://www.jylyhj.cn
 *
 * 版权所有，侵权必究！
 */package com.jyly.commons.dynamic.datasource.annotation;

import java.lang.annotation.*;

/**
 * 多数据源注解
 *
 * @author zhouhua
 * @since 1.0.0
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface DataSource {
    String value() default "";
}

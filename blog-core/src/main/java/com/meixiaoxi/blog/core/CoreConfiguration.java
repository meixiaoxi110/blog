package com.meixiaoxi.blog.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Copyright: Copyright (c) 2018 meixiaoxi
 *
 * @ClassName: MybatisConfigaration
 * @Description:
 * @version: v1.0.0
 * @author: meixiaoxi
 * @date: 2019-03-20 15:47:40
 * Modification History:
 * Date          Author          Version          Description
 * -----------------------------------------------------------
 * 2019-03-20    meixiaoxi       v1.0.0           创建
 */
@Configuration
@ComponentScan(basePackages = "com.meixiaoxi.blog.core")
@EnableTransactionManagement
@MapperScan(basePackages = "com.meixiaoxi.blog.core.dao")
public class CoreConfiguration {
}

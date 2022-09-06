package com.econage.runner.config;

import com.econage.cornerstone.db.ecobatis.annotations.MapperScan;
import com.econage.project.ProjectPackage;
import com.flowyun.cornerstone.web.client.rest.annotations.RestProxyScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
* 需要编写项目定制逻辑时，取消下方注释
* */
@ComponentScan(basePackageClasses = {ProjectPackage.class})
@RestProxyScan(basePackageClasses = {ProjectPackage.class})
@MapperScan(basePackageClasses = {ProjectPackage.class})
@Configuration(proxyBeanMethods = false)
public class ProjectConfiguration {

}

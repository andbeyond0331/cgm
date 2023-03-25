package com.cgm.cgm.config;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
public class DBConfig {

	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

//	@Bean
//	@ConfigurationProperties(prefix = "spring.datasource.hikari")
//	public HikariConfig hikariConfig() {
//		return new HikariConfig();
//	}
//
//	@Bean
//	public DataSource dataSource() {
//		DataSource dataSource = new HikariDataSource(hikariConfig());
//		System.out.println("dataSource: " + dataSource);
//		return dataSource;
//	}
//
//	@Bean
//	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
//		System.out.println("DatabaseConfig sqlSessionFactory");
//		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//		sqlSessionFactoryBean.setDataSource(dataSource);
//
//		Resource[] arrResource = new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml");
//		sqlSessionFactoryBean.setMapperLocations(arrResource);
//
//		sqlSessionFactoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
//
//		return (SqlSessionFactory) sqlSessionFactoryBean.getObject();
//	}
//
//	@Bean
//	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
//		return new SqlSessionTemplate(sqlSessionFactory);
//	}
}

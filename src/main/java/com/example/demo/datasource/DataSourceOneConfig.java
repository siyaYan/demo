package com.example.demo.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @Params: jdbcTemplate config & mybatis mapper config
 * @Author: Siya(Xiran) Yan
 * @Date: 11:08 1/12/20
 */
@Configuration
@MapperScan(basePackages = "com.example.demo.mapper.one", sqlSessionFactoryRef = "oneSqlSessionFactory")
public class DataSourceOneConfig {
    @Bean(name = "oneDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.one")
    public DataSource getDateSourceOne() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "oneSqlSessionFactory")
    @Primary
    public SqlSessionFactory oneSqlSessionFactory(@Qualifier("oneDataSource") DataSource datasource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(datasource);
        bean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/one/*.xml"));
        return bean.getObject();
    }

    //
    @Bean("oneTemplate")
    @Primary
    public JdbcTemplate oneTemplate(
            @Qualifier("oneDataSource") DataSource datasource) {
        return new JdbcTemplate(datasource);
    }
}

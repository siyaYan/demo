package com.example.demo.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @Params: jdbcTemplate config & mybatis mapper config
 * @Author: Siya(Xiran) Yan
 * @Date: 10:59 1/12/20
 */
@Configuration
@MapperScan(basePackages = "com.example.demo.mapper.two", sqlSessionFactoryRef = "twoSqlSessionFactory")
public class DataSourceTwoConfig {
    /**
     * error cause by build datasource, the HikariDataSource.class format, can't read data form properties
     */
    @Bean(name = "twoDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.two")
    public DataSource getDateSourceTwo(DataSourceProperties properties) {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "twoSqlSessionFactory")
    public SqlSessionFactory twoSqlSessionFactory(@Qualifier("twoDataSource") DataSource datasource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(datasource);
        bean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/two/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "twoTemplate")
    public JdbcTemplate twoTemplate(
            @Qualifier("twoDataSource") DataSource datasource) {
        return new JdbcTemplate(datasource);
    }
}
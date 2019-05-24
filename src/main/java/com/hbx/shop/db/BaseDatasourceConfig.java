package com.hbx.shop.db;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


@Configuration
public class BaseDatasourceConfig {

    @Bean(name = "baseDatasource")
    @ConfigurationProperties(prefix = "spring.datasource.activity")
    public DataSource  dataSource(){
        return DataSourceBuilder.create().type(DruidDataSource.class).build();

    }

    @Bean(name = "baseSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("baseDatasource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean.getObject();
    }


    @Bean(name = "baseDataSourceTransactionmanager")
    public DataSourceTransactionManager dataSourceTransactionManager(@Qualifier("baseDatasource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }


    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("baseSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }





}

package com.paaulooo.nex.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class MySQLConnection {

    @Bean
    public DataSource dataSource() {
        String driverClass =  "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/nexdb";
        String user = "root";
        String password = "password";
        return DataSourceBuilder.create()
                .driverClassName(driverClass)
                .url(url)
                .username(user)
                .password(password).
                build();
    }
}

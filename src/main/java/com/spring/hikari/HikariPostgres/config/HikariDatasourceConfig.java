package com.spring.hikari.HikariPostgres.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
@ConfigurationProperties(value = "spring.datasource")
public class HikariDatasourceConfig {

    private String url;
    private String username;
    private String password;

    @Bean
    public HikariDataSource hikariConfig() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setUsername(username);
        hikariConfig.setPassword(password);
        hikariConfig.setJdbcUrl(url);
        hikariConfig.setConnectionTestQuery("SELECT 1");
        hikariConfig.setConnectionTimeout(300000);
        hikariConfig.setMinimumIdle(3);
        hikariConfig.setMaximumPoolSize(10);
        return new HikariDataSource(hikariConfig);
    }

}

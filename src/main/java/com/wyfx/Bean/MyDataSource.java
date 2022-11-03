package com.wyfx.Bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "datasource")
public class MyDataSource {
    private String password;
    private String type;
    private String username;
    private String driverClassName;
    private String url;

}

package com.xinbo.cloud.sharding.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 熊二
 * @date 2020/3/30 17:40
 * @desc file desc
 */

@MapperScan(basePackages = "com.xinbo.cloud")
@SpringBootApplication(scanBasePackages = "com.xinbo.cloud")
@EnableSwagger2
public class CloudShardingTestApplication {
    public static void main(String[] args) {

        SpringApplication.run(CloudShardingTestApplication.class, args);

    }
}

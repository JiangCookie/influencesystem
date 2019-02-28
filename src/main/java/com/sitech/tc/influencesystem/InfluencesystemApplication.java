package com.sitech.tc.influencesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.sitech.tc.influencesystem.mapper")
public class InfluencesystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfluencesystemApplication.class, args);
    }


}

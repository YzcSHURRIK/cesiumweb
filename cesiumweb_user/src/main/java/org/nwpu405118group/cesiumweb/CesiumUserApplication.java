package org.nwpu405118group.cesiumweb;

import org.nwpu405118group.cesiumweb.service.utils.IdWorker;
import org.nwpu405118group.cesiumweb.service.utils.JwtUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CesiumUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(CesiumUserApplication.class);
    }

    @Bean
    public IdWorker idWorker() {
        return new IdWorker();
    }

    @Bean
    public JwtUtil jwtUtil() {
        return new JwtUtil();
    }
}

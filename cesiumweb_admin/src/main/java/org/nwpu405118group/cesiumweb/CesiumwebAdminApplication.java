package org.nwpu405118group.cesiumweb;


import org.nwpu405118group.cesiumweb.service.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CesiumwebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(CesiumwebAdminApplication.class, args);
    }

    @Bean
    public IdWorker idWorker() {
        return new IdWorker();
    }
}

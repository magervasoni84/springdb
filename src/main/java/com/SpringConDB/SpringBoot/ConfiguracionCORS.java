//
//package com.SpringConDB.SpringBoot;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//
//@Configuration
//public class ConfiguracionCORS {
//    
//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurerAdapter() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry){
//                registry.addMapping("/**")
//                        .allowedMethods("HEAD","GET", "PUT", "POST", "DELETE", "PATCH","OPTIONS")
//                        .allowedOrigins("*")
//                        //.allowedHeaders("Content-Type", "X-Requested-With", "remember-me", "Authorization")
//                        .allowedHeaders("*")
//                        //.alloCredentials(false)
//                        //.exposedHeaders("Access-Control-Allow-Origin:*")
//                        ;
//            }
//        };
//    }
//}

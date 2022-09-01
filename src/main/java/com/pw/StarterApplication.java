package com.pw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @ClassName StarterApplication
 * @Date 2022/8/23 8:24
 * @Author pengwei
 **/
@SpringBootApplication
public class StarterApplication extends SpringBootServletInitializer {
    private static Logger logger= LoggerFactory.getLogger(StarterApplication.class);
    public static void main(String[] args) {
        //SpringApplication.run(StarterApplication.class);
        SpringApplication springApplication=new SpringApplication(StarterApplication .class);
        // 设置banner 图标关闭
        springApplication.setBannerMode(Banner.Mode.OFF);
        logger.info("springboot项目启动。。。。");
        springApplication.run();
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(StarterApplication.class);
    }
}

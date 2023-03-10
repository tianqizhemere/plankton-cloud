package vip.plankton.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vip.plankton.cloud.handler.GlobalExceptionHandler;

/**
 * 网关配置
 *
 * @author Wukh
 * @create 2023-03-09
 */
@Configuration
public class GatewayConfiguration {

    @Bean
    public GlobalExceptionHandler globalExceptionHandler() {
        return new GlobalExceptionHandler();
    }
}

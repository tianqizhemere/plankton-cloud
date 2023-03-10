package vip.plankton.cloud.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * 网关配置文件
 *
 * @author Wukh
 * @create 2023-03-09
 */
@Data
// 刷新配置
@RefreshScope
@Configuration
@ConfigurationProperties(value = "gateway")
public class GatewayConfigProperties {

    /**
     * 放行白名单配置，网关不校验此处的白名单
     */
    private List<String> whites;
}

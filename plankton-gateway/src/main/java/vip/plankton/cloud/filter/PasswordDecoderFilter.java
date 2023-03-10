package vip.plankton.cloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;

/**
 * 密码解密 过滤器
 *
 * @author Wukh
 * @create 2023-03-09
 */
@Slf4j
public class PasswordDecoderFilter extends AbstractGatewayFilterFactory {
    @Override
    public GatewayFilter apply(Object config) {
        return null;
    }
}

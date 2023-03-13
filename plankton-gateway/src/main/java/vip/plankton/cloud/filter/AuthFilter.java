package vip.plankton.cloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import vip.plankton.cloud.config.GatewayConfigProperties;
import vip.plankton.cloud.starter.redis.util.RedisUtil;

import javax.annotation.Resource;

/**
 * 网关鉴权
 *
 * @author Wukh
 * @create 2023-03-09
 */
@Slf4j
@Component
public class AuthFilter implements GlobalFilter, Ordered {

    @Resource
    private GatewayConfigProperties gatewayConfigProperties;

    @Resource
    private RedisUtil redisUtil;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        return null;
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }
}

# 客户端调用超时时间
- 配置在zuul中，以Ribbon的超时时间为准
- 配置在普通微服务中，以Feign的超时时间为准
- hystrix监控
  ```shell
  打开：
    localhost:9001/hystrix
    填入监控地址：
    localhost:9001/actuator/hystrix.stream
```
- feign 调用源码解析(看源码，是否是如下逻辑)
    - 先从hystrix中判断目标接口是否熔断，熔断则调用降级服务，否则直接返回失败
    - 然后才从ribbon中获取一个负载均衡的实例，来发起实际的调用

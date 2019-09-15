### eureka 服务注册中心

[eureka 分区详解](https://segmentfault.com/a/1190000014107639)

* 服务注册中心启动脚本
```text
docker run --net=host -p 8761:8761 -d  --name myregister1 itmuch/register:0.0.1-SNAPSHOT
```

* spring cloud docker 容器跨宿主机网络访问
```text
微服务情况下,需要随时可以启动任意多个docker实例来进行分布式负载。(比如抢红包,活动秒杀等)
需要解决的问题如下:
多宿主机情况,即docker实例可以在多台机器上任意部署。 

//方案一
其实解决的方法很简单,就是把需要动态的值都当参数传递给spring boot 和 docker
docker run -d --name auxplat-helloworld --expose=6999 -p 6999:6999 -e "EUREKA_INSTANCE_IP-ADDRESS=100.100.20.214" -e "SERVER_PORT=6999" aux/auxplat-helloworld 
docker run -d --name auxplat-helloworld-1 --expose=6998-p 6998:6998-e "EUREKA_INSTANCE_IP-ADDRESS=100.100.20.214" -e "SERVER_PORT=6998" aux/auxplat-helloworld 
docker run -d --name auxplat-helloworld --expose=6999 -p 6999:6999 -e "EUREKA_INSTANCE_IP-ADDRESS=100.100.20.212" -e "SERVER_PORT=6999" aux/auxplat-helloworld 
前两条在 100.100.20.214 上 跑两个 6999 和 6998 的docker实例。

//方案二(指定注册中心的地址)
1、服务暴露端口
2、微服务注册到注册中心的时候使用宿主机的ip

eureka.instance.prefer-ip-address=true
# ip地址使用宿主机的ip
eureka.instance.instance-id=ip地址:端口
eureka:
  client:
    serviceUrl:
      defaultZone: http://192.168.31.86:8761/eureka/
  instance:
#instance-id: ${spring.cloud.client.ip-address}:${server.port}
    instance-id: http://192.168.31.86:${server.port}
    prefer-ip-address: true  
#下面一行就是众里寻她千百度的一行代码
    ip-address: 192.168.31.86



docker run -d --name account-service13 --expose=8762 -p 8762:8762 -e "EUREKA_INSTANCE_IP-ADDRESS=111.231.189.44" -e "SERVER_PORT=8761" itmuch/account-service:0.0.1-SNAPSHOT


docker run -d --name myregister14  --expose=8761 -p 8761:8761   itmuch/register:0.0.1-SNAPSHOT

```

* Eureka 注册失败
```text
1.问题一: registration status: 204?
   Eureka客户端（服务提供者/消费者）没有成功引入web的starter。
   如果pom文件中引入后，还需要真正被maven加载，程序才能真正引入
   


```



* 参考资料
[docker 部署 springcloud 服务中容器ip的问题 ](https://blog.csdn.net/xiaolinzi176/article/details/81535932)

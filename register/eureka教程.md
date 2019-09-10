### eureka 服务注册中心

[eureka 分区详解](https://segmentfault.com/a/1190000014107639)

* 服务注册中心启动脚本
```text
docker run --net=host -p 8761:8761 -d  --name myregister1 itmuch/register:0.0.1-SNAPSHOT
```

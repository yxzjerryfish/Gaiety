# Gaiety
​	Gaiety是一个基于Spring Cloud的微服务化的生活服务平台

### 说明

​	Gaiety本来应该是我在博彦科技给他们做的最后一个项目，后来腰斩了，由于总监架构水平不咋滴，所以这个项目只能说是一般，这里我就基于当时的一些想法自己用一些比较好的技术来实现这个东西~

​	当然，这个工程是我站在开发和技术经理的角度来思考一些东西，距离真实工程需要的Jenkins、docker、k8s等部署工具，以及Elasticsearch等日志分析工具，Zipkin等链路追踪，需运维自己搞~

1.0 版本用到的东西如下：

> 涉及技术：
>
> > Spring Boot 每个单体服务编写：
> >
> > >Spring Boot 涉及到的技术不再赘述，因为也列举不完，基本除了常用的web容器功能等外，还包含JPA，Schedule等
> >
> > Spring Cloud 负责服务框架：
> >
> > > Spring Cloud Eureka 注册中心
> > >
> > > Spring Cloud Feign 服务调用
> > >
> > > Spring Cloud Gateway 作为网关
> >
> > MySql 作为关系型数据库
> >
> > Redis 作为内存非关系型数据库
> >
> > Kafka 作为消息队列中间件
> >
> > 其他... 用到再说
> >
> 
> 前端部分等这个写完之后我用Vue来制作第一版的前端

后续跟进计划：

> 2.0 将基础架构由Spring Cloud Netflix迁徙到 Spring Cloud Alibaba 将前端部分由Vue更改为Angular
>
> 3.0 提供App部分，由C#实现


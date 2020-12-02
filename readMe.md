# Spring boot

## Component:
1. Spring(JAVA 企业级开发常用框架) 
2. Redis(数据结构服务器)
3. AspectJ(AOP 常用框架)
4. SSH/SSM(常用框架组合|逻辑分层、数据库) Strtus2 Spring Hibernate/SpringMVC Spring Mybatis

## Details
#### Mybatis (数据持久层框架）
#### Redis（Remote Dictionary Server )即远程字典服务
1. 是一个开源的使用ANSI C语言编写、支持网络、可基于内存亦可持久化的日志型、Key-Value数据库，并提供多种语言的API。
实现缓存机制
2. 打开Redis：./bin/redis-server etc/redis.conf
#### Session共享
1. 单点登录（SSO）是指在多个应用系统中，登录用户只需要登录验证一次就可以访问所有相互信任的应用系统，Redis Session共享是实现单点登录的一种方式。本文是通过Spring Boot框架集成Redis缓存来实现session共享的
2. 开启Session共享功能。使用此注解之后Session调用会自动通过Redis存储和获取。想要达到的目的，在其他的系统上只需要做同样的配置即可。
其中maxInactiveIntervalInSeconds参数是设置Session失效时，原Spring Boot的server.session.timeout属性不再生效。
3. Session是服务器端的一个key-value的数据结构，开发者经常把Session与cookie配合使用，用于保持登录用户的回话。
4. 第一次访问服务端时，服务端会响应一个sessionId并且本地cookie中，之后每次访问都会将cookie中的sessionId放入到请求头中去请求服务器。如果通过这个sessionid无法找到对应的值，那么服务器会创建一个新的sessionid并且响应给客户端。

- 使用Spring Boot Starters，那么默认使用的日志框架是Logback

#### MongoDB是一个开源的NoSQL文档数据库。
1. 存储多种数据结构，类似JSON的BSON，可以存储复杂数据类型。
2. 支持的查询语言非常强大，其语法类似面向对象的方式，可以实现类似关系数据库单表查询的绝大部分功能，而且还支持对数据建立索引。
3. 新建实现MongoRepository接口和直接使用MongoTemplate类两种方法。
4. 打开MongoDB：cd /usr/local/mongodb/bin   ./mongo 
5. 端口：http://localhost:27017/
6. Navicat premium 管理mysql和mongodb

#### Swagger是一个规范和完整的框架.
1. 用于生成、描述、调用和可视化 RESTful 风格的 Web 服务。
2. Swagger 可以根据不同的业务代码实现自动生成API文档，提供给前端调用方在线测试，且自动显示返回采纳数JSON格式的字符串，从而节省后端与前端人员的沟通与调试成本。
@Api：用在类上，说明该类的作用。以标记一个Controller类做为swagger文档资源
@ApiOperation：用在方法上，说明方法的作用，Url资源的定义
@ApiImplicitParams : 用在方法上包含一组参数说明。
@ApiImplicitParam：用来注解来给方法入参增加说明。
@ApiResponse：在@ApiResponses注解内，一般用于表达一个错误的响应信息

#### ElasticSearch是一个基于Lucene的搜索服务器
1. 它提供了一个分布式多用户能力的全文搜索引擎，基于RESTful web接口。Java语言开发的，开放源码发布，流行的企业级搜索引擎。
2. ElasticSearch能够做到实时搜索并且稳定，可靠。

# Spring Cloud

## Nacos
- Nacos是阿里巴巴开源的项目，是一个更易于帮助构建云原生应用的动态服务发现、配置管理和服务管理平台。英文全称 Dynamic Naming and Configuration Service，Na为naming/nameServer即注册中心,co为configuration即注册中心，service是指该注册/配置中心都是以服务为核心。
1. 动态配置服务：中心化、外部化和动态化的方式管理所有环境的配置。动态配置消除了配置变更时重新部署应用和服务的需要。配置中心化管理让实现无状态服务更简单，也让按需弹性扩展服务更容易。
2. 服务发现及管理：动态服务发现对以服务为中心的（例如微服务和云原生）应用架构方式非常关键。Nacos支持DNS-Based和RPC-Based（Dubbo、gRPC）模式的服务发现。Nacos也提供实时健康检查，以防止将请求发往不健康的主机或服务实例。借助Nacos，您可以更容易地为您的服务实现断路器。
3. 动态DNS服务：通过支持权重路由，动态DNS服务能让您轻松实现中间层负载均衡、更灵活的路由策略、流量控制以及简单数据中心内网的简单DNS解析服务。动态DNS服务还能让您更容易地实现以DNS协议为基础的服务发现，以消除耦合到厂商私有服务发现API上的风险。


### mvn命令：
- vi ~/.bash_profile 配置环境变量
- 每次重启都要source ~/.bash_profile
1. mac15以上默认 shell:zsh not bash
2. 修改~/.zshrc，追加source ~/.bash_profile， 再source ~/.zshrc就可以一直生效了

???
## 一个简单，超快，7x24小时运行的证券交易所

本项目warpexchangeStudy是根据廖雪峰的教程和源码创建的SpringCloud项目
这旨在让自己更深入了解springCloud各个方面

### 教程链接：https://www.liaoxuefeng.com/wiki/1252599548343744/1266263401691296

### 源代码：https://github.com/michaelliao/warpexchange/

### fork代码：https://github.com/zhb0110/warpexchange/

### 本项目代码：https://github.com/zhb0110/warpexchange-study

### 技术选型

- Java 17 + SpringBoot 3.x + Spring 6.x + Maven.
- 100% in-内存交易.

## 模块

1. 搭建项目框架：
   parent：管理最基础的pom.xml，其他模块(不包括build)直接从parent继承，简化各自的pom.xml，打包方式pom；
   build：把所有模块放到一起编译，包括parent模块，打包方式pom；
   config-repo：目录，存储Spring Cloud Config服务器端的配置文件
   common：公共代码；
   config：配置服务器，以下子模块都从这里远程读取配置；
2. trading-engine：交易引擎；
3. trading-sequencer：定序服务；
4. trading-api：交易API服务；
5. quotation：行情服务；
6. push：推送服务；
7. ui：用户Web界面。

## 项目搭建记录

链接：https://www.yuque.com/zhuhongbo-x17of/yzx0z9/ys3qqsubloy7iamz

## 项目启动

链接：https://www.yuque.com/zhuhongbo-x17of/yzx0z9/ov8p4k5iubwtbrs9

## 问题：第二次启动，拿不到资产数据
查了下，资产数据都是空的，AssetService类中
比较好的方法：重新注册一个用户，所有用户都获得了资产数据，这个比较靠谱，因为在TradingEngineService类中执行了“用户数量”次数的processMessages方法。
其他改造方法一般：比如在MvcController中改造，虽然用户数据都是在这里初始化，但是一些逻辑需要通盘考虑，直接再次给用户赋值资产，会被事件处理器去重。












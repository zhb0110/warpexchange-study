## 一个简单，超快，7x24小时运行的证券交易所

本项目warpexchangeStudy是根据廖雪峰的教程和源码创建的SpringCloud项目
这旨在让自己更深入了解springCloud各个方面

### 教程链接：https://www.liaoxuefeng.com/wiki/1252599548343744/1266263401691296

### 源代码：https://github.com/michaelliao/warpexchange/

### fork代码：https://github.com/zhb0110/warpexchange/

### 本项目代码：略

### 技术选型

- Java 17 + SpringBoot 3.x + Spring 6.x + Maven.
- 100% in-内存交易.

## 模块

parent：管理最基础的pom.xml，其他模块(不包括build)直接从parent继承，简化各自的pom.xml，打包方式pom；
build：把所有模块放到一起编译，包括parent模块，打包方式pom；
config-repo：目录，存储Spring Cloud Config服务器端的配置文件

common：公共代码；
config：配置服务器；
push：推送服务；
quotation：行情服务；
trading-api：交易API服务；
trading-engine：交易引擎；
trading-sequencer：定序服务；
ui：用户Web界面。



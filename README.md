# Java高并发秒杀系统API

How to play

git clone https://github.com/codingXiaxw/seckill.git
open IDEA --> File --> New --> Open
choose seckill's pom.xml，open it
update the jdbc.properties files about your mysql's username and password
deploy the tomcat，and start up
enter in the browser: http://localhost:8080/seckill/list
enjoy it
Develop environment

IDEA+Maven+SSM框架。

Written in front of words

之前写了一个用SSM框架搭建的商品查询系统,分两篇文章分别记录了自己整合SSM框架的过程以及利用SSM开发的一些基础知识，由于那时候刚学完SSM框架，所以自己觉得整合的过程总结的不够好。如今在有了一定的SSM框架开发经验后打算参考慕课网上对秒杀系统的讲解视频再写一个用Maven+SSM做的一个秒杀系统，从头到尾记录自己整合SSM框架以及用SS框架M开发这个秒杀系统的过程。maven的强大之处就是你不用再像以前那样，如果在项目中用到spring框架还要到spring官网上去下载一系列的jar包，用了maven对项目进行管理之后你就可以直接在它的pom.xml文件中添加jar包的相应坐标，这样maven就能自动从它的中央仓库中为我们将这些jar包下载到其本地仓库中供我们使用。

用maven对项目进行管理的知识很简单，关于创建maven项目的知识大家看我的这篇文章便可以在几分钟内掌握:Maven安装配置及创建你的第一个Maven项目

秒杀系统搭建环境:IDEA+Maven+SSM框架。详情讲解请点击这里或是下面模块的链接前往我的博客观看。

完成这个秒杀系统，需要完成四个模块的代码编写，分别是:

1.Java高并发秒杀APi之业务分析与DAO层代码编写。
2.Java高并发秒杀APi之Service层代码编写。
3.Java高并发秒杀APi之Web层代码编写。
其实完成这三个模块就可以完成我们的秒杀系统了，但对于我们的秒杀系统中一件秒杀商品，在秒杀的时候肯定会有成千上万的用户参与进来，通过上述三个模块完成的系统无法解决这么多用户的高并发操作，所以我们还需要第四个模块:

4.Java高并发秒杀APi之高并发优化(待更新)。

Android私服搭建与依赖管理
-----------------------------------------------------------------
# Android引入依赖的多种方式
## 一、第三方jar包
   步骤：将jar包放入libs目录下面，然后add as library
   
## 二、依赖本地模块
   步骤：新建本地module或者library，然后用本地模块进行依赖，例如：implementation project(':mylibrary')
   
## 三、aar方式依赖本地模块
   步骤：新建本地module或者library，然后build或者rebuild整个project，
   然后在新建的module或者library的build目录下的output目录下的aar目录，将aar文件放入需要依赖的libs目录下面，
   然后在gradle中加入一下
```
repositories{
        flatDir{
            dirs 'libs'
        }
    }
	
implementation(name:'lib2',ext:'aar')
name是aar文件的名字，ext是后缀名
```
## 四、在相应的gradle文件依赖
   步骤：直接在dependencies进行implementation
```
   例如：implementation 'com.android.support:appcompat-v7:28.0.0'
```
# 私服Nexus的获取和windows平台搭建![网址](http://www.sonatype.com)
  以下是一些参考博客
* [maven私服搭建及gradle上传](https://www.jianshu.com/p/b1fe26d5b8c8)  
* [Windows下搭建基于Nexus的Android Maven私服(一)](https://blog.csdn.net/huweijian5/article/details/56670569)
* [Windows下搭建基于Nexus的Android Maven私服(二)](https://blog.csdn.net/huweijian5/article/details/56834199)
* [Gradle中文教程系列-跟我学Gradle-4.1：Nexus私服的安装与配置](https://www.jianshu.com/p/e8d999465edf)
* [使用Gradle和Sonatype Nexus 搭建私有maven仓库](https://blog.csdn.net/u011974987/article/details/52372185)

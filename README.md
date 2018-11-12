
MyBatis-Generator
=================
规范说明：
----------------------------------
    1. 所有表结构的主键(id)的类型必须相同，命名必须规范，不可随意命名
    2. 规范化共有字段，需要配置在dbtools.properties中
    3. 数据库必须包含如下字段:createAt,createBy,updateAt,updateBy,dr,data_version

概述：
----------------------------------
### 使用说明：
		1、该项目为MyBatis生成器；MyBatis比IBatis最大的方便地方在于不用写Mapper（Dao）的实现类，
		   故作者把接口类通用的增删改查抽出来（名称叫BaseMapper，默认所有Mapper（Dao）接口
		   继承该接口），该生成器就是生成这些通用方法的配置文件
		2、该生成器默认支持物理分页，如果不喜欢、或者不是该物理分页方式的可以在模版文件中和接口
		   文件中注掉对应的配置和方法
		3、DBType类为数据库字段类型与java类型转换的enum类，如果在生成器运行的过程中报对应的错或
		   者输出java类型不是自己想要的可以修改该类调整
		4、test文件夹下放置了相关类，通用的BaseMapper接口类、相关的物理分页拦截器、方言类等。需
		   要的可以看下

### 主要作用：
        1、Model类的生成
        2、Mapper映射XML文件的生成
        3、通用的BaseMapper接口类，直接拷贝test文件夹下面的就行了

### 技术说明：
		1、该生成器为Maven项目
		2、使用freemarker模板引擎、commons-io工具包



### 待改进：
        1、针对不同数据库制定不同的DB类型与JAVA类型之间的转换
        
        
#枚举相关处理
D:\1aXIHU\pandora-qms-portal\src\main\resources\authConfig.properties    revert 到测试环境

张俊-咸蛋 11:54:47
QSB
张俊-咸蛋 11:57:44
增加点： 
1.CommonController  all()
2.CommonController  补充单个接口
3.QSB enum.js base_info 补充
4. QSB enum.js base_info ajax_all_enum_func 后面补充

5.测试方法：
此方法放开测试，无误后将此行注释
张俊-咸蛋 13:40:34
ApprovalStatusEnum.java
TQmsIssueTraceDetailMeaObjEnum.java
TQmsIssueTraceDetailMeaPosiEnum.java
TQmsIssueTraceDetailTraceItemTypeEnum.java
 


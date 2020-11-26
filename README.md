# 写一个自我介绍，并对其进行增删改查

##### 1.建立实体类（entity）

（1）登录用户（LoginUsers）

![image-20201126173932350](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126173932350.png)

（2）介绍用户(Users)

![image-20201126174550321](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126174550321.png)

##### 2.开发工具（Util）

(1)servlet-api，sqlserver-jdbc包导入

![image-20201126175125431](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126175125431.png)

![image-20201126175150217](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126175150217.png)

（2）连接数据库

![image-20201126175330690](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126175330690.png)

（3）测试是否连接数据库

![image-20201126175352322](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126175352322.png)

（4）确认登录信息

![image-20201126175457504](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126175457504.png)

（5）添加介绍用户

![image-20201126175534179](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126175534179.png)

（6）删除介绍用户

![image-20201126175607033](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126175607033.png)

（7）修改介绍用户

![image-20201126175636920](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126175636920.png)

（8）查找修改用户

![image-20201126175713064](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126175713064.png)

##### 3.服务的响应（controller）

（1）管理用户的登录

![image-20201126180140987](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126180140987.png)

（2）介绍用户的添加

![image-20201126180010579](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126180010579.png)

（3）介绍用户的删除

![image-20201126180101503](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126180101503.png)

（4）介绍用户的修改

![image-20201126180257170](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126180257170.png)

（5）介绍用户的查询

![image-20201126180351667](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126180351667.png)

（6）配置servlet

![image-20201126180712993](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126180712993.png)

![image-20201126180736395](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126180736395.png)

##### 4.前端发送请求和接收响应（web）

![image-20201126180803312](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126180803312.png)

<center><!--文件如上（源码在/web文件夹下）--></center>

- index.jsp	——>	默认欢迎界面
- Login.html	——>	登陆界面
- LoginError.jsp	——>	登录失败响应
- Index.html	——>	目录界面
- Add.html/Delete.html/Update.html/Selete.html	——>增删改查界面
- AddSuccuss.jsp/DeleteSuccess.jsp/UpdateSuccess.jsp/SeleteSuccess.jsp	——>	增删改查成功界面，提示成功并返回目录界面
- AddFail.jsp/DeleteFail.jsp/UpdateFail.jsp/SeleteFail.jsp	——>	增删改查失败界面，提示失败并返回目录界面

##### 5.运行效果

（1）登陆界面

![image-20201126182128222](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126182128222.png)

（2）目录界面

- 登陆成功跳到目录界面
- ![image-20201126182243441](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126182243441.png)
- 登陆失败提示错误并返回登陆页面
- ![image-20201126182322437](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126182322437.png)

（3）增删改——以添加界面为例

- ![image-20201126190005986](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126190005986.png)

- 添加成功提示并返回目录
- ![image-20201126185937271](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126185937271.png)

- 添加失败提示并返回目录
- ![image-20201126182659347](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126182659347.png)

（4）查询界面

- 查询成功进行显示
- ![image-20201126190035540](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126190035540.png)
- 查询失败进行提示并返回目录
- ![image-20201126183003045](C:\Users\11842\AppData\Roaming\Typora\typora-user-images\image-20201126183003045.png)
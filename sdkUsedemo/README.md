doupay数字货币交易系统-DEMO
=====================================
## 环境指引
http://sandbox.pay.apipay.one/ 沙盒环境
http://pay.apipay.one/ 正式环境
## 修改服务配置文件
请根据服务实际部署情况修改以下配置。配置文件位置如下，如果配置文件中没有某一项配置，说明该模块未使用到该项功能，无需添加：

doupay.api.appId=
doupay.api.secret=
doupay.api.privateKey= 对应用户个人私钥
doupay.api.publicKey=  对应交换后的平台公钥
doupay.api.sysLog=true
doupay.api.expireTime=1800
doupay.api.url=http://sandbox.pay.apipay.one/ 沙盒环境

### 服务测试启动
1、添加maven配置进行依赖下载

2、 进入 src/main/resource/application.properties 指定spring.profiles.active: sandbox 为沙盒环境或正式环境

3、进入test路径下有封装好的接口测试文件 直接点击方法名前的test运行摁钮直接进行测试

# Aishop商城-学习 参考谷粒商城制作

## 说明

配置要求：处理器至少6核，内存至少需要16GB。

- 虚拟机环境配置

- 依次运行解压后的nacos、seata、sentinel【需要链路追踪则开启】。【操作ES时，直接运行kibana即可】。

- 将源码导入IDEA，导入依赖后即可正常运行。【Maven、npm设置成国内镜像下载依赖】
   
   - renren-fast-vue: 打开IDEA底部的Terminal，进入renren-fast-vue目录下,安装依赖后npm install --save，运行npm run dev。【安装sass依赖出现问题时，安装淘宝的cnpm进行安装】
   
   - renren-fast: 打开IDEA底部的Terminal，运行java -jar renren-fast。【renren-fast运行端口更改为8082，前端访问由gulimall-gateway进行转发，这样可以将8080端口空闲出来供sentinel-dashboard使用。】


## 补充

- 支付包沙箱：买家账号juxbwt4757@sandbox.com | 登录密码111111 | 支付密码111111
    
   - 支付完成后，页面显示“抱歉，网络系统繁忙，请稍后再试”【沙盒已支付成功】。问题描述：https://forum.alipay.com/mini-app/post/25101011
   
- 短信接口配置、OSS配置、支付宝沙箱配置、内网穿透配置，均可以改成自己的参数。

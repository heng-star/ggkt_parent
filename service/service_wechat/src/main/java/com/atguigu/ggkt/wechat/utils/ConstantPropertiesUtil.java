package com.atguigu.ggkt.wechat.utils;

import com.atguigu.ggkt.utils.Wxgongzhonghao;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 常量类，读取配置文件application.properties中的配置
 */
@Component
public class ConstantPropertiesUtil implements InitializingBean {

    @Value("${wechat.mpAppId}")
    private String appid;

    @Value("${wechat.mpAppSecret}")
    private String appsecret;

    public static String ACCESS_KEY_ID;
    public static String ACCESS_KEY_SECRET;

    @Override
    public void afterPropertiesSet() throws Exception {
        Wxgongzhonghao wx=new Wxgongzhonghao();
        ACCESS_KEY_ID = wx.appID;
        ACCESS_KEY_SECRET = wx.appsecret;
    }
}

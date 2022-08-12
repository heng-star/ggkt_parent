package com.atguigu.ggkt.wechat.config;

import com.atguigu.ggkt.utils.Wxgongzhonghao;
import com.atguigu.ggkt.wechat.utils.ConstantPropertiesUtil;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.config.WxMpConfigStorage;
import me.chanjar.weixin.mp.config.impl.WxMpDefaultConfigImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class WeChatMpConfig {

    @Autowired
    private ConstantPropertiesUtil constantPropertiesUtil;

    @Bean
    public WxMpService wxMpService() throws Exception {
        WxMpService wxMpService = new WxMpServiceImpl();
        wxMpService.setWxMpConfigStorage(wxMpConfigStorage());
        return wxMpService;
    }
    @Bean
    public WxMpConfigStorage wxMpConfigStorage() throws Exception {
        WxMpDefaultConfigImpl wxMpConfigStorage = new WxMpDefaultConfigImpl();
        Wxgongzhonghao wx=new Wxgongzhonghao();
        wxMpConfigStorage.setAppId(wx.appID);
        wxMpConfigStorage.setSecret(wx.appsecret);
//        wxMpConfigStorage.setAppId(ConstantPropertiesUtil.ACCESS_KEY_ID);
//        wxMpConfigStorage.setSecret(ConstantPropertiesUtil.ACCESS_KEY_SECRET);
        return wxMpConfigStorage;
    }
}

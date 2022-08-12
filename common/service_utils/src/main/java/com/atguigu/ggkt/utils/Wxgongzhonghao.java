package com.atguigu.ggkt.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Wxgongzhonghao {

    public String appID;
    public String appsecret;
    public Wxgongzhonghao() throws Exception{
        File f=new File("I:\\tencentcos\\weixin-test.properties");
        InputStream i=new FileInputStream(f);
        Properties p=new Properties();
        p.load(i);
        this.appID=p.getProperty("appID");
        this.appsecret=p.getProperty("appsecret");
        //Wxgongzhonghao
    }
    public String getSecretId() {
        return appID;
    }
    public String getSecretKey() {
        return appsecret;
    }
}

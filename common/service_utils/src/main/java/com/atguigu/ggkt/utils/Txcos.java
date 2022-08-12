package com.atguigu.ggkt.utils;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

@Data
public class Txcos {
    public String bucketname;
    public String secretId;
    public String secretKey;
    public Txcos() throws Exception{
        File f=new File("I:\\tencentcos\\secert.properties");
        InputStream i=new FileInputStream(f);
        Properties p=new Properties();
        p.load(i);
        this.bucketname=p.getProperty("bucketname");
        this.secretId=p.getProperty("SecretId");
        this.secretKey=p.getProperty("SecretKey");
    }

    public String getBucketname() {
        return bucketname;
    }

    public String getSecretId() {
        return secretId;
    }

    public String getSecretKey() {
        return secretKey;
    }
}

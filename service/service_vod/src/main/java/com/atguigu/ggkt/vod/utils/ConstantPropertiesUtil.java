package com.atguigu.ggkt.vod.utils;

import com.atguigu.ggkt.utils.Txcos;
import javafx.fxml.Initializable;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConstantPropertiesUtil implements InitializingBean  {

    @Value("${tencent.cos.file.region}")
    private String region;

//    @Value("${tencent.cos.file.secretid}")
//    private String secretId;
//
//    @Value("${tencent.cos.file.secretkey}")
//    private String secretKey;
//
//    @Value("${tencent.cos.file.bucketname}")
//    private String bucketName;

    public static String END_POINT;
    public static String ACCESS_KEY_ID;
    public static String ACCESS_KEY_SECRET;
    public static String BUCKET_NAME;

    Txcos txcos;

    {
        try {
            txcos = new Txcos();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    txcos.init();

    @Override
    public void afterPropertiesSet() throws Exception {
        END_POINT = region;
        ACCESS_KEY_ID =txcos.getSecretId();
        ACCESS_KEY_SECRET =txcos.getSecretKey();
        BUCKET_NAME =txcos.getBucketname();
    }
}

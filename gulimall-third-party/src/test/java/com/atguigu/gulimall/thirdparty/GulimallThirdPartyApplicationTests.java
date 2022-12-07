package com.atguigu.gulimall.thirdparty;

import com.aliyun.oss.OSSClient;
import javafx.scene.Camera;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest
class GulimallThirdPartyApplicationTests {

    @Autowired
    OSSClient ossClient;
    @Test
    void contextLoads() throws FileNotFoundException {
        //上传文件流
        FileInputStream stream = new FileInputStream("C:\\Users\\Lucky\\Pictures\\Camera Roll\\tx.jpg");
        ossClient.putObject("gulimall-xiansen","tx.jpg",stream);
        //关闭ossClient
        ossClient.shutdown();
        System.out.println("上传完成...");
    }

}

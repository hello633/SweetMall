package com.mycompany.sweetmall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class SweetmallThirdPartyApplicationTests {

    @Resource
    OSSClient ossClient;

    @Test
    void contextLoads() {
    }

    @Test
    public void TestUpload() throws FileNotFoundException {

        InputStream inputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\file\\11.jpg");
        ossClient.putObject("sweetmall","11.jpg",inputStream);
        ossClient.shutdown();

    }
}

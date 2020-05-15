package com.ex.mall.product;

import com.ex.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class MallProductApplicationTests {
    @Autowired
    BrandService mService;

    @Test
    void contextLoads() {
        /*BrandEntity entity = new BrandEntity();
        entity.setName("huawei");
        mService.save(entity);*/
        mService.removeById(1);
    }

}

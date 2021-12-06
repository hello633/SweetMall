package com.mycompany.sweetmall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mycompany.sweetmall.product.entity.BrandEntity;
import com.mycompany.sweetmall.product.service.BrandService;
import com.mycompany.sweetmall.product.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Slf4j
@SpringBootTest
class SweetmallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Autowired
    CategoryService categoryService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();

        brandEntity.setBrandId(1L);
        brandEntity.setDescript("超级无敌吹风机");

        brandService.updateById(brandEntity);
        //brandEntity.setName("华为");
        //brandService.save(brandEntity);
        System.out.println("修改成功");

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1l));

        list.forEach((item) ->{
            System.out.println(item);
        });
    }

    @Test
    void findParents(){
        Long[] catelogPath = categoryService.findCatelogPath(225L);
        log.info("完整路径，{}", Arrays.asList(catelogPath));

    }



}

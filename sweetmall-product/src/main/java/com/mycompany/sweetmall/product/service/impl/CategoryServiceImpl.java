package com.mycompany.sweetmall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mycompany.common.utils.PageUtils;
import com.mycompany.common.utils.Query;

import com.mycompany.sweetmall.product.dao.CategoryDao;
import com.mycompany.sweetmall.product.entity.CategoryEntity;
import com.mycompany.sweetmall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {

        // 1、查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);

        // 2、组装成父子的树形结构
        List<CategoryEntity> level1Menus = entities.stream().filter((categoryEntity -> categoryEntity.getParentCid().equals(0L))
        ).map( menu -> {menu.setChildren(getChildren(menu,entities));
                return menu;
        }).sorted(( menu1 , menu2 ) -> (menu1.getSort()==null ? 0 : menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort())).collect(Collectors.toList());
        return level1Menus;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {

        // TODO 1、检查当前删除的菜单，是否被别的地方引用

        baseMapper.deleteBatchIds(asList);
    }

    @Override
    public Long[] findCatelogPath(Long catelogId) {
        List<Long> paths = new ArrayList<>();

        List<Long> parentPath = findParentPath(catelogId, paths);

        Collections.reverse(parentPath);

        return parentPath.toArray(new Long[0]);

    }

    private List<Long> findParentPath(Long catelogId,List<Long> path){
        path.add(catelogId);
        CategoryEntity byId = this.getById(catelogId);
        if (byId.getParentCid() != 0){
            findParentPath(byId.getParentCid(),path);
        }
        return path;

    }

    // 递归查找所有菜单的子菜单
    private List<CategoryEntity> getChildren(CategoryEntity root,List<CategoryEntity> all){

        List<CategoryEntity> children = all.stream().filter(menu -> menu.getParentCid().equals(root.getCatId())
        ).map(menu -> {
            menu.setChildren(getChildren(menu,all));
            return menu;
        }).sorted((menu1, menu2) -> (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort())).collect(Collectors.toList());

        return children;
    }

}
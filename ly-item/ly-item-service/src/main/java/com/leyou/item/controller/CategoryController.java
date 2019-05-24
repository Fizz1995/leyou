package com.leyou.item.controller;

import com.leyou.item.pojo.Category;
import com.leyou.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 根据父节点查询商品类目
     *
     * @param pid
     * @return
     */
    @GetMapping("list")
    public ResponseEntity<List<Category>> queryCategoryListByParent(
            @RequestParam(value = "pid", defaultValue = "0") Long pid,Category category) {
        List<Category> list = this.categoryService.queryCategoryListByParent(pid);
        if (list == null) {
            //没有找到返回404
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        //找到返回200
        return ResponseEntity.ok(list);

    }
}

package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {

    PRICE_CANNOT_BE_NULL(400, "价格不能为空！"),
    CATEGORY_NOT_FIND(404, "商品分类暂无！"),
    INVALID_FILE_TYPE(400,"无效文件"),
    UPLOAD_FILE_ERROR(500,"文件上传失败")
    ;
    private int code;
    private String msg;
}

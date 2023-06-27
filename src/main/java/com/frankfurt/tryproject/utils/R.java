package com.frankfurt.tryproject.utils;

import lombok.Data;

//返回一个固定的格式
@Data
public class R<T> {
    private Boolean flag;
    private T data;
    private String message;

    public R() {

    }

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R(Boolean flag, T data) {
        this.data = data;
        this.flag = flag;
    }

    public R(T data) {
        this.data = data;
    }

    public static <T> R<T> success(T data) {

        return new R<>(true, data);

    }

    //错误的时候是提示信息
    public static <T> R<T> fail(T message) {

        return new R<>(false, message);
    }

}

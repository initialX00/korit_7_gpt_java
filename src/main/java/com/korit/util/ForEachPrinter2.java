package com.korit.util;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachPrinter2 {
    //T,R,C 추상화된 제너릭타입, 일반자료형 불가, 클래스타입으로 취급된다.
    //private T data;

    //static 메서드는 객체를 생성하지 않기에 제너릭타입을 리턴자료형(반환타입) 앞에 표기한다.
    public static <T> void print(T[] array) {
        for (T data : array) {
            System.out.print(data);
        }
    }

    public static <T> List<T> print2(List<T> datas, Consumer<List<T>> action) {
        List<T> result =new ArrayList<>();
        action.accept(datas);
        return result;
    }



}

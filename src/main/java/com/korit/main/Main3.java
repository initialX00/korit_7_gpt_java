package com.korit.main;

import com.korit.util.ForEachPrinter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 제네릭
public class Main3 {
    public static void main(String[] args) {
       // ForEachPrinter2<Integer> ifp = new ForEachPrinter2<>(); //객체의 자료형은 앞에서 유추가능하여 생략
        //new ForEachPrinter2<>(); 자료형이 유추가 불가능할 경우 Object로 취급된다
        //Object클래스로 제너릭처럼 타입에 유연성을 가지지만 Object를 쓸경우 업캐스팅, 다운캐스팅이 필수다.
        String[] names = new String[] {"a","b","c"};
        Integer[] numbers = new Integer[] {1,2,3};
        ForEachPrinter2.print(names);  //abc
        System.out.println();
        ForEachPrinter2.print(numbers);  //123
        System.out.println();

        //List와 제네릭
        List<String> datas = ForEachPrinter2.print2(Arrays.asList(names), data -> System.out.println(data));  //[a, b, c]

        //List.of :: 수정이 불가, 상수선언, 읽기전용
        List<Integer> list = List.of(1,2,3,4,5);
        //List.of를 .addAll이나 toList()로 새롭게 받아 수정할 수 있는 List만들기
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        list2.add(10);
        List<Integer> list3 = list.stream().collect(Collectors.toList());
        list3.add(20);
    }

    public static boolean test() {
        //클린코드 - 초보자용 풀어쓰기
        boolean result = false;
        result = (10 & 2) == 0;
        return result;

        //리팩토링 - 숙련자용 함축코드
        //result 10 & 2 == 0;
    }
}

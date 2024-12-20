package com.korit.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {
        List<Integer> numberList = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> numberList2 = null;
        List<String> numberList3 = null;
        List<Integer> numberList4 = null;
        List<Integer> numberList5 = null;


        numberList2 = new ArrayList<>();  //배열을 생성하여 대입
        for(int i = 0; i<numberList.size(); i++){
            numberList2.add(numberList.get(i) * 10);
        }

        numberList3 = new ArrayList<>();
        for(Integer num : numberList){
            numberList3.add(num * 10 + " ");  //스트링 입력
        }

        //numberList.forEach(num -> {
        //    numberList4.add(num);
        //});
        //numberList.forEach(num -> numberList4.add(num));

        numberList5 = numberList.stream() //리스트타입을 스트림타입으로 변환
                .map(num -> num * 10) // 10 곱하기
                .collect(Collectors.toList());  //새 스트림으로 값을 담고 리스트로 변환

        System.out.println(numberList);
        System.out.println(numberList2);
        System.out.println(numberList3);
        System.out.println(numberList4);
        System.out.println(numberList5);
    }
}

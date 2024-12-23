package com.korit.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {
        List<Integer> numberList = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> numberList2 = null;
        List<String> numberList3 = null;   //null로 초기화는 초기화하지 않았다는 뜻 (주소가 없으므로)
        List<Integer> numberList4 = null;
        List<Integer> numberList5 = null;


        numberList2 = new ArrayList<>();  //배열을 생성하여 대입, 주소생성
        for(int i = 0; i<numberList.size(); i++){
            numberList2.add(numberList.get(i) * 10);
        }

        numberList3 = new ArrayList<>();
        for(Integer num : numberList){
            numberList3.add(num * 10 + " ");  //스트링 입력
        }

        //numberList4 = new ArrayList<>();
        //numberList.forEach(num -> {  //리무브같은걸로 순회할때 인덱스가 꼬여서 오류가 뜨기때문에,
        //    numberList4.add(num);    //numberList4에 fianl선언이 필요하다.
        //});                          //인텔리제이가 문법에 엄격해서 오류 뜸. 이클립스에선 안 뜸.



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

package com.korit.main;

import com.korit.service.ATestService;
import com.korit.service.BTestService;
import com.korit.service.TestPrint;

import java.util.Random;

public class Main1 {
    public static void main(String[] args) {

        //객체직접 호출 : 참조형데이터이므로 주소출력
        System.out.println(new ATestService());  //com.korit.service.ATestService@5594a1b5
        System.out.println(new BTestService());  //com.korit.service.BTestService@3b6eb2ec

        //객체화 후 메서드 호출
        ATestService aTestService = new ATestService();
        BTestService bTestService = new BTestService();
        aTestService.print();  //ATestService
        bTestService.print();  //BTestService

        //업캐스팅
        TestPrint testPrint1 = new ATestService();
        TestPrint testPrint2 = aTestService;
        testPrint1.print();  //ATestService
        testPrint2.print();  //ATestService

        //업캐스팅
//        ATestService aTestService = new ATestService();
//        BTestService bTestService = new BTestService();
        TestPrint testPrint3 = null;
        Random random = new Random();
        int randomInt = random.nextInt(100);
        if(randomInt % 2 == 0) {
            testPrint3 = aTestService;
        } else {
            testPrint3 = bTestService;
        }
        testPrint3.print();  //ATestService or BTestService
    }
}

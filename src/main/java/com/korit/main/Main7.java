package com.korit.main;

public class Main7 {
    public static void main(String[] args) throws InterruptedException {
        //Runnable 인터페이스 & Thread 예제//

        Runnable runnable = new Runnable() { //익명클래스 - 일회용, 객체 생성을 하지않음
            @Override
            public void run() {
                for(int i = 0; i < 10; i++) {
                    try {
                        System.out.println("첫번째 반복문 i : " + i);
                        Thread.sleep(1000); // sleep : 0.001초 단위로 일시정시
                    } catch (InterruptedException e) {  //슬립의 개입에 의한 오류 예외처리
                        throw new RuntimeException("프로그램에 오류가 발생했습니다");
                    }
                }
            }
        };

        Thread t1 = new Thread(runnable); //스레드생성
        t1.start(); //스레드 실행




        Runnable runnable2 = () -> {
            for(int i = 0; i < 10; i++) {
                try {
                    System.out.println("두번째 반복문 i : " + i);
                    Thread.sleep(1000); // sleep : 0.001초 단위로 일시정시
                } catch (InterruptedException e) {
                    throw new RuntimeException("프로그램 오류가 발생했습니다");
                }
            }
        };

        Thread t2 = new Thread(runnable2);
        t2.start();



        //main 자체도 하나의 스레드이다. 따라서 현재 3개의 스레드가 있다.
        for(int i = 0; i < 10; i++) {
            System.out.println("MAIN Tread i : " + i);
            Thread.sleep(1000);
        }




    }
}

package com.korit.main;


@FunctionalInterface //함수형 인터페이스 - 람다전용, 추상메서드 2개 이상 불가
interface 무기 { //인터페이스
    String 공격(Integer 데미지);
    //void 위협();  //메서드가 두개면 람다 오류
}

class 총 implements 무기 {
    @Override
    public String 공격(Integer 데미지) { //반환값이 있으면 리턴해주기
        System.out.println("총을 쏜다");
        System.out.println("데미지 : " + 데미지);
        return "총 데미지 : " + 데미지;
    }
}


public class Main5 {
    public static void main(String[] args) {

        //일반적으로 객체화 - 여러번가능
        무기 wp1 = new 총();
        wp1.공격(100);


        //익명클래스 - 한번만 사용가능
        무기 wp2 = new 무기() {
            @Override
            public String 공격(Integer 데미지) { //반환값이 있으면 리턴
                System.out.println("일회성 공격");
                System.out.println("데미지 : " + 데미지);
                return "총 데미지 : " + 데미지;
            }
        };
        wp2.공격(50);


        //람다 - 익명클래스의 함수화 (간략화)
        무기 wp3 = (Integer 데미지) -> { System.out.println("람다로 공격");
            System.out.println("데미지 : " + 데미지);
            return "람다 데미지 : " + 데미지;
        };
        wp3.공격(500);
        
        //람다 생략//
        //함수가 하나이므로 매개변수 자료형 생략가능
        무기 wp4 = (데미지) -> { System.out.println("람다로 공격");
            System.out.println("데미지 : " + 데미지);
            return "람다 데미지 : " + 데미지;
        };
        wp4.공격(500);

        //매개변수가 하나면 소괄호() 생략가능
        무기 wp5 = 데미지 -> { System.out.println("람다로 공격");
            System.out.println("데미지 : " + 데미지);
            return "람다 데미지 : " + 데미지;
        };
        wp5.공격(500);

        //리턴값이 있는 경우 중괄호{}와 리턴을 생략 후 리턴값만 적을 수 있다 
        무기 wp6 = 데미지 -> "람다 데미지 : " + 데미지;
        wp6.공격(500);
        

    }
}

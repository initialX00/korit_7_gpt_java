package com.korit.main;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;


@AllArgsConstructor
class Authority<T> implements Supplier<T> {
    private T role;
    @Override
    public T get() {
        return role;
    }
}

public class Main6 {
    public static void main(String[] args) {
        //자주 쓰는 람다용 인터페이스//
//        Runnable runnable;
//        Consumer<String> consumer;
//        Supplier<String> supplier;
//        Function<String, String> function;
//        Predicate<String> predicate;
//        BiConsumer<Integer, String> biConsumer;
//        BiFunction<Integer, Integer, String> biFunction;
//        BiPredicate<Integer, Integer> biPredicate;
//        UnaryOperator<Integer> unaryOperator;
//        BinaryOperator<Double> binaryOperator;



        //Runnable
        // Thread(Main 메서드의 역할)
        // 실행메소드인 run()이 여러곳에서 자주 쓰이다보니 run()를 인터페이스로 추상화한것
        Runnable runnable;

        List<Runnable> programs =new ArrayList<>();
        for(int i = 0; i < 5; i++){
            final int finalI = i;
            programs.add(() -> {
                System.out.println("프로그램" + (finalI + 1)); //runnable에 담길 함수
            });
            //Runnable r = () -> System.out.println("프로그램" + (finalI + 1));
            //programs.add(r);
        }

        for(Runnable program : programs) {
            program.run();
        }



        //Consumer
        //매개변수로 값을 받아서 해당 값을 처리한다. 처리한 결과를 return하지는 않는다. ex)forEach처럼
        Consumer<String> consumer;



        //Supplier
        //매개변수로 값을 받지 않고 처리한 데이터를 return하는 역할을 한다. get()을 사용한다.
        Supplier<String> supplier;

        Authority<String> authority = new Authority<>("ROLE_ADMIN");
        String role = authority.get();



        //Function
        //매개변수로 값을 받아서 처리한 데이터를 return해주는 역할, 매개변수 하나만을 요구한다.
        Function<String, String> function; //String을 받아 String으로 반환

        Function<Integer, Integer> addfunction = num -> num + 10;
        Integer result = addfunction.apply(1);



        //BiFunction
        //매개변수로 값을 받아서 처리한 데이터를 return해주는 역할, 매개변수 두개를 요구한다.
        BiFunction<Integer, Integer, String> biFunction; //Integer 두개를 받아 String으로 반환
        BiFunction<Integer, Integer, Integer> addbiFunction = (num1, num2) -> num1 + num2;
        Integer result2 = addbiFunction.apply(100, 200);

        Map<String, Object> userMap = Map.of("username","admin", "password","1234");
        // { "username" : "admin",  "password" : "1234" }  - Map에서 key,value의 한 쌍을 entry라 한다.

        Set<Map.Entry<String, Object>> entries = userMap.entrySet();  //entry끼리 Set자료형으로 변환

        for(Map.Entry<String, Object> entry : entries) { //인덱스가 없으므로 형태를 변환한다.
            entry.getKey();
            entry.getValue();
        }

        userMap.forEach((key, value) -> System.out.println("key:" + key + ",value:" + value));
        //매개변수 2개를 필요로하는 bifuntion이 람다식에 포함되어있다




        //Predicate
        //boolean 값으로 반환한다. 필터에 사용된다.
        Predicate<String> predicate;

        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        List<Integer> evenNums = nums.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());




        BiConsumer<Integer, String> biConsumer;
        BiPredicate<Integer, Integer> biPredicate;


        
        //UnaryOperator
        //Funtion을 상속받고 매개변수와 리턴의 타입이 같다.
        UnaryOperator<Integer> unaryOperator;
        //BinaryOperator
        //BiFution을 상속받고 매개변수와 리턴의 타입이 같다.
        BinaryOperator<Double> binaryOperator;




    }
}



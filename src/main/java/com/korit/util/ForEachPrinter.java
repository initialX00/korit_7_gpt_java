package com.korit.util;

public class ForEachPrinter {
    public void print(Integer[] nums) {
        for(Integer num : nums) {
            System.out.print(num + " ");
        }
    }
    //스태틱메서드
    public static void print2(Integer[] nums) {
        for(Integer num : nums) {
            System.out.print(num + " ");
        }
    }
}

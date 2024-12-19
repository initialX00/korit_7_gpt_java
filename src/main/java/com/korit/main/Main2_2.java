package com.korit.main;

import com.korit.util.ForEachPrinter;

public class Main2_2 {
    public static void main(String[] args) {

        Integer[] nums = new Integer[] {1,2,3,4,5,6,7,8,9};
        Integer[] nums2 = new Integer[] {11,12,13,14,15,16,17,18,19};
        Integer[] nums3 = new Integer[] {111,112,113,114,115,116,117,118,119};

        //각각을 객체화하여 호출한다.
        ForEachPrinter forEachPrinter = new ForEachPrinter();
        forEachPrinter.print(nums);
        forEachPrinter.print(nums2);
        forEachPrinter.print(nums3);

        //static 메서드를 통해 객체화 없이 직접 호출
        ForEachPrinter.print2(nums);
        ForEachPrinter.print2(nums2);
        ForEachPrinter.print2(nums3);

    }
}

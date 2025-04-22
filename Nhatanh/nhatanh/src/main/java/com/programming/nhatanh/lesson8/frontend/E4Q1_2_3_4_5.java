package com.programming.nhatanh.lesson8.frontend;


import com.programming.nhatanh.lesson8.entity.MyMath_Wild;
import com.programming.nhatanh.lesson8.entity.MyNumber;

import java.util.ArrayList;

public class E4Q1_2_3_4_5 {
    public static void main(String[] args)  {
        MyNumber myNumber = new MyNumber();
        System.out.println(myNumber.getMax(21, 33.2));


        MyMath_Wild math = new MyMath_Wild();
        math.somu(2, 3);
        math.somu(2.4, 3.5);
        math.sum(1,2,3,4);


        ArrayList<Object> listWildcards = new ArrayList<>();
        listWildcards.add("Nguyễn Văn Nam");
        listWildcards.add(30);
        listWildcards.add("Hà đông, Hà nội");
        System.out.println(listWildcards);
    }
}

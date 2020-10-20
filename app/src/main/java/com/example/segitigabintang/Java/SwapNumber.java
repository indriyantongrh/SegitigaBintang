package com.example.segitigabintang.Java;

import java.util.Scanner;

/**
 * Created by Indriyantongrh on 20/10/20.
 */
public class SwapNumber {
    public  static void main (String[] args) {
        int x = 0;
        int y = -10;
        System.out.println("Nilai x asli "+ x);
        System.out.println("Nilai y asli "+ y);

        x = x +y ;
        y = x - y;
        x = x - y;

        System.out.println("Nilai sesudah x dibalik "+ x);
        System.out.println("Nilai sesudah y dibalik "+ y);


    }

}

package com.example.segitigabintang.Java;

/**
 * Created by Indriyantongrh on 20/10/20.
 */
public class bintangkanan {
    public static void main(String[] args){
        int baris, spasi, bintang, jumlah;

        jumlah=7;

        for (baris=0; baris<jumlah; baris++){
            for(bintang=0; bintang<=baris; bintang++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}

package com.example.segitigabintang.Java;

import android.icu.text.UFormat;

/**
 * Created by Indriyantongrh on 20/10/20.
 */
public class bintangkiri {
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

        //proses perulangan segitiga bintang rata kanan
        System.out.print("\n");
        for (baris=1; baris<=jumlah; baris++){
            for (spasi=(jumlah-1); spasi>=baris; spasi--){
                System.out.print(" ");
            }
            for (bintang=1; bintang<=baris; bintang++){
                System.out.print("*");
            }
            System.out.print("\n");
        }


        System.out.print("\n");
        for (baris=1; baris<=jumlah; baris++){
            for (spasi=(jumlah-1); spasi>=baris; spasi--){
                System.out.print(" ");
            }
            for (bintang=1; bintang<=2*baris-1; bintang++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}

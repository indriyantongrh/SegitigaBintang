package com.example.segitigabintang.Java;

import android.icu.text.UFormat;

/**
 * Created by Indriyantongrh on 20/10/20.
 */
public class bintangkiri {
    public static void main(String[] args){
        int line, star , space, amount;

        amount=7;

        for (line=0; line<amount; line++){
            for(star=0; star<=line; star++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        //proses perulangan segitiga bintang rata kanan
        System.out.print("\n");
        for (line=1; line<=amount; line++){
            for (space=(amount-1); space>=line; space--){
                System.out.print(" ");
            }
            for (star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.print("\n");
        }


        System.out.print("\n");
        for (line=1; line<=amount; line++){
            for (space=(amount-1); space>=line; space--){
                System.out.print(" ");
            }
            for (star=1; star<=2*line-1; star++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Init
        ArrayList<Integer> polynom1 = new ArrayList<Integer>();
        ArrayList<Integer> polynom2 = new ArrayList<Integer>();
        ArrayList<Integer> ResArr= new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        // In
        System.out.println("Enter power:");
        int pow = scan.nextInt();
        System.out.println("Enter the first polynomial:");
        for (int i = 0; i < pow + 1; i++) {
            int buf = scan.nextInt();
            polynom1.add(buf);
        }
        System.out.println("Enter the second polynomial:");
        for (int i = 0; i < pow + 1; i++) {
            int buf = scan.nextInt();
            polynom2.add(buf);
        }
        for (int i=0; i<pow*2+1;i++)
            ResArr.add(0);
        //Вывод многочленов
        System.out.println("Multiplying polynomials:");
        int pow_tmp = pow;
        boolean Start_flag=false;
        for (int i = 0; i < pow+1; i++) {
            if (polynom1.get(i)!=0)
            {
                if (polynom1.get(i)>0&&Start_flag) {
                    System.out.print("+");
                }
                System.out.print(polynom1.get(i));
                if (pow_tmp>0) System.out.print("x");
                if (pow_tmp>1) System.out.print("^"+pow_tmp);
                Start_flag=true;
            }
            pow_tmp --;
        }

        System.out.println();
        System.out.println("*");
        pow_tmp = pow;
        Start_flag=false;

        for (int i = 0; i < pow+1; i++) {
            if (polynom2.get(i)!=0)
            {
                if (polynom2.get(i)>0&&Start_flag) {
                    System.out.print("+");
                }
                System.out.print(polynom2.get(i));
                if (pow_tmp>0) System.out.print("x");
                if (pow_tmp>1) System.out.print("^"+pow_tmp);
                Start_flag=true;
            }
            pow_tmp --;
        }
        System.out.println();
        System.out.println("=");
        Start_flag=false;
        //Умножаем
        for (int i = 0; i < pow + 1; i++) {
            for (int j = 0; j < pow + 1; j++) {
                int buf = polynom1.get(i)*polynom2.get(j);
                ResArr.set(i+j,ResArr.get(i+j)+buf);
            }
        }
        pow_tmp=pow*2;
        for (int i = 0; i < pow*2+1; i++) {
            if (ResArr.get(i)!=0)
            {
                if (ResArr.get(i)>0&&Start_flag) {
                    System.out.print("+");
                }
                System.out.print(ResArr.get(i));
                if (pow_tmp>0) System.out.print("x");
                if (pow_tmp>1) System.out.print("^"+pow_tmp);
                Start_flag=true;
            }
            pow_tmp --;
        }


    }
}
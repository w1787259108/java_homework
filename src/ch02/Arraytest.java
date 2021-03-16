package ch02;

import java.util.Scanner;

public class Arraytest {
    public static void main(String[] args) {
        double sum=0;
        int n=0;
        int a[]={72,85,96,75,98,74,25,94,85,74,58,65,98};
//        for (int i=0;i<a.length;i++)
//        {
//            sum+=a[i];
//        }
        for (int i:
             a) {
            sum+=i;
        }//foreach ( 类型 type：数组名 {语句})
        System.out.println("平均成绩为"+sum/a.length);
    }
}

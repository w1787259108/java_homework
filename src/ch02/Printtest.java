package ch02;

import java.util.Scanner;

public class Printtest {
    public static void main(String[] args) {
        int sum=0;
        int m=0;
        System.out.println("请输入数字，并回车，输入ctrl+d结束输出");
        Scanner reader = new Scanner(System.in);
        while(reader.hasNextInt()){
            int p=reader.nextInt();
            sum+=p;
            m+=1;
        }
        System.out.printf("共输入了%d个数，和为%d.\n",m,sum);
        System.out.printf("平均值为%.1f\n",(float)sum/m);
        int [] a={1,2,3},b={4,5};
        System.out.println(a);
        System.out.println(b);
        a=b;
        System.out.println(a);
        System.out.println(b);
    }
}

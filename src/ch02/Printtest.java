package ch02;

import java.util.Scanner;

public class Printtest {
    public static void main(String[] args) {
        int sum=0;
        int m=0;
        System.out.println("���������֣����س�������ctrl+d�������");
        Scanner reader = new Scanner(System.in);
        while(reader.hasNextInt()){
            int p=reader.nextInt();
            sum+=p;
            m+=1;
        }
        System.out.printf("��������%d��������Ϊ%d.\n",m,sum);
        System.out.printf("ƽ��ֵΪ%.1f\n",(float)sum/m);
        int [] a={1,2,3},b={4,5};
        System.out.println(a);
        System.out.println(b);
        a=b;
        System.out.println(a);
        System.out.println(b);
    }
}

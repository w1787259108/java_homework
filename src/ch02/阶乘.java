package ch02;

import java.util.Scanner;

public class �׳� {


    public static void main(String[] args) {
        int n, sum = 0;
        System.out.println("����������n������0��������");
        Scanner reader = new Scanner(System.in);
        while (reader.hasNextInt()) {
            n = reader.nextInt();
            if (n == 0)
                System.exit(0);
            sum = 0;
            System.out.println("n�Ľ׳�");
            System.out.printf("%d\n", func1(n, 1));
            System.out.printf("%d\n\n", func2(n));
            System.out.println("n�Ľ׳˺�");
            for (int i = 1; i <= n; i++) {
                sum += func2(i);
            }
            System.out.printf("%d\n\n", sum);
        }

    }

    //�ݹ���n�Ľ׳�
    public static int func1(int n, int sum) {
        if (n == 1) {
            return sum;
        }
        sum *= n;
        return func1(n - 1, sum);
    }

    //forѭ����n�Ľ׳�
    public static int func2(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;

    }
}






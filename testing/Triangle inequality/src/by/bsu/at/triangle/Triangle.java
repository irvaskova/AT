package by.bsu.at.triangle;

import java.util.Scanner;

public class Triangle {
    public static boolean isTriangle(int a, int b, int c) {
        if ((a + b) > c && (a + c) >  b && (b + c) > a)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        Scanner sb = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int a = sa.nextInt();
        int b = sb.nextInt();
        int c = sc.nextInt();
        boolean res;
        res = isTriangle(a,b,c);
        System.out.println(res ? "Треугольник существует.":"Треугольник не существует.");
    }
}

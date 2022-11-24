package main.ch2;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println("x: " + x + " y: " + y); // x: 10 y: 20

        // 두 값을 교환을 하려고 이렇게 바꿈
        x = y;
        y = x;

        System.out.println("x: " + x + " y: " + y); // x: 20 y: 20

        // 교환하기 위해서는 임시 저장소 필요

        int m = 10;
        int n = 20;
        int temp;

        temp = m;
        m = n;
        n = temp;

        System.out.println("m: " + m + " n: " + n); // m : 20 n: 10;
    }
}

package main.ch2;

public class CastingEx1 {
    public static void main(String[] args) {
        // 형변환
        // (타입) 피연산자

        double d1 = 85.4;
        int score = (int) d1; // double -> int 로 형변환

        System.out.println("score = " + score);
        System.out.println("d1 = " + d1);

        // 정수간 형변환
        // 주의할 점 값 손실 발생 가능성
        int i1 = 10;
        byte b1 = (byte) i1;
        System.out.printf("[int -> byte] i1 = %d -> b1 = %d%n", i1, b1);

        i1 = 300;
        b1 = (byte) i1;
        System.out.printf("[int -> byte] i1 = %d -> b1 = %d%n", i1, b1);

        b1 = 10;
        i1 = (int) b1;
        System.out.printf("[byte -> int] b1 = %d -> i1 = %d%n", i1, b1);

        b1 = -2;
        i1 = b1; // 자동 형변환 가능
        System.out.printf("[byte -> int] b1 = %d -> i1 = %d%n", i1, b1);

        System.out.println("i1 = " + Integer.toBinaryString(i1));

        // 실수간 형변환
        float f1 = 9.1234567f;
        double d2 = 9.1234567;
        double d3 = (double) f1;

        System.out.printf("f1 = %20.18f%n", f1);
        System.out.printf("d2 = %20.18f%n", d2);
        System.out.printf("d3 = %20.18f%n", d3);
    }
}

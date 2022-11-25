package main.ch2;

public class PrimitiveTypeEx3 {
    public static void main(String[] args) {
        /*
        정수형
        저장 가능한 값의 범위
        byte    -128 ~ 127
        short   -2^15 ~ 2^15 - 1
        int     -2^31 ~ 2^31 - 1
        long    -2^63 ~ 2^63 - 1
         */

        // 타입이 표현할 수 있는 값의 범위를 넘어서는 것을
        // 오버 플로우!!
        short sMin = -32768;
        short sMax = 32767;

        System.out.println("sMin = " + sMin);
        System.out.println("sMax = " + sMax);

        // 부호 비트가 0 과 1 서로 뒤바뀔 때 오버플로우 발생
        System.out.println("sMin - 1 = " + (short) (sMin - 1));
        System.out.println("sMax + 1 = " + (short) (sMax + 1));
    }
}

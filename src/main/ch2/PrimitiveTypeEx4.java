package main.ch2;

public class PrimitiveTypeEx4 {
    public static void main(String[] args) {
        /*
        실수형
        저장 가능한 값의 범위
        float 1.4 * 10^-45 ~ 3.4 * 10^38 7자리
        double 4.9 * 10^-324 ~ 1.8 * 10^308 15자리
         */

        // double 은 보통 범위 때문에 쓰는 것보다 높은 정밀도를 요구할 때 사용
        // double 유래는 float 보다 약 두배의 정밀도를 가져서 붙여짐
        // 실수형에서는 오버플로우 발생하면 무한대가 발생한다

        // 언더 플로우가 있다
        // 실수형으로도 표현할 수 없는 아주 작은 값이 되는 경우
        float f1 = 9.123345678901234567890f;
        float f2 = 1.2345678901234567890f;
        double d1 = 9.123345678901234567890d;

        System.out.printf("       123456789012345678901234%n");
        System.out.printf("f1 :   %f%n", f1); // 소수점 6째자리까지 출력
        System.out.printf("f1 : %24.20f%n", f1);
        System.out.printf("f2 : %24.20f%n", f2);
        System.out.printf("d1 : %24.20f%n", d1);
    }
}

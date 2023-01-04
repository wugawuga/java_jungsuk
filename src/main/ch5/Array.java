package main.ch5;

public class Array {
    public static void main(String[] args) {
        // 타입[] 변수명;
        int[] intArray;

        // 타입 변수명[];
        String strArray[];

        // 타입[] 변수명;
        // 변수명 = new 타입[배열의 길이];
        int[] intArray1;
        intArray1 = new int[3];

        // 선언과 생성 동시에
        int[] intArray2 = new int[3];

        // [3] -> 3 은 인덱스
        int[] intArray3 = new int[3];

        // int findInt = intArray[index];

        int[] ints = {1, 2, 3, 4, 5};
        for (int i = 0; i < ints.length; i++) {
            System.out.println("ints[i] = " + ints[i]);
        }
        for (int anInt : ints) {
            System.out.println("anInt = " + anInt);
        }
        // i 값을 변경할 수 없다. 그냥 반복문에선 ints[i] = 10; 이런 식으로 재할당 가능하다
        // 하지만 향상된 반복문에선 i 에 재할당을 해도 배열 요소는 변하지 않는다
    }
}

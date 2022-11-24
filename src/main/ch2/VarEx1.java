package main.ch2;

public class VarEx1 {
    public static void main(String[] args) {
        int year = 0;
        int age = 22;

        System.out.println(year);
        System.out.println(age);

        year = age + 2000;  // 변수 age 값에 2000을 더해서 변수 year 에 저장
        age = age + 1;      // 변수 age 에 저장된 값을 1 증가

        System.out.println(year);
        System.out.println(age);
    }
}

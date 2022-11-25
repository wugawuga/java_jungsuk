package main.ch2;

public class StringEx {
    public static void main(String[] args) {
        String name = "Ja" + "va";
        String str = name + 8.0;

        System.out.println(name);
        System.out.println(str);
        System.out.println(7 + " ");
        System.out.println(" " + 7);
        System.out.println(7 + "");
        System.out.println("" + 7);
        System.out.println("" + "");

        // 덧셈 연산자는 왼쪽에서 오른쪽의 방향으로 연산을 수행
        // 결합순서에 따라 결과가 달라짐에 주의
        System.out.println(7 + 7 + "");
        System.out.println("" + 7 + 7);
    }
}

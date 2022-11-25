package main.ch2;

public class PrimitiveTypeEx2 {
    public static void main(String[] args) {
        char ch = 'A';

        System.out.printf("%c = %d (%#X)%n", ch, (int) ch, (int) ch);

        char hch = '가';
        System.out.printf("%c = %d (%#X)%n", hch, (int) hch, (int) hch);

        // A = 65 (0X41)
        // 가 = 44032 (0XAC00)
    }
}

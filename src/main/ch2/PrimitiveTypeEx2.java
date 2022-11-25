package main.ch2;

public class PrimitiveTypeEx2 {
    public static void main(String[] args) {
        char ch = 'A';

        System.out.printf("%c = %d (%#X)%n", ch, (int) ch, (int) ch);

        char hch = '가';
        System.out.printf("%c = %d (%#X)%n", hch, (int) hch, (int) hch);

        // A = 65 (0X41)
        // 가 = 44032 (0XAC00)

        /* 특수문자
             \t tab
             \b backspace
             \f form feed
             \n new line
             \r carriage return
             \\ 역슬래시
             \' 작은따옴표
             \" 큰따옴표
        */
        System.out.println("======특수문자======");
        System.out.println('\'');
        System.out.println("abc\t123\b456");
        System.out.println('\n');
        System.out.println("\"Hello\"");
        System.out.println("c:\\");
    }
}

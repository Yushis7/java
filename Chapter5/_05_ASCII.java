package chap5;

public class _05_ASCII {
    public static void main(String[] args) {
        //아스키 코드(ANSI) : 미국 표준 코드
        char c = 'A';
        System.out.println(c);
        System.out.println((int)c);

        c = 'B';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);
        //알파벳 대문자A는 65부터 소문자a는 97부터 숫자0은 48부터 시작

    }
}

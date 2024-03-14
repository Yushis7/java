package Chap3;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); //s1=s2같으면 true아니면 false
        System.out.println(s2.equals("python"));//대소문자 구분해서 false
        System.out.println(s2.equalsIgnoreCase("python"));
        //대소문자 구분없이 체크하기

        //문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보
        s2 = "1234";
        System.out.println(s1.equals(s2)); //true(내용)
        System.out.println(s1 == s2);//true(참조)

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false 왜 위에와 다른가? new String을 쓰면 완전히 달라짐
        //서로 참조하는 곳이 다름 즉 그냥 s1,s2를 하면 같은 공간에 참조지만
        //new string을 쓰면 다른 공간에 다른 참조를 쓰게 된다

    }
}

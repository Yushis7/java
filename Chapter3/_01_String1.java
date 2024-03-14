package Chap3;

import java.sql.SQLOutput;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and python and C.";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length()); // 글자 수가 몇 자인지

        //대소문자 변환
        System.out.println(s.toUpperCase()); //대문자로 변형
        System.out.println(s.toLowerCase()); //소문자로 변형

        //포함관계
        System.out.println(s.contains("Java"));//단어가 포함된다면 true,아니면 false
        System.out.println(s.contains("c#"));
        System.out.println(s.indexOf("Java"));//위치 정보 확인
        //string s 에서 I like Java니까 0부터 시작해서 띄어쓰기까지 7번쨰 위치
        System.out.println(s.indexOf("c#"));//위치에 없으면 -1
        System.out.println(s.indexOf("and"));//처음 일치하는 위치 정보
        System.out.println(s.lastIndexOf("and"));//뒤부터 새는 방법 아마 스피드떄문에 쓰는듯?
        System.out.println(s.startsWith("I like"));//이 문자열로 시작하면 true 아니면 false
        System.out.println(s.endsWith("."));//이 문자열로 끝나면 true 아니면 false



    }
}

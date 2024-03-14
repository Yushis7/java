package Chap3;

public class _02_Stirng2 {
    public static void main(String[] args) {
        String s = "I like Java and python and C.";

        //문자열 변환
        System.out.println(s.replace(" and", ","));
        //and를 ,로 바꿔줌
        System.out.println(s.substring(7));
        //인덱스 기준 7부터 시작(이전내용은 삭제)
        System.out.println(s.substring(s.indexOf("Java")));
        //위에꺼랑 똑같은데 Java부터 해서 좀 더 쉽게
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf(".")));
        //Java부터 시작해서 맨 끝에 .만 없애버리기


        //공백 제거
        s = "             I love Java.        ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞뒤공백제거

        //문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1+s2); // 단어 합체
        System.out.println(s1+","+s2); // 단어 사이 문자넣어서 합체
        System.out.println(s1+",C#,"+s2);
        System.out.println(s1.concat(",").concat(s2));
        //concat함수를 써서도 가능

        //3:22:20

    }
}

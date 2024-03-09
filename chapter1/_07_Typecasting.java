package Chap1;

public class _07_Typecasting {
    public static void main(String[] args) {
        //형변환 Typecasting
        //정수형에서 실수형으로 , 실수형에서 정수형으로 변환

//        int score = 93 + 98.8 ; 이런식이면 계산이 안되니
        int score = 93;
        System.out.println(score);
        System.out.println((float)score); //float넣으니 소수점 나옴
        System.out.println((double)score); // 이것도 실수가능

        //float,double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int)score_f);
        System.out.println((int)score_d);

        //정수+실수 연산
        score = 93 +(int) 98.8; //93+98
        System.out.println(score);

        score_d =(double) 93+98.8; //93.0+98.8
        System.out.println(score_d);

        //변수에 형변환된 데이터 삽입
        double convertedScoreDouble = score; // 191 ->191.0 변환됨
        // int ->long ㅡ> float ㅡ> double(자동형변환)

//        int convertedScoreInt = score_d; //191.8 ㅡ>191
        //실수에서 정수로 바뀌다보니 소수점이 짤린다는 걸 알려주는 붉은줄
        int cconvertedScoreInt = (int)score_d; //그래서 int넣어줌

        //숫자를 문자열로
        String s1 = String.valueOf(93); //문자열로 바꿔줌
        s1 = Integer.toString(93);  //문자열로 바꿔주는 기능
        System.out.println(s1);

        //실수를 문자열로
        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        //문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i); // 문자93을 숫자로 바꿈

        //문자열을 실수로
        double d = Double.parseDouble("98.8");
        System.out.println(d);

        //문자 자체를 숫자로 바꾸려고 하면?
//        int error = Integer.parseInt("자바");
        //실행해보면 알듯이 안된다고 나옴





    }
}

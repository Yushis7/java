package Chap2;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;
        System.out.println(김치찌개||계란말이||제육볶음);
        //하나라도 True면 true다(쏘쏘한 식당)
        System.out.println(김치찌개 &&계란말이 && 제육볶음);
        //모두 True면 True다(최고의 식당 찾기 성공)

        //and 연산
        System.out.println((5 > 3) && (3 > 1)); //둘다 진실
        System.out.println((5>3)&&(3<1)); //하나만 진실 그래서 false

        // Or 연산
        System.out.println((5>3)||(3>1));//하나롣 만족하니 True
        System.out.println((5>3)||(3<1));//하나라도 만족하니 True
        System.out.println((5<3)||(3<1));//둘다 틀렸으니 false

//        System.out.println(1<3<5); 는 안되지만;
        System.out.println(1<3 && 3<5); // 는 가능

        //논리 부정 연산자
        System.out.println(!true); //!는 반대로
        System.out.println(!false);
        System.out.println(!(5==5)); //false
        System.out.println(!(5==3)); //true



    }
}

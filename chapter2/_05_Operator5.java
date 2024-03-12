package Chap2;

public class _05_Operator5 {
    public static void main(String[] args) {
        //삼항 연산자
        //결과 = (조건)? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x= 3;
        int y =5;
        int max = (x>y) ? x:y;
        System.out.println(max); //5 거짓이니 5결과값

        int min = (x<y) ? x:y;
        System.out.println(min); //3 참이니 3결과값

        boolean b= (x==y) ? true : false;
        System.out.println(b); //false x=y인지 아닌지

        String s = (x != y) ? "달라요" : "같아요";
        System.out.println(s); // x=y가 다르니 달라요

        int z = 120;
        int w = 115;
        int cm = (z <= w) ? z:w;
        System.out.println("키가"+cm+"이므로 탑승이 불가합니다");

        int v = 121;
        int cm2 = (z > v) ? z:v;
        System.out.println("키가"+cm2+"이므로 탑승이 가능합니다");



    }
}

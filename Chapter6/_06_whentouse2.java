package chap6;

public class _06_whentouse2 {
    public static int getPower(int number,int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args){
        //2의 2승 구하기
        System.out.println(getPower(2,2));
        //3의 3승 구하기
        System.out.println(getPower(3,3));
        //4의 2승 구하기
        System.out.println(getPower(4,2));
    }
}
//두가지방법 중 더 편한거 쓰면 됨


package chap6;

public class _02_parameter {
    public static void power(int number){
        //number를 거듭제곱으로 바꿔줌
        int result = number*number;
        System.out.println(number + "의 2승은"+ result);
    }

    public static void powerByexp(int number,int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의"+exponent+"승은"+result);
        //2^3승같은거 만드는거

        
    }


    public static void main(String[] args) {
        //전달값 parameter
        //2 -> 2*2 =4
        //3 -> 3*3 =9

        //Argument , 인수
        power(2); // 2*2 = 4
        power(3); // 3*3= 9
        powerByexp(2,3); // 2*2*2
        powerByexp(3,3);
        powerByexp(10,0);

    }
}

package chap6;

public class _06_whentouse {
    public static void main(String[] args) {
        //메소드가 필요한 이유

        //2의 2승 구하기
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *=2;
        }
        System.out.println(result); // 2*2=4

        //3의 3승 구하기
        result = 1;
        for (int i = 0; i < 3; i++) {
            result *=3;
        }
        System.out.println(result); // 3*3*3 = 27

        //4의 2승 구하기
        result =1;
        for (int i = 0; i < 2; i++) {
            result *=4;
        }
        System.out.println(result); //4*4
    }
    //메소드를 쓰는 이유는 중복되는 코드를 없애기 위해

}

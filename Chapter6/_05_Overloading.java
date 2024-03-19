package chap6;

public class _05_Overloading {
    public static int getPower(int number){
        int result = number * number;
        return result;
        //return number *number;
    }
    public static int getPowerStr(String strnumber){
        int number = Integer.parseInt(strnumber);
        return number *number;
    }

    public static int getPowerExp(int number,int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        //메소드 오버로딩 이름이 같은 메소드 여러개 만들기
        System.out.println(getPower(3)); // 3*3
        System.out.println(getPowerStr("4")); //4*4

    }
}

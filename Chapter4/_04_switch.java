package chap4;

public class _04_switch {
    public static void main(String[] args) {
        //중고 상품의 등급에 따른 가격 책정
        //1급 최상 , 4등 최하
        int grade = 1; //등급
        int price = 7000; // 기본가격
        switch (grade) {
            case 1:
                price += 1000; //price = price+1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade +"등급 제품의 가격 :" +price+"원");
    }
}

//범위가 어디서부터~어디까지면 if문을 쓰고
//범위가 아닌 정확한 위치와 값이 정해진 경우 case문을 쓴다


package chap4;

public class _03_elseif {
    public static void main(String[] args) {
        //조건문 elseif
        //한라봉 에이드 존재시 +1
        //또는 망고주스가 존재시 +1
        //또는 아아 +1

        boolean hanrabongade = false;// 한라봉에이드
        boolean mangojuice = true; // 망고주스
        boolean orangejuice = true; // 오렌지쥬스
        // true,false로 어떻게 바꾸느냐에 따라 if문 주문완료가 바뀜

        if (hanrabongade) {
            System.out.println("한라봉 에이드+1");
        } else if (mangojuice) {
            System.out.println("망고주스+1");
        }else if (orangejuice){
            System.out.println("오렌지주스+1");
        } else { // else는 없어도 작동 함
            System.out.println("아아_1");
        }
        System.out.println("주문완료");

    }
}

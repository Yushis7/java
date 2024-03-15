package chap4;

public class _06_While {
    public static void main(String[] args) {
        //반복문은 while
        //수영장에서 수영 할 때
        int distance = 25; // 전체거리 25m
        int move = 0; // 현재 이동 거리 0m
        while (move < distance) {
            //현재 이동거리가  전체 거리보다 작다는 조건이 참일 때 반복
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : "+ move);
            move += 3; // 3m이동
        }
        System.out.println("도착하였습니다");

        //무한 루프
        move = 0;
        while (move < distance) {
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : "+ move);
        }
        System.out.println("도착하였습니다"); // 무한반복이 안끝나면 빨간버튼



    }
}

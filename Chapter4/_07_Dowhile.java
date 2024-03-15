package chap4;

public class _07_Dowhile {
    public static void main(String[] args) {
        //반복문 dowhile
        int distance = 25;
        int move = 0;
        int height = 2 ; //키 2m
        while (move+height < distance) {
            System.out.println("발차기를 합니다");
            System.out.println("현재 이동거리는"+move);
            move += 3;
        }
        System.out.println("도착했습니다.");

        //do while 반복문
        do{
            System.out.println("발차기를 합니다");
            System.out.println("현재 이동거리는"+move);
            move += 3;
        }while (move + height < distance);
        System.out.println("도착했습니다.");
        }
    }


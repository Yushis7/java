package chap5;

public class _04_mutiearrayloop2 {
    public static void main(String[] args) {
        //세로크기10 x 가로크기 15 에 해당하는 영화관 좌석 만들기
       // 이건 7:12 아스키코드 용으로 만든거
        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) { //세로
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) +(j+1);
            }
            ch++;
        }

        //영화관 좌석 번호 확인
        for (int i = 0; i < seats3.length; i++) {//세로
            for (int j = 0; j < seats3[i].length; j++) {//가로
                System.out.print(seats3[i][j]+" "); //A1 A2 A3
            }
            System.out.println();

        }
    }
}
//07:00:00 구직 활동하느라 좀 집중력 흩어짐 다시 보기 24.1.18
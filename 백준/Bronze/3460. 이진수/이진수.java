import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();  // 테스트 케이스의 개수
        
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int position = 0;  // 비트 위치
            
            while (n > 0) {
                if ((n & 1) == 1) {  // 현재 비트가 1인지 확인
                    System.out.print(position + " ");
                }
                n = n >> 1;  // 오른쪽으로 1 비트 이동
                position++;  // 비트 위치 증가
            }
            System.out.println();  // 각 테스트 케이스마다 줄바꿈
        }
        
        in.close();  // Scanner 닫기
    }
}
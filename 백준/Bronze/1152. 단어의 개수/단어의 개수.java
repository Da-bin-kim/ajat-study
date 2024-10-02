import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine().trim();  // 문자열 앞뒤 공백 제거
        scan.close();
        
        if (string.isEmpty()) {
            System.out.println(0);
            return;
        }
        
        int count = 0;
        
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            // 공백이 나오면 단어 하나가 끝났다고 가정
            if (c == ' ' && i != 0 && i != string.length() - 1) {
                count++;
            }
        }
        
        // 마지막 단어는 공백이 없기 때문에 count + 1
        System.out.println(count + 1);
    }
}

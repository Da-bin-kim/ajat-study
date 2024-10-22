import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); 
        
        for (int i = 0; i < t; i++) {
            String b = "";
            int N = in.nextInt();
            while (N != 0) {
                b += N % 2;
                N = N / 2;
            }
            
            for (int j = 0; j < b.length(); j++) {
                if (b.charAt(j) == '1') {
                    System.out.print(j + " ");
                }
            }
            System.out.println(); 
        }
    }
}
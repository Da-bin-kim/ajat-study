import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int count = 0;
        int result = 0;
        
        for (int i = 1; i <= N ; i++){
            if((N % i) == 0){
                count++;
            }
            if(count == K){
                result = i;
                break;
            }
        }
        
        System.out.println(result);
    }
}
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
        int d1, d2, d3, prizeD;
		d1 = in.nextInt();
		d2 = in.nextInt();
		d3 = in.nextInt();
        prizeD = 0;
        
        if(d1 == d2 || d1 == d3 || d2 == d3){ //같은 눈이 있는 경우
            if(d1 == d2 && d2 == d3){ //셋 다 같은 경우
                prizeD = d1;
                System.out.print(10000 + prizeD * 1000);
            }else{ //두 개만 같은 경우
                if (d1 == d2 || d1 == d3){
                    prizeD = d1;
                }else if (d2 == d3){
                    prizeD = d2;
                }
                System.out.print(1000 + prizeD * 100);
            }
            
        }else{ //모두 다른 눈인 경우
            if (d1>d2){
                prizeD = d1;
            }else{
                prizeD = d2;
            }
            if (prizeD < d3){
                prizeD = d3;
            }
            System.out.print(prizeD * 100);
        }
    }
}
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
        //입력 받음
		Scanner in = new Scanner(System.in);
        String str = "";
        for(int i = 1; i <= 10; i++){
            str += in.nextLine();
            if (i < 10) {
                str += " ";
            };
        }
        String[] strArr = str.split(" ");
        
        //계산
        int max = 0;
        int count = 0;
        for(int i = 0; i < strArr.length; i++){
            if(i%2 == 0){ //내림
                count -= Integer.parseInt(strArr[i]);
            }else{ //탐
                count += Integer.parseInt(strArr[i]);
            }
            if(count >= max){
                max = count;
            }
        }
        
        System.out.print(max);
    }
}
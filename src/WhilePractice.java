import java.util.Scanner;

public class WhilePractice {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int i=65, count=0;
			while(i<=90) {
				int a=count/5;
				if(a%2==0) {
				System.out.printf("%c\t",i);
				i++;
			}System.out.println();
		}
	}	
}
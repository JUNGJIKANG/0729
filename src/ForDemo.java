import java.util.Scanner;

public class ForDemo {
	public static void main(String[] args) {
//		int sum=0;
//		for(int i=1; i<=100; i++) {
//			sum+=i;
//		} 
//		System.out.print("sum="+sum); //1부터100까지 더한 값
		
		Scanner sc=new Scanner(System.in);
		System.out.println("몇 factorial : ");
		int su=sc.nextInt();
		int result=1;
		for(int i=su; i>=1; i--) {
//			result=result*i;
			result*=i;
		}
		System.out.printf("%d!=%d\n",su,result);
	}
}

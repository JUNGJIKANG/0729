import java.util.Scanner;

public class DoWhileDemo_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// for문을 활용한 코딩
		int rand1, rand2;
		for(;;) {
		rand1=(int)(Math.random()*6+1); //math 클래스에서 참조해오는 것.
		rand2=(int)(Math.random()*6+1); //math 클래스에서 참조해오는 것.
		if(rand1!=rand2)break;
		}
		System.out.println("rand1="+rand1+", rand2="+rand2); 
		
		//dowhile문을 활용한 코딩
		do {
			rand1=(int)(Math.random()*6+1); 
			rand2=(int)(Math.random()*6+1); 
		}while(rand1==rand2);
		System.out.println("rand1="+rand1+", rand2="+rand2);
	} 
}

//1부터 6까지의 랜덤값을 추출하되, 서로 다른 두 개를 출력하는 프로그램
//Dowhile, for, Random 시용
//random 2개를 먼저 뽑자
import java.util.Scanner;

public class DoWhileDemo_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// for문을 활용한 코딩
		int a, b, c, d, e, f;
		for(;;) {
		a=(int)(Math.random()*45+1); 
		b=(int)(Math.random()*45+1); 
		c=(int)(Math.random()*45+1); 
		d=(int)(Math.random()*45+1); 
		e=(int)(Math.random()*45+1); 
		f=(int)(Math.random()*45+1); 
		if(a==b||a==c||a==d||a==e||a==f
		||b==c||b==d||b==e||b==f
		||c==d||c==e||c==f
		||d==e||d==f)break;
		}
		System.out.println("A="+a+", B="+b+", C="+c+", D="+d+", E="+e+", F="+f); 
		
		//dowhile문을 활용한 코딩
//		do {
//			rand1=(int)(Math.random()*6+1); 
//			rand2=(int)(Math.random()*6+1); 
//		}while(rand1==rand2);
//		System.out.println("rand1="+rand1+", rand2="+rand2);
	} 
}

//1부터 6까지의 랜덤값을 추출하되, 서로 다른 두 개를 출력하는 프로그램
//Dowhile, for, Random 시용
//random 2개를 먼저 뽑자
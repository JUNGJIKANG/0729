import java.util.Scanner;
public class MyCalendar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Year : "); int year=sc.nextInt();
		System.out.print("Month : "); int month=sc.nextInt();
		int day=1;
		int sum=0;
		for(int i=1; i<year; i++) {
			if((year%400==0)||(year%4==0&&year%100!=0)) {//i가 윤년입니까
				sum+=366; //i가 윤년이라면
			}else {
				sum+=365;//i가 윤년이 아니라면
			}
		}
	 //작년 12월 31일까지 합
	
	for(int i=1; i<month; i++) {
		sum+= getLastDay(year, i);
	}//올해 6월까지 합
	sum++; //6월 마지막날 다음 날
	int space=sum%7; //sum을 7로 나눠서 얼마만큼의 공백이 나오는지에 대한 계산
	
	System.out.println("                     <<<"+year+"년"+month+"월>>>");
	System.out.println("日\t火\t月\t水\t木\t金\t土");
	//첫 째주.
	int count=0;
	for(int i=0; i<space; i++) {
		System.out.print("★\t");
		count++;
	}	
	//첫 주 1일부터 마지막 날까지 출력
	int lastDay = getLastDay(year,month);
	for(int i=1; i<=lastDay; i++) {
		System.out.print(i+"\t");
		count++;
		if(count%7==0)System.out.println();
	}
	
	for(int i=count; i%7!=0; i++) {
		System.out.print("★\t");
	}
//	switch(sum%7) {
//	case 0 : System.out.println("SUN"); break;
//	case 1 : System.out.println("MON"); break;
//	case 2 : System.out.println("TUE"); break;
//	case 3 : System.out.println("WED"); break;
//	case 4 : System.out.println("THU"); break;
//	case 5 : System.out.println("FRI"); break;
//	case 6 : System.out.println("SAT"); break;
	} //main() end
 
	//년도와 월을 입력받아서 그 달 마지막 일을 넘겨주는 메소드
static int getLastDay(int year, int month){ //지역변수, 같은 이름을 써도 겹치지 않음(다른 Static에서 적용되기 때문에)
	int lastDay=0;
	if(month==2) { //2월이라면
		if((year%400==0)||(year%4==0&&year%100!=0)) lastDay=29; //2월인데 윤년일 떄,
		else lastDay =28;
	}else if(month!=2) { //2월이 아니라면
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) lastDay =31;
		else lastDay =30;
	}
	return lastDay; 
}
}
import java.util.Scanner;
class IfTestLeapYear{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int year=s.nextInt();
		if(year>0&&year%4==0&&year%100!=0){
			System.out.println(year+"年是闰年");
		}else if(year>0&&year%400==0){
			System.out.println(year+"年是闰年");
		}else{
			System.out.println(year+"年不是闰年");
		}
	}
}
/*
目标：通过API文档学习使用math类中的方法，来生成一个随机数。

1. 找到math类
2. math类属于java.lang包，无需导包
3. 看版本
4. 看math类的结构，没构造函数，所有成员都是静态
5. 看method summary，找到可以生成随机数的方法
6. 找到random()方法，
7. 研究random()的修饰符、返回值类型、和参数列表
8. 在程序中调用random()

*/
import java.util.Scanner;

class MathDemo{
	public static void main(String[] args){
		/* double a=Math.random();
		System.out.println(a);
		
		//再生成一百个零到一百间的随机数
		for(int i=0;i<100;i++){
			int b=(int)(Math.random()*100)+1;
			System.out.println(b);
		} */
		new MathGame().game();
		
	}
}

/*
我们再来做一个猜随机数的小游戏
分析：
	创建一个0-100的随机整数a
	输入一个整数b
	
	判断b==a
	如果相等，输出“你猜对了”
	如果b>a，输出“大了”
	如果b<a，输出“小了”
	
	循环上述过程，直到a==b为true
	因为循环次数未知且判断条件复杂，所以用死循环
	
*/
class MathGame{
	public static void game(){
		int a=(int)(Math.random()*100)+1;
		for(;;){
			System.out.println("请输入你猜的数字:");
			Scanner s=new Scanner(System.in);
			int b=s.nextInt();
			if(b==a){
				System.out.println("你猜对了");
				return;
			}else if(b>a){
				System.out.println("大了");
			}else{
				System.out.println("小了");
			}
		}
	}
}

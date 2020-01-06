//定义一个功能，比较两数是否相等。
import java.util.Scanner;
class FunctionTest2{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		boolean x=compare(a,b);
		System.out.println(x);
	}
	public static boolean compare(int a,int b){
		/* if(a==b){
			return true;
		}else{
			return false;
		} 
		太复杂了
		用三元运算符呢？
		return (a==b)?true:false;
		同样有些麻烦，而且以上两种写法都存在一个问题：
		if（true）{
			true
		}
		就是如果真，返回真，相当于写废话……
		*/
		return a==b;
	}
}
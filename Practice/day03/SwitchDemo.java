class SwitchDemo{
	public static void main(String[] args){
		/* 
		switch 语句:
		
		switch(表达式)
		{
			case 取值1:
			执行语句;
			break;
			case 取值2:
			执行语句;
			break;
			……
			default:
			执行语句;
			break;
		}
		*/
		int x=3;
		switch(x){
			case 1:
			System.out.println("x="+x);
			break;
			case 2:
			System.out.println("x="+x);
			break;
			case 3:
			System.out.println("x="+x);
			break;
			default:
			System.out.println("不知道x等于多少");
			break;
		}
		
		/* switch语句的特点 */
		/* 1. switch语句选择的数据类型只有四种：byte、short、int、char */
		int a=6,b=3;
		char opt='/';
		switch(opt){
			case '+':
			System.out.println(a+b);
			break;
			case '-':
			System.out.println(a-b);
			break;
			case '*':
			System.out.println(a*b);
			break;
			case '/':
			System.out.println(a/b);
			break;
			default:
			System.out.println("无法识别该运算符号");
			break;
			//不要把大键盘1左边的点当成了分号右边的点，分号右边的点才是单引号。
		}
		/* 2. 各个case与default之间没有顺序关系，即使把default放在最前面，也是先执行第一个case，
		在所有case执行完毕后，表达式不符合所有case条件时，才会执行default。*/
		switch(x){
			default:
			System.out.println("不知道x等于多少");
			break;
			case 1:
			System.out.println("x="+x);
			break;
			case 2:
			System.out.println("x="+x);
			break;
			case 3:
			System.out.println("x="+x);
			break;			
		}
		/* 
		3. switch语句只有遇到break或执行到语句结束才会停止（即遇到大括号）。
		因此，如果匹配的case或default没有对应的break语句，那么switch语句会继续执行，直到遇到break语句或者大括号。
		*/
		int y=4;
		switch(y){
			default:
			System.out.println("a");
			//break;
			case 1:
			System.out.println("b");
			//break;
			case 2:
			System.out.println("c");
			//break;
			case 3:
			System.out.println("d");
			break;
		}
	}
}
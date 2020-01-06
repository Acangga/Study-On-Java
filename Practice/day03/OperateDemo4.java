class OperateDemo4{
	public static void main(String[] args){
		/*逻辑运算符有什么用？
		用于连接两个boolean类型的表达式
		
		&:与
		true&true=true
		true&false=false
		false&true=flase
		false&false=false
		即只有两个表达式的结果都为true时，与表达式的结果才为true。有任何一个条件为false，结果即为false。
		
		|:或
		true|true=true
		true|false=true
		false|true=true
		false|false=false
		两个表达式中任一个表达式的结果为true，结果即为true。
		
		^:异或
		true^true=false
		true^false=true
		false^true=true
		false^false=false
		两个表达式结果如果相同，结果为false；两个表达式结果如果不同，结果为true。
		
		!:非
		判断事物的另一面
		!true=false
		!false=true
		!!true=true
		
		&&:双与（短路）
		和&运算的结果是一样的，只是运算过程有一点区别。
		&：无论&左边的表达式结果为何，都会运算右边的表达式。
		&&：左边的表达式为false时，右边的表达式不参与运算。因为左边的表达式已经为false，无论右边的表达式结果为什么，都不会影响与运算的结果。
		
		||：双或（短路）
		和|运算的结果是一样的，只是运算过程有一点区别。
		|：无论|左边的表达式结果为何，都会运算右边的表达式。
		||：左边的表达式为true时，右边的表达式不参与运算。因为左边的表达式已经为true，无论右边的表达式结果为什么，都不会影响与运算的结果。
		
		
		*/
		int x=6;
		//与
		System.out.println(x>2&x<5);//false
		//或
		System.out.println(x>2|x<5);//true
		//异或
		System.out.println(x>2^x<5);//true
		//非
		System.out.println(!true);//false
		System.out.println(!(x>3));//false
	}
}
class OperateDemo{
	/*
	算术运算符 + - * / %（取余，模运算） +（字符、字符串，起连接符的作用）
	++（自增。在初始数据上+1，再赋值给原数据）
	*/
    public static void main(String[] args){
    	int x=456;
        x=x/100*100;
        System.out.println(x);/*输出结果为400。因为456除以100等于4.56，有两位小数，而整数见进行加减乘除等运算得出的结果的默认数据类型也是整数，所以java底层会默认将0.56舍去，所以得到400*/
		int y=-5%2;
		int z=5%-2;
		System.out.println(y);//结果为-1
		System.out.println(z);//结果为1
		/*因为取模运算只考虑取取模数的正负号*/
		
		int a=4;
		int b=5;
		System.out.println("a="+a+','+"b="+b);//此处的+用于连接字符和数字
		
		int i=3,d;
		i++;//i=i+1,两个步骤，先+1，再赋值给原数据
		System.out.println(i);
		i=3;
		++i;//i=i+1
		System.out.println(i);
		i=3;
		d=i++;
		System.out.println(d+","+i);
		/*结果是i=4,d=3，这是因为，在内存中运算的过程是这样的，先生成整数3，再把3赋值给i，把i的值加载到数据栈，此时i=3，栈顶值为3，运算i+1，此时i=4，将数据栈顶的
		值3取出来，赋给d*/
		i=3;
		d=++i;
		System.out.println(d+","+i);
		/*结果为d=4,i=4，在内存中的运算过程是这样的，先生成整数3，把3赋给i，运算i+1，此时i=4，把i的值加载到数据栈，栈顶值为4，最后将栈顶值取出来，赋给d*/
		
		i=3;
		i=i++;
		System.out.println(i);
		/*结果为i=3，在内存中运算的过程是这样的，先生成整数3，把3赋给i，把i的值加载到数据栈，栈顶值为3，运算i+1，此时i=4，最后把栈顶值取出来，赋给i，此时i=3*/
	}
}
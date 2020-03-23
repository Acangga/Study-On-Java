class Father{
	
	final int age=50;//可以在声明变量时直接进行初始化
	
	final int height;
	{
		height=185;//可以在构造代码块中进行初始化
	}
	
	final int weight;
	Father(){
		weight=80;//可以在构造函数中进行初始化
	}
	
	final String birthday="123";
	{
		birthday="19680419";
	}
	Father(){
		birthday="19680420";
	}
	/* 错误: 可能已分配变量birthday
                birthday="19680420"; 
				
	但不能在构造代码块和构造函数中都对变量进行初始化
	*/
}

/* 
	何时对被final修饰的变量进行初始化？
	
	非静态：
	在构造函数结束前对其进行初始化即可。
	因为无论如何，即使你不给成员变量赋值，构造函数也会对成员变量进行默认初始化，
	给它们赋默认值，那么一旦构造函数运行结束，初始化完成，	由于被final修饰的变量只能被赋值一次，
	你就无法再给被final修饰的变量赋值了，所以我们要在构造函数定义完之前，给被final修饰的成员变量赋值。
	
	静态：
	因为静态变量随着类的加载就已经被加载进内存了，那么当时就已经完成了初始化，无法再被初始化，
	所以被final修饰的静态变量最好在声明时直接进行初始化。
	

*/

class FinalTest2{
	public static void main(String[] args){
		
	}
}
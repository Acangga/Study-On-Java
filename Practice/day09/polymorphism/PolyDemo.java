class Father{
	int num=1;
	void show(){
		System.out.println("show(Father)");
	}	
	static void method(){
		System.out.println("static method(Father)");
	}
	/*如果将上面的代码注释掉，编译时会报错：
	PolyDemo.java:24: 错误: 找不到符号
                System.out.println(f.num);//result:1
                                    ^
	符号:   变量 num
	位置: 类型为Father的变量 f
	PolyDemo.java:25: 错误: 找不到符号
                f.show();//result:show(Son)
                 ^
	符号:   方法 show()
	位置: 类型为Father的变量 f
	PolyDemo.java:26: 错误: 找不到符号
                f.method();//result:static method(Father)
                 ^
	符号:   方法 method()
	位置: 类型为Father的变量 f
	
	由此可知，使用多态方式访问成员变量、成员方法和静态方法时，都会先去父类中寻找对应的成员变量、成员方法和静态方法。
	如果找不到，则无法通过编译。
	
	*/
}

class Son extends Father{
	int num=10;
	void show(){
		System.out.println("show(Son)");
	}
	static void method(){
		System.out.println("static method(Son)");
	}
}

class PolyDemo{
	public static void main(String[] args){
		Father f=new Son();
		System.out.println(f.num);//result:1
		f.show();//result:show(Son)
		f.method();//result:static method(Father)
	}
}
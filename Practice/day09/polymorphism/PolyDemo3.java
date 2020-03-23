class Father{
	void show(){
		System.out.println("show(Father)");
	}
}

class Son extends Father{
	void show(){
		System.out.println("show(Son)");
	}
	void method(){
		System.out.println("only method(Son)");
	}
}

class PolyDemo3{
	public static void main(String[] args){
		//向上转型：相当于儿子穿父亲的衣服，化妆为父亲
		Father f=new Son();
		f.show();
		//f.method();
		/*
		PolyDemo3.java:20: 错误: 找不到符号
                f.method();
                 ^
		符号:   方法 method()
		位置: 类型为Father的变量 f
		1 个错误
		*/
		
		//向下转型
		Son s=(Son)f;
		s.method();
		/* 
		因为f实际上是Son类的实例的引用变量，所以可以向下转型。
		*/
	}
	
}
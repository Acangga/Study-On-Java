class Father{
	int age=50;
}

class FinalTest{
	public static void main(String[] args){
		//基本类型的变量：不可以被重新赋值
		
		final int x=1;
		
		//x=10;
		/* 
		错误: 无法为最终变量x分配值
                x=10;
		*/
		
		//引用类型的变量：变量所指向的实例中的对象包含的成员变量可以被重新赋值，但该引用变量的首地址值不能被重新赋予。
		final Father f=new Father();
		System.out.println(f.age);
		f.age=500;
		System.out.println(f.age);
		//成员变量age可以被重新赋值
		
		f=new Father();
		/* 错误: 无法为最终变量f分配值
                f=new Father(); 
		
		这是要让该引用变量指向另一个实例，即重新赋予它另一个首地址值，这是不可以的
				*/
		
	}
}
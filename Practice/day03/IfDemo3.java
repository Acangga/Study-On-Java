class IfDemo3{
	public static void main(String[] args){
		/*
		if的第三种格式
		
		if(条件语句)
	{
	执行语句；
	}else if(条件语句){
	执行语句；
	}else{
	执行语句；
	}
		*/
		int a=3;
		if(a>1){
		System.out.println("a>1");
		}else if(a>2){
			System.out.println("a>2");
		}else if(a>3){
			System.out.println("a>3");
		}else{
			System.out.println("a>4");
		}
		/* 以上的if语句由多个代码块组成的单条语句，但是它只会输出一个结果，当前面的条件语句判断为true时，后面的代码块就不会再执行 */
	}
}
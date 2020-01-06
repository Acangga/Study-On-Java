class ArrayDemo2{
	public static void main(String[] args){
		int arr[]=new int[3];
		/*
		System.out.println(arr[3]);编译通过但运行时报错：ArrayIndexOutOfBoundsException，即数组索引超出边界
		*/
		
		/*
		arr=null;
		System.out.println(arr[0]);编译通过但运行时报错：NullPointerException,
		当引用类型变量没有指向任何实体时，仍在用其操作实体，就会报出以上错误。
		*/
		

		System.out.println(arr);
		/*
		编译通过，但运行结果为：[I@15db9742，这是一个经过hash算法运算的数据，代表着引用型变量指向的实体的地址值。
		"["代表该引用型变量为数组，I表示该数组中的元素类型为Int型。
		*/
		

		
	}
}
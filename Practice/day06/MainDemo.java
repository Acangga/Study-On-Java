
class MainDemo{
	public static void main(String[] args){
		System.out.println(args);
		/* 结果：[Ljava.lang.String;@15db9742
			[代表数组；L表示参数很长；
			java.lang.String代表java.lang包中的String包，也代表数组中的元素类型是String；
			@15db9742是实体存储的地址的哈希值。
			以上结果证明JVM在调用主函数时确实给main方法传了一个元素是字符串类型的数组实体进去。
		*/
		
		//那么这个数组有长度吗？
		System.out.println(args.length);
		/* 结果：0 
			这说明JVM传了 new String[0] 这样一个参数。
			这似乎没有意义。
			但之所以主函数中有这样一个参数列表，是为了让我们在运行java程序的时候可以传入一些我们需要的参数，
			这是给使用程序的人留下的入口。
			而之所以选择用String[]类型的参数，是因为字符串可以兼容数字，字母等类型的数据，可以将字符串转换为其他类型的数据，
			所以字符串是最通用的数据类型；而为了满足用户传入多个数据的需求，我们选择了元素类型为字符串的数组String[]。
		*/
		
		/* 那么我们怎么传入参数呢？我们在控制台直接传入参数 
			我们直接在控制台键入：java MainDemo haha hehe xixi（想要传入的参数）
			我们遍历一下这个参数列表，发现与我们刚刚传入的参数一致。
		*/
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
	}
	
	public static void main(String[] x){
		System.out.println("ooooo");
	}
	/* 
	MainDemo.java:32: 错误: 已在类 MainDemo中定义了方法 main(String[])
        public static void main(String[] x){
	*/
}
class Test{
	public static void main(String[] args){
		int x=0;
		for(;x<5;x++){
			System.out.println(x);
		}
		System.out.println(x);
	}
}
/* for循环中的条件判断语句也可以对定义在for循环之外的变量进行判断，循环后操作表达式也可以对该变量进行操作，
且由于该变量的作用域大于for循环的作用域，所以该变量在for循环结束后仍然存在于内存中，即for循环对它进行的操作仍然生效，
该变量已经改变。 */
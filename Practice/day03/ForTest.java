class ForTest{
	public static void main(String[] args){
		//练习：用for循环对100以内的数字进行累加
		int sum=0;
		for(int x=1;x<=100;x++){
			sum+=x;
		}
		System.out.println(sum);
		
		/* 
		那么for循环和while循环有什么异同呢？
		1.for和while在功能上是一样的，用for可以实现的，用while也可以。
		2.在格式上不同。
		3.在使用场景上有一点区别，当需要用一个变量来控制循环，但该变量又只有这一个作用时，推荐用for循环，可以节省内存空间。
			若在循环结束后仍需用到该变量，推荐使用循环while。
			因为在for循环结束后，该变量所占用的内存就被释放了，它的作用域就是for循环的范围，而while循环中的变量需要单独定义，
			它的作用域是包含while所在的大括号的范围，所以在while循环结束后，这个变量仍存在于内存中，可以被操作。
		*/
		int x=1;
		while(x<5){
			System.out.println("x="+x);
			x++;
		}
		System.out.println("x======"+x);//打印出“x======5”
		
		for(int y=1;y<5;y++){
			System.out.println("y="+y);
		}
		System.out.println("y======"+y);
		//报错：找不到变量y，因为for循环结束后，变量y占用的内存已经被释放，y已经不复存在。
		
		/* 无限循环：有时我们也不知道需要循环何时停止，就需要让让它一直进行，直到满足某些条件。
		while(true){
			
		}
		想让while循环无限进行下去，只需让它的条件判断语句结果永远为true即可
		
		for(;;){
			
		}
		for循环也一样，但它的条件判断语句在空白时默认为true，所以可以不写。 */
	}
}
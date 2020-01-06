class ForTest3{
	public static void main(String[] args){
		/* 
		打印九九乘法表
		1*1=1
		1*2=2 2*2=4
		1*3=3 2*3=6 3*3=9
		...
		1*9=9 ......9*9=81
		*/
		for(int x=1;x<=9;x++){
			for(int y=1;y<=x;y++){
				System.out.print(y+"*"+x+"="+y*x+"\t");
				/* \t为制表符，它可以把它两边的字符串分别放到两个就像excel中的单元格一样的格子中，
				并左对齐。所以假设有两行字符串“aaaaa”，用制表符将其在不同位置分开，“aa\taaa”，“aaaa\ta”,
				但最后在屏幕上输出时，制表符\t后面的“aaa”和“a”也是对齐在同一列上的。 */
			}
			System.out.println();
		}
		/* 
		\t:转义字符table，制表符
		\b:转义字符backspace，退格
		\n:转义字符enter，回车
		\r:转义字符按下回车键
		
		\r和\n到底是什么关系？
		在windows系统中回车符号其实是由\r\n这两个符号组成的
		linux中回车符号是\n
		*/
		System.out.println("Hello\nWorld");
		System.out.println("Hello\r\nWorld");
		System.out.println("Hello\bWorld");
		System.out.println("\"HelloWorld\"");//想打印单纯的字符",需要用\来将其变为转义字符，表示为\"
		System.out.println("\\HelloWorld\\");//想打印单纯的字符\，需要用\来将其变为转义字符，表示为\\
		
		
	}
}

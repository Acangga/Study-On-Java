/* 
	Q：如何将一个十进制数字转化为十六进制数字？ 
	A：查表法。
	
	遗留问题：
	怎么能让分割线上的编号自己按规律变化？
*/
class ArrayTest2{
	public static void main(String[] args){
		int x=0;
		
		toHex(60);
		toHex_1(60);
		toHex_2(60);
		toHex_3(60);
		toHex_4(60);
		toHex_5(60);
		toHex_6(60);
		trans(60);
	}
	
	public static void toHex(int num){
		int x=num&15;
		num=num>>>4;
		int y=num&15;
		System.out.println(x+"\n"+y);
		System.out.println("--------------------------------0");
	}
	/* 
		输出为12,3，正确，但这是在我们已知要转换的数据转换为十六进制数之后只有两位的情况下，可以如此实现。
		那么，如果要转换的数据比较大，且我们不知道需要进行多少次与运算呢？
		int类型有32个二进制位，即最多有8个十六进制位，所以我们最多需要进行八次与运算，那就要重复写八段代码，比较麻烦，
		所以我们考虑用循环结构来简化我们的代码。
	*/
	
	public static void toHex_1(int num){
		for(int i=0;i<8;i++){
			int temp=num&15;
			num=num>>>4;
			System.out.print(temp+",");
		}
		System.out.println("\n--------------------------------1");
	}	
	/* 
		输出为12,3,0,0,0,0,0,0,正确，然而我们最终要输出的是十六进制数，12在十六进制中应该表示为C，所以该怎么办呢？如何让12对应C呢？
		我们把表示十六进制数所需要的所有元素和对应
		0,1,2,3,4,5,6,7,8,9,A ,B ,C ,D ,E ,F
		0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15
		我们可以发现如果把第二行的数字当成索引的话，这不就是我们刚学过的数组吗？这样一来，数字不就与字母对应起来了吗？
		所以我们可以得出结论：
		Q：什么时候使用数组？
		A:如果两组数据出现了对应关系，而且其中一组数据是有序的整数，并可以作为角标使用，这时就可以考虑使用数组，将这些数据存储到数组中。
		
		所以我们这里就可以将与运算的结果作为索引，去数组中查找对应的元素，从而起到将数字与字母对应起来的效果。
		我们将这种方法称为查表法，如下。
		
	*/
	public static void toHex_2(int num){
		//我们创建了一个数组作为对应关系表
		char[] chs=new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		for(int i=0;i<8;i++){
			int temp=num&15;
			num=num>>>4;
			System.out.print(chs[temp]);
		}
		System.out.println("\n--------------------------------2");
		
	}
	/* 
		输出结果为C3000000，正确，但是我们想要的输出结果是3C，所以我们需要先打印3，后打印C，并且把000000去掉。
		考虑到我们如果要转换的数字比较大，用查表法会得出的数据比较多，所以我们可以将这些数据存储起来，再进行操作。
		所以我们创建一个数组作为临时容器来存储查表法查出的数据。
	*/
	public static void toHex_3(int num){
		// 还是先创建一个关系表
		char[] chs=new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		// 再创建一个数组用来做容器
		char[] arr=new char[8];//因为最多只能查出八个数据，所以将数组长度设定为8。
		//因为我们需要将查出的数据按顺序存储到上面的arr中，所以我们需要一个能够规律变化的变量来控制arr的索引。
		int index=0;
		//为了把000000去掉，我们需要控制当想要转换的数据的有效位已经都取到时就不再进行位运算了。即num!=0时，停止运算。
		while(num!=0){
			int temp=num&15;
			arr[index++]=chs[temp];
			/* 这里可以把arr[index++]=chs[temp];看做：
				int j=index++;
				arr[j]=chs[temp];
				结合循环来看，用j=index++时，j是从0开始增大，
				用j=++index时，j就是从1开始增大。
				因为我们要从索引0的位置开始存储元素，所以采用index++。
			*/
			num=num>>>4;
		}
		//然后我们遍历数组arr
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println("\n--------------------------------3");
	}
	/* 
		结果为C,3, , , , , , ,我们发现还是没有得到3C，且000000虽然没了，但仍然有空位存在。
		所以我们考虑将查表得到的结果按顺序从容器数组arr的尾部，即索引最大的位置开始反向存储，然后正向输出。
		这样就能打印出3C，但仍有空位存在。所以我们用index来控制遍历循环的次数。
		
	*/
	public static void toHex_4(int num){
		char[] chs=new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] arr=new char[8];
		int index=arr.length;
		while(num!=0){
			int temp=num&15;
			arr[--index]=chs[temp];
			num=num>>>4;
		}
		for(int i=index;i<arr.length;i++){
			System.out.print(arr[i]);
		}
		System.out.println("\n--------------------------------4");
	}
	
	/* 
		或者仍然从索引0开始顺序存储，但从index反向遍历。
	*/
	public static void toHex_5(int num){
		char[] chs=new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] arr=new char[8];
		int index=0;
		while(num!=0){
			int temp=num&15;
			arr[index++]=chs[temp];
			num=num>>>4;
		}
		for(int i=index-1;i>=0;i--){
			System.out.print(arr[i]);
		}
		System.out.println("\n--------------------------------5");
	}
	/* 
		如果num为0，程序没有结果，所以我们加上
	*/
	public static void toHex_6(int num){
		if(num==0){
			System.out.print('0');
			return;//不写return的话，这段代码执行结束后还会执行后续代码。
		}
		char[] chs=new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] arr=new char[32];//因为有转换二进制的需要，所以长度8不够用了，增加到32.
		int index=0;
		while(num!=0){
			int temp=num&15;
			arr[index++]=chs[temp];
			num=num>>>4;
		}
		for(int i=index-1;i>=0;i--){
			System.out.print(arr[i]);
		}
		System.out.println("\n--------------------------------6");
	}
	/* 
		在java中提供了现成的进制转换的方法。虽然如此，但我们掌握实现的原理也是有必要的，因为有的编程语言没有这种现成的方法，
		就需要我们自己造轮子。
	*/
	public static void trans(int num){
		System.out.print(Integer.toHexString(num));
		/* 相应的转换二进制、八进制的方法也有
			Integer.toBinaryString(num)
			Integer.toOctalString(num)
		*/
		System.out.println("\n--------------------------------7");
	}
	
}
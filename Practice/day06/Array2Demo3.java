/*
格式二：
	数据类型[][] 数组名=new 数据类型[m][];
	m:表示二维数组中的一维数组个数。
	没有n（列数），也就是说可以动态地给出列数，即列数可变。
*/

class Array2Demo3{
	public static void main(String[] args){
		
		int[][] arr=new int[3][];
		
		System.out.println(arr);//[[I@15db9742
		System.out.println(arr[0]);//null
		System.out.println(arr[1]);//null
		System.out.println(arr[2]);//null
		//System.out.println(arr[1][1]);//java.lang.NullPointerException
		
		//动态地为一维数组们分配空间
		arr[0]=new int[2];
		arr[1]=new int[3];
		arr[2]=new int[1];
		
		System.out.println(arr[0]);//[I@6d06d69c
		System.out.println(arr[1]);//[I@7852e922
		System.out.println(arr[2]);//[I@4e25154f
		
		System.out.println(arr[1][0]);//0
		System.out.println(arr[1][1]);//0
		System.out.println(arr[1][2]);//0
		
		arr[1][0]=100;
		arr[1][2]=200;
		
	}
}
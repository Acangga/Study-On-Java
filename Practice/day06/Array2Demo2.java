/* 
二维数组：元素为一维数组的数组。

格式一：
	数据类型[][] 数组名=new 数据类型[m][n]
	m:表示这个二维数组中有多少个一维数组。
	n:表示每个一维数组中有多少个元素。
	
注意：
	A:以下格式也可以表示二维数组（但不推荐）
		a：数据类型 数组名[][]=new 数据类型[m][n];
		b：数据类型[] 数组名[]=new 数据类型[m][n];
	B:注意下面定义的区别：
		a：int x,y;
			其实相当于
			int x;
			int y;
		b:int[] x,y[];
			其实相当于
			int[] x; 即声明了一个一维数组
			int[] y[]; 即声明了一个二维数组
*/

class Array2Demo2{
	public static void main(String[] args){
		int[][] arr=new int[3][2];
		System.out.println(arr);//[[I@15db9742
		System.out.println(arr[1]);//[[I@15db9742
		System.out.println(arr[1][1]);//0
		
	}	
}
/* 
	创建二维数组的格式
 */

class Array2Demo{
	public static void main(String[] args){
		//动态初始化，创建一个二维数组，该数组中含有三个一维数组，每个一维数组中含有两个元素。
		int[][] arr=new int[3][2];
		
		System.out.println(arr);//[[I@15db9742 两个中括号，代表二维数组，I代表其中元素为int类型
		System.out.println(arr[0]);//[I@6d06d69c 一个中括号代表一维数组，I代表其中元素为int类型
		System.out.println(arr[0][1]);//0int[][] arr=new int[3][2];//动态初始化，创建一个二维数组，该数组中含有三个一维数组，每个一维数组中含有两个元素。
		
		int[][] arr1=new int[3][];//动态初始化，创建一个二维数组，该数组中含有三个一维数组，每个一维数组都为空。
		System.out.println(arr1);//[[I@7852e922 两个中括号，代表二维数组，I代表其中元素为int类型
		System.out.println(arr1[0]);//null 该二维数组中所有一维数组为空
		//System.out.println(arr1[0][1]);//NullPointerException 因为一维数组为空，所以指针没意义
		
		//打印二维数组长度
		int[][] arr2=new int[3][2];
		System.out.println(arr.length);//打印二维数组的长度，即二维数组中一维数组的个数
		System.out.println(arr[0].length);//打印二位数组中角标为0的一维数组长度，即一维数组中元素的个数
		
		//静态初始化
		int[][] arr3={{1,6,3},{7,56,13},{9,4,66}};
		
		//遍历二维数组
		for(int i=0;i<arr3.length;i++){
			for(int j=0;j<arr3[i].length;j++){
				System.out.print(arr3[i][j]+",");
			}
		}
		System.out.println();
		
		Add(arr3);
	}
	//求二维数组中所有元素的和
	public static void Add(int[][] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				sum+=arr[i][j];
			}
		}
		System.out.println(sum);
	}
}
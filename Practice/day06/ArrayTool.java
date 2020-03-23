/* 
	该类中没有任何非静态成员变量（所以成员方法不可能调用非静态方法），只有成员方法，这种类我们将之称为工具类。
	该类的对象也就不会封装有任何特有数据，只是一个空对象白白占用内存空间，所以创建该类的对象没有意义。
	那么我们可以将该类中的成员函数定义为静态函数，直接通过类名调用这些函数。
	
	为了保证不让其他成员创建该类对象，可以将构造函数私有化，让其他成员无法访问该类的构造函数，也就无法创建对象了。
 
	如果要将类文档化，这个类就一定要是公共的，所以用public修饰该类。
	且因为用了public修饰该类，所以java源文件的名称一定要和类名一致。
	
	这样一个工具类，可以为其他程序所用，直接将.class类文件传送给他人，供其调用即可。
	但是，其他人如何知道这个类提供了什么样的方法呢？又该如何调用呢？函数名是什么？
	为了解决这个问题，Java提供了文档注释功能和javadoc程序来生成说明文档。	
 */
 
 /**
	建立了一个用于操作数组的工具类。其中包含常见的数组操作方法，如：取数组中最值、排序等。
	@author Acangga
	@version v1.0
 */
 
public class ArrayTool{
	
	private ArrayTool(){}
	
	/**
	取数组中最大值
	@param arr 接收一个元素类型为int的数组
	@return 该数组中值最大的元素
	*/
		public int getMax(int[] arr){
		int maxIndex=0;
		for(int x=1;x<arr.length;x++){
			if(arr[maxIndex]<arr[x]){
				maxIndex=x;
			}
		}
		return arr[maxIndex];
	}
	
	/**
	查找某数据是否存在于数组中，若存在则获取其索引。
	@param arr 接收一个元素类型为int的数组
	@param key 要查找的数据
	@return 若数组中存在该数据，则返回对应元素的索引；若不存在，则返回-1。
	*/
	public int getIndex(int[] arr,int key){
		for(int x=0;x<arr.length;x++){
			if(key==arr[x]){
				return x;
			}
		}
		return -1;
	}
	
	/**
	对数组进行选择排序。
	@param arr 接收一个元素类型为int的数组
	*/
	public void selectSort(int[] arr){
		for(int x=0;x<arr.length-1;x++){
			int num=arr[x];
			int index=x;
			for(int y=x+1;y<arr.length;y++){
				if(num>arr[y]){
					num=arr[y];
					index=y;
				}
			}
			swap(arr,x,index);
		}
		
	}
	/**
	交换数组中两个元素的位置。
	@param arr 接收一个元素类型为int的数组
	@param x 其中一个元素的索引
	@param y 另一个元素的索引
	
	javadoc只能识别public和protected权限的函数，private权限的无法被识别。
	所以此处没必要写文档注释。
	*/
	private void swap(int[] arr,int x,int y){
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	
	/**
	将int[]转换成String类型，格式是{e1,e2,...}。
	@param arr 接收一个元素类型为int的数组
	@return str 返回该数组的字符串形式
	*/
	public String arrayToString(int[] arr){
		String str="{";
		for(int x=0;x<arr.length;x++){
			if(x!=arr.length-1){
			str=str+arr[x]+",";
			}else{
			str=str+arr[x]+"}";
			}
		}
		return str;
	}
}
/* 
	我们把之前学过的理顺一下发展思路
 */
class ArrayToolDemo{
	public static void main(String[] args){
		//获取数组中值最大的元素
		int[] arr=new int[]{3,6,9,4,2,3,454};
		/* int maxIndex=0;
		for(int i=1;i<arr.length;i++){
			if(arr[i]>arr[maxIndex]){
				maxIndex=i;
			}
		} 
		System.out.println("max="+arr[maxIndex]);
		
		*/
		
		int max=getMax(arr);
		System.out.println("max="+max);
		
		ArrayTool tool=new ArrayTool();
		String str=tool.arrayToString(arr);
		System.out.println("arr="+str);
		
		tool.selectSort(arr);
		String str1=tool.arrayToString(arr);
		System.out.println("arr="+str1);
		
	}
	
	/*上面这种方式复用性差，且主函数是用来调用方法的，不是用来给你写方法的。
		所以我们学了函数，用函数来封装代码，用主函数调用函数。
	*/
	public static int getMax(int[] arr){
		int maxIndex=0;
		for(int i=1;i<arr.length;i++){
			if(arr[maxIndex]<arr[i]){
				maxIndex=i;
			}
		}
		return arr[maxIndex];
	}
	/* 
		上述方法在本类中解决了在数组中获取最值的问题，但如果我们在别的类中也需要这种功能怎么办呢？
		如果我们需要更多的对数组进行操作的功能呢？
		于是我们想到刚学过的面向对象思想。我们把操作数组的各种功能封装到一个类中，那么我们需要这些功能的时候，
		只需要根据类这张图纸，创建一台具有这些功能的机器（对象），然后使用这台机器（对象）即可。
		所以我们创建一个新的类文件。
		
	*/
}
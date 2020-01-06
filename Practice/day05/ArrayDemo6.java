/* 
	冒泡排序
	程序的本质就是把一个动作（可以是逻辑运算，数学运算）循环多少次，从而实现某些功能的结构体。再把实现简单功能的结构体组合起来，
	完成更加复杂的功能，形成更加复杂精密且庞大的结构体。
	冒泡排序和选择排序也没有本质上的区别，只是所用的思路不同，而编程只是实现思路的过程而已。
	我们所要解决的基本问题也就是循环次数该如何控制，以及如何分解出内部循环体中的元运算。
	
	注意：
	错误: 非法的表达式开始
	这个报错一般是由{}大括号不完整造成的，请仔细检查每对大括号是否完整，以及是否有方法内嵌套方法的情况。
 */

class ArrayDemo6{
	public static void main(String[] args){
		int[] arr={112,456,3,54,69,-8};
		printArray(arr);
		//bubbleSort(arr);
		bubbleSort_2(arr);
		printArray(arr);
		
	}
	
	public static void bubbleSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					/* int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp; */ 
					swap(arr,j,j+1);
					swap(arr,j,j+i);//明明数字和字母的颜色都不同，把1写成i了，还半天看不出来……沙雕
				}				
			}
		}
	}
	
	public static void bubbleSort_2(int[] arr){
		for(int i=arr.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(arr[j]>arr[j+1]){
					/* int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp; */
					swap(arr,j,j+1);
				}
			}
		}
	}
	
	//数组中两个元素交换位置
	public static void swap(int[] arr,int a,int b){
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	//打印数组中所有元素的功能
	public static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
				System.out.print("arr["+i+"]="+arr[i]+"\t");			
		}
		System.out.println();
	}
}
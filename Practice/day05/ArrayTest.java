/* 
面试练习题：
已知一个有序数组，现在需要向数组中的某个元素的位置上存储一个新的元素，并保证数组仍然是有序的，那么这个元素应该存储在数组中哪个元素的位置上？
 */
 import java.util.*;
class ArrayTest{
	public static void main(String[] args){
		int[] arr=new int[]{3,16,28,36,59,88};
		int index=halfSearch(arr,30);
		System.out.println(index);
		
		//java中内置了二分法的方法
		int index_1=Arrays.binarySearch(arr,30);
		/* 这个方法就相当于在手写二分法中，在找不到对应元素的情况下，不return -1，也不return min，而是return -mini-1
		这样一来，当要查找的元素存在于数组中时，返回的是该元素的索引，当不存在时，返回一个负数，告诉你不存在你查找的元素，
		并且这个负数的绝对值减一就是练习题要求的位置索引。
		取负值是为了表明元素不存在，与正值区分开，-1是为了避免返回值为0时无法区分正负的情况。
		比如在arr中查找整数2，很明显2不存在于数组arr，所以返回值为负数，且2<3，索引应该为0.而0没有正负之分，那么在不明确数组中所有
		元素的前提下，我们就无法知道数组中是否有2这个元素。所以我们返回-min-1，这样当查找2时，返回值为-1，我们就可以明确知道2不存在于
		数组中，且如果把它放在数组中且保持数组有序，它的索引应该是0、
		*/
		System.out.println(index_1);
	}
	//手写二分法
	public static int halfSearch(int[] arr,int key){
		int min=0;
		int max=arr.length-1;
		while(min<=max){
			int mid=(min+max)>>1;
			if(key>arr[mid]){
				min=mid+1;
			}else if(key<arr[mid]){
				max=mid-1;
			}else{
				return mid;
			}
		}
		return min;
	}	
}
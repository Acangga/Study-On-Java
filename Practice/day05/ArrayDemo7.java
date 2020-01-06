class ArrayDemo7{
	public static void main(String[] args){
		int[] arr={3,6,12,26,35,49,66};
		
		int index=halfSearch(arr,66);
		System.out.println(index);
		
		int index_2=halfSearch_2(arr,49);
		System.out.println(index_2);
	}
	
	//数组常见功能：查找（查找元素对应的索引）
	public static int getIndex(int[] arr,int key){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key){
				return i;
			}
		}
		return -1;
		/*如果数组中没有要查找的元素怎么办？
		因为返回值为int类型，所以函数一定要有返回值。所以当没有要查找的元素时，就返回-1，
		或其他负数，因为数组中元素的索引没有负数。如此既能解决没有返回值的问题，又能将这个信息告诉我们。*/
	}
	
	//二分查找法：适用于有序数组，即随着索引增大，数组内元素越来越大或越来越小的数组。其实就是二分法啦~
	public static int halfSearch(int[] arr,int key){
		int min,max,mid;
		min=0;
		max=arr.length-1;
		mid=(min+max)>>1;
		/*用位运算比用除法运算效率更高.
		再循环外就把mid计算出来是因为后面while循环的判断条件需要用到arr[mid]。
		*/
		while(key!=arr[mid]){
			if(key>arr[mid]){
				min=mid+1;
			}else if(key<arr[mid]){
				max=mid-1;
			}
			if(max<min){
				return -1;
			}
			/* 因为当max<min时，就说明数组中没有我们要找的元素。至于先判断还是先给mid赋值其实无所谓，只不过当max<min时可以省略一步给
			mid赋值的过程，能稍微提高效率。	*/
			mid=(min+max)>>1;
		}
		return mid;
	}
	
	//二分法的另一种写法
	public static int halfSearch_2(int[] arr,int key){
		int min,max,mid;
		min=0;
		max=arr.length-1;
		//mid=(min+max)>>1;bug：程序不停运行。因为while循环中的mid不变，一直满足min<=max，while循环成了无限循环。
		while(min<=max){
			mid=(min+max)>>1;
			if(key>arr[mid]){
				min=mid+1;
			}else if(key<arr[mid]){
				max=mid-1;
			}else{
				return mid;
			}
		}
		return -1;
	}
	
	
}
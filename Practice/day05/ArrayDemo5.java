class ArrayDemo5{
	public static void main(String[] args){
		int[] arr={112,456,3,54,69,-8};
		printArray(arr);
		selectSort_2(arr);
		printArray(arr);
	}
	
	//方法一
	public static void selectSort(int[] arr){
		/* 
			该函数无需返回值？
			因为该方法中的形式参数数组arr与需要排序的实际参数数组arr指向的是堆内存中的同一个实体，经过该方法的操作之后，
			对应实体的数组中的元素顺序已经被永久改变，即实际参数数组arr所指向的数组实体中元素的顺序也已经改变了，所以无需返回结果。
			用void即可。
		*/

		for(int i=0;i<arr.length-1;i++){
			/*
			arr.length-1是为了简便，数组中的倒数第二个元素已经跟最后一个元素比较过了，且最后一个元素跟自己比较无意义，
			并且，当i取到最大值是，能通过外层for循环的判断语句，但进入内层for循环时，j=i+1，j>arr.length,已经无法通过内层循环的判断语句，
			会直接跳出内层循环
			*/
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp;
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
	
	//方法二
	public static void selectSort_2(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int num=arr[i];
			int index=i;
			/* 
				为什么一定要定义一个变量num来记录index对应的元素的值？
				因为这种更高效的选择排序的方法的运行过程是这样的：i=0时，用num和index两个变量先分别记录下arr[0]和索引0，
				然后用num去和后面的元素比较大小，当找到比初始值arr[i]小的元素，即num>arr[j]时，执行num=arr[j]，index=j，
				然后再用已经变化了的num去寻找下一个比它小的元素，找到就执行num=arr[j]，index=j，直到和所有元素都进行过比较为止，
				此时num就取到了数组内所有元素中最小的那一个的值。
				所以num的作用就是存储数组内更小的元素的值，从而继续去和别的元素比较，保证最后index存储的是值最小的元素的索引，
				如果想当然地认为num没用，将其去掉，只保留index记录索引，那么外循环每运行一次，得出的arr[index]只会是最后一个与arr[i]
				比较的且比它小的元素，而不是所有元素中的最小值。
				因为方法一中，每当arr[i]>arr[j]时，都会交换两者的位置，除非arr[i]本身就是数组中最小的，否则它就会不断被赋予更小的值，
				直到它成为数组中的最小。而在方法二中我们为了提高效率而希望不用如此频繁地交换元素的位置，所以用两个变量，num、index
				来分别记录元素的值和索引，num的作用是不断地去和数组中的元素比较，得出最小的元素的值，而index的作用是记录对应元素的索引，
				从而在内循环的比较结束后，将得到的最小元素和arr[i]交换位置。
			*/
			for(int j=i+1;j<arr.length;j++){
				if(num>arr[j]){//arr[i]>arr[j]
					num=arr[j];
					index=j;
				}
			}
			if(index!=i){//如果arr[i]就是最小的元素，自己跟自己换位置没有意义，所以此处进行了判断
			swap(arr,i,index);
			}
		}
	}
	/* 用两个变量记录了外循环每执行一轮比较出的最小元素的 */
	
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
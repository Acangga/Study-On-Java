/* 
	获取数组中值最大的元素
	
	思路：
	1.定义一个变量记录值最大的元素或其索引。
	2.给该变量一个初始值，可以是数组中的任一元素或其索引。
	3.遍历该数组，用数组中的每个元素去与已经完成初始化的该变量进行比较，并将较大的值赋给该变量。
	4.遍历完成后，该变量值就是数组元素中的最大值。
	
	注意：
	1.为什么要将变量初始化为数组中的元素或其索引，而不定义为数组外的数据？因为在数组未知的情况下，
	给变量任意取值，这个值可能比数组中所有元素的值都要大，或者小，这样就无法取出数组中的最大值或最小值。
	2.获取最小值同理。
	
	
	定义方法，两个明确：
	结果（返回值）类型：最大值 int
	未知内容（参数）类型：数组 int[]  因为要求最大值的数组是什么并不知道
 */
class ArrayDemo4{
	public static void main(String[] args){
		int[] arr={115,56,49,26,85,16,97,123};
		
		int max=getMaxElement(arr);
		int max_2=getMaxIndex(arr);	
		System.out.println(max);
		System.out.println(max_2);
	}
	
	//方法一：变量记录最大元素值
	public static int getMaxElement(int[] arr){
		int maxElement=arr[0];
		for(int i=1;i<arr.length;i++){
			if(maxElement<arr[i]){
				maxElement=arr[i];
			}
		}
		return maxElement;	
	}
	/* 
		初始化i=1是因为已经初始化maxElement=arr[0]，让maxElement再和arr[0]比较没有意义，所以从arr[1]开始比较，
		当然也可以初始化maxElement为数组中任意一个元素，然后从arr[0]开始比较,但是那样就多比较了一次。
	*/
	
	//方法二：变量记录最大元素索引
	public static int getMaxIndex(int[] arr){
		int maxIndex=0;
		for(int i=0;i<arr.length;i++){
			if(arr[maxIndex]<arr[i]){
				arr[maxIndex]=arr[i];
			}
		}
		return arr[maxIndex];
	}
}

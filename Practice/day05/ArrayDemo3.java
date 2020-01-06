//数组的基本操作
/* 
	对数组的最基本操作就是存和取。
	核心就是对角标（索引）的操作
 */
class ArrayDemo3{
	public static void main(String[] args){
		int[] arr={16,45,23,69,87};
		//现在让我们把数组中的每个元素都在命令行打印出来，就是遍历数组。
		//数组作为实体自带长度属性，数组名.length
		System.out.println("arr.length="+arr.length);
		for(int x=0;x<arr.length;x++){
			System.out.println("arr["+x+"]="+arr[x]);
		}
		
		System.out.println();
		
		//反向遍历
		for(int x=arr.length-1;x>=0;x--){//不要忘了在for循环中定义变量要写变量类型
			System.out.println("arr["+x+"]="+arr[x]);
		}
		
		System.out.println();
		
		//打印所有角标为偶数的元素
		for(int x=0;x<arr.length;x+=2){
			System.out.println("arr["+x+"]="+arr[x]);
		}
		
	}
}
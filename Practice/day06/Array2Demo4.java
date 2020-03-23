/*
格式三：
	数据类型[][] 数组名=new 数据类型[][]{元素1,元素2,...},{元素1,元素2,...},...,{元素1,元素2,...};
	
	简写形式：
		数据类型[][] 数组名={元素1,元素2,...},{元素1,元素2,...},...,{元素1,元素2,...};
*/

class Array2Demo4{
	public static void main(String[] args){
		
		int[][] arr={1,2,3},{4,5},{6};
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[0][1]);
		
	}
}
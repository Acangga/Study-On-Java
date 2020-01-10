/* 
	查表法的应用：
	根据数字获取对应的星期
 */
class ArrayTest3{
	public static void main(String[] args){
		System.out.println(getWeek(3));
	}
	public static String getWeek(int num){
		if(num>7||num<1){
			return "非法数据";
		}
		String[] week=new String[]{"","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		//在索引0的位置上放一个空位是为了让数字和星期几对应起来，毕竟没有星期零。
		return week[num];
		//String的首字母S要大写。
	}
}
class IfTest {
	public static void main(String[] args) {
		/*
		需求：用户输入月份，程序输出对应的季节
		思路：用一个变量代表用户输入的数据，如何获取先不管
			春季：3、4、5
			夏季：6、7、8
			秋季：9、10、11
			冬季：12、1、2
			用if判断语句来对用户输入的月份数据进行判断，并用执行语句输出季节
			用不等式判断变量所在的范围，从而确定其对应的季节，而对应冬季的12、1、2不好用区间表示，
			可以想到两种方式来解决：
			一、用==来对12、1、2分别进行判断，用||来连接三个不等式
			二、用排除法，先将1~12之外的数据排除（可以提高软件的健壮性，对于整型数据不会出现超范围无法判断的结果），
						再将春、夏、秋对应的数据排除，剩下的就必然是冬季所对应的的数据
		*/
		int month=2;
		if(month<1||month>12) {
			System.out.println("没有"+month+"月这个月份");
		} else if(month>=3&&month<=5) {
			System.out.println(month+"月属于春季");
		}else if(month>=6&&month<=8){
			System.out.println(month+"月属于夏季");
		}else if(month>=9&&month<=11){
			System.out.println(month+"月属于秋季");
		}else{
			System.out.println(month+"月属于冬季");
		}
	}
}
class SwitchTest{
	public static void main(String[] args){
		/* 
		用switch语句将月份和季节对应起来
		*/
		int month=9;
		switch(month){
			case 3:
			case 4:
			case 5:
			System.out.println(month+"月属于春季");
			break;
			case 6:
			case 7:
			case 8:
			System.out.println(month+"月属于夏季");
			break;
			case 9:
			case 10:
			case 11:
			System.out.println(month+"月属于秋季");
			break;
			case 12:
			case 1:
			case 2:
			System.out.println(month+"月属于冬季");
			break;
			default:
			System.out.println(month+"月不属于人类的月份");
			break;
			
		}
	}
}
class SwitchTest{
	public static void main(String[] args){
		/* 
		��switch��佫�·ݺͼ��ڶ�Ӧ����
		*/
		int month=9;
		switch(month){
			case 3:
			case 4:
			case 5:
			System.out.println(month+"�����ڴ���");
			break;
			case 6:
			case 7:
			case 8:
			System.out.println(month+"�������ļ�");
			break;
			case 9:
			case 10:
			case 11:
			System.out.println(month+"�������＾");
			break;
			case 12:
			case 1:
			case 2:
			System.out.println(month+"�����ڶ���");
			break;
			default:
			System.out.println(month+"�²�����������·�");
			break;
			
		}
	}
}
class BreakContinueDemo{
	public static void main(String[] args){
		/* 
		break:����
		break�����÷�Χ��switch����ѭ�����
		break��䵥������ʱ����������������ִ�в����ģ����Լ�ʹд��Ҳû�����塣
		breakֻ������ǰ���ڵ�ѭ����
		���break����Ƕ�׵��ڲ�ѭ���У��Ҳ�������break������ǰѭ����������Ҫ�������ѭ������ô����ͨ����ѭ�������ʵ�֡�
		���ǣ����break�����ѭ���ж������ڲ�ѭ���У����޷������ڲ�ѭ���ģ���break��Ҫ�����ã�����Ҫ���������÷�Χ�ڡ�
		*/
		damao:for(int x=0;x<3;x++){
			ermao:for(int y=0;y<4;y++){
				System.out.println("x="+x);
				break damao;
			}
		}
		
		System.out.println("--------����һ���ָ���----------");
		
		/* 
		continue����������������ѭ���������´�ѭ��
		continue�����÷�Χ��ѭ���ṹ
		���continue�������ڣ�������κ���䶼ִ�в���
		
		for(int x=0;x<11;x++){
			if(x%2==0){
				continue;
				System.out.println("x="+x);
			}
		}
		*/
		
		for(int x=0;x<11;x++){
			if(x%2==0){
				continue;
			}
			System.out.println("x="+x);
		}
		
		damao:for(int x=0;x<3;x++){
			ermao:for(int y=0;y<4;y++){
				System.out.println("x="+x+"\ty="+y);
				continue damao;//������y++��ֱ�ӽ��������ѭ��x++
			}
		}
	}
}
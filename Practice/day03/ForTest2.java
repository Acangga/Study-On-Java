class ForTest2{
	public static void main(String[] args){
		//��ӡ����
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//��ӡ��ֱ��������
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//��ӡ��ֱ��������
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print("*");//Ϊ���ô�ӡ����������������Խ��Խ�٣������ñ���j��һ���ϴ����ֵݼ�����������ʼ�ձ�������
			}
			System.out.println();
		}
		System.out.println();
		
		//��ӡ����������
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){//����2��֮��һ��Ҫ�г˺�*
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//��whileѭ����ӡ��ֱ��������
		int i=1;
		int j=1;
		while(i<=5){
			j=1;
				/* ��Ϊj����������whileѭ�������Ĵ����ţ����Ե�whileѭ�����е�j����֮��
				��j����������j��ֵ���������ˣ�������Ҫ���½����ʼ��Ϊ1��
				
				���û��j=0��j���¸�ֵ����ô��һ��ѭ��ʱ��������£�
				����while���ѭ������ʱi=1��j=1���ж�����ж�i<=5Ϊtrue������ѭ���壬��ʼִ���ڲ�whileѭ����
				�ж�j<=i�Ľ��Ϊtrue�������ڲ�whileѭ����ѭ���壬��ӡһ���Ǻš�*����Ȼ��j++����ʱi=1��j=2��
				����ѭ���жϱ��ʽ,���ʽ�ж�j<=i���Ϊfalse���ڲ�whileѭ��������ִ��System.out.println();
				ִ��i++��ִ�����whileѭ���������ж���䣬��ʱi=2��j=2���ж�i<=5���Ϊtrue�������ڲ�whileѭ����
				ִ���ڲ�whileѭ���������ж���䣬�ж�j=2<=i=2�Ľ��Ϊtrue������ѭ���壬��ӡһ���Ǻš���
				���ѭ��ִ��5�Σ��ڲ�ѭ��Ҳִֻ����5�Σ�����whileѭ����������Ϊjʼ������i�������������ֻ��ӡ������Ǻţ�
				��û�д�ӡ�������Ρ�
				
				ʹ��Ƕ��forѭ��ʱ��ÿ�����ѭ������һ�Σ����½����ڲ�forѭ��ʱ����ʼ����䶼���j���г�ʼ���������ڴ�ӡ������ʱ��
				���Ӽ�㡣
				*/
			while(j<=i){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			
		}
		
		System.out.println();
		
		//��ӡ������������
		for(int x=1;x<=5;x++){
			for(int y=1;y<=x;y++){
				System.out.print(" ");
			}
			for(int y=9;y>=2*x-1;y--){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		for(int x=1;x<=5;x++){
			for(int y=1;y<=x;y++){
				System.out.print(" ");
			}
			for(int y=2*x-1;y<=9;y++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		/*
		
		* * * * * 
		-* * * *
		--* * * 
		---* * 
		----*

		*/
		for(int x=1; x<=5; x++)
		{
			for(int y=1; y<x; y++)
			{
				System.out.print(" ");
			}
			
			for(int z=x; z<=5; z++)
			{
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}
import java.util.Scanner;
class ScannerTestBMI{
	public static void main(String[] args){
		//定义Scanner
		Scanner s=new Scanner(System.in);
		
		// 告知用户操作方式并获取身高数据
		System.out.println("请输入你的身高（m）");
		float height=s.nextFloat();
		// 判断数据是否合法
		if(height>0&&height<5){
			System.out.println("身高:"+height+"m");
		}else{
			System.out.println("您输入的身高数据不合法");
		}
		
		
		// 告知用户操作方式并获取体重数据
		System.out.println("请输入你的体重（kg）");
		float weight=s.nextFloat();
		// 判断数据是否合法
		if(weight>0&&weight<500){
			System.out.println("体重:"+weight+"kg");
		}else{
			System.out.println("您输入的体重数据不合法");
		}
		
		
		// 计算BMI
		float BMI=weight/(height*height);
		System.out.println("BMI:"+BMI);
		
		/* 
		根据BMI判断当前身体状况
		(0,18.5) 偏瘦
		[18.5,24) 标准
		[24,27) 超重
		[27,30) 轻度肥胖
		[30,35) 中度肥胖
		[35,正无穷） 重度肥胖		
		*/
		if(BMI<18.5&&BMI>0){
			System.out.println("您当前的身体状况为【偏瘦】");
		}else if(BMI>=18.5&&BMI<24){
			System.out.println("您当前的身体状况为【标准】");
		}else if(BMI>=24&&BMI<27){
			System.out.println("您当前的身体状况为【超重】");
		}else if(BMI>=27&&BMI<30){
			System.out.println("您当前的身体状况为【轻度肥胖】");
		}else if(BMI>=30&&BMI<35){
			System.out.println("您当前的身体状况为【中度肥胖】");
		}else if(BMI>=35){
			System.out.println("您当前的身体状况为【重度肥胖】");
		}else{
			System.out.println("您输入的数据不合法");
		}
	} 
}
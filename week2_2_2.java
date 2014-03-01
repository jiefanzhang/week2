import java.io.*; 
import java.util.*;
class week2_2_2
{
	public static void main(String[] args)
	{
		double a=0.0,b=0.0,sum=0.0;
		int opt=0;
		Scanner num=new Scanner(System.in);
		try{
			System.out.print("請輸入兩個浮點數: ");
			a=num.nextDouble();
			b=num.nextDouble();
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
		while(true)
		{
			System.out.print("請選擇運算子 1)加 2)減 3)乘 4)除 -1)離開: ");
			opt=num.nextInt();
			switch(opt)
			{
				case 1:
					sum=a+b;
					break;
				case 2:
					sum=a-b;
					break;
				case 3:
					sum=a*b;
					break;
				case 4:
					if(b==0)
					{
						System.out.println("分母不可為0!");
						sum=0.0;
						break;
					}
					else
						sum=a/b;
					break;
				case -1:
					return;
				default :
					System.out.println("輸入錯誤，請重新選擇!");
					continue;
			}
			System.out.println("運算結果為 "+sum);
		}
	}
}
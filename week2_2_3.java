import java.util.*;
class week2_2_3
{
	public static void main(String[] args)
	{
		int year,count=1;
		Scanner num=new Scanner(System.in);
		System.out.print("請輸入一個西元的年份: ");
		year=num.nextInt();
		for(int i=1;i<=year;i++)
		{
			if(i%400==0||(i%4==0&&i%100!=0))
			{
				System.out.print(i+"\t");
				if(count%5==0)
					System.out.print("\n");
				count++;
			}
		}
	}
}
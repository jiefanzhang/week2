import java.io.*; 
import java.util.*;
class week2_3_2
{
	public static void main(String[] args)
	{
		int yy,mm,dd;
		Date d=new Date();
		Scanner sca=new Scanner(System.in);
		System.out.print("請輸入年份 月份 日期: ");
		yy=sca.nextInt();
		mm=sca.nextInt();
		dd=sca.nextInt();
		if(d.D(yy,mm,dd)==true)
			System.out.println("格式正確!");
	}
}
class Date
{
	int[] date={31,28,31,30,31,30,31,31,30,31,30,31};
	boolean D(int y,int m,int d)
	{
		int key;
		if(y>=0)
		{
			if(m<13&&m>0)
			{
				key=date[m-1];
				if(m!=2)
				{
					if(key>=d&&d>0)
						return true;
					System.out.println("格式錯誤(日期)!");
					return false;
				}
				else
				{
					if(y%400==0||(y%4==0&&y%100!=0))
					{
						key=29;
					}
					if(key>d&&d>0)
						return true;
					System.out.println("格式錯誤(日期)!");
					return false;
				}
			}
			System.out.println("格式錯誤(月份)!");
			return false;
		}
		System.out.println("格式錯誤(年份)!");
		return false;
	}
}

import java.io.*; 
import java.util.*;
class week2_2_4
{
	public static void main(String[] args)throws IOException
	{
		int opt,count=0,select;
		String[] name=new String[10];
		int[] grade=new int[10];
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in)); 
		Scanner sca=new Scanner(System.in);
		while(true)
		{
			System.out.print("請選擇功能 1)新增 2)查詢 -1)離開: ");
			opt=sca.nextInt();
			switch(opt)
			{
				case 1:
					System.out.print("請輸入學生姓名: ");
					name[count]=buf.readLine();
					while(true)
					{
						try
						{
							System.out.print("請輸入學生成績: ");
							grade[count]=sca.nextInt();
						}
						catch(NumberFormatException e)
						{
							System.out.println("輸入錯誤，請重新輸入!");
							continue;
						}
						break;
					}
					count++;
					break;
				case 2:
					while(true)
					{
						try
						{
							System.out.print("請輸入編號(1~"+count+"之間): ");
							select=sca.nextInt();
						}
						catch(NumberFormatException e)
						{
							System.out.println("輸入錯誤，請重新輸入!");
							continue;
						}
						break;
					}
					if(select>count||select<1)
						System.out.println("查無此編號!");
					else
						System.out.print("編號"+(select-1)+"學生姓名: "+name[select-1]+"\n學生成績: "+grade[select-1]+"\n");
					break;
				case -1:
					return;
				default :
					System.out.println("輸入錯誤，請重新選擇!");
					continue;
			}
		}
	}
}
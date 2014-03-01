import java.io.*; 
import java.util.*;
class week2_3_1
{
	public static void main(String[] args)
	{
		int opt,count=0,select;
		double r,ang;
		ArrayList<circle> cir=new ArrayList<circle>();
		Scanner sca=new Scanner(System.in);
		while(true)
		{
			System.out.print("請選擇功能 1)新增 2)輸入角度 -1)離開: ");
			opt=sca.nextInt();
			switch(opt)
			{
				case 1:
					while(true)
					{
						try
						{
							System.out.print("請輸入半徑: ");
							r=sca.nextDouble();
							circle c=new circle(r);
							cir.add(c);
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
					{
						while(true)
						{
							try
							{
								System.out.print("請輸入角度: ");
								ang=sca.nextDouble();
							}
							catch(NumberFormatException e)
							{
								System.out.println("輸入錯誤，請重新輸入!");
								continue;
							}
							break;
						}
						cir.get(select-1).showall(ang);
					}
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
class circle
{
	double r;
	circle(double r)
	{
		this.r=r;
	}
	double arc(double ang)
	{
		return 2*3.14*r*(ang/360);
	}
	double pie(double ang)
	{
		return 3.14*r*r*(ang/360); 
	}
	void showall(double ang)
	{
		System.out.println("半徑: "+r+" 角度: "+ang+" 弧長: "+arc(ang)+" 面積: "+pie(ang));
	}
}
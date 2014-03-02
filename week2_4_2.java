import java.io.*; 
import java.util.*;
class week2_4_2
{
	public static void main(String[] args)
	{
		int opt,count=0;
		double r,r2;
		shape s;
		ArrayList<shape> sha=new ArrayList<shape>();
		Scanner sca=new Scanner(System.in);
		while(true)
		{
			System.out.print("1)Circle 2)Oval 3)Rectangle 4)Triangle 5)Print -1)exit:");
			opt=sca.nextInt();
			switch(opt)
			{
				case 1:
					System.out.print("請輸入半徑: ");
					r=sca.nextDouble();
					s=new circle(r);
					sha.add(s);
					count++;
					break;
				case 2:
					System.out.print("請輸入長短半徑(a,b): ");
					r=sca.nextDouble();
					r2=sca.nextDouble();
					s=new oval(r,r2);
					sha.add(s);
					count++;
					break;
				case 3:
					System.out.print("請輸入長、寬(a,b): ");
					r=sca.nextDouble();
					r2=sca.nextDouble();
					s=new rectangle(r,r2);
					sha.add(s);
					count++;
					break;
				case 4:
					System.out.print("請輸入底、高(a,b): ");
					r=sca.nextDouble();
					r2=sca.nextDouble();
					s=new triangle(r,r2);
					sha.add(s);
					count++;
					break;
				case 5:
					for(int i=0;i<count;i++)
						sha.get(i).showall();
				case -1:
					return;
				default :
					System.out.println("輸入錯誤，請重新選擇!");
					continue;
			}
		}
	}
}
abstract class shape
{
	abstract double area();
	abstract void showall();
}
class circle extends shape
{
	double r;
	circle(double r)
	{
		this.r=r;
	}
	double area()
	{
		return 3.14*r*r;
	}
	void showall()
	{
		System.out.println("形狀: circle\t面積: "+area());
	}
}
class oval extends shape
{
	double r,r2;
	oval(double r,double r2)
	{
		this.r=r;
		this.r2=r2;
	}
	double area()
	{
		return 3.14*r*r2;
	}
	void showall()
	{
		System.out.println("形狀: oval\t面積: "+area());
	}
}
class rectangle extends shape
{
	double width,height;
	rectangle(double a,double b)
	{
		this.width=a;
		this.height=b;
	}
	double area()
	{
		return width*height;
	}
	void showall()
	{
		System.out.println("形狀: rectangle\t面積: "+area());
	}
}
class triangle extends shape
{
	double bottom,height;
	triangle(double a,double b)
	{
		this.bottom=a;
		this.height=b;
	}
	double area()
	{
		return bottom*height/2;
	}
	void showall()
	{
		System.out.println("形狀: triangle\t面積: "+area());
	}
}
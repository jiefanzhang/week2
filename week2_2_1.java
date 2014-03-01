import java.io.*;
import java.util.*;
class week2_2_1
{
	public static void main(String[] args)throws IOException
	{
		int[] hb={0,0,0};
		System.out.print("請輸入姓名: ");
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in)); 
		String name=buf.readLine();
		System.out.print("請輸入西元生日: ");
		Scanner sca=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			hb[i]=sca.nextInt();
		}
		hb[0]=hb[0]-1911;
		System.out.println(name+" 您好!");
		if(hb[0]>=0)
			System.out.print("生日: 民國"+hb[0]+"年"+hb[1]+"月"+hb[2]+"日");
		else
		{
			hb[0]=hb[0]*(-1);
			System.out.print("生日: 民國前"+hb[0]+"年"+hb[1]+"月"+hb[2]+"日");
		}
	}
}
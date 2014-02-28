class week2_1_2
{
	public static void main(String[] args)
	{
		double[] a={1.2,3.0,0.8};
		double sum=0.0,avg;
		for(double x:a)
		{
			sum+=x;
		}
		avg=sum/a.length;
		System.out.print("sum="+sum+"\n");
		System.out.print("avg="+avg+"\n");
	}
}
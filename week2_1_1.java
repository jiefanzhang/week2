public class week2_1_1{
	public static void main(String[] args){
		int[] s={4,23,45},f={13,54,23};
		int i,sum=0;
		for(i=2;i>=0;i--){
			if(f[i]==s[i])
				f[i]=0;
			else if(f[i]<s[i]){
				f[i-1]--;
				f[i]=f[i]+60-s[i];
			}
			else{
				f[i]=f[i]-s[i];
			}
		}
		sum=f[0];
		for(i=0;i<2;i++){
			sum=sum*60+f[i+1];
			//(13*60+54)*60+23
		}
		System.out.print("seconds="+sum+"\n");
	}
}
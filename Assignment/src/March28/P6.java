package March28;

public class P6 {

	public static void main(String[] args) {
		
		char[] n={'a','B','3','&','c','D','E','f','4','4','d','a','x','d','A','D'};
		System.out.println(co(n));
	}
	static int co(char[] str)
	{
		int x,i;
		int a[26];
		
		for(i=0;i<26;i++)
		{
			a[i]=0;
			i=0;
		}
		while(str[i]!='\0')
		{
			if(str[i]>='a'&&str[i]<='z')
			{
				x=str[i]-'a';
			}
			
			else if(str[i])>='A'&&str[i]<='Z')
			{
				x=str[i]-'A';
				a[x]=a[x]+1;
				i=i+1;
			}
		}
		return 0;
	}
}

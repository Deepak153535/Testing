package March28;

public class P12 {

	public static void main(String[] args) {
		
	
	int temp;
	int sum = 0;
	int r=0,c = 0;
	int d1 = 1,d2 = 2;
	int table[8][8]; 
	
	for (int k = 0; k< 64; k++)
	{
		table[r][c]=1;
		
		r = (r+d1) % 8;
		c = (c+d2) % 8;
		temp=d1,d1=d2;d2=temp;
		
	} 
	for(r=0;r<8;r++)
	
		for (c=0; c<8; C++)
		
		sum += table[r][c];

	}
}

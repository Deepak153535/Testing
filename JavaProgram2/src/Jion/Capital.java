package Jion;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Capital {

	public static void main(String[] args) {
		
		String s="javatname";
		char[]c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			char a=c[i];
			int e=a-32;
			char r=(char)e;
			
			System.out.print(r);
		}
		System.out.println();
	}
}

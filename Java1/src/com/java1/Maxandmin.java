package com.java1;

public class Maxandmin {
public static void main(String[] args) {
	String s="hello";
	int f[] = new int[s.length()];
	char min = s.charAt(0),max=s.charAt(0);
	int i,j,min1,max1;
	char string[]=s.toCharArray();
	for(i=0;i<string.length;i++) {
		{
			f[i]=1;
			for(j=i+1;j<string.length;j++) {
				if(string[i]==string[j] && string[i]!='0')
				{
					f[i]++;
					string[j]='0';
				}
			}
		}
	}
		min1=max1=f[0];
		for(i=0;i<f.length;i++) {
			if(min1>f[i] && f[i]!='0') {
				min1=f[i];
				min=string[i];
			}
			if(max1<f[i])
			{
				max1=f[i];
				max=string[i];
			}
		}
		
	System.out.println("min char:"+min);
	System.out.println("max char:"+max);

}
}

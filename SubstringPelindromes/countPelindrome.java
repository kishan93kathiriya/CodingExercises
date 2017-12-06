import java.util.Scanner;

class countPelindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("'"+s+"' String has '"+new sample().count_Pelindrome(s)+"' Substring Pelindromes");
	}

	public int count_Pelindrome(String s)
	{
		char[] c=s.toCharArray();
		int count=0;
		for(int index=1;index<c.length;index++)
		{
			//Even Pelindromes
			if(c[index]==c[index-1])
			{
				int increment=1;
				count++;
				while((index-increment-1)>-1 && (index+increment)<c.length)
				{
					if(c[index-increment-1] != c[index+increment])
						break;
					count++;
					increment++;
				}
			}

			// Odd Pelindromes
			if(index>1 && c[index] == c[index-2])
			{
				int increment=1;
				count++;
				while((index-increment-2)>-1 && (index+increment)<c.length)
				{
					if(c[index-increment-2] != c[index+increment])
						break;
					increment++;
					count++;
				}
			}
		}
		return count+c.length;
	}
}
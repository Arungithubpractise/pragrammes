package programmes;

public class countnoofwordsinstring {

	public static void main(String[] args)
	{
		String str = "Welcome to java";
	
		int count = 1;
		for(int i=0; i<str.length()-1; i++) 
		{
			
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
			{
				count++;
			}
					
		}
		System.out.println(count);
	
		}
	
	}






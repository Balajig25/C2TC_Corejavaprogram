package daytwo;

public class ForEachLoopDemo {
	public static void main(String[] args) {
		int a[]= {20,30,40,50,60};	

		for(int i:a)
		{
		System.out.println(i);	
		}
		
		char ch[]= {'j','a','v','a'};
		for(char c:ch)
		{
			System.out.print(c);		
		}
		System.out.println(" ");
		String s1[]= {"Java","program","learn"};

		for(String s:s1)
		{
			System.out.print(s+" ");		
		}
	}
}
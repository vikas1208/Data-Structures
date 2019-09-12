package revision;

public class Prac14 {

	public static void main(String[] args) {
		
		String str="sMaRt inTerViewS";
		char ch1=' ';
		for(int i=0;i<str.length();i++)
		{
			int ch=str.charAt(i);
			if(ch>96)
			{
			 ch1=(char) (ch-32);
					System.out.print(ch1);
			}
			
			else
			{
				ch1=(char) (ch+32);
				System.out.print(ch1);
		}
		

	}

}
}

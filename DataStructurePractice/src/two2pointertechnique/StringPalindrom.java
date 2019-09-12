package two2pointertechnique;

public class StringPalindrom {

	public static void main(String[] args) {
		String str="1234321";
		System.out.println(isPalindrome(str));
	}

	public static boolean isPalindrome(String str) {
		int i=0;int j=str.length()-1;
	//	int mid=i+j/2;
		boolean flag=false;
		while(i<j)
		{
			if(str.charAt(i)==str.charAt(j))
			{
				 i++;
				 j--;
				 flag=true;
			}
			else {
				flag=false; 
				break;
			}
			
		}
		return flag;
		}

}

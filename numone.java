import java.util.*;

public class numone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String bs = sc.next();
		char[] key = bs.toCharArray();
		String as = sc.next();
		char[] arr = as.toCharArray();
			
		//String[] alp = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"
			//	, "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String alp = "abcdefghijklmnopqrstuvwxyz";
		char[] allp = alp.toCharArray();
		String alp2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] allp2 = alp2.toCharArray();
		
		int i = 0, j = 0;
		
		char[] ans = new char[i];
		
		//System.out.println("eydbkmiqugjxlvtzpnwohracsf");
//		
//		for(i = 0, j = 0; i < arr.length&& j < 26; i++, j++) {
//			if(Character.isUpperCase(arr[i])==true) {
//				arr[i] = (char)(j+65);
//			}
//			else
//				arr[i] = (char)(j+97);
//			System.out.println(arr[i]);
//		}
		
		
		
		
//		for(i = 0, j = 0; i < arr.length&& j < 26; i++, j++) {
//			if(arr[i] == ' ') {
//				//System.out.print(arr[i]);
//				continue;
//			}
//			else if(65<=arr[i]&&arr[i]< 97) {
//				arr[i] = (char)(j+65); 
//				//System.out.print(arr[i]);
//				continue;
//			}
//			else {
//				arr[i] = (char)(j+97);
//				//System.out.print(arr[i]);	
//				continue;
//			}
//		}
//		for(i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//		}
		
		
		//, "A", "B", "C", "D", "E", "F", "G", 
		//"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R ", "S", "T", "U" , "V", "W", "X", 
		//"Y", "Z"
		
		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < 26; j++) {
				if(arr[i] == ' ') {
					ans[i] += arr[i];
				}
				else if(Character.isUpperCase(arr[i])) {
					if(key[j]==arr[i]+32)
						ans[i] += allp2[j];
				}
				else 
					ans[i] += allp[j];
			}
		}
		System.out.print(ans);
		
	
	}

}

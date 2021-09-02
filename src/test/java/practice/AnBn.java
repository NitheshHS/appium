package practice;

public class AnBn {
	public static void main(String[] args) {
		String str="aabbb";

		int length=str.length();
		if(length%2 == 1) {
			System.out.println("no");
		}

		boolean flag=false;
		for(int i=0;i<length/2;i++) {
			if(str.charAt(i) == 'a' && str.charAt(length-1-i) == 'b') {
				flag=true;
			}
		}
		System.out.println(flag);
	}
	public static boolean patternSolver(String str) {

		int first=0;
		int last=str.length()-1;
		if(str.length() %2 != 0) {
			return false;
		}
		while(first < str.length()/2 && last >= str.length()/2) {
			if(str.charAt(first) != 'a' || str.charAt(last) != 'b') {
				return false;
			}
			first++;
			last--;
		}
		return true;

	}

}

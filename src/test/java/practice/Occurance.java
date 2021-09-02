package practice;

public class Occurance {
	public static void main(String[] args) {
		String str="I am automation engineer";
		str=str.toLowerCase();
		
		int[] freq=new int[str.length()];
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='0';
				}
			}
			if(ch[i]!='0') {
				freq[i]=count;
			}
		}
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!='0' && ch[i]>0) {
				System.out.println(ch[i]+"=="+freq[i]);
			}
		}
		
	}

}

package practice;

public class CovertTitle {
	public static void main(String[] args) {
		String str="my name is nithesh";
		String[] strArr=str.split(" ");
		//["my","name","is","nithesh"]
		String newStr="";
		for(int i=0;i<strArr.length;i++) {
			//my=> m=0, y=1
			
					char firstChar=strArr[i].charAt(0);
					String lastWord = strArr[i].substring(1);
					newStr= newStr+((char)(firstChar-32))+lastWord;
					
			
			newStr=newStr+" ";
		}
		System.out.println(newStr);
	}

}

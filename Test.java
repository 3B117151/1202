public class Test {
	public static void main (String[] args){
		int [] iArr = {7,3,4,9,6};
	
		for (int x=0;x<iArr.length;x++){
			if(iArr[x]>iArr[x+1]){
			iArr[x]=iArr[x+1];
			iArr[x+1]=iArr[x]
			}
		}
		
		for (int x=0;x<iArr.length;x++){
		System.out.println(">>"+iArr[x]);
		}
	}
}
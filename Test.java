public class Test {
	public static void main (String[] args){
			int [] iArr = {7,3,4,9,6};
		
			for (int x=0;x<iArr.length;x++){
				for(int y=0;y<iArr.length;y++){
					if(iArr[x]>iArr[y]){
						int temp=iArr[x];
						iArr[x]=iArr[y];
						iArr[y]=temp;
						}
					}
				}
	
			for (int x=0;x<iArr.length;x++){
			System.out.println(">>"+iArr[x]);
			}
	}		
}
	

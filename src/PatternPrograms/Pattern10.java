package PatternPrograms;

public class Pattern10 {

	public static void main(String[] args) {
	
		for(int row=3;row>=1;row--) {
			
			for(int col=3;col>=row;col--) {
				
				System.out.print(col+" ");
			}
			
			System.out.println(" ");
		}

	}

}

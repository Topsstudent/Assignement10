package module1;

public class Pattern4 {
	public static void main(String[] args) {
		/*    1
		 *   2 2
		 *  3 3 3
		 * 4 4 4 4
		 */
		for(int i=1;i<=4;i++) {
			for(int k=i;k<=4;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}

package Alert;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Single dimensional arary
//		String [] a = {"Selenium","rc","qtp","test"};
//		System.out.println(a.length);
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i] + " ");
//		}
		
		//multidimensional array
		
		int [][] a = {{2,2,3,4},{8,7,6,5}};
		System.out.println(a[0].length);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
			
			
		}
		
	}

}

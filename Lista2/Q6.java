package Lista2;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {1, 2, 3, 4, 5};
		int arr2[] = {1, 2, 3, 4, 5};
		
		int erro =0;
		for(int i = 0; i < arr1.length; i++) {
			
			if(arr1[i] != arr2[i]) {
				erro++;				
			}
		}
		
		if(erro > 0) {
			System.out.println("Os vetores não são idênticos");
		}
		else {
			System.out.println("Os vetores são idênticos");
		}
		
		
	}

}

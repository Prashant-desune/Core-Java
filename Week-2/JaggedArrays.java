
public class JaggedArrays {
	
	static void printJaggedArray(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
	}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][];
		arr[0]= new int[3];
		arr[1]= new int[2];
		arr[2]= new int[3];

		printJaggedArray(arr);
		
		int arr2[][] = new int[3][];
		
		arr2[0]= new int[] {1,2,3};
		arr2[1]= new int[] {2,3};
		arr2[2]= new int[] {4,5,6};
		
		System.out.println("*************");
		
		printJaggedArray(arr2);

	}

}

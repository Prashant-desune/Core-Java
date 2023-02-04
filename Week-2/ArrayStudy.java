
public class ArrayStudy {
	
	static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5;
		int arr[] = new int [size];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		print(arr);
		for(int i = 0; i<size; i++) {
			arr[i] = i+1;
		}
		print(arr);
		
		int arr2[] = {1,2,3};
		print(arr);
		
		int copyArray[] = new int[2*size];
		for(int i = 0; i<size; i++) {
			copyArray[i] = arr[i];
		}
		copyArray[5]=6;
		copyArray[6]=7;
		print(copyArray);
		
		print(new int[] {1,2,3,4,5});
	}

}

package Lec9;

public class Array_swapingdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println(arr[0] + " " + arr[1]);
		Swap(arr, 0,1);
		System.out.println(arr[0] + " " + arr[1]);

	}

	public static void Swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int t = arr[i];
		arr[i]=arr[j];
		arr[j]=t;
		
	}

}

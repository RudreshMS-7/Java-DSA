package in.datastructuresJava;

public class SecondMaxArray {
	
	public int findSecondMAx(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]> max) {
				secondMax = max;
				max = arr[i];	
			}else if(arr[i]> secondMax && arr[i] != max) {
				secondMax = arr[i];
			}
		}
		return secondMax;
	}

	public static void main(String[] args) {
		int[] arr = {3, 2, 4, 7, 10, 6, 5,};
		SecondMaxArray secMax = new SecondMaxArray();
		System.out.println(secMax.findSecondMAx(arr));;
		

	}

}

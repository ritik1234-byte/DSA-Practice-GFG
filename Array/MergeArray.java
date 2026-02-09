package array;

public class MergeArray {
	public static void main(String args []) {
		int arr[]= {5,8,9,7,6,7};
		int brr[]= {8,9,7,5,6,4,7,6,3,7,5,6};
		
		int arr3[]=new int[arr.length+brr.length];
		int i=0;
		int j=arr.length;
		
		while(i<j ) {
			arr3[i]=arr[i];
			i++;
		}
	int l=arr.length;
	int k=0;
		while(k<brr.length) {
			arr3[l]=brr[k];
			l++;
			k++;
		}
		
		for(int ele:arr3) {
			System.out.print(ele+" ");
		}

		
	}

}

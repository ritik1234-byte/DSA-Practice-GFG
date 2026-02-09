package array;

public class WaveArray {
	public static void sortWave(int arr[]) {
		for(int i=0;i<arr.length;i+=2) {
			int temp=arr[i];
			int n=arr.length-1;
			if(n==i){
			break;
			}
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		
		
	}
	public static void main(String args[]) {
		int arr[]= {2,4,7,8,9,22};
		WaveArray.sortWave(arr);
		for(int x:arr) {
			System.out.println(x +" ");
		}	
	}

}

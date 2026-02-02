package array;

public class Sort012 {
	public static void sort012(int arr[]) {
		 int n=arr.length-1;
	        int zero=0;
	        int one=0;
	        int two=0;
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]==0){
	                zero++;
	            }
	            else if(arr[i]==1){
	                one++;
	            }
	            else{
	                two++;
	            }
	            
	        }
	        
	        for(int i=0;i<zero;i++){
	            arr[i]=0;
	        }
	        for(int i=zero;i<one+zero;i++){
	            arr[i]=1;
	            }
	        for(int i=one+zero;i<arr.length;i++){
	            arr[i]=2;
	        }
	        
		
	}
    public static void main(String args []) {
    	int arr[]= {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
    	Sort012.sort012(arr);
    	for(int e:arr) {
    		System.out.println(e +" ");
    	}
    	
    }
}

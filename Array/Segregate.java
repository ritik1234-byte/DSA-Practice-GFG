package array;

public class Segregate {
  void segregate0and1(int[] arr) {
	         int noofzero=0;
	         int noofone=0;
	         for(int x:arr){
	             if(x==0){
	                 noofzero++;
	             }
	             else{
	                 noofone++;
	         }
	         }
	         
	         for(int i=0;i<arr.length;i++){
	             if(i<noofzero){
	                 arr[i]=0;
	             }
	             else if(i>=noofzero){
	                 arr[i]=1;
	             }
	             else{
	                 
	             }
	         }
			 
	    }

public static void main(String args []) {
	int arr[]= {0, 0, 1, 1, 0};
	Segregate obj=new Segregate();
	obj.segregate0and1(arr);
	for(int x:arr) {
		System.out.print(x +" ");
	}
	
}

}

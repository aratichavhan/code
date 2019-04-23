import java.io.*;
import java.util.*;
import java.lang.*;
public class mmtpro{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		//int no=sc.nextInt();
		int i=0;
		int arr[]={1,1,1,0,1,1,1,1};
		int res[]=new int[arr.length];
		for(i=0;i<arr.length;i++){
			if(i==0 && arr[i+1]==1){
			res[i]=1;}
			else if(i==0 && arr[i+1]==0){
				res[i]=0;
			}
			else if(i==arr.length-1 && arr[arr.length-2]==0){
				res[i]=0;
			}
			else if(i==arr.length-1 && arr[arr.length-2]==1){
				res[i]=1;
			}
			else if(arr[i-1]==arr[i+1]){
				res[i]=0;
			}
			else if(arr[i-1]!=arr[i+1]){
				res[i]=1;
			}
			else{
				System.out.println(" ");
			}
				
			
		}
		System.out.println(Arrays.toString(res));
		
	}
}
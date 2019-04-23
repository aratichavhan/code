import java.io.*;
import java.util.*;
import java.lang.*;
public class unique{
     static boolean removeDuplicates(String str) 
    { 
        boolean[] charset=new boolean[128];
		for(int i=0;i<str.length();i++){
		int val=str.charAt(i);
		 System.out.println("val"+val);
		if(charset[val]==true)
		return false;
		
		charset[val]=true;
		System.out.println("cval"+Arrays.toString(charset));
		}
		return true;
		}
      
    public static void main (String[] args)  
    { 
        
        
        String str= "arti"; 
		int n = str.length();
        System.out.println("res="+removeDuplicates(str));		
        
    } 
} 

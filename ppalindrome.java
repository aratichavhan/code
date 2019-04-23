import java.io.*;
import java.util.*;
import java.lang.*;
public class ppalindrome{
     static int removeDuplicates(String str) 
    { 
        int cnt[]=new int[256];
		for(int i=0;i<str.length();i++){
			cnt[str.charAt(i)]++;
		}
		
		System.out.println( );
		return Arrays.toString(cnt);
		}
      
    public static void main (String[] args)  
    { 
        
        
        String str= "arati"; 
		int n = str.length();
        System.out.println("res="+removeDuplicates(str));		
        
    } 
} 

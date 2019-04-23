import java.io.*;
import java.util.*;
import java.lang.*;
public class oneway{
     static boolean oneeditaway(String first,String second) 
    { 
        if(Math.abs(first.length()-second.length())>1)
		{
		return false;
		}
		String s1=first.length()<second.length() ? first:second;
        String s2=first.length()<second.length() ? second:first;
		
		int index1=0;
int index2=0;
         boolean founddiff=false;
		 while(index2<s2.length() && index1<s1.length())
		 {
			 if(s2.charAt(index2)!=s1.charAt(index1)){
				 if(founddiff=true) return false;
				 
				 founddiff=true;
				 
				 if(s1.length()==s2.length()){
				 index1++;}
				 
			 }
			 else{
				 index1++;
			 }
			
		 }
		 
		  index2++;
return true;
		}
      
    public static void main (String[] args)  
    { 
        
        
        String first= "arati"; 
		 String second= "areti"; 
		
        System.out.println("res="+oneeditaway(first,second));		
        
    } 
} 

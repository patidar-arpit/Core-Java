package local;
import java.util.*;

public class Generics1 {

	  public static void main(String[] args) {  
	        Integer[] intArray = { 1, 2, 3, 4, 5 };  
	        String[] stringArray = { "Hello", "World", "!" };   
	        printArray(intArray);  
	        printArray(stringArray);
	    }  
	    public static <T> void printArray(T[] arr) {  
	        for (T element : arr) {  
	            System.out.println(element + " ");  
	        }  
	          
	    }  
    
}


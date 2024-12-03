package Searching; 
public class SearchingAlgorithm{ 
int[]data; 
public SearchingAlgorithm(int[]data) { 
this.data=data; 
} 
public void linearSearch(int item) { 
boolean found=false; 
int location=-1; 
for(int i=0;i<data.length;i++) { 
if(item==data[i]) { 
found=true; 
location=i; 
break; 
} 
} 
if(found==true) { 
System.out.println("Item found this location:"); 
} 
else { 
System.out.println("Item is not found"); 
} 
} 
} 
package Searching; 
import java.util.Scanner; 
public class Main { 
public static void main(String[] args) { 
int[]data=new int[10]; 
Scanner input=new Scanner(System.in); 
System.out.println("Enter"+data.length+ "values"); 
for(int i=0;i<data.length;i++) { 
data[i]=input.nextInt(); 
} 
SearchingAlgorithm search=new SearchingAlgorithm(data); search.linearSearch(8); 
}


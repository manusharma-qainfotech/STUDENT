import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Student {
	public int id ;
	public String name;
	public  double cgpa;
	Student(int id, String name ,double cgpa)
	{
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}  
	
	//static ArrayList arraylist;
	
	public static void main(String[] args) {
	
	  ArrayList<Student> arraylist = new ArrayList();
	 
		Scanner scan = new Scanner(System.in);
        
		System.out.println("how many students");
        
		int n=  scan.nextInt();
        
        
		for(int i = 0;i<n;i++)
        {
	     int  id1 = scan.nextInt();
	    
	     String  name1 = scan.next();
       	 
	     double  cgpa1 = scan.nextDouble();
	     
	     
	     arraylist.add(new Student(id1,name1,cgpa1));
	 		
        }
		
		Collections.sort(arraylist, new Comparato());

		 Iterator itr = arraylist.iterator();
		 while(itr.hasNext())
		 {
			 Student st = (Student) itr.next();
			 System.out.println(st.name);
		 }
 		  	}
	
}

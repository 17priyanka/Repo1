//Writing a program in Java to demonstrate the uses of polymorphism
package assignment;

public class PolymorphAdd {

	
		
		    public int sum(int x, int y) 
		    { 
		        return (x + y); 
		    } 
		    public int sum(int x, int y, int z) 
		    { 
		        return (x + y + z); 
		    } 
		    public double sum(double x, double y) 
		    { 
		        return (x + y); 
		    } 
		    public static void main(String args[]) 
		    { 
		    	PolymorphAdd s = new PolymorphAdd(); 
		        System.out.println(s.sum(10, 20)); 
		        System.out.println(s.sum(10, 20, 30)); 
		        System.out.println(s.sum(10.5, 20.5)); 
		    } 
		}


	



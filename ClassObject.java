//Writing a program in Java to demonstrate the uses of classes and objects
package assignment;

public class ClassObject {  
		    String name; 
		    String breed; 
		    int age; 
		    String color; 
		    public ClassObject(String name, String breed, int age, String color) 
		    { 
		        this.name = name; 
		        this.breed = breed; 
		        this.age = age; 
		        this.color = color; 
		    } 
		    public String getName() 
		    { 
		        return name; 
		    } 
		    public String getBreed() 
		    { 
		        return breed; 
		    } 
		    public int getAge() 
		    { 
		        return age; 
		    } 
		    public String getColor() 
		    { 
		        return color; 
		    } 
		    @Override
		    public String toString() 
		    { 
		        return("Hi my name is "+ this.getName()+ ".\nMy breed,age and color are " + this.getBreed()+", " + this.getAge()+ ", and"+ this.getColor() + "."); 
		    } 
		    public static void main(String[] args) 
		    { 
		    	ClassObject scott = new ClassObject("dhafny","papillon", 7, "white"); 
		        System.out.println(scott.toString()); 
		    } 
		}


	



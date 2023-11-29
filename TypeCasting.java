package assignment;

public class TypeCasting {

			public static void main(String[] args) {
				
				//implicit conversion
				System.out.println("Implicit Type Casting");
				char a='B';
				System.out.println("Value of a: "+a);
				
				int b='M';
				System.out.println("Value of b: "+b);
				
				float c=a;
				System.out.println("Value of c: "+c);
				
				long d=b;
				System.out.println("Value of d: "+d);
				
				double e=a;
				System.out.println("Value of e: "+e);
				System.out.println("");
				
				System.out.println("Explicit Type Casting");
				//explicit conversion
				
				double x=20.362222222222;
				float y=(float)x;
				System.out.println("Value of x: "+x);
				System.out.println("Value of y: "+y);
				
			}
		



	}



package operadores;

public class Main {

	public static void main(String[] args) {
		
		/*operadores aritmeticos */
		// + sumar dos valores
		int n1 = 3;
		int n2 = 4;
		
		int suma = n1 + n2;
		
		System.out.println(n1 + n2);
		System.out.println(suma);
		
		int n3 = 6;
		float n4 = 3.5f;
		
		System.out.println(n3 + n4);
		// - restar dos valores
		
		int n5 = 10;
		float n6 = 4.5f;
		
		System.out.println(n5 - n6);
		
		// / dividir dos valores
		
		int n7 = 20;
		float n8 = 7.5f;
		
		System.out.println(n7 / n8);
		// * multiplicar dos valores
		
		int n9 = 7;
		float n10 = 5.3f;
		
		System.out.println(n9 * n10);
		// % El resto de una division
		
		int n11 = 10;
		int n12 = 4;
		
		System.out.println(n11 % n12);
		
		// ++
		System.out.println("INCREMENTO");
		int n13 = 8;
		n13 = n13 + 1;
		n13++;
		//System.out.println(n13);
		
		//int n14 = n13++;
		int n14 = ++n13;
		
		// --
		System.out.println("DECREMENTO");
		n13 = n13 - 1;
		n13--;
		System.out.println(n13);
		/*operadores logicos */
		
		//==
		System.out.println(1==1); //true
		System.out.println(1==2); //false
		//!=
		System.out.println(1!=1); //false
		System.out.println(1!=2); //true
		//>
		System.out.println(1>0); //true
		System.out.println(1>1); //false
		System.out.println(1>2); //false
		//<
		System.out.println(1<0); //false
		System.out.println(1<1); //false
		System.out.println(1<2); //true
		//>=
		System.out.println(1>=0); //true
		System.out.println(1>=1); //true
		System.out.println(1>=2); //false
		//<=
		System.out.println(1<=0); //false
		System.out.println(1<=1); //true
		System.out.println(1<=2); //true
		/*operadores de comparacion*/
		//&&
		System.out.println((1 < 0) && (1 < 2)); //false pero solo se evalua la primera
		System.out.println((1 < 2) && (1 < 0)); //false pero se evaluan las 2
		
		//||	
		System.out.println((1 < 0) || (1 < 2)); //true
		
		//!
		System.out.println(!(1 < 0)); //true
		System.out.println(!(1 < 1)); //false
	}

}

package fundamentos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double resultado = 6 *(3 + 2);
		double resultado2 = (1-5) * (2-7);
		double resultado3 = (Math.pow(resultado, 2))/(3 * 2); 
		double resultado4 =(Math.pow((resultado2/2), 2));
		double resultado5 = Math.pow((resultado3 - resultado4), 3);
        Integer resultado6 = (int) (resultado5/(Math.pow(10,3)));
        
        System.out.println(resultado6);
	}

}

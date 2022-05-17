
public class TestaCaracteres {
	public static void main(String[]args) {
		
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor);
		
		//valor = valor + 1;         // Não compila. Por quê ? Int com Char...
        //System.out.println(valor);
		
		valor = (char)(valor +1);
		System.out.println(valor);
		
		String palavra = "Eu vou virar programador";
		System.out.println(palavra);
		
		palavra = palavra + " em 2022";
		System.out.println(palavra);
	}
}

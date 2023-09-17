import java.util.Scanner;
// Importe a classe ParametrosInvalidosException aqui
import  pacote.onde.ParametrosInvalidosException;

public class contador { 

    public static void main(String[] args) {
	
	Scanner terminal = new Scanner(System.in);
	System.out.println("Digite o primeiro parâmetro");
	int parametroUm = terminal.nextInt();
	System.out.println("Digite o segundo parâmetro");
	int parametroDois = terminal.nextInt();

		

	try {
		//chamando o método contendo a lógica de contagem
		contar(parametroUm, parametroDois);
	
	}catch (ParametrosInvalidosException e) {	
		//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		System.err.println(e.getMessage());
	}
}
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
    if (parametroUm > parametroDois) {
        throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
    }

	int contagem = parametroDois - parametroUm;

    // Usar um loop 'for' para imprimir os números com base na variável contagem
    for (int i = parametroUm; i <= parametroDois; i++) {
        System.out.println("Imprimindo o número " + i);
    }
}
} 	
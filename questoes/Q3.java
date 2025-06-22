//Data: 09/06/2025
//Conteúdo: Avaliação prática

package questoes;
import utils.IO;

public class Q3 {

    public static void resolver(){
        IO.imprimir("Avaliação - Questão 03 - Número Perfeito");

        //Entrada
        int numero = IO.lerValorInteiro();
        int soma = 0;
        //Processamento
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                soma += i;
            }
        }if (soma == numero) {
            IO.imprimir(numero + " é um número perfeito.");
        } else {
            IO.imprimir(numero + " não é um número perfeito.");
        }
        // resolverNumeroPerfeito();
        
    }

    public static void resolverNumeroPerfeito(){

        // Sua solução aqui
        
    }

}

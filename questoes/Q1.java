//Data: 09/06/2025
//Conteúdo: Avaliação prática

package questoes;
import utils.IO;

public class Q1 {

    public static void resolver(){
        IO.imprimir("Avaliação - Questão 01 - ");

        //Entrada
        int n = IO.lerValorInteiro();

        //Processamento
        resolverQuadradoEAoCubo(n);{
            for (int i = 1; i <= n; i++) {
                int quadrado = i * i;
                int cubo = i * i * i;
                IO.imprimir("Número: " + i + ", Quadrado: " + quadrado + ", Cubo: " + cubo);
            }
        }
        
    }

    public static void resolverQuadradoEAoCubo(int n){

        // Sua solução aqui
        
    }

}

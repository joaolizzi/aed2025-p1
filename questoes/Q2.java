//Data: 09/06/2025
//Conteúdo: Avaliação prática

package questoes;
import utils.IO;

public class Q2 {

    public static void resolver(){
        IO.imprimir("Avaliação - Questão 02 - Senha Fixa");

        //Entrada
       final int senhaFixa = 2002;
       int senha;
        //Processamento
       while (true) {
        senha = IO.lerValorInteiro();
        if (senha == senhaFixa) {
            IO.imprimir("Acesso permitido");
            break;
        } else {
            IO.imprimir("Senha Invalida");
        }
       }
        // resolverSenhaFixa();
        
    }

    public static void resolverSenhaFixa(){

        // Sua solução aqui
        
    }

}

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int parametroUm, parametroDois;

        System.out.println("Digite o primeiro parametro");
        parametroUm = teclado.nextInt();
        System.out.println("Digite o segundo parametro");
        parametroDois = teclado.nextInt();

        try{
            //implementacao do metodo
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidoException e){
            //mensagem da excecao
            System.out.println("O primeiro numero nao pode ser maior que o segundo");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidoException{
        //Validacao dos parametros
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidoException();
        }
        //operacao para definir numero de interacoes
        int contador = parametroDois - parametroUm;

        for (int i = 1; i <= contador; i++) {
            System.out.println("Imprimindo o numero " + i);
        }
    }
}

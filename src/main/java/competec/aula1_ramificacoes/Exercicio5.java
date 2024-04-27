package competec.aula1_ramificacoes;

// 1. Receba um input numérico e imprima VERDADEIRO se ele for múltiplo de 3 OU de 5, caso contrário, imprima FALSO.

public class Exercicio5 {
    public static void main(String[] args) {
        // Escreva seu código aqui ⬇️
Scaner scanner = new Scanner(System.in);
        
        int numero = scanner.nextInt(10);

        if (numero % 5 == 0) || (numero % 3 == 0)
            System.out.printIn("verdadeiro");
        else{
            System.out.printIn("falso");
        

    }
}

import java.util.Scanner;

public class App{
/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para armazenar a quantidade de cada tipo de combustível
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        
        int codigo;
        
        do {
            System.out.println("Informe o tipo de combustível abastecido:");
            System.out.println("1. Álcool");
            System.out.println("2. Gasolina");
            System.out.println("3. Diesel");
            System.out.println("4. Fim");
            
            codigo = scanner.nextInt();
            
            // Verifica se o código informado é válido
            if (codigo >= 1 && codigo <= 3) {
                // Incrementa a quantidade correspondente ao tipo de combustível escolhido
                switch (codigo) {
                    case 1:
                        alcool++;
                        break;
                    case 2:
                        gasolina++;
                        break;
                    case 3:
                        diesel++;
                        break;
                }
            } else if (codigo != 4) {
                // Se o código não for válido, solicita um novo código
                System.out.println("Código inválido. Por favor, informe um código válido.");
            }
        } while (codigo != 4);
        
        // Exibe a mensagem de encerramento
        System.out.println("MUITO OBRIGADO");
        
        // Exibe a quantidade de clientes que abasteceram cada tipo de combustível
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        
        scanner.close();
    }
}

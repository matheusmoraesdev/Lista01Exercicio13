import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) throws Exception {
        double altura;
        double peso_m,peso_f;
        char sexo;
    Scanner reader = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
            altura = reader.nextDouble();
        System.out.print("Qual seu sexo ? Digite 'M' para Masculino e 'F' para Feminino: ");
            sexo = reader.next().charAt(0);
            reader.close();
        peso_m = (72.7 * altura) - 58;
        peso_f = (62.1 * altura) - 44.7;
    
    if (sexo == 'M') {
        System.out.println("Seu peso ideal é: " + peso_m);
    } else if (sexo == 'F') {
        System.out.println("Seu peso ideal é: " + peso_f);
    } else {
        System.out.println("Digitação errada. Tente novamente!");
        }
    }
}

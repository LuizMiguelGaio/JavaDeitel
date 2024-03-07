package src.cap4;
import java.util.Scanner;
public class Exerc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int x = 0;



        while (x < 12){
            sum += x;
            System.out.println(sum);
            x++;
        }
        System.out.printf("A soma é: %d", sum);


        //4.4
        //int y = 0;
        //int z = 0;
        //int contador = 0;
        //4.3 abaixo
        //x += 1;
        //x =+ 1;
        //x++;
        //++x;

        //System.out.println("Digite um numero: \n");
        //x = input.nextInt();
        //System.out.println("Digite outro numero: \n");
        //y = input.nextInt();
       // while (contador <= 10) {
           // z = x + y;
           // x++;
            //contador++;
        //}
        //System.out.printf("z = %d", z);
    }
}

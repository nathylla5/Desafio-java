import java.util.Scanner;
public class Index {
    public static void main(String[] args) {
        int i=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos carrinhos?");
        int car = scan.nextInt();
        Iniciar iniciar[] = new Iniciar[car];
        do {
                iniciar[i] = new Iniciar();
                i++;       
        } while (i < car);
       
    }
}

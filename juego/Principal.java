import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Oprima 1 para iniciar juego");
        int num = sc.nextInt();
        System.out.println(Bichos.fraseAbuela());
        System.out.println("Iniciando juego");
        if (num == 1) {
            Bichos.AsignarAleatorio();
            System.out.println(Bichos.mostrarTablero());
            System.out.println(Bichos.fraseAbuela());
        }
        while (true) {
            System.out.println("-----OPCIONES-----");
            System.out.println("1. Disparar una bala");
            System.out.println("2. Activar bomba atomica");
            System.out.println("3. Activar bicho mutante");
            System.out.println("4. Frase de la abuela");
            System.out.println("0. Detener juego");
            int numero = sc.nextInt();
            if (numero == 0) {
                break;
            }
            switch (numero) {
                case 1:
                    System.out.println("Dame la posicion x del bicho: ");
                    int pos1 = sc.nextInt();
                    System.out.println("Dame la posicion y del bicho: ");
                    int pos2 = sc.nextInt();
                    Bichos.dispararBala(pos1, pos2);
                    System.out.println(Bichos.mostrarTablero());
                    break;

                case 2:
                    System.out.println("Dame la posicion x del bicho: ");
                    int posx = sc.nextInt();
                    System.out.println("Dame la posicion y del bicho: ");
                    int posy = sc.nextInt();
                    Bichos.bombaAtomica(posx, posy);
                    System.out.println("La bomba atomica fue activada");
                    System.out.println(Bichos.mostrarTablero());
                    break;

                case 3:
                    System.out.println();
                    break;

                case 4:
                    System.out.println(Bichos.fraseAbuela());
                    break;

            }
        }
    }
}

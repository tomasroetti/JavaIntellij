import java.util.Scanner;

public class jugar {
    private Scanner teclado = new Scanner(System.in);
    private  boolean juegoactivo = true;


    public void juego (){
        System.out.println("Hola,Cuál es tu nombre ?");
        String nombre = teclado.next();
        System.out.printf("Buenas %s, vamos a comenzar\n",nombre);

        int min = 0;
        int max = 10;
        int numeroalt = (int) (Math.random() * ((max - min) + 1));

        System.out.println(numeroalt);

        while (juegoactivo && true) {
            System.out.println("Ingrese un  número");
            int numero = teclado.nextInt();


            if (numero == numeroalt) {
                System.out.println("Usteded a ganado");
                juegoactivo=false;
            }else if (numero < numeroalt) {
                System.out.println("El numero es mayor ");

            }else{
                System.out.println("el numero es menor");

            }
        }
    }
}

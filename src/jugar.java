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
        int intentos = 0;

        System.out.printf("Vamos a comenzar elegi un numero entre %d y %d",min,max);

        System.out.println(numeroalt);

        while (juegoactivo) {
            System.out.println("Ingrese un  número");
            int numero = teclado.nextInt();
            intentos++ ;

            if (numero == numeroalt) {
                System.out.printf("Usteded a ganado\n con la %d intentos",intentos);
                juegoactivo=false;
            }else if (numero < numeroalt) {
                System.out.println("El numero es mayor ");

            }else{
                System.out.println("el numero es menor");

            }
        }
    }
}

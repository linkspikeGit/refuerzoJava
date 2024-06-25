import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        int opcion = 0;

        Scanner esc = new Scanner(System.in);

        System.out.println("Por favor ingrese el ejercicio que desea realizar: ");
        System.out.println("1. Calculadora basica ");
        System.out.println("2. Convertidor de temperatura ");
        System.out.println("3. Reversa de cadena ");
        System.out.println("Ingrese la opcion: ");
        opcion = Integer.parseInt(esc.nextLine());

        switch (opcion){

            case 1:
                Calculadora c1 = new Calculadora();
                c1.calcu();
            break;


        }





    }

}

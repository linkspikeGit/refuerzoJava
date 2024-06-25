import java.util.Scanner;

public class Calculadora {

    double num1, num2, resultado;
    String operacion;

    public Calculadora(){

        this.num1 = 0;
        this.num2 = 0;
        this.resultado = 0;
        this.operacion = "";
    }

    public void calcu(){

        Scanner es = new Scanner(System.in);


        System.out.println("Bienvenido a la calculadora: ");
        System.out.println("Por favor ingrese el primer numero: ");
        num1 = Double.parseDouble(es.nextLine());
        System.out.println("Por favor ingrese el segundo numero: ");
        num2 = Double.parseDouble(es.nextLine());

        System.out.println("Que operación desea realizar? + para suma, - para resta, * para multiplicacion o / para division");
        operacion = es.nextLine();

        switch (operacion){

            case "+":
                resultado = num1 + num2;
                System.out.println("La suma de los numeros es: "+resultado);
            break;
            case "-":
                resultado = num1 - num2;
                System.out.println("La resta de los numeros es: "+resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println("La suma de los numeros es: "+resultado);
                break;
            case "/":

                if (num2==0){
                    System.out.println("La división por cero no está definida");
                    break;
                }
                resultado = num1 / num2;
                System.out.println("La división de los numeros es: "+resultado);

                break;
        }





    }


}

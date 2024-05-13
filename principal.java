import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("*************************************** \n " +
                "Hola mucho gusto, Sea bienvenido al conversor de monedas \n " +
                "1) Peso Colombiano -> Dolar \n " +
                "2) Dolar -> Peso Colombiano  \n " +
                "3) Peso Colombiano -> Real Brasileño \n " +
                "4) Real Brasileño -> Peso Colombiano \n " +
                "5) Peso Colombiano -> Peso Argentino \n " +
                "6) Peso Argentino -> Peso Colombiano \n " +
                "7) Salir \n " +
                "Elija una de las siguientes Elecciones");
        int valor = Integer.parseInt(teclado.nextLine());

        System.out.println("***************************************");
        consultarMoneda consulta  = new consultarMoneda();

        switch (valor){
            case 1:
                System.out.println("Has eleguido: Peso Colombiano -> Dolar");

                System.out.println("Ingrese el valor que desea convertir: ");
                double evaluar = teclado.nextDouble();

                Moneda moneda = consulta.buscaMoneda("COP","USD");
                /*Hago la respectiva multiplicacion*/
                double resultado = evaluar * moneda.conversion_rate();

                /*Debo que hacer que esta informacion se filtre por hay para extraer el resultado*/
                /*operacionMoneda moneda1 = new operacionMoneda(evaluar);*/

                System.out.println("El valor " + evaluar +" "+ moneda.base_code() + " corresponde al valor final de: " + resultado +" "+ moneda.target_code());
                break;
            case 2:
                System.out.println("Has eleguido:  Dolar -> Peso Colombiano");

                System.out.println("Ingrese el valor que desea convertir: ");
                double evaluar1 =teclado.nextDouble();

                Moneda moneda1 = consulta.buscaMoneda("USD", "COP");
                double resultado1 = evaluar1 * moneda1.conversion_rate();

                System.out.println("El valor " + evaluar1 + " " + moneda1.base_code() + " corresponde al valor final de: " + resultado1 + " " + moneda1.target_code());
                break;
            case 3:
                System.out.println("Has eleguido: Peso Colombiano -> Real Brasileño");

                System.out.println("Ingrese el valor que deasea convertir: ");
                double evaluar2 = teclado.nextDouble();

                Moneda moneda2 = consulta.buscaMoneda("COP","BRL");
                double resultado2 = evaluar2 * moneda2.conversion_rate();

                System.out.println("El valor: " + evaluar2 + " " + moneda2.base_code() + " corresponde al valor final de: " + resultado2 + " " + moneda2.target_code());
                break;
            case 4:
                System.out.println("Has eleguido: Real Brasileño -> Peso Colombiano");

                System.out.println("Ingrese el valor que desea convertir: ");
                double evaluar3 = teclado.nextDouble();

                Moneda moneda3 = consulta.buscaMoneda("BRL", "COP");
                double resultado3 = evaluar3 * moneda3.conversion_rate();

                System.out.println("El valor: " + evaluar3 + " " + moneda3.base_code() + " corresponde al valor final de: " + resultado3 + " " + moneda3.target_code());
                break;
            case 5:
                System.out.println("Has eleguido: Peso Colombiano -> Peso Argentino");

                System.out.println("Ingrese el valor que desea convertir: ");
                double evaluar4 = teclado.nextDouble();

                Moneda moneda4 = consulta.buscaMoneda("COP", "ARS");
                double resultado4 = evaluar4 * moneda4.conversion_rate();

                System.out.println("El valor: " + evaluar4 + " " + moneda4.base_code() + " corresponde al valor final de: " + resultado4 + " " + moneda4.target_code());
                break;
            case 6:
                System.out.println("Has eleguido: Peso Argentino -> Peso Colombiano");

                System.out.println("Ingrese el valor que desea convertir: ");
                double evaluar5 = teclado.nextDouble();

                Moneda moneda5 =  consulta.buscaMoneda("ARS", "COP");
                double resultado5 = evaluar5 * moneda5.conversion_rate();

                System.out.println("El valor: " + evaluar5 + " " + moneda5.base_code() + " corresponde al valor final de: " + resultado5 + " " + moneda5.target_code());
                break;
            case 7:
                System.out.println("has salido correctamente");
                break;
            default:
                System.out.println("Informacion invalida");
        }
    }
}
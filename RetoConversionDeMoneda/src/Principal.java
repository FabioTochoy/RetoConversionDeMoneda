import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaConversionAPI consulta = new ConsultaConversionAPI();

        int opcion = 0;

        while (opcion !=7){

            System.out.println("*******************************************************************");
            System.out.println("Bienvenido/a al conversor de moneda.");
            System.out.println("1. Dolar USAa Peso Colombiano");
            System.out.println("2. Peso Colombiano a Dolar");
            System.out.println("3. Dolar USA a Yen Japones");
            System.out.println("4. Yen Japones a Dolar");
            System.out.println("5. Peso Colombiano a Yen japones");
            System.out.println("6. Yen Japones a Peso Colombiano");
            System.out.println("7. para salir");
            System.out.println("Selecione una opcion valida.");
            System.out.println("*******************************************************************");

            opcion = lectura.nextInt();

            if(opcion ==7){
                System.out.println("Gracias por usar nuestro conversor de moneda. Feliz dia.");
                break;
            }

            String monedaIngreso = "";
            String monedaSalida = "";

            switch (opcion) {
                case 1 -> {
                    monedaIngreso = "USD";
                    monedaSalida = "COP";
                }
                case 2 -> {
                    monedaIngreso = "COP";
                    monedaSalida = "USD";
                }
                case 3 -> {
                    monedaIngreso = "USD";
                    monedaSalida = "JPY";
                }
                case 4 -> {
                    monedaIngreso = "JPY";
                    monedaSalida = "USD";
                }
                case 5 -> {
                    monedaIngreso = "COP";
                    monedaSalida = "JPY";
                }
                case 6 -> {
                    monedaIngreso = "JPY";
                    monedaSalida = "COP";
                }
                default -> {
                    System.out.println("Opción no válida. Intente de nuevo.");
                    continue;
                }

            }

            System.out.println("Ingrese la cantidad a convertir: ");
            double cantidad = lectura.nextDouble();


            try {
                ConversorMoneda conversor = consulta.moneda(monedaIngreso, monedaSalida);

                double tasa = conversor.conversion_rate();
                double convertido = cantidad * tasa;

                System.out.println("=== Resultado de Conversión ===");
                System.out.println("1 " + monedaIngreso + " Corresponde a " + tasa + " " + monedaSalida +" actualmente.");
                System.out.println("el valor agregado de " + cantidad + " " + monedaIngreso + " Corresponde al valor de " + convertido + " " + monedaSalida);


            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

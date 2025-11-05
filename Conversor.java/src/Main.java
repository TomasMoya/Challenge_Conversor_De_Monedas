import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main() throws IOException, InterruptedException {
        MenuConversor menu = new MenuConversor();
        Scanner respuestaUsuario = new Scanner(System.in);
        ConsultaAPI consulta = new ConsultaAPI();

//        consulta.setMoneda1("COB");
//        consulta.setMoneda2("ARS");
//        System.out.println(consulta.realizarConsulta());



        System.out.println("¡Bienvenido/a al conversor de monedas!");
        int opcion = 1;
        loop : while (opcion != 0){
            menu.mostrarMenu();
            try {
                opcion = respuestaUsuario.nextInt();
                respuestaUsuario.nextLine();
            } catch (InputMismatchException e){
                System.out.println("El valor ingresado no es válido");
                break;
            }
            switch (opcion) {
                case 1:
                    consulta.setMoneda1("ARS");
                    consulta.setMoneda2("BRL");
                    break;
                case 2:
                    consulta.setMoneda1("BRL");
                    consulta.setMoneda2("ARS");
                    break;
                case 3:
                    consulta.setMoneda1("CLP");
                    consulta.setMoneda2("ARS");
                    break;
                case 4:
                    consulta.setMoneda1("ARS");
                    consulta.setMoneda2("CLP");
                    break;
                case 5:
                    consulta.setMoneda1("CLP");
                    consulta.setMoneda2("BRL");
                    break;
                case 6:
                    consulta.setMoneda1("BRL");
                    consulta.setMoneda2("CLP");
                    break;
                case 7:
                    boolean busquedaValidada = false;
                    while (!busquedaValidada) {
                        menu.mostrarMenuConMasOpciones();
                        consulta.setMoneda1(respuestaUsuario.nextLine());
                        menu.IngresarMonedaAConvertir();
                        consulta.setMoneda2(respuestaUsuario.nextLine());
                        consulta.realizarConsulta();
                        Monedas monedas = consulta.realizarConsulta();
                        if (monedas.getMonedaBase() == null && monedas.getMonedaACalcular() == null) {
                            System.out.println("Los códigos ingresados no son válidos, intenta de nuevo");
                        } else {
                            busquedaValidada = true;
                        }
                    }
                    break;
                case 0:
                    System.out.println("¡Esperamos haberte ayudado, hasta la próxima!");
                    break;
                default:
                    System.out.println("La opción no es válida");
                    break loop;
            }
            if (opcion != 0){
                consulta.realizarConsulta();
                Monedas monedas = consulta.realizarConsulta();
                System.out.println("Ingresa la cantidad que deseas convertir: ");
                monedas.setCantidad(respuestaUsuario.nextDouble());
                monedas.calcularConversion();
                System.out.println(monedas);
            }
        }
        System.out.println("\nAbandonando el conversor...");
    }
}

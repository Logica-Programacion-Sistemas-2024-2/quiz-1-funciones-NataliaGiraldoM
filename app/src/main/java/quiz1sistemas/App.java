
package quiz1sistemas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        try{

           Scanner sc = new Scanner(System.in);

           System.out.println("Favor ingresar cuantas boletas desea comprar: ");
           int cantidadBoletas = sc.nextInt();
           sc.nextLine();

           System.out.println("Favor ingresar el tipo de silla V (VIP) o G (General): ");
           String tipoSilla = sc.next("");

           System.out.println("Favor ingresar numero de combo a comprar (1, 2, 3): ");
           int numeroCombo = sc.nextInt();
           sc.nextLine();

           System.out.println("Favor ingresar cuantos combos desea comprar: ");
           int cantidadCombos = sc.nextInt();
           sc.nextLine();

           valorBoletas = calcularValorBoleta(tipoSilla, cantidadBoletas);
           valorNetoCombo = calcularValorNetoCombo(numeroCombo, cantidadCombos);
           descuentoCombo = calcularDescuentoCombo (tipoSilla, numeroCombo, valorNetoCombo);
           valorFactura = calcularValorFactura(valorNetoCombo, valorBoletas, descuentoCombo);

           System.out.println("Usted eligió " + cantidadBoletas +" boletas tipo " + tipoSilla + ", junto con " + cantidadCombos + "combos numero " + numeroCombo + ". El valor de su factura es: " + valorFactura);


        }catch (Exception e) {
                System.out.println("Error " + e);
        }
    }

  
    public static int calcularValorBoleta(String tipoSilla, int cantidadBoletas){

        try {

                int valorBoleta = 0;
            switch (tipoSilla) {
                case "V":
                    valorBoleta = 15000;
                    break;

                case "G":
                    valorBoleta = 10000;
                    break;

                default :
                    return -1;
            }

            int valorBoletas = valorBoleta * cantidadBoletas;

            return valorBoletas;

        } catch (Exception e) {
            return -1;
        }
    } 

    public static int calcularValorNetoCombo(int numeroCombo, int cantidadCombos){
        try {

            int valorCombo = 0;
        switch (numeroCombo) {
            case 1:
                valorCombo = 40000;
                break;

            case 2:
                valorCombo = 30000;
                break;

            case 3:
                valorCombo = 42000;

            default :
                return -1;
        
        }

        int valorNetoCombo = valorCombo * cantidadCombos;

        return valorNetoCombo;

    } catch (Exception e) {
        return -1;
    }
} 
    
    public static int calcularDescuentoCombo(String tipoSilla, int numeroCombo, int valorNetoCombo){

        try{


          if (tipoSilla == "V"){

            switch (numeroCombo) {
                case 1:
                descuentoCombo = valorNetoCombo * 0.05;
                break;

                case 2:
                descuentoCombo = valorNetoCombo * 0.06;
                break;

                case 3:
                descuentoCombo = valorNetoCombo * 0.03;

            default :
                return -1;
            }

            return descuentoCombo;
          }


        } catch (Exception e) {
            return -1;
        }

    }

    
    public static int calcularValorFactura(int valorNetoCombo, int valorBoletas, int descuentoCombo){
 
        
        try {

            int valorFactura = valorNetoCombo + valorBoletas - descuentoCombo;
            return valorFactura;
        } catch (Exception e) {
            return -1;
        }

    }

}

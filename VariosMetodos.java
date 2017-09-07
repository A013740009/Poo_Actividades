/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadmodulos;
/**
 *
 * @author A01374009
 */
import java.util.Scanner;

public class VariosMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****************");
        System.out.println("MENU");
        System.out.println("*****************");
        System.out.println("  1.Calorias consumidas");
        System.out.println("  2.Centigrados a Farenheit");
        System.out.println("  3.Ecuacion de Segundo grado");
        System.out.println("  4.Progresion aritmetica");
        System.out.println("  5.Sueldo final");
        System.out.println("  6.Salir");
        String menu= sc.next();
        switch(menu){
            case "1":
                System.out.println("ACTIVIDAD");
                String actividad = sc.next();
                System.out.println("TIEMPO");
                int tiempo = sc.nextInt();
                System.out.println("PESO");
                double peso = sc.nextDouble();
                System.out.println(calorias(actividad, tiempo, peso));
                break;
            case "2":
                System.out.println("CELSIUS");
                double celsius = sc.nextDouble();
                System.out.println(temperatura(celsius));
                break;
            case "3":
                System.out.println("INTRODUCE x^2");
                int a = sc.nextInt();
                System.out.println("INTRODUCE x");
                int b = sc.nextInt();
                System.out.println("INTRODUCE #");
                int c = sc.nextInt();
                cuadratica(a, b, c);
                break;
            case "4":
                System.out.println("Introduce a");
                int a1 = sc.nextInt();
                System.out.println("Introduce b");
                int an = sc.nextInt();
                System.out.println("El resultado:");
                System.out.println(progresion(a1, an));
                break;
            case "5":
                System.out.println("Introduce sueldo");
                double sueldo = sc.nextDouble();
                System.out.println("Introduce prestaciones");
                double prestaciones = sc.nextDouble();
                System.out.println("Introduce el tope");
                double tope = sc.nextDouble();
                System.out.println(sueldoFinal(sueldo, prestaciones, tope));
                break;
            case "6":
                System.out.println("!Que tenga un excelente dia¡");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        
        
    }
    public static double calorias(String actividad, int tiempo, double peso) {
        int mets;
        switch(actividad){
                case "Correr":
                    mets = 10;
                    break;
                case "Basquetball":
                    mets = 8;
                    break;
                case "Tenis":
                    mets = 4;
                    break;
                case "Cocinar":
                    mets = 2;
                    break;
                case "Dormir":
                    mets = 1;
                    break;
                case "Leer":
                    mets = 1;
                    break;
                case "Bailar":
                    mets = 3;
                    break;
                case "Caminar":
                    mets = 2;
                    break;
                default:
                    mets = 0;
                    break;
        }
        double formula = (0.0175 * mets * peso * tiempo);
        return formula;
    }
    
    public static double temperatura(double celsius) {
        double Tf = (9/5)* celsius + 32;
        return Tf;
    }
    public static void cuadratica(int a, int b, int c) {
        int x = -b;
        int y = b*b;
        int z = 4*a*c;
        double r = (x+(Math.sqrt((y-z))))/(a*2);
        double r1 =(x-(Math.sqrt((y-z))))/(a*2);
        System.out.println("El valor de x es"+r);
        System.out.println("El otro valor de z es"+r1);
        
    }
    public static double progresion(int a1, int an) {
        double n = ((an - a1)+1);
        double S = (((a1 + an) * n)/2);
        return S;
    }
    public static double sueldoFinal(double sueldo, double prestaciones, double tope)  {
        double ingreso= sueldo + prestaciones;
        if (ingreso > tope ) {
            double impuestos = ingreso *.35;
            double pago = ingreso - impuestos;
            double mingresos= ingreso/2;
            if (mingresos> prestaciones){
                double extra= pago*.05;
                pago= pago+extra;
                return pago;
            }
            else{
                return pago;   
            }
        }
        else if (ingreso == tope){
            double impuestos = ingreso *.35;
            double pago = ingreso - impuestos;
            double mingresos= ingreso/2;
            if (mingresos> prestaciones){
                double extra= pago*.05;
                pago= pago+extra;
                return pago;
            }
            else{
                return pago;   
            }
        }
        else if(ingreso < tope){
            double impuestos = ingreso *.20;
            double pago = ingreso - impuestos;
            double mingresos= ingreso/2;
            if (mingresos> prestaciones){
                double extra= pago*.05;
                pago= (pago+extra);
                return pago;
            }
            else{
                return pago;   
            }
    }
}

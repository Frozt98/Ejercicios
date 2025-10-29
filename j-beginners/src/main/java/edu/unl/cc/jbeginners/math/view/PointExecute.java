/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.jbeginners.math.view;

import edu.unl.cc.jbeginners.math.domain.Point;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author JOSE SALAZAR
 */
public class PointExecute {
    public static Point readPoint(Scanner scanner){
          Point point;
     while(true){
        try{
            System.out.println("Ingresando informacion para un punto");
        
        System.out.println("Ingrese el identificador para el punto: ");
        String name = scanner.next();
        System.out.println("Ingrese la coordenada x: ");
        double x = scanner.nextDouble();
        System.out.println("Ingrese la coordenada Y: ");
        double y = scanner.nextDouble();
        point = new Point(x,y,name);
        break;
        
        } catch(InputMismatchException ime){
        scanner.nextLine();
        System.out.println("Entrada no valido, No es el tipo de dato esperado");
        System.out.println("Ingrese nuevamente los puntos");
        
        }catch(IllegalArgumentException iae){
            System.out.println(iae.getMessage());
                System.out.println("Ingrese nuevamente los puntos");
        }
        
    }
     return point;
     
    }
    public static void main (String args[]){
        Point p1,p2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Porgrama que permite trabajar con puntos en el plano cartesiano");
         p1 = readPoint(scanner);
         p2 = readPoint(scanner);
        
        System.out.println("Datos ingresados: ");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("El punto medio de p1--->p2 es: "+p1.getMiddlePoint(p2));
        System.out.println("El vector de p1----->p2 es:"+p1.getVector(p2));
        System.out.println("La pendiente del punto p1---->p2 es: "+p1.slope(p2));

        scanner.close();
        
        
    }
        
      /*Point p1 = new Point(6,-5,"P1");
      Point p2 = new Point(-7,10,"P2");
        System.out.println("Instance p1 es: "+p1);
        System.out.println("Instance p2 es: "+p2);
        
        System.out.println("La pendiente de P1--->P2 es: "+p1.slope(p2));
        System.out.println("La orientacion de P1---->P2 es :"+p1.getOrientacionType(p2));
        Point p1Middlep2 = p1.getMiddlePoint(p2);
        System.out.println("El punto medio de P1---->P2 es:" +p1Middlep2);
        System.out.println("El punto medio de P1---->P2 es:" +p2.getMiddlePoint(p1));
        
        System.out.println("p1 pertenece a la clase: "+p1.getClass().getCanonicalName());
        System.out.println("p1 pertenece a la clase: "+p1.getClass().getName());
        System.out.println("p1 pertenece a la clase: "+p1.getClass().getSimpleName());
        System.out.println("p1 pertenece a la clase: "+p1.getClass().getTypeName());
        System.out.println("p1 pertenece a la clase: "+p1.getClass().getPackageName());*/             
    
    
}

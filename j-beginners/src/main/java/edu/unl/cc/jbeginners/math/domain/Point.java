/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.jbeginners.math.domain;

/**
 *Representa al punto en plano cartesiano
 * @author JOSE SALAZAR
 */
public class Point {
    private Double x;
    private double y;
    private String name;

    public Point() {
        x = Double.valueOf("0");
        y = 0;
        name = " P0";
    }
    public Point(double x, double y, String name) {
        setX(x);
        setY(y);
        this.name = name;
    }

    private Point(double d, String origen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public Double distance(Point finalPoint){
         double distanx = finalPoint.getX() -this.x;
         double distany = finalPoint.getY() - this.y;
         double distance = Math.pow(distanx, 2)+ Math.pow(distany, 2);
         return distance;
    }
    
     public Point getMiddlePoint(Point finalPoint){
         Double x = (finalPoint.getX() + this.x) /2;
         Double y = (finalPoint.getY() + this.y)/2; 
        return new Point(x,y,"VR-" +this.name + "-"+ finalPoint.getName() );
    }       

     /**
      * Calcula la pendiente
      * @param finalPoint
      * @return valor -..0..+
      */
      public double slope(Point finalPoint){
          double m = (finalPoint.getX() -this.x)/ (finalPoint.getY() -this.y);
          return m; 
    }
       public String getOrientacionType(Point finalPoint){
           double m = slope(finalPoint);
           if(m==0){
               return "HORIZONTAL";
           }else{
               if(m==1){
               return "VERTICAL";    
           }
        }
           return "OBLICUA";
    }
       
        public Point getVector(Point finalPoint){
             Double x = finalPoint.getX() - this.x;
             Double y = finalPoint.getY() - this.y; 
        return new Point(x,y,"VR-" +this.name + "-"+ finalPoint.getName() );
    }
        public Point getVector(){
            Point originPoint = new Point();
            return originPoint.getVector(this);
            
    }
    
    public Double getX() {
        return x;
    }

    public void setX(double x) {
        if(x > 100 || x <-100){
            throw new IllegalArgumentException("Valor no permitido");
        }
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(double y) {
        if(y > 100 || y <-100){
            throw new IllegalArgumentException("Valor no permitido");
        }                             
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    @Override
    public String toString() {
        return name+ "(" + x + "," + y +'}';
    }
    
}

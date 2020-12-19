package Grafos;


public class Vertice {
  
  private String name;
  private Integer numAristas;
  private Integer index;
  
  private double x;
  private double y;

 
  private double distance;

  
  public Vertice(String name) {
    this.name = name;
    this.numAristas = 0;
  }

  /*Constructor que toma un entero como argumento. Asigna a la variable
  de instancia 'name' la cadena formada por la letra 'n' concatenada con
  la representación en cadena del número entero que tomó como argumento*/
  public Vertice(int name) {
    this.index = name;
    this.name = "n" + String.valueOf(name);
    this.numAristas = 0;
  }

  
  public Vertice(int name, double x, double y) {
    this.index = name;
    this.name = "n" + String.valueOf(name);
    this.x = x;
    this.y = y;
  }

  /*getters de variables de instancia */

  public String getName() {return name;}

  public Integer getNumEdges() {return numAristas;}

  public Integer getIndex() {return index;}

  public double getDistance() {return distance;}

  public void setDistance(double d) {this.distance = d; }

  /*Variables de instancia usadas en el modelo geográfico simple*/
  public double getX() {return x;}

  public double getY() {return y;}
}
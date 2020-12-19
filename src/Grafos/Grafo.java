package Grafos;
import java.util.*;
import java.io.FileNotFoundException;

public class Grafo {
 
  private Vertice[] nodes;
  
  private HashMap<Vertice, HashSet<Vertice>> graph;
  
  private HashMap<Vertice, HashSet<Arista>> incidencia; 
  private final int numeroVertices; 
  private int numeroAristas;  
  private static Formatter output; 
  private Boolean weighted; 


  
  public void escribirArchivo(String nombre)
  {
    try{
      output = new Formatter(nombre);
    }
    catch (SecurityException securityException)
    {
      System.err.println("No hay permiso de escritura.");
      System.exit(1);
    }
    catch (FileNotFoundException fileNotFoundException) {
      System.err.println("Error al abrir el archivo.");
      System.exit(1);
    }
    try{
      output.format("%s",this);
    }
    catch (FormatterClosedException formatterClosedException) {
      System.err.println("Error al escribir al archivo");
    }
    if (output != null)
    output.close();
  }
  
  public Grafo(int numVertices, String modelo) 
  {
      this.graph = new HashMap<Vertice, HashSet<Vertice>>();
      this.incidencia = new HashMap<Vertice, HashSet<Arista>>();
      this.numeroVertices = numVertices;
      this.nodes = new Vertice[numVertices];
      Random coorX = new Random();
      Random coorY = new Random();
      if (modelo == "geo-uniforme") {
        for (int i = 0; i < numVertices; i++) {
          Vertice n = new Vertice(i, coorX.nextDouble(), coorY.nextDouble());
          this.nodes[i] = n;
          this.graph.put(n, new HashSet<Vertice>());
          this.incidencia.put(n, new HashSet<Arista>());
        }
      }
      this.weighted = false;
    }

  
  public Grafo(int numVertices) 
  {
    this.graph = new HashMap<Vertice, HashSet<Vertice>>();
    this.incidencia = new HashMap<Vertice, HashSet<Arista>>();
    this.numeroVertices = numVertices;
    this.nodes = new Vertice[numVertices];
    for (int i = 0; i < numVertices; i++) {
      Vertice n = new Vertice(i);
      this.nodes[i] = n;
      this.graph.put(n, new HashSet<Vertice>());
      this.incidencia.put(n, new HashSet<Arista>());
    }
    this.weighted = false;
  }

    
  public int gradoVertice(int i) 
  {
    Vertice n1 = this.getNode(i);
    return this.graph.get(n1).size();
  }

  
  
  public void conectarVertices(int i, int j) 
  {
    
     Vertice n1 = this.getNode(i);
     Vertice n2 = this.getNode(j);
     
     HashSet<Vertice> aristas1 = this.getEdges(i);
     HashSet<Vertice> aristas2 = this.getEdges(j);

     
     aristas1.add(n2);
     aristas2.add(n1);  
     this.numeroAristas +=1; 
  }

  
  private Boolean existeConexion(int i, int j) 
  {
    
     Vertice n1 = this.getNode(i);
     Vertice n2 = this.getNode(j);
    
    HashSet<Vertice> aristas1 = this.getEdges(i);
    HashSet<Vertice> aristas2 = this.getEdges(j);
    
     if (aristas1.contains(n2) || aristas2.contains(n1)) {
       return true;
     }
     else{
       return false;
     }
  }

  
  private double distanciaVertices(Vertice n1, Vertice n2) 
  {
    return Math.sqrt(Math.pow((n1.getX() - n2.getX()), 2)
    + Math.pow((n1.getY() - n2.getY()), 2));
  }

  
  public int getNumNodes() {return numeroVertices;}

  public int getNumEdges() {return numeroAristas;}

  public Vertice getNode(int i) {return this.nodes[i];}

  public Boolean getWeightedFlag() {return this.weighted;}

  public HashSet<Vertice> getEdges(int i)
  {
    Vertice n = this.getNode(i);
    return this.graph.get(n);
  }

  public HashSet<Arista> getWeightedEdges(int i) 
  {
    Vertice n = this.getNode(i);
    return this.incidencia.get(n);
  }

  public void setWeighted() {this.weighted = true;}

  public void setIncidencia(int i, HashSet<Arista> aristasPeso) {
    this.incidencia.put(this.getNode(i), aristasPeso);}

  public void setAristaPeso(int i, int j, double peso) 
  {
    if (!this.existeConexion(i, j)) this.conectarVertices(i, j);
    Arista aristaNuevaij = new Arista(i, j, peso);
    Arista aristaNuevaji = new Arista(j, i, peso);
    HashSet<Arista> aristasNodoi = this.getWeightedEdges(i);
    HashSet<Arista> aristasNodoj = this.getWeightedEdges(j);
    aristasNodoi.add(aristaNuevaij);
    aristasNodoj.add(aristaNuevaji);
    this.setIncidencia(i, aristasNodoi);
    this.setIncidencia(j, aristasNodoj);
    if (!this.getWeightedFlag()) this.setWeighted();
  }

  
  public String toString() 
  {
    String salida;
    if (this.getWeightedFlag()) { 
      salida ="graph {\n";        
      for (int i = 0; i < this.getNumNodes(); i++) {
        salida += this.getNode(i).getName() + " [label=\""
        + this.getNode(i).getName() + " ("+ this.getNode(i).getDistance()
        + ")\"];\n";
      }
      for (int i = 0; i < this.getNumNodes(); i++) {
        HashSet<Arista> aristas = this.getWeightedEdges(i);
        for (Arista e : aristas) {
        salida += e.getNode1() + " -- " + e.getNode2()
        + " [weight=" + e.getWeight()+"" + " label="+e.getWeight()+""
        + "];\n";
        }
       }
      salida += "}\n";
    }
    else { 
      salida ="graph {\n";
      for (int i = 0; i < this.getNumNodes(); i++) {
        salida += this.getNode(i).getName() + ";\n";
      }
      for (int i = 0; i < this.getNumNodes(); i++) {
        HashSet<Vertice> aristas = this.getEdges(i);
        for (Vertice n : aristas) {
        salida += this.getNode(i).getName() + " -- " + n.getName() + ";\n";
        }
       }
      salida += "}\n";
    }
    return salida;
  }

  
  public void modeloErdosyRenyi(int numAristas) 
  {
    Random randomNum1 = new Random();
    Random randomNum2 = new Random();
    
    while (this.getNumEdges() < numAristas) 
    {
      int num1 = randomNum1.nextInt(this.getNumNodes());
      int num2 = randomNum2.nextInt(this.getNumNodes());
      if (num1 != num2) {
        if (!existeConexion(num1, num2)) {
          conectarVertices(num1, num2);
        }
      }
    }
  }

  
  public void modeloGilbert(double probabilidad)
  {
    Random randomNum = new Random();
    
    for(int i = 0; i < this.getNumNodes(); i++) {
      for(int j = 0; j <this.getNumNodes(); j++) {
        if ((i != j) && (randomNum.nextDouble() <= probabilidad)) {
          if (!existeConexion(i, j)) {
            conectarVertices(i, j);
          }
        }
      }
    }
  }

  
  public void modeloGeografico(double r)
  {
    
    for(int i = 0; i < this.getNumNodes(); i++) {
      for(int j = i + 1; j < this.getNumNodes(); j++) {
        double distancia = distanciaVertices(this.getNode(i), this.getNode(j));
        if (distancia <= r) {
            conectarVertices(i, j);
        }
      }
    }
  }

  
  public void modeloBarabasiAlbert(int d) 
  {
    Random volado = new Random();
  
    for(int i = 0; i < d; i++){
      for(int j = 0; j < i; j++) {
        if (!existeConexion(i, j)) {
          conectarVertices(i, j);
        }
      }
    }
  
    for(int i = d; i < this.getNumNodes();) 
    {
      for(int j = 0; j < i; j++) {
        double probabilidad =
        (double)gradoVertice(j)/(double)this.getNumEdges();
        if (volado.nextDouble() <= probabilidad) {
          if (!existeConexion(i, j) && (gradoVertice(i) < d)) {
            conectarVertices(i, j);
          }
        }
      }
      if (gradoVertice(i) >= d) i++;
    }
  }

}
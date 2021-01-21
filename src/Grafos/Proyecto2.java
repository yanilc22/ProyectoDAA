package Grafos;

public class Proyecto2{
  public static void main(String s[]){

  


    Grafo Aleatorio1 = new Grafo(30);
    Aleatorio1.modeloErdosyRenyi(30); 
    Aleatorio1.escribirArchivo("ErdosyRenyi1.gv");
    Grafo BFS1 = Aleatorio1.BFS(0);
    BFS1.escribirArchivo("BFS1.gv");
    Grafo DFS_Recursivo1 = Aleatorio1.DFS_Recursivo(0);
    DFS_Recursivo1.escribirArchivo("DFS_Recursivo1.gv");
    Grafo DFS_Iterativo1 = Aleatorio1.DFS_Iterativo(0);
    DFS_Iterativo1.escribirArchivo("DFS_Iterativo1.gv");

    Grafo Aleatorio2 = new Grafo(100);
    Aleatorio2.modeloErdosyRenyi(100); 
    Aleatorio2.escribirArchivo("ErdosyRenyi2.gv");
    Grafo BFS2 = Aleatorio2.BFS(0);
    BFS2.escribirArchivo("BFS2.gv");
    Grafo DFS_Recursivo2 = Aleatorio2.DFS_Recursivo(0);
    DFS_Recursivo2.escribirArchivo("DFS_Recursivo2.gv");
    Grafo DFS_Iterativo2 = Aleatorio2.DFS_Iterativo(0);
    DFS_Iterativo2.escribirArchivo("DFS_Iterativo2.gv");
    
    Grafo Aleatorio3 = new Grafo(500);
    Aleatorio3.modeloErdosyRenyi(500); 
    Aleatorio3.escribirArchivo("ErdosyRenyi3.gv");
    Grafo BFS3 = Aleatorio3.BFS(0);
    BFS3.escribirArchivo("BFS3.gv");
    Grafo DFS_Recursivo3 = Aleatorio3.DFS_Recursivo(0);
    DFS_Recursivo3.escribirArchivo("DFS_Recursivo3.gv");
    Grafo DFS_Iterativo3 = Aleatorio3.DFS_Iterativo(0);
    DFS_Iterativo3.escribirArchivo("DFS_Iterativo3.gv");

  }  
}


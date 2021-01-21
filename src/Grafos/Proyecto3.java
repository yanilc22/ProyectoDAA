package Grafos;

public class Proyecto3 {
	
	 public static void main(String s[]){

		   

		   
		 	Grafo Dijkstra1 = new Grafo(30);
		    Dijkstra1.modeloGilbert(80); 
		    Grafo Pesado1 = Dijkstra1.EdgeValues(1.0, 15.0);
		    Pesado1.escribirArchivo("Dijkstra_1.gv");
		    Grafo Dijkstra_1 = Pesado1.Dijkstra(0);
		    Dijkstra_1.escribirArchivo("Dijkstra1.gv");
		    
		    Grafo Dijkstra2 = new Grafo(100);
		    Dijkstra2.modeloGilbert(.10); 
		    Grafo Pesado2 = Dijkstra2.EdgeValues(1.0, 15.0);
		    Pesado2.escribirArchivo("Dijkstra_2.gv");
		    Grafo Dijkstra_2 = Pesado2.Dijkstra(0);
		    Dijkstra_2.escribirArchivo("Dijkstra2.gv");
		  

		    
		  }

}

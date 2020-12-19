package  Grafos;

public class Proyecto1 {
  public static void main(String s[]){

	  Grafo ErdosRenyi1 = new Grafo(30);
	    ErdosRenyi1.modeloErdosyRenyi(45); 
	    ErdosRenyi1.escribirArchivo("ModeloErdosRenyi1.gv");

	    Grafo ErdosRenyi2 = new Grafo(100);
	    ErdosRenyi2.modeloErdosyRenyi(150); 
	    ErdosRenyi2.escribirArchivo("ModeloErdosRenyi2.gv");

	    Grafo ErdosRenyi3 = new Grafo(500);
	    ErdosRenyi3.modeloErdosyRenyi(1000); 
	    ErdosRenyi3.escribirArchivo("ModeloErdosRenyi3.gv");
	    
	   
	   
	    
	    Grafo Gilbert1= new Grafo(30);
	    Gilbert1.modeloGilbert(.50); 
	    Gilbert1.escribirArchivo("ModeloGilbert1.gv");

	    Grafo Gilbert2 = new Grafo(100);
	    Gilbert2.modeloGilbert(.80); 
	    Gilbert2.escribirArchivo("ModeloGilbert2.gv");

	    Grafo Gilbert3 = new Grafo(500);
	    Gilbert3.modeloGilbert(.90); 
	    Gilbert3.escribirArchivo("ModeloGilbert13.gv");

	    Grafo Geografico1 = new Grafo(30);
	    Geografico1.modeloGeografico(.5);  
	    Geografico1.escribirArchivo("ModeloGeografico1.gv");

	    Grafo Geografico2 = new Grafo(100);
	    Geografico2.modeloGeografico(.5);
	    Geografico2.escribirArchivo("ModeloGeografico2.gv");

	    Grafo Geografico3 = new Grafo(500);
	    Geografico3.modeloGeografico(.5); 
	    Geografico3.escribirArchivo("ModeloGeografico3.gv");

	    Grafo BarabaA1 = new Grafo(30);
	    BarabaA1.modeloBarabasiAlbert(4);  
	    BarabaA1.escribirArchivo("ModeloBarabasiA1.gv");

	    Grafo BarabaA2 = new Grafo(100);
	    BarabaA2.modeloBarabasiAlbert(2); 
	    BarabaA2.escribirArchivo("ModeloBarabasiA2.gv");

	    Grafo BarabaA3 = new Grafo(500);
	    BarabaA3.modeloBarabasiAlbert(50);
	    BarabaA3.escribirArchivo("ModeloBarabasiA3.gv");

	    


	  
  }
}
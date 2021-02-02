package Grafos;



import static Grafos.Grafo.ErdosRenyi;
import static Grafos.Grafo.Geografico;
import static Grafos.Grafo.Barabasi;
import static Grafos.Grafo.Gilbert;
import static Grafos.Grafo.EscribirArchivo;



public class Proyecto4 {

	public static void main(String[] args) {
		    
		    Grafo GrafoBusqueda = new Grafo();
	        Grafo GrafoPrim = new Grafo();
	        Grafo GrafoKruskalD = new Grafo();
	        Grafo GrafoKruskalI = new Grafo();
//	        
//	        
//	        GrafoBusqueda = ErdosRenyi(30,100);
//	        GrafoBusqueda.EdgeValues(1, 1000);
//	        GrafoPrim = GrafoBusqueda.Prim();
//	        EscribirArchivo("ErdosRenyiPrimPocos",GrafoPrim);
//	        
//	        GrafoBusqueda = ErdosRenyi(30,100);
//	        GrafoBusqueda.EdgeValues(1, 1000);
//	        GrafoKruskalD = GrafoBusqueda.Kruskal_D();
//	        EscribirArchivo("ErdosRenyiKruskalDPocos",GrafoKruskalD);
//	       
//	        GrafoBusqueda = ErdosRenyi(30,100);
//	        GrafoBusqueda.EdgeValues(1, 1000);
//	        GrafoKruskalI = GrafoBusqueda.Kruskal_I();
//	        EscribirArchivo("ErdosRenyiKruskalIPocos",GrafoKruskalI);
//	        
//	       
//	        GrafoBusqueda = ErdosRenyi(200, 500);
//	        GrafoBusqueda.EdgeValues(1, 1000);
//	        GrafoPrim = GrafoBusqueda.Prim();
//	        EscribirArchivo("ErdosRenyiPrimMuchos",GrafoPrim);
//	        
//	        GrafoBusqueda = ErdosRenyi(200, 500);
//	        GrafoBusqueda.EdgeValues(1, 1000);
//	        GrafoKruskalI = GrafoBusqueda.Kruskal_I();
//	        EscribirArchivo("ErdosRenyiKruskalIMuchos",GrafoKruskalI);
//	        
//	        GrafoBusqueda = ErdosRenyi(200, 500);
//	        GrafoBusqueda.EdgeValues(1, 1000);
//	        GrafoKruskalD = GrafoBusqueda.Kruskal_D();
//	        EscribirArchivo("ErdosRenyiKruskalDMuchos",GrafoKruskalD);
//	        
//
//	        GrafoBusqueda = Gilbert(30,.2);
//	        GrafoBusqueda.EdgeValues(1, 1000);
//	        GrafoPrim = GrafoBusqueda.Prim();
//	        EscribirArchivo("GilbertPrimPocos",GrafoPrim);
//	        
//	        GrafoBusqueda = Gilbert(30,.2);
//	        GrafoBusqueda.EdgeValues(1, 1000);
//	        GrafoKruskalD = GrafoBusqueda.Kruskal_D();
//	        EscribirArchivo("GilbertKruskalDPocos",GrafoKruskalD); 
//	        
//	        GrafoBusqueda = Gilbert(30,.2);
//	        GrafoBusqueda.EdgeValues(1, 1000);
//	        GrafoKruskalD = GrafoBusqueda.Kruskal_D();
//	        EscribirArchivo("GilbertKruskalDPocos",GrafoKruskalD);
//	        
//	        
//	        
//	        GrafoBusqueda = Gilbert(200, .2);
//	        GrafoBusqueda.EdgeValues(1, 1000);
//	        GrafoPrim = GrafoBusqueda.Prim();
//	        EscribirArchivo("GilbertPrimMuchos",GrafoPrim);

//	        GrafoBusqueda = Gilbert(200, .2);
//	        GrafoBusqueda.EdgeValues(1, 1000);
//	        GrafoKruskalD = GrafoBusqueda.Kruskal_D();
//	        EscribirArchivo("GilbertKruskalDMuchos",GrafoKruskalD);
//	        
//	   
//	        GrafoBusqueda = Gilbert(200, .2);
//	        GrafoBusqueda.EdgeValues(1, 1000);
//	        GrafoKruskalI = GrafoBusqueda.Kruskal_I();
//	        EscribirArchivo("GilbertKruskalIMuchos",GrafoKruskalI);
//
//	        
//	        GrafoBusqueda = Geografico(30,.6);
//	        GrafoBusqueda.EdgeValues(1, 1000);
//	        GrafoPrim = GrafoBusqueda.Prim();
//	        EscribirArchivo("GeograficoPrimPocos",GrafoPrim);
//	        
//	        GrafoBusqueda = Geografico(30,.6);
//	        GrafoBusqueda.EdgeValues(1, 1000);
//	        GrafoKruskalD = GrafoBusqueda.Kruskal_D();
//	        EscribirArchivo("GeograficoKruskalDPocos",GrafoKruskalD);
//	        
//	        GrafoBusqueda = Geografico(30,.6);
//	        GrafoBusqueda.EdgeValues(1, 1000);
//	        GrafoKruskalI = GrafoBusqueda.Kruskal_I();
//	        EscribirArchivo("GeograficoKruskalIPocos",GrafoKruskalI);
//	        
//	        GrafoBusqueda = Geografico(200, .6);
//	        GrafoBusqueda.EdgeValues(1, 1000);
//	        GrafoPrim = GrafoBusqueda.Prim();
//	        EscribirArchivo("GeograficoPrimMuchos",GrafoPrim);

//	        GrafoBusqueda = Geografico(200, .6);
//	        GrafoBusqueda.EdgeValues(1, 1000);
//	        GrafoKruskalD = GrafoBusqueda.Kruskal_D();
//	        EscribirArchivo("GeograficoKruskalDMuchos",GrafoKruskalD);
//	        
//	        GrafoBusqueda = Geografico(200, .6);
//	        GrafoBusqueda.EdgeValues(1, 1000);
//	        GrafoKruskalI = GrafoBusqueda.Kruskal_I();
//	        EscribirArchivo("GeograficoKruskalIMuchos",GrafoKruskalI);
//	     
//	        GrafoBusqueda = Barabasi(30,100);
//	        GrafoBusqueda.EdgeValues(1, 1000);
//	        GrafoPrim = GrafoBusqueda.Prim();
//	        EscribirArchivo("BarabasiPrimPocos",GrafoPrim);
//	        
//	        GrafoBusqueda = Barabasi(30,100);
//	        GrafoBusqueda.EdgeValues(1, 1000);
//	        GrafoKruskalD = GrafoBusqueda.Kruskal_D();
//	        EscribirArchivo("BarabasiKruskalDPocos",GrafoKruskalD);
//	      
//	        GrafoBusqueda = Barabasi(30,100);
//	        GrafoBusqueda.EdgeValues(1, 1000);
//	        GrafoKruskalI = GrafoBusqueda.Kruskal_I();
//	        EscribirArchivo("BarabasiKruskalIPocos",GrafoKruskalI);
//	        
//	        GrafoBusqueda = Barabasi(200, 500);
//	        GrafoBusqueda.EdgeValues(1, 1000);
//	        GrafoPrim = GrafoBusqueda.Prim();
//	        EscribirArchivo("BarabasiPrimMuchos",GrafoPrim);
//	        
//	        GrafoBusqueda = Barabasi(200, 500);
//	        GrafoBusqueda.EdgeValues(1, 1000);
//	        GrafoKruskalD = GrafoBusqueda.Kruskal_D();
//	        EscribirArchivo("BarabasiKruskalDMuchos",GrafoKruskalD);
//	        
	       
	        GrafoBusqueda = Barabasi(200, 500);
	        GrafoBusqueda.EdgeValues(1, 1000);
	        GrafoKruskalI = GrafoBusqueda.Kruskal_I();
	        EscribirArchivo("BarabasiKruskalIMuchos",GrafoKruskalI);
	     
	       
	        
	        

	}

}

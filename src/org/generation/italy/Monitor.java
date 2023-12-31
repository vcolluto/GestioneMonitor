package org.generation.italy;

public class Monitor {
	//variabili del monitor (attributi)
	String colore;
	int pollici=-1;		//-1: non impostato 
	int luminositą=50;
	boolean stato=false; 		//false: spento, true: acceso
	
	
	//funzionalitą (metodi)
 	public void accendi() {
 		stato=true;
 	}
 	
 	
 	public void spegni() {
 		stato=false;
 	}
	
 	public void aumentaLuminositą()
 	{
 		if (luminositą<100)
 			luminositą+=10;
 	}
 	
 	public void riduciLuminositą()
 	{
 		if (luminositą>1)
 			luminositą-=1;
 	}
 	
 	public void mostraDati() 		//visualizza i dati del monitor
 	{
 		System.out.println("Colore: "+colore);
 		if (pollici>=0)
 			System.out.println("Pollici: "+pollici);		//li mostro se sono impostati
 		else
 			System.out.println("Pollici: -non impostato-");		//li mostro se sono impostati
		if (stato==true)
			System.out.println("Stato: acceso");
		else
			System.out.println("Stato: spento");
		System.out.print("Luminositą: ");
		for(int i=0;i<luminositą/10;i++)
			System.out.print("-");
		System.out.println();
 	}
 	
}

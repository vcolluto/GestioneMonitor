package org.generation.italy;

public class Monitor {
	//variabili del monitor (attributi)
	String colore;
	int pollici;
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
 	
}

package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Interfaccia che espone i metodi per aggiornare la UI relativa alla schermata di avvio dell'applicazione
*/ 
public interface MainView { 

/**
* Metodo utilizzato per visualizzare la schermata di caricamento dell'applicazione
* @param message Messaggio di caricamento
* @return  void
*/
 void setLoadingView(String message);

}


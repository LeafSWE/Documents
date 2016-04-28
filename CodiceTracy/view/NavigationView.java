package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Interfaccia che espone i metodi per aggiornare la UI contenente le istruzioni di navigazione per raggiungere una certa destinazione
*/ 
public interface NavigationView { 

/**
* Metodo utilizzato per aggiornare la lista di istruzioni 
* @return  void
*/
 void refreshInstructions();

/**
* Metodo utilizzato per visualizzare la lista di istruzioni utili a raggiungere un certo POI
* @param adapter Collegamento tra la lista delle informazioni e la view in cui esse devono essere mostrate
* @return  void
*/
 void setInstructionAdapter(NavigationAdapter adapter);

}


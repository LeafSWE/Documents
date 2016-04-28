package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Interfaccia che espone i metodi per aggiornare la UI contenente la lista dei POI nelle vicinanze dell'utente
*/ 
public interface NearbyPoiView { 

/**
* Metodo utilizzato per visualizzare tutti i POI nelle circostanze dell'utente
* @param adp Collegamento tra la lista dei POI circostanti l'utente e la view in cui essi devono essere mostrati
* @return  void
*/
 void setAdapter(Adapter adp);

}


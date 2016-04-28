package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Interfaccia che espone i metodi per aggiornare la UI della Home
*/ 
public interface HomeView { 

/**
* Metodo utilizzato per visualizzare l'indirizzo di un edificio
* @param address Indirizzo dell'edificio
* @return  void
*/
 void setBuildingAddress(String address);

/**
* Metodo utilizzato per visualizzare la descrizione di un edificio
* @param description Descrizione dell'edificio
* @return  void
*/
 void setBuildingDescription(String description);

/**
* Metodo utilizzato per visualizzare il nome di un edificio
* @param name Nome dell'edificio
* @return  void
*/
 void setBuildingName(String name);

/**
* Metodo utilizzato per visualizzare gli orari di apertura di un edificio
* @param hours Orari di apertura
* @return  void
*/
 void setBuildingOpeningHours(String hours);

/**
* Metodo utilizzato per visualizzare la lista di categorie dei POI dell'edificio
* @param adapter Collegamento tra la lista delle categorie di POI dell'edificio e la view in cui esse devono essere mostrate
* @return  void
*/
 void setPoiCategoryListAdapter(ListAdapter adapter);

}


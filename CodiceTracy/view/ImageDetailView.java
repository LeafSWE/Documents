package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Interfaccia che espone i metodi per aggiornare la UI contenente lo slideshow delle immagini relative ad un certo POI
*/ 
public interface ImageDetailView { 

/**
* Metodo utilizzato per visualizzare una slideshow di immagini relative al POI da raggiungere
* @param adp Collegamento tra la lista delle immagini e la view in cui esse devono essere mostrate
* @return  void
*/
 void setAdapter(Adapter adp);

}


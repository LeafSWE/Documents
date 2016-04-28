package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Interfaccia che espone i metodi per aggiornare la UI contenente la versione dettagliata di una certa istruzione e le foto relative al POI destinazione di tale istruzione
*/ 
public interface DetailedInformationView { 

/**
* Metodo utilizzato per visualizzare la descrizione dettagliata relativa ad una certa istruzione
* @param detailedInst Descrizione dettagliata relativa ad una certa istruzione di navigazione
* @return  void
*/
 void setDetailedDescription(String detailedInst);

/**
* Metodo utilizzato per visualizzare la lista delle anteprime delle foto relative ad un certo POI
* @param photo Lista degli URI delle immagini relative ad un certo POI
* @return  void
*/
 void setPhotos(PhotoInformation photo);

}


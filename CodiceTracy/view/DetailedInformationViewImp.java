package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che si occupa di mostrare: le anteprime delle foto rappresentanti il prossimo POI, la descrizione dettagliata di una certa informazione di navigazione. La UI legata a questa classe permette all'utente di accedere alle foto rappresentanti il prossimo POI
*/ 
public class DetailedInformationViewImp implements DetailedInformationView { 

/** 
* Presenter della View 
*/
private DetailedInformationActivity presenter;

/**
* Costruttore della classe DetailedInformationViewImp
* @param presenter Presenter della View che viene creata
*/
public DetailedInformationViewImp(DetailedInformationActivity presenter);

/**
* Metodo utilizzato per visualizzare la descrizione dettagliata relativa ad una certa istruzione
* @param detailedInst Descrizione dettagliata relativa ad una certa istruzione di navigazione
* @return  void
*/
@Override 
public void setDetailedDescription(String detailedInst);

/**
* Metodo utilizzato per visualizzare la lista delle anteprime delle foto relative ad un certo POI
* @param urls Lista degli URI delle immagini relative ad un certo POI
* @return  void
*/
@Override 
public void setPhotos(List<String> urls);

}


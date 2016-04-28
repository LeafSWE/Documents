package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che si occupa di mostrare i POI situati nelle vicinanze dell'utente. La UI legata a questa classe permette all'utente di accedere alle informazioni di un certo POI
*/ 
public class NearbyPoiViewImp implements NearbyPoiView { 

/** 
* View che mostra la lista di POI nelle vicinanze dell'utente 
*/
private ListView listPois;

/** 
* Presenter della View 
*/
private NearbyPoiActivity presenter;

/**
* Costruttore della classe NearbyPoiViewImp
* @param presenter Presenter della View che viene creata
*/
public NearbyPoiViewImp(NearbyPoiActivity presenter);

/**
* Metodo utilizzato per visualizzare tutti i POI nelle circostanze dell'utente
* @param adp Collegamento tra la lista dei POI circostanti l'utente e la view in cui essi devono essere mostrati
* @return  void
*/
@Override 
public void setAdapter(Adapter adp);

}


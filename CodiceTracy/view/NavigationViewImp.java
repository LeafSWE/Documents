package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che si occupa di mostrare la lista di istruzioni di navigazione utili per raggiungere un determinato POI. La UI legata a questa classe permette all'utente di accedere alle descrizioni dettagliate delle varie istruzioni
*/ 
public class NavigationViewImp implements NavigationView { 

/** 
* Collegamento tra la lista delle informazioni e la view in cui esse devono essere mostrate 
*/
private Adapter instrctionAdapter;

/** 
* Presenter della View 
*/
private NavigationActivity presenter;

/**
* Costruttore della classe NavigationViewImp
* @param presenter Presenter della View che viene creata
*/
public NavigationViewImp(NavigationActivity presenter);

/**
* Metodo utilizzato per aggiornare la lista di istruzioni
* @return  void
*/
@Override 
public void refreshInstructions();

/**
* Metodo utilizzato per visualizzare la lista di istruzioni utili a raggiungere un certo POI
* @param adapter Collegamento tra la lista delle informazioni e la view in cui esse devono essere mostrate
* @return  void
*/
@Override 
public void setInstructionAdapter(NavigationAdapter adapter);

}


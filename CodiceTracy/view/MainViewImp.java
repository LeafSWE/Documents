package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che si occupa di mostrare la schermata di caricamento dell'applicazione, eventuali operazioni CPU-intensive possono essere eseguite qui.
*/ 
public class MainViewImp implements MainView { 

/** 
* Presenter della View 
*/
private MainActivity presenter;

/**
* Costruttore della classe MainViewImp
* @param presenter Presenter della View che viene creata
*/
public MainViewImp(MainActivity presenter);

/**
* Metodo utilizzato per visualizzare la schermata di caricamento dell'applicazione
* @param message Messaggio di caricamento
* @return  void
*/
@Override 
public void setLoadingView(String message);

}


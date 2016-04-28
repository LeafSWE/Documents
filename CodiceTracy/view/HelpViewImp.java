package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che si occupa di mostrare la guida utente dell'applicazione
*/ 
public class HelpViewImp implements HelpView { 

/** 
* Presenter della View 
*/
private HelpActivity presenter;

/** 
* View che permette di visualizzare una pagina web 
*/
private WebView webView;

/**
* Costruttore della classe HelpViewImp che richiede l'url dove si trova la guida online
* @param url Stringa rappresentante l'URL a cui recuperare la guida dell'applicazione
*/
public HelpViewImp(String url);

/**
* Costruttore della classe HelpViewImp che richiede un'istanza di HomeActivity
* @param presenter Presenter della View che viene creata
*/
public HelpViewImp(HomeActivity presenter);

/**
* Metodo utilizzato per visualizzare la guida dell'applicazione
* @param url Stringa rappresentante l'URL a cui recuperare la guida dell'applicazione
* @return  void
*/
@Override 
public void setHelp(String url);

}


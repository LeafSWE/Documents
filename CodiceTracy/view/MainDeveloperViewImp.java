package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che si occupa di mostrare la lista di log salvati. La UI legata a questa classe permette all'utente di: accedere alle informazioni di un certo log o avviare un nuovo log
*/ 
public class MainDeveloperViewImp implements MainDeveloperView { 

/** 
* View che mostra la lista dei log 
*/
private ListView logList;

/** 
* Bottone che permette di attivare un log 
*/
private FloatingActionButton logStartBtn;

/** 
* Presenter della View 
*/
private MainDeveloperActivity presenter;

/**
* Costruttore della classe MainDeveloperViewImp
* @param presenter Presenter della View che viene creata
*/
public MainDeveloperViewImp(MainDeveloperActivity presenter);

/**
* Metodo utilizzato per visualizzare la lista di tutti i log salvati in locale
* @param adp Collegamento tra la lista dei log e la view in cui essi devono essere mostrati
* @return  void
*/
@Override 
public void setLogsAdapter(Adapter adp);

}


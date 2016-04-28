package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che permette di visualizzare il log in corso e di salvarlo.
*/ 
public class LoggingViewImp implements LoggingView { 

/** 
* Bottone per interrompere un log in corso  
*/
private FloatingActionButton btnStopLog;

/** 
* Lista di log salvati sul dispositivo 
*/
private ListView listLog;

/** 
* Presenter della View 
*/
private LoggingActivity presenter;

/**
* Costruttore della classe LoggingViewImp
* @param presenter Presenter della View che viene creata
*/
public LoggingViewImp(LoggingActivity presenter);

/**
* Metodo utilizzato per visualizzare la lista dei beacon rilevati 
* @param adp Collegamento tra la lista dei beacon rilevati e la view in cui essi devono essere mostrati
* @return  void
*/
@Override 
public void setBeaconListAdapter(Adapter adp);

}


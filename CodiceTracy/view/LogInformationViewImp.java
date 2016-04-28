package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che si occupa di mostrare i dettagli relativi ad un singolo log. La UI legata a questa classe permette all'utente di eliminare il log 
*/ 
public class LogInformationViewImp implements LogInformationView { 

/** 
* Bottone per rimuovere un log salvato 
*/
private FloatingActionButton btnDeleteLog;

/** 
* Presenter della View 
*/
private LogInfromationActivity presenter;

/** 
* TextView all'interno della quale viene visualizzato il contenuto del log 
*/
private TextView txtLog;

/**
* Costruttore della classe LogInformationViewImp
* @param presenter Presenter della View che viene creata
*/
public LogInformationViewImp(LogInformationActivity presenter);

/**
* Metodo utilizzato per visualizzare la lista delle informazioni di un certo beacon
* @param logInfo Collegamento tra la lista delle informazione dei log e la view in cui esse devono essere mostrate
* @return  void
*/
@Override 
public void setBeaconAdapter(String logInfo);

}


package com.leaf.clips.model;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import android.content.ServiceConnection;

/** 
*Classe che implementa android.content.ServiceConnection, utile al fine di comunicare con la classe che si occupa del rilevamento dei beacon
*/ 
public class ServiceConnectionImp { 

/**
* Questo metodo permette di specificare determinate azioni nel momento in cui un servizio(Service) viene connesso ad un componente
* @param className Questo parametro richiede il nome del servizio su cui si vuole eseguire la connessione
* @param service Questo parametro richiede l'IBinder del servizio con cui si vuole effettuare la connessione
* @return  void
*/
@Override 
public void onServiceConnected(ComponentName className, IBinder service);

/**
* Questo metodo permette di eseguire delle azioni nel momento in cui un servizio (Service) viene interrotto o termina in seguito ad un errore.
* @param className Questo parametro richiede il nome del servizio che è stato interrotto o è terminato in seguito ad errori
* @return  void
*/
@Override 
public void onServiceDisconneted(ComponentName className);

}


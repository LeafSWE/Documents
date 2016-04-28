package com.leaf.clips.model;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/** 
*Classe base per la comunicazione con le classi che si occupano del rilevamento dei beacon
*/ 
public abstract class AbsBeaconReceiverManager extends ServiceConnectionImp { 

/** 
* Service che si occupa del rilevamento dei beacon 
*/
private final BeaconRanger beaconManagerAdapter;

/** 
* Contesto dell'applicazione 
*/
private final Context context;

/** 
* Connessione con il Service per la comunicazione con il service stesso 
*/
private ServiceConnection serviceConnection;

/** 
* Intent per ricevere I beacon inviati dal BeaconManagerAdapter 
*/
private final static Intent SERVICE_START;

/**
* Costruttore della classe AbsBeaconReceiverManager
*/
public AbsBeaconReceiverManager();

/**
* Metodo che ritorna il contesto dell'applicazione
* @return  Context
*/
protected Context getContext();

/**
* Metodo che permette di modificare il tempo tra una scansione per la ricerca dei beacon e la successiva
* @param p Periodo di scansione dei beacon da scansionare
* @param type Parametro per decidere se cambiare il periodo di scansione in Foreground o in Background, di scansione o di non scansione
* @return  void
*/
public void modifyScanningPeriod(long p, periodType type);

/**
* Metodo astratto che permette di eseguire delle azioni alla ricezione di una PriorityQueue<MyBeacon> contenente l'insieme dei beacon visibili in un determinato momento
* @return  void
*/
@Override 
public abstract void onReceive();

/**
* Metodo che permette di attivare il service che si occupa di fare le scansioni per trovare I beacon
* @return  void
*/
public void startService();

/**
* Metodo che permette di fermare il service che si occupa di fare le scansioni per trovare I beacon
* @return  void
*/
public void stopService();

}


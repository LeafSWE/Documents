package com.leaf.clips.model.beacon;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import android.app.Service;

/** 
*Classe che si occupa del rilevamento dei beacon. Estende la classe android.app.Service e implementa le interfacce org.altbeacon.beacon.BeaconConsumer e org.altbeacon.beacon.startup.BootstrapNotifier
*/ 
public class BeaconManagerAdapter implements BeaconRanger { 

/** 
* Rappresenta una stringa che identifica la marca del Beacon o del protocollo 
*/
private static String beaconLayout;

/** 
* Riferimento alla classe che permette di gestire il rilevamento dei beacon 
*/
private BeaconManager beaconManager;

/** 
* Indica se il BeaconManager è in background o meno 
*/
private boolean isBackground;

/** 
* Riferimento al LocalBinder che detiene il collegamento con il Service 
*/
private IBinder locBinder;

/** 
* Insieme dei periodi di scan del BeaconManager 
*/
private Map<PeriodType, Long> periods;

/** 
* Rappresenta un criterio che serve ad eseguire il match con un beacon 
*/
private Region region;

/**
* Metodo che determina se un dispositivo è presente all'interno di una Region
* @param i Stato della Region che può essere MonitorNotifier.INSIDE o MonitorNotifier.OUTSIDE
* @param region Criterio che serve ad eseguire il match con un beacon
* @return  void
*/
@Override 
public void didDeterminateStateForRegion(int  i, Region region);

/**
* Metodo che definisce delle azioni da eseguire nel momento in cui il dispositivo rileva uno o più beacon nella Region
* @param region Criterio che serve ad eseguire il match con un beacon
* @return  void
*/
@Override 
public void didEnterRegion(Region region);

/**
* Metodo che definisce delle azioni da eseguire nel momento in cui il dispositivo non rileva più beacon nella Region
* @param region Criterio che serve ad eseguire il match con un beacon
* @return  void
*/
@Override 
public void didExitRegion(Region region);

/**
* Metodo per ottenere uno tra i periodi di scan del BeaconManager in base alla richiesta
* @param type Tipo di periodo di scan desiderato
* @return  long
*/
@Override 
public long getPeriod(PeriodType type);

/**
* Metodo che ritorna un valore booleano che indica se il BeaconManager è in background
* @return  boolean
*/
@Override 
public boolean isBackground();

/**
* Metodo che serve a modificare il periodo di scansione per il rilevamento dei beacon
* @param p Periodo di scansione
* @param type Parametro per decidere se cambiare il periodo di scansione in Foreground o in Background, di scansione o di non scansione
* @return  void
*/
public void modifyScanPeriod(long p, periodType type);

/**
* Metodo che serve a definire determinate azioni nel momento in cui una classe viene collegata ad un Service 
* @param intent Intent del Service di cui  si vuole fare il collegamento  
* @return  IBinder
*/
@Override 
public IBinder onBind(Intent intent);

/**
* Metodo che inizializza i parametri della classe alla creazione di un'istanza
* @return  void
*/
@Override 
public void onCreate();

/**
* Metodo che esegue le azioni necessarie alla distruzione del Service
* @return  void
*/
@Override 
public void onDestroy();

/**
* Metodo per notificare al Service che l'applicazione sta andando in background 
* @param mode Questo parametro serve per impostare se l'applicazione sta andando in background o no.
* @return  void
*/
public void setBackgroundMode(boolean mode);

/**
* Metodo che imposta il monitor che rileva le notifiche
* @return  void
*/
private void setMonitorNotifier();

/**
* Metodo per impostare il periodo che determina l'uscita di un beacon da una Region
* @param p Questo parametro richiede il periodo in millisecondi 
* @return  void
*/
public void setRegionExitPeriod(long p);

/**
* Questo metodo serve per far partire il Ranging dei Beacon 
* @return  void
*/
private void startRanging();

}


package com.leaf.clips.model.beacon;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Interfaccia che espone tutti i metodi che possono essere invocati su di una classe che si occupa del rilevamento dei beacon 
*/ 
public interface BeaconRanger { 

/**
* Metodo per ottenere uno tra i periodi di scan del BeaconManager in base alla richiesta
* @param type Tipo di periodo di scan desiderato
* @return  long
*/
 long getPeriod(PeriodType type);

/**
* Metodo che ritorna un valore booleano che indica se il BeaconManager è in background
* @return  boolean
*/
 boolean isBackground();

/**
* Metodo che serve a modificare il periodo di scansione per il rilevamento dei beacon
* @param p Periodo di scansione
* @param type Parametro per decidere se cambiare il periodo di scansione in Foreground o in Background, di scansione o di non scansione
* @return  void
*/
 void modifyScanPeriod(long p, periodType type);

/**
* Metodo per notificare al Service che l'applicazione sta andando in background 
* @return  void
*/
 void setBackgroundMode();

/**
* Metodo per impostare il periodo che determina l'uscita di un beacon da una Region
* @return  void
*/
 void setRegionExitPeriod();

}


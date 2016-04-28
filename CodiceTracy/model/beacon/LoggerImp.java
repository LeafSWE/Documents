package com.leaf.clips.model.beacon;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che implementa Logger, per la gestione di un log
*/ 
public class LoggerImp implements Logger { 

/** 
* Rappresenta il contenuto di un log 
*/
private StringBuffer data;

/** 
* Path della directory in cui vengono salvati i log 
*/
private final static String directory;

/**
* Metodo che aggiunge all'insieme di informazioni di beacon già eventualmente presenti le informazioni riguardanti i beacon passati in ingresso
* @param beacons Questo parametro richiede una lista di beacons
* @return  void
*/
@Override 
public void add(PriorityQueue<MyBeacon> beacons);

/**
* Metodo che restituisce il path della directory in cui vengono salvati i log
* @return  String
*/
public static String getDirectory();

/**
* Metodo che salva le informazioni contenute nell'oggetto su di un file
* @return  void
*/
@Override 
public void log();

/**
* Metodo che, dato il nome di un log, ritorna sotto forma di stringa l'informazione in esso contenuta
* @param name Nome del log da cui reperire le informazioni
* @return  String
*/
@Override 
public String open(String name);

/**
* Metodo per la rimozione di un log precedentemente salvato
* @param name Nome del log da rimuovere
* @return  void
*/
@Override 
public void remove(String name);

/**
* Metodo che salva le informazioni contenute nell'oggetto su di un file con nome uguale alla stringa passata come parametro
* @param name Nome del file sul quale salvare il log
* @return  void
*/
@Override 
public void save(String name);

/**
* Metodo che salva le informazioni contenute nell'oggetto su di un file
* @return  void
*/
public void save();

}


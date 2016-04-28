package com.leaf.clips.model.beacon;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Interfaccia che espone i metodi utili per accedere alle funzionalità di un logger
*/ 
public interface Logger { 

/**
* Metodo che aggiunge all'insieme di informazioni di beacon già eventualmente presenti le informazioni riguardanti i beacon passati in ingresso
* @param beacons Insieme dei beacon di cui salvare le informazioni.
* @return  void
*/
 void add(PriorityQueue<MyBeacon> beacons);

/**
* Metodo che salva le informazioni contenute nell'oggetto su di un file
* @return  void
*/
 void log();

/**
* Metodo che, dato il nome di un file di log, ritorna l'informazione in esso contenuta sotto forma di stringa
* @param name Nome del file di log da cui reperire le informazioni
* @return  String
*/
 String open(String name);

/**
* Metodo per la rimozione di un log precedentemente salvato
* @param name Nome del log da rimuovere
* @return  void
*/
 void remove(String name);

/**
* Metodo che salva le informazioni contenute nell'oggetto su di un file con nome uguale alla stringa passata come parametro
* @param filename Nome da dare al file.
* @return  void
*/
 void save(String filename);

}


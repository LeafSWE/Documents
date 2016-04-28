package com.leaf.clips.model.dataaccess.dao;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che rappresenta una ennupla della tabella Building del database locale
*/ 
public class BuildingTable { 

/** 
* Indirizzo dell'edificio 
*/
private String address;

/** 
* Descrizione dell'edificio 
*/
private String description;

/** 
* Identificativo dell'edificio 
*/
private int id;

/** 
* Major dell'edificio 
*/
private int major;

/** 
* Dimensione della mappa (in MB) 
*/
private String mapSize;

/** 
* Versione corrente della mappa 
*/
private int mapVersion;

/** 
* Nome dell'edificio 
*/
private String name;

/** 
* Orario dell'apertura dell'edificio 
*/
private String openingHours;

/** 
* Identificativo dell'applicazione 
*/
private String uuid;

/**
* Costruttore della classe BuildingTable
* @param id Identificativo numerico dell'oggetto BuildingTable
* @param uuid Identificativo univoco
* @param major Major dell'edificio
* @param name Nome dell'edificio mappato
* @param description Descrizione dell'edificio mappato
* @param openingHours Orari di apertura dell'edificio mappato
* @param address Indirizzo dell'edificio mappato
* @param mapVersion Versione della mappa
* @param mapSize Dimensione della mappa (espressa in MB)
*/
public BuildingTable(int id, String uuid, int major, String name, String description, String openingHours, String address, int mapVersion, String mapSize);

/**
* Metodo che ritorna l'indirizzo dell'edificio
* @return  String
*/
public String getAddress();

/**
* Metodo che ritorna la descrizione dell'edificio
* @return  String
*/
public String getDescription();

/**
* Metodo che ritorna l'identificativo dell'edificio
* @return  int
*/
public int getId();

/**
* Metodo che ritorna il major dell'edificio
* @return  int
*/
public int getMajor();

/**
* Metodo che ritorna il nome dell'edificio
* @return  String
*/
public String getName();

/**
* Metodo che ritorna l'orario di apertura dell'edificio
* @return  String
*/
public String getOpeningHours();

/**
* Metodo che ritorna la dimensione della mappa (in MB)
* @return  String
*/
public String getSize();

/**
* Metodo che ritorna l'identificativo dell'applicazione
* @return  String
*/
public String getUUID();

/**
* Metodo che ritorna la versione della mappa dell'edificio
* @return  int
*/
public int getVersion();

}


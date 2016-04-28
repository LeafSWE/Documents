package com.leaf.clips.model.dataaccess.dao;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che rappresenta una ennupla della tabella RegionOfInterest del database locale
*/ 
public class RegionOfInterestTable { 

/** 
* Identificativo della RegionOfInterest 
*/
private int id;

/** 
* Major dell'edificio 
*/
private int major;

/** 
* Identificativo del beacon associato alla ROI 
*/
private int minor;

/** 
* UUID dell'applicazione 
*/
private String uuid;

/**
* Costruttore della classe RegionOfInterestTable
* @param id Identificativo della RegionOfInterest
* @param uuid Identificativo dell'applicazione
* @param major Major dell'edificio
* @param minor Identificativo del beacon associato alla ROI
*/
public RegionOfInterestTable(int id, String uuid, int major, int minor);

/**
* Metodo che ritorna l'identificativo della ROI
* @return  int
*/
public int getId();

/**
* Metodo che ritorna il major dell'edificio
* @return  int
*/
public int getMajor();

/**
* Metodo che ritorna l'identificativo del beacon associato alla ROI
* @return  int
*/
public int getMinor();

/**
* Metodo che ritorna l'UUID dell'applicazione
* @return  String
*/
public String getUUID();

}


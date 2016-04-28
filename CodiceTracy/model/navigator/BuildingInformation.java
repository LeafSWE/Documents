package com.leaf.clips.model.navigator;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import android.support.v4.content.LocalBroadcastManager;

/** 
*Classe che rappresenta le informazioni di un edificio
*/ 
public class BuildingInformation { 

/** 
* Indirizzo dell'edificio 
*/
private final String  address;

/** 
* Descrizione dell'edificio 
*/
private final String  description;

/** 
* Nome dell'edificio 
*/
private final String  name;

/** 
* Orari di apertura dell'edificio 
*/
private final String  openingHours;

/**
* Costruttore della classe BuildingInformation
* @param name Nome dell'edificio
* @param description Descrizione dell'edificio
* @param openingHours Orari di apertura dell'edificio
* @param address Indirizzo dell'edificio
*/
public BuildingInformation(String name, String description, String openingHours, String address);

/**
* Metodo che ritorna l'indirizzo dell'edificio al quale tale oggetto è associato
* @return  String
*/
public String getAddress();

/**
* Metodo che ritorna la descrizione dell'edificio al quale tale oggetto è associato
* @return  String
*/
public String getDescription();

/**
* Metodo che ritorna il nome dell'edificio al quale tale oggetto è associato
* @return  String
*/
public String getName();

/**
* Metodo che ritorna gli orari dell'edificio al quale tale oggetto è associato
* @return  String
*/
public String getOpeningHours();

/**
* Metodo che ritorna tutte le informazioni dell'edificio al quale tale oggetto è associato sottoforma di stringa
* @return  String
*/
public String toString();

}


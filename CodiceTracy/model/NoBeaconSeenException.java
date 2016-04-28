package com.leaf.clips.model;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che rappresenta l'eccezione lanciata nel caso in cui non siano rilevati beacon
*/ 
public class NoBeaconSeenException { 

/** 
* Rappresenta il messaggio di default che viene mostrato quando non viene rilevato nessun beacon 
*/
private static String DEFAULT_MESSAGE;

/** 
* Rappresenta un messaggio qualsiasi quando non viene rilevato nessun beacon 
*/
private final String message;

/**
* Costruttore della classe di default
*/
public NoBeaconSeenException();

/**
* Costruttore della classe che richiede un messaggio come parametro
* @param message Questo parametro richiede che un messaggio di tipo  String
*/
public NoBeaconSeenException(String message);

}


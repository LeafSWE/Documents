package com.leaf.clips.model.navigator;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import org.altbeacon.beacon.RangeNotifier;

/** 
*Classe che rappresenta una eccezione che può essere lanciata durante l'utilizzo della classe Navigator
*/ 
public class NoGraphSetException extends NavigationExceptions { 

/** 
* Messaggio di default associato all'eccezione nel caso in cui si avvi la navigazione senza aver settato il grafo 
*/
private final static String DEFAULT_MESSAGE;

/** 
* Stringa che rappresenta l'eccezione 
*/
private final String message;

/**
* Costruttore di default della classe NoGraphSetException
*/
public NoGraphSetException();

/**
* Costruttore della classe NoGraphSetException
* @param message Messaggio che rappresenta l'eccezione
*/
public NoGraphSetException(String message);

/**
* Metodo che ritorna il messaggio che rappresenta l'eccezione
* @return  String
*/
@Override 
public String getException();

}


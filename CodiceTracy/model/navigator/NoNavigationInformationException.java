package com.leaf.clips.model.navigator;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import org.altbeacon.beacon.BeaconConsumer;

/** 
*Classe che rappresenta una eccezione che può essere lanciata durante l'utilizzo della classe Navigator
*/ 
public class NoNavigationInformationException extends NavigationExceptions { 

/** 
* Messaggio di default associato all'eccezione nel caso in cui si avvi la navigazione senza aver settato il grafo 
*/
private final static String DEFAULT_MESSAGE;

/** 
* Stringa che rappresenta l'eccezione 
*/
private final String message;

/**
* Costruttore di default della classe NoNavigationInformationException
*/
public NoNavigationInformatioonException();

/**
* Costruttore della classe NoNavigationInformationException
* @param message Messaggio che rappresenta l'eccezione
*/
public NoNavigationInformatioonException(String message);

/**
* Metodo che ritorna il messaggio che rappresenta l'eccezione
* @return  String
*/
@Override 
public String getException();

}


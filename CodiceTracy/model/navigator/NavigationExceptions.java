package com.leaf.clips.model.navigator;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import org.altbeacon.beacon.BeaconParser;

/** 
*Classe base per le eccezioni che possono essere lanciate durante la navigazione. Estende java.lang.Exception
*/ 
public abstract class NavigationExceptions { 

/**
* Metodo che ritorna una stringa che rappresenta il motivo per cui è stata lanciata l'eccezione
* @return  String
*/
public abstract String getException();

}


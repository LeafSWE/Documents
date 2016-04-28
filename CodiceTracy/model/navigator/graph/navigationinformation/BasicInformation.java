package com.leaf.clips.model.navigator.graph.navigationinformation;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe contenente le informazioni di base per la navigazione
*/ 
public class BasicInformation { 

/** 
* Azione da compiere per superare un determinato arco 
*/
private final String action;

/**
* Costruttore della classe BasicInformation
* @param basicInformation Informazioni di base per il superamento di un arco
*/
public BasicInformation(String basicInformation);

/**
* Metodo che ritorna le informazioni contenute in un oggetto BasicInformation per il superamento di un determinato arco
* @return  String
*/
public String getBasicInformation();

}


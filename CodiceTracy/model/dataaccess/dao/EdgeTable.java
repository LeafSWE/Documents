package com.leaf.clips.model.dataaccess.dao;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che rappresenta una ennupla della tabella Edge del database locale
*/ 
public class EdgeTable { 

/** 
* Descrizione dell'azione da compiere per arrivare dallo startROI all'endROI 
*/
private String action;

/** 
* Angolo rispetto al Nord polare presente lo startROI e l'endROI 
*/
private String coordinate;

/** 
* Distanza tra lo startROI e l'endROI 
*/
private double distance;

/** 
* Nodo d'arrivo dell'arco 
*/
private int endROI;

/** 
* Identificativo dell'Edge 
*/
private int id;

/** 
* Descrizione testuale estesa per raggiungere l'endROI a partire dallo startROI 
*/
private String longDescription;

/** 
* Nodo di partenza dell'arco 
*/
private int startROI;

/** 
* Identificativo del tipo di Edge 
*/
private int typeId;

/**
* Costruttore della classe EdgeTable
* @param id Identificativo dell'Edge
* @param startROI Nodo di partenza dell'arco
* @param endROI Nodo d'arrivo dell'arco
* @param distance Distanza tra lo startROI e l'endROI
* @param coordinate Angolo rispetto al Nord polare presente lo startROI e l'endROI
* @param typeId Identificativo del tipo di Edge
* @param action Descrizione dell'azione da compiere per arrivare dallo startROI all'endROI
* @param longDescription Descrizione testuale estesa per raggiungere l'endROI a partire dallo startROI
*/
public EdgeTable(int id, int startROI, int endROI, double distance, String coordinate, int typeId, String action, String longDescription);

/**
* Metodo che ritorna la descrizione dell'azione da compiere per arrivare dallo startROI all'endROI
* @return  String
*/
public String getAction();

/**
* Metodo che ritorna l'angolo rispetto al Nord polare presente lo startROI e l'endROI
* @return  String
*/
public String getCoordinate();

/**
* Metodo che ritorna la distanza tra lo startROI e l'endROI
* @return  double
*/
public double getDistance();

/**
* Metodo che ritorna il nodo d'arrivo dell'arco
* @return  int
*/
public int getEndROI();

/**
* Metodo che ritorna l'identificativo dell'Edge
* @return  int
*/
public int getId();

/**
* Metodo che ritorna la descrizione testuale estesa per raggiungere l'endROI a partire dallo startROI
* @return  String
*/
public String getLongDescription();

/**
* Metodo che ritorna il nodo di partenza dell'arco
* @return  int
*/
public int getStartROI();

/**
* Metodo che ritorna l'identificativo del tipo di Edge
* @return  int
*/
public int getTypeId();

}


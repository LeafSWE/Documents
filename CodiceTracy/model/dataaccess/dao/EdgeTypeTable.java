package com.leaf.clips.model.dataaccess.dao;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che rappresenta una ennupla della tabella EdgeType del database locale
*/ 
public class EdgeTypeTable { 

/** 
* Identificativo numerico dell'oggetto EdgeTypeTable 
*/
private int id;

/** 
* Identificativo numerico che permette di identificare il tipo di Edge 
*/
private String typeName;

/**
* Costruttore della classe EdgeTypeTable
* @param id Identificativo numerico dell'oggetto EdgeTypeTable
* @param typeName Identificativo numerico che permette di identificare il tipo di Edge
*/
public EdgeTypeTable(int id, String typeName);

/**
* Metodo che restituisce l'identificativo numerico dell'oggetto EdgeTypeTable
* @return  int
*/
public int getId();

/**
* Metodo che restituisce l'identificativo numerico che permette di identificare il tipo di Edge
* @return  String
*/
public String getTypeName();

}


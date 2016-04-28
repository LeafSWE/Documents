package com.leaf.clips.model.dataaccess.dao;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che rappresenta una ennupla della tabella Photo del database locale
*/ 
public class PhotoTable { 

/** 
* Identificativo numerico dell'Edge a cui fa riferimento la foto 
*/
private int edgeId;

/** 
* Identificativo numerico dell'oggetto PhotoTable 
*/
private int id;

/** 
* Stringa che rappresenta l'URL dove si può reperire la foto 
*/
private String url;

/**
* Costruttore della classe PhotoTable
* @param id Identificativo numerico della foto nel database locale
* @param url Stringa che rappresenta l'URL dove si può reperire la foto
* @param edgeId Identificativo numerico dell'Edge a cui fa riferimento la foto
*/
public PhotoTable(int id, String url, int edgeId);

/**
* Metodo che viene utilizzato per recuperare l'identificativo numerico dell'Edge a cui fa riferimento la foto
* @return  int
*/
public int getEdgeId();

/**
* Metodo che viene utilizzato per recuperare l'identificativo numerico della foto nel database
* @return  int
*/
public int getId();

/**
* Metodo per recuperare la stringa che rappresenta l'URL dove è possibile reperire la foto 
* @return  String
*/
public String getUrl();

}


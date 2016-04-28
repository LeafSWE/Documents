package com.leaf.clips.model.navigator.graph.navigationinformation;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Interfaccia che espone i metodi per accedere alle informazioni di navigazione
*/ 
public interface NavigationInformation { 

/**
* Metodo che ritorna le informazioni di base per il superamento dell'arco al quale tale oggetto è associato
* @return  String
*/
 String getBasicInformation();

/**
* Metodo che ritorna delle informazioni dettagliate per il superamento dell'arco al quale tale oggetto è associato
* @return  String
*/
 String getDetailedInformation();

/**
* Metodo che ritorna un oggetto PhotoInformation contenente i riferimenti alle fotografie riguardanti l'arco al quale tale oggetto è associato
* @return  PhotoInformation
*/
 PhotoInformation getPhotoInformation();

}


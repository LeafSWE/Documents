package com.leaf.clips.model.navigator.graph.navigationinformation;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che contiene le informazioni visive (sotto forma di URI a foto) utilizzate per la navigazione
*/ 
public class PhotoInformation { 

/** 
* Collezione di oggetti PhotoRef rappresentanti le fotografie dell'arco a cui l'oggetto è associato 
*/
private final Collection<PhotoRef> photos;

/**
* Costruttore della classe PhotoInformation
*/
public PhotoInformation();

/**
* Metodo che restituisce una collezione di oggetti PhotoRef rappresentanti le fotografie dell'arco a cui l'oggetto è associato
* @return  Collection<PhotoRef>
*/
public Collection<PhotoRef> getPhotoInformation();

}


package com.leaf.clips.model.navigator.graph.navigationinformation;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che rappresenta l'URI di una foto
*/ 
public class PhotoRef { 

/** 
* URL di una fotografia 
*/
private final URI photoUrl;

/**
* Costruttore della classe PhotoRef
* @param source URL di una fotografia
*/
public PhotoRef(URI source);

/**
* Metodo che restituisce l'URL per accedere alla fotografia che l'oggetto rappresenta
* @return  URI
*/
public URI getPhotoUri();

}


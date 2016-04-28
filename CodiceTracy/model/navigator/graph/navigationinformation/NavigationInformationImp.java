package com.leaf.clips.model.navigator.graph.navigationinformation;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe utilizzata per recuperare le informazioni da fornire all'utente per la navigazione
*/ 
public class NavigationInformationImp implements NavigationInformation { 

/** 
* Informazioni di base associate ad un EnrichedEdge 
*/
private final BasicInformation basicInformation;

/** 
* Informazioni di dettagliate associate ad un EnrichedEdge 
*/
private final DetailedInformation detailedInformation;

/** 
* Fotografie associate ad un EnrichedEdge 
*/
private final PhotoInformation photoInformation;

/**
* Costruttore della classe NavigationInformationImp
* @param basicInformation Informazioni di base associate ad un EnrichedEdge
* @param detailedInformation Informazioni di dettagliate associate ad un EnrichedEdge
* @param photoInformation Fotografie associate ad un EnrichedEdge
*/
public NavigationInformationImp(BasicInformation basicInformation, DetailedInformation detailedInformation, PhotoInformation photoInformation);

/**
* Metodo che ritorna le informazioni di base per il superamento dell'arco al quale tale oggetto è associato
* @return  String
*/
@Override 
public String getBasicInformation();

/**
* Metodo che ritorna delle informazioni dettagliate per il superamento dell'arco al quale tale oggetto è associato
* @return  String
*/
@Override 
public String getDetailedInformation();

/**
* Metodo che ritorna un oggetto PhotoInformation contenente i riferimenti alle fotografie riguardanti l'arco al quale tale oggetto è associato
* @return  PhotoInformation
*/
@Override 
public PhotoInformation getPhotoInformation();

}


package com.leaf.clips.model.navigator;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import org.altbeacon.beacon.startup.BootstrapNotifier;

/** 
*Classe che rappresenta le informazioni di navigazione pronte per essere restituite ad un eventuale utilizzatore
*/ 
public class ProcessedInformationImp implements ProcessedInformation { 

/** 
* Informazioni di base di un Edge 
*/
private String basic;

/** 
* Indicazioni dettagliate di un Edge 
*/
private String detailed;

/** 
* Lista di foto di un Edge 
*/
private List<String> photos;

/**
* Costruttore della classe ProcessedInformationImp
* @param edge Edge da cui devono essere estratte le informazioni
*/
public ProcessedInformationImp(EnrichedEdge edge);

/**
* Costruttore della classe ProcessedInformationImp
* @param edge Edge da cui devono essere estratte le informazioni
* @param starterInformation Informazioni aggiuntive per costruire le informazioni associate ad un arco del percorso per superarlo
*/
public ProcessedInformationImp(EnrichedEdge edge, String starterInformation);

/**
* Metodo che ritorna le istruzioni dettagliate per superare un certo arco nel percorso calcolato
* @return  String
*/
@Override 
public String getDetailedInstruction();

/**
* Metodo che ritorna un oggetto PhotoInformation con il quale è possibile accedere alle fotografie che ritraggono l'arco da superare nel percorso calcolato
* @return  PhotoInformation
*/
@Override 
public PhotoInformation getPhotoInstruction();

/**
* Metodo che ritorna le istruzioni basilari per superare un certo arco nel percorso calcolato
* @return  String
*/
@Override 
public String getProcessedBasicInstruction();

}


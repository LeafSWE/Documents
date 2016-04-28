package com.leaf.clips.model.navigator;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import android.content.Intent;

/** 
*Classe che rappresenta la mappa di un edificio con tutte le informazioni ad esso associate
*/ 
public class BuildingMapImp implements BuildingMap { 

/** 
* Informazioni riguardanti l'edificio rappresentato dalla mappa 
*/
private BuildingInformation buildingInformation;

/** 
* Insieme di archi che indicano i possibili percorsi tra due ROI 
*/
private final Collection<EnrichedEdge> edges;

/** 
* Identificativo univoco dell'edificio 
*/
private final int id;

/** 
* Insieme di POI appartenenti all'edificio rappresentato dalla mappa 
*/
private final Collection<PointOfInterest> pois;

/** 
* Insieme di ROI appartenenti all'edificio rappresentato dalla mappa 
*/
private final Collection<RegionOfInterest> rois;

/** 
* Dimensione della mappa dell'edificio (in MB) 
*/
private String size;

/** 
* Versione corrente della mappa 
*/
private final int version;

/**
* Costruttore della classe BuildingMapImp
* @param id Identificativo dell'edificio
* @param version Versione della mappa
* @param pois Tutti i POI appartenenti all'edificio
* @param rois Tutte le ROI appartenente all'edificio
* @param buildingInfo Informazioni dell'edificio
* @param size Dimensione della mappa dell'edificio (espressa in MB)
*/
public BuildingMapImp(int id, int version, Collection<PointOfInterest> pois, Collection<RegionOfInterest> rois, BuildingInformation buildingInfo, String size);

/**
* Metodo che ritorna l'indirizzo dell'edificio a cui l'oggetto è associato
* @return  String
*/
@Override 
public String getAddress();

/**
* Metodo che ritorna un oggetto BuildingInformation contenente tutte le informazioni dell'edificio a cui è associato.
* @return  BuildingInformation
*/
@Override 
public BuildingInformation getAllBuildingInformation();

/**
* Metodo che ritorna la collezione di tutti gli archi previsti nella rappresentazione a grafo di un edificio
* @return  Collection<EnrichedEdge>
*/
@Override 
public Collection<EnrichedEdge> getAllEdges();

/**
* Metodo che ritorna la collezione di POI associati alla ROI che contiene il beacon passato come argomento
* @param beacon Beacon associato alla RegionOfInterest di cui si vogliono conoscere l'insieme di POI che contiene
* @return  Collection<PointOfInterest>
*/
@Override 
public Collection<PointOfInterest> getAllNearbyPOIs(MyBeacon beacon);

/**
* Metodo che ritorna la collezione di tutti i POI presenti in un edificio
* @return  Collection<PointOfInterest>
*/
@Override 
public Collection<PointOfInterest> getAllPOIs();

/**
* Metodo che ritorna una collezione di stringhe, eventualmente vuota, che rappresentano le categorie di appartenenza dei POI
* @return  Collection<String>
*/
@Override 
public Collection<String> getAllPOIsCategories();

/**
* Metodo che ritorna la collezione di tutti i ROI presenti in un edificio
* @return  Collection<RegionOfInterest>
*/
@Override 
public Collection<RegionOfInterest> getAllROIs();

/**
* Metodo che ritorna una descrizione dell'edificio a cui l'oggetto è associato
* @return  String
*/
@Override 
public String getDescription();

/**
* Metodo che l'identificativo numerico della mappa all'interno di un database
* @return  int
*/
@Override 
public int getId();

/**
* Metodo che restituisce il nome dell'edificio a cui è associato tale oggetto
* @return  String
*/
@Override 
public String getName();

/**
* Metodo che ritornagli orari di apertura dell'edificio a cui l'oggetto è associato
* @return  String
*/
@Override 
public String getOpeningHours();

/**
* Metodo che ritorna la dimensione della mappa dell'edificio (espressa in MB)
* @return  String
*/
@Override 
public String getSize();

/**
* Metodo che ritorna l'identificativo numerico della mappa
* @return  int
*/
@Override 
public int getVersion();

/**
* Metodo che permette di cercare i POI di un edificio in cui nome contiene la stringa passata come parametro. Ritorna una collezione, eventualmente vuota,  di oggetti PointOfInterest nel cui nome contengono la stringa passata come parametro
* @param name Stringa da cercare nei POI dell'edificio
* @return  Collection<PointOfInterest>
*/
@Override 
public Collection<PointOfInterest> searchPOIByName(String name);

}


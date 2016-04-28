package com.leaf.clips.model.dataaccess.service;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import com.google.api.client.json.JsonObjectParser
;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/** 
*Classe che rappresenta il layer Service tra gli oggetti BuildingMap e gli oggetti DAO corrispettivi
*/ 
public class BuildingService implements DatabaseService { 

/** 
* URL del database remoto 
*/
private String databaseURL;

/** 
* Oggetto che si pone come layer Service tra gli oggetti EnrichedEdge e gli oggetti DAO corrispettivi 
*/
private EdgeService edgeService;

/** 
* Oggetto che si pone come layer Service tra gli oggetti PointOfInterest e gli oggetti DAO corrispettivi 
*/
private PointOfInterestService poiService;

/** 
* Oggetto di utility per la conversione da JSON a BuildingTable 
*/
private RemoteBuildingDao remoteBuildingDao;

/** 
* Oggetto che si pone come layer Service tra gli oggetti RegionOfInterest e gli oggetti DAO corrispettivi 
*/
private RegionOfInterestService roiService;

/** 
* Oggetto che rappresenta un DAO per la tabella "Building" del database locale 
*/
private SQLiteBuildingDao sqliteBuildingDao;

/**
* Costruttore della classe BuildingService
* @param dbURL URL del database remoto
* @param sqliteBuilding Oggetto che rappresenta un DAO per la tabella "Building" del database locale
* @param remoteBuilding Oggetto di utility per la conversione da JSON a BuildingTable
* @param roiService Oggetto che si pone come layer Service tra gli oggetti RegionOfInterest e gli oggetti DAO corrispettivi
* @param poiService Oggetto che si pone come layer Service tra gli oggetti PointOfInterest e gli oggetti DAO corrispettivi
* @param edgeService Oggetto che si pone come layer Service tra gli oggetti EnrichedEdge e gli oggetti DAO corrispettivi
*/
public BuildingService(String dbURL, SQLiteDao sqliteBuilding, RemoteBuildingDao remoteBuilding, RegionOfInterestService roiService, PointOfInterestService poiService, EdgeService edgeService);

/**
* Metodo per la conversione di un JsonObject in un oggetto BuildingTable, che verrà inserito nel database locale
* @param object Oggetto JsonObject che contiene le informazioni di un edificio
* @return  void
*/
public void convertAndInsert(JsonObject object);

/**
* Metodo per rimuovere la mappa di un edificio dal database locale
* @param id Identificativo dell'edificio da rimuovere
* @return  void
*/
@Override 
public void deleteBuilding(int id);

/**
* Metodo per recuperare le informazioni di tutte le mappe degli edifici presenti nel database locale
* @return  Collection<BuildingTable>
*/
@Override 
public Collection<BuildingTable> findAllBuildings();

/**
* Metodo per recuperare le informazioni di tutte le mappe degli edifici presenti nel database remoto
* @return  Collection<BuildingTable>
*/
@Override 
public Collection<BuildingTable> findAllRemoteBuildings();

/**
* Metodo per recuperare la mappa di un edificio ricercandola nel database locale
* @param major Major dell'edificio
* @return  BuildingMap
*/
@Override 
public BuildingMap findBuildingByMajor(int major);

/**
* Metodo per recuperare la mappa di un edificio ricercandola nel database remoto
* @param major Major dell'edificio
* @return  BuildingMap
*/
@Override 
public BuildingMap findRemoteBuildingByMajor(int major);

/**
* Metodo per la costruzione di oggetto BuildingMap a partire da un BuildingTable
* @param buildingTable Oggetto contenente le informazioni dell'edificio
* @return  BuildingMap
*/
private BuildingMap fromTableToBo(BuildingTable buildingTable);

/**
* Metodo per verificare la presenza di una mappa di un edificio nel database locale
* @param major Major dell'edificio
* @return  boolean
*/
@Override 
public boolean isBuildingMapPresent(int major);

/**
* Metodo per verificare se la mappa di un edificio è aggiornata all'ultima versione
* @param major Major dell'edificio
* @return  boolean
*/
@Override 
public boolean isBuildingMapUpdated(int major);

/**
* Metodo per scaricare la mappa di un edificio dal database remoto ed inserirla nel database locale
* @param major Major dell'edificio
* @return  void
*/
private void retrieveAndInsertMap(int major);

/**
* Metodo per aggiornare la mappa di un edificio all'ultima versione disponibile
* @param major Major dell'edificio
* @return  void
*/
@Override 
public void updateBuildingMap(int major);

}


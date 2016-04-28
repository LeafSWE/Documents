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
*Classe che rappresenta il layer Service tra gli oggetti EnrichedEdge e gli oggetti DAO corrispettivi
*/ 
public class EdgeService { 

/** 
* Oggetto che si pone come layer Service tra gli oggetti PhotoRef e gli oggetti DAO corrispettivi 
*/
private PhotoService photoService;

/** 
* Oggetto di utility per la conversione da JSON a EdgeTable 
*/
private RemoteEdgeDao remoteEdgeDao;

/** 
* Oggetto di utility per la conversione da JSON a EdgeTypeTable 
*/
private RemoteEdgeTypeDao remoteEdgeTypeDao;

/** 
* Oggetto che si pone come layer Service tra gli oggetti RegionOfInterest e gli oggetti DAO corrispettivi 
*/
private RegionOfInterestService roiService;

/** 
* Oggetto che rappresenta un DAO per la tabella "Edge" del database locale 
*/
private SQLiteEdgeDao sqliteEdgeDao;

/** 
* Oggetto che rappresenta un DAO per la tabella "EdgeType" del database locale 
*/
private SQLiteEdgeTypeDao sqliteEdgeTypeDao;

/**
* Costruttore della classe EdgeService
* @param sqliteEdge Oggetto che rappresenta un DAO per la tabella "Edge" del database locale
* @param remoteEdge Oggetto di utility per la conversione da JSON a EdgeTable
* @param sqliteEdgeType Oggetto che rappresenta un DAO per la tabella "EdgeType" del database locale
* @param remoteEdgeType Oggetto di utility per la conversione da JSON a EdgeTypeTable
* @param photoService Oggetto che si pone come layer Service tra gli oggetti PhotoRef e gli oggetti DAO corrispettivi
* @param roiService Oggetto che si pone come layer Service tra gli oggetti RegionOfInterest e gli oggetti DAO corrispettivi
*/
public EdgeService(SQLiteEdgeDao sqliteEdge, RemoteEdgeDao remoteEdge, SQLiteEdgeTypeDao sqliteEdgeType, RemoteEdgeTypeDao remoteEdgeType, PhotoService photoService, RegionOfInterestService roiService);

/**
* Metodo per la conversione di un JsonObject in un oggetto EdgeTable, che verrà inserito nel database locale
* @param object Oggetto JsonObject che contiene le informazioni di un Edge
* @return  void
*/
public void convertAndInsert(JsonObject object);

/**
* Metodo per la conversione di un JsonObject in un oggetto EdgeTypeTable, che verrà inserito nel database locale
* @param object Oggetto JsonObject che contiene le informazioni di un tipo di Edge
* @return  void
*/
public void convertAndInsertEdgeType(JsonObject object);

/**
* Metodo per rimuovere un Edge dal database locale
* @param id Identificativo numerico dell'Edge da rimuovere
* @return  void
*/
public void deleteEdge(int id);

/**
* Metodo per recuperare le informazioni di tutti gli Edge di un edificio, dato il major dell'edificio
* @param major Major dell'edificio
* @return  Collection<EnrichedEdge>
*/
public Collection<EnrichedEdge> findAllEdgesOfBuilding(int major);

/**
* Metodo per recuperare un Edge ricercandolo nel database locale
* @param id Identificativo numerico dell'Edge da ricercare
* @return  EnrichedEdge
*/
public EnrichedEdge findEdge(int id);

/**
* Metodo per la costruzione di oggetto EnrichedEdge a partire da un EdgeTable
* @param edgeTable Oggetto contenente le informazioni di un Edge
* @return  EnrichedEdge
*/
private EnrichedEdge fromTableToBo(EdgeTable edgeTable);

}


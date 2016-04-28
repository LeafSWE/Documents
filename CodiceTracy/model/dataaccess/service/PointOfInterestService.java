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
*Classe che rappresenta il layer Service tra gli oggetti PointOfInterest e gli oggetti DAO corrispettivi
*/ 
public class PointOfInterestService { 

/** 
* Oggetto di utility per la conversione da JSON a CategoryTable 
*/
private RemoteCategoryDao remoteCategoryDao;

/** 
* Oggetto di utility per la conversione da JSON a PointOfInterestTable 
*/
private RemotePointOfInterestDao remotePointOfInterestDao;

/** 
* Oggetto di utility per la conversione da JSON a RoiPoiTable 
*/
private RemoteRoiPoiDao remoteRoiPoiDao;

/** 
* Oggetto che rappresenta un DAO per la tabella "Category" del database locale 
*/
private SQLiteCategoryDao sqliteCategoryDao;

/** 
* Oggetto che rappresenta un DAO per la tabella "POI" del database locale 
*/
private SQLitePointOfInterestDao sqlitePointOfInterestDao;

/** 
* Oggetto che rappresenta un DAO per la tabella "ROIPOI" del database locale 
*/
private SQLiteRoiPoiDao sqliteRoiPoiDao;

/**
* Costruttore della classe PointOfInterestService
* @param sqlitePOI Oggetto che rappresenta un DAO per la tabella "POI" del database locale
* @param remotePOI Oggetto di utility per la conversione da JSON a PointOfInterestTable
* @param sqliteRoiPoi Oggetto che rappresenta un DAO per la tabella "ROIPOI" del database locale
* @param remoteRoiPoi Oggetto di utility per la conversione da JSON a RoiPoiTable
* @param sqliteCategory Oggetto che rappresenta un DAO per la tabella "Category" del database locale
* @param remoteCategory Oggetto di utility per la conversione da JSON a CategoryTable
*/
public PointOfInterestService(SQLitePointOfInterestDao sqlitePOI, RemotePointOfInterestDao remotePOI, SQLiteRoiPoiDao sqliteRoiPoi, RemoteRoiPoiDao remoteRoiPoi, SQLiteCategoryDao sqliteCategory, RemoteCategoryDao remoteCategory);

/**
* Metodo per la conversione di un JsonObject in un oggetto PointOfInterestTable, che verrà inserito nel database locale
* @param object Oggetto JsonObject che contiene le informazioni di un PointOfInterest
* @return  void
*/
public void convertAndInsert(JsonObject object);

/**
* Metodo per la conversione di un JsonObject in un oggetto CategoryTable, che verrà inserito nel database locale
* @param object Oggetto JsonObject che contiene le informazioni di una categoria
* @return  void
*/
public void convertAndInsertCategory(JsonObject object);

/**
* Metodo per la conversione di un JsonObject in un oggetto RoiPoiTable, che verrà inserito nel database locale
* @param object Oggetto JsonObject che contiene le stesse informazioni di un oggetto EdgeType
* @return  void
*/
public void convertAndInsertRoiPoi(JsonObject object);

/**
* Metodo per rimuovere un PointOfInterest dal database locale
* @param id Identificativo numerico del PointOfInterest da rimuovere
* @return  void
*/
public void deletePointOfInterest(int id);

/**
* Metodo per recuperare le informazioni di tutti i PointOfInterest di un edificio, dato il major dell'edificio
* @param major Major dell'edificio
* @return  Collection<PointOfInterest>
*/
public Collection<PointOfInterest> findAllPointsWithMajor(int major);

/**
* Metodo per recuperare un PointOfInterest ricercandolo nel database locale
* @param id Identificativo numerico del PointOfInterest da recuperare
* @return  PointOfInterest
*/
public PointOfInterest findPointOfInterest(int id);

/**
* Metodo per la costruzione di oggetto PointOfInterest a partire da un PointOfInterestTable
* @param pointOfInterestTable Oggetto contenente le informazioni del PointOfInterest
* @return  PointOfInterest
*/
private PointOfInterest fromTableToBo(PointOfInterestTable pointOfInterestTable);

}


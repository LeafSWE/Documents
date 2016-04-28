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
*Classe che rappresenta il layer Service tra gli oggetti RegionOfInterest e gli oggetti DAO corrispettivi
*/ 
public class RegionOfInterestService { 

/** 
* Oggetto di utility per la conversione da JSON a RegionOfInterestTable 
*/
private RemoteRegionOfInterestDao remoteRegionOfInterestDao;

/** 
* Oggetto di utility per la conversione da JSON a RoiPoiTable 
*/
private RemoteRoiPoiDao remoteRoiPoiDao;

/** 
* Oggetto che rappresenta un DAO per la tabella "ROI" del database locale 
*/
private SQLiteRegionOfInterestDao sqliteRegionOfInterestDao;

/** 
* Oggetto che rappresenta un DAO per la tabella "ROIPOI" del database locale 
*/
private SQLiteRoiPoiDao sqliteRoiPoiDao;

/**
* Costruttore della classe RegionOfInterestService
* @param sqliteROI Oggetto che rappresenta un DAO per la tabella "ROI" del database locale
* @param remoteROI Oggetto di utility per la conversione da JSON a RegionOfInterestTable
* @param sqliteRoiPoi Oggetto che rappresenta un DAO per la tabella "ROIPOI" del database locale
* @param remoteRoiPoi Oggetto di utility per la conversione da JSON a RoiPoiTable
*/
public RegionOfInterestService(SQLiteRegionOfInterestDao sqliteROI, RemoteRegionOfInterestDao remoteROI, SQLiteRoiPoiDao sqliteRoiPoi, RemoteRoiPoiDao remoteRoiPoi);

/**
* Metodo per la conversione di un JsonObject in un oggetto RegionOfInterestTable, che verrà inserito nel database locale
* @param object Oggetto JsonObject che contiene le informazioni di una RegionOfInterest
* @return  void
*/
public void convertAndInsert(JsonObject object);

/**
* Metodo per rimuovere una RegionOfInterest dal database locale
* @param id Identificativo numerico della RegionOfInterest da rimuovere
* @return  void
*/
public void deleteRegionOfInterest(int id);

/**
* Metodo per recuperare le informazioni di tutte le RegionOfInterest di un edificio, dato il major dell'edificio
* @param major Major dell'edificio
* @return  Collection<RegionOfInterest>
*/
public Collection<RegionOfInterest> findAllRegionsWithMajor(int major);

/**
* Metodo per recuperare una RegionOfInterest ricercandola nel database locale
* @param id Identificativo numerico della RegionOfInterest da recuperare
* @return  RegionOfInterest
*/
public RegionOfInterest findRegionOfInterest(int id);

/**
* Metodo per la costruzione di oggetto RegionOfInterest a partire da un RegionOfInterestTable
* @param regionOfInterestTable Oggetto contenente le informazioni della RegionOfInterest
* @return  RegionOfInterest
*/
private RegionOfInterest fromTableToBo(RegionOfInterestTable regionOfInterestTable);

}


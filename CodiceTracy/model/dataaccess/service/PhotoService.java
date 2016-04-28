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
*Classe che rappresenta il layer Service tra gli oggetti PhotoRef e gli oggetti DAO corrispettivi
*/ 
public class PhotoService { 

/** 
* Oggetto di utility per la conversione da JSON a PhotoTable 
*/
private RemotePhotoDao remotePhotoDao;

/** 
* Oggetto che rappresenta un DAO per la tabella "Photo" del database locale 
*/
private SQLitePhotoDao sqlitePhotoDao;

/**
* Costruttore della classe PhotoService
* @param sqlitePhoto Oggetto che rappresenta un DAO per la tabella "Photo" del database locale
* @param remotePhoto Oggetto di utility per la conversione da JSON a PhotoTable
*/
public PhotoService(SQLitePhotoDao sqlitePhoto, RemotePhotoDao remotePhoto);

/**
* Metodo per la conversione di un JsonObject in un oggetto PhotoTable, che verrà inserito nel database locale
* @param object Oggetto JsonObject che contiene le informazioni di una foto
* @return  void
*/
public void convertAndInsert(JsonObject object);

/**
* Metodo per rimuovere una foto di un Edge dal database locale
* @param id Identificativo numerico della foto da rimuovere
* @return  void
*/
public void deletePhoto(int id);

/**
* Metodo per recuperare tutte le foto di un Edge dal database locale
* @param id Identificativo dell'Edge di cui si vuole recuperare tutte le foto
* @return  Collection<PhotoRef>
*/
public Collection<PhotoRef> findAllPhotosOfEdge(int id);

/**
* Metodo per recuperare una foto ricercandola nel database locale
* @param id Identificativo numerico della foto da recuperare
* @return  PhotoRef
*/
public PhotoRef findPhoto(int id);

/**
* Metodo per la costruzione di oggetto PhotoRef a partire da un PhotoTable
* @param photoTable Oggetto contenente le informazioni della foto
* @return  PhotoRef
*/
private PhotoRef fromTableToBo(PhotoTable photoTable);

}


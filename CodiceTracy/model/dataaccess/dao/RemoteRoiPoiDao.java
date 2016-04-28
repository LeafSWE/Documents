package com.leaf.clips.model.dataaccess.dao;
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
*Classe di utility per la conversione da JSON a RoiPoiTable
*/ 
public class RemoteRoiPoiDao { 

/**
* Costruttore di default per la classe RemoteRoiPoiDao
*/
public RemoteRoiPoiDao();

/**
* Metodo utilizzato per la conversione di un oggetto JsonObject in un oggetto RoiPoiTable, che viene ritornato
* @param object Oggetto JSON che rappresenta un oggetto di tipo RoiPoiTable
* @return  RoiPoiTable
*/
public RoiPoiTable fromJSONToTable(JsonObject object);

}


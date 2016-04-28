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
*Classe di utility per la conversione da JSON a EdgeTypeTable
*/ 
public class RemoteEdgeTypeDao { 

/**
* Costruttore di default per la classe RemoteEdgeTypeDao
*/
public RemoteEdgeTypeDao();

/**
* Metodo utilizzato per la conversione di un oggetto JsonObject in un oggetto EdgeTypeTable, che viene ritornato
* @param object Oggetto JSON che rappresenta un oggetto di tipo EdgeTypeTable
* @return  EdgeTypeTable
*/
public EdgeTypeTable fromJSONToTable(JsonObject object);

}


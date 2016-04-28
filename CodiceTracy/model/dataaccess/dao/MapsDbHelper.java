package com.leaf.clips.model.dataaccess.dao;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import android.database.sqlite.SQLiteOpenHelper;

/** 
*Classe che rappresenta un aiutante per ottenere informazioni su come accedere al database locale e remoto
*/ 
public class MapsDbHelper { 

/** 
* Nome del database locale. Valore di default: "maps.db" 
*/
public final static String DB_NAME;

/** 
* Numero di versione del database locale. Valore di default: "1" 
*/
public final static int DB_VERSION;

/** 
* Istanza di MapsDbHelper salvata per poter essere condivisa 
*/
private static MapsDbHelper instance;

/** 
* URL del database remoto 
*/
public final static String REMOTE_DB_URL;

/**
* Costruttore della classe MapsDbHelper
*/
private MapsDbHelper();

/**
* Metodo che ritorna una istanza di MapsDbHelper
* @return  MapsDbHelper
*/
public static MapsDbHelper getInstance();

/**
* Metodo che ritorna l'URL del database remoto
* @return  String
*/
public String getRemoteDatabaseURL();

/**
* Metodo che viene chiamato la prima volta che viene creato il database
* @param db Riferimento al database
* @return  void
*/
@Override 
public void onCreate(SQLiteDatabase db);

/**
* Metodo che viene chiamato per effettuare l'upgrade del database
* @param db Riferimento al database
* @param oldVersion Numero di versione del vecchio database
* @param newVersione Numero di versione del nuovo database
* @return  void
*/
@Override 
public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersione);

}


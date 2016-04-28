package com.leaf.clips.presenter;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import android.app.Application(Android);

/** 
*Classe che estende Application e recupera il riferimento al DatabaseService
*/ 
public class DatabaseServiceManager { 

/** 
* Riferimento per accedere al database locale 
*/
private DatabaseService dbService;

/**
* Metodo che restituisce un riferimento al database locale
* @return  DatabaseService
*/
public static DatabaseService getDatabaseService();

}


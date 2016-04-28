package com.leaf.clips.model.dataaccess.service;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che rappresenta un aiutante per la costruzione di un DatabaseService
*/ 
public class ServiceHelper { 

/**
* Metodo che viene utilizzato per ottenere un'istanza di DatabaseService
* @param sqliteDaoFactory Un oggetto SQLiteDaoFactory necessaria per la creazione degli oggetti DAO locali
* @param remoteDaoFactory Un oggetto RemoteDaoFactory necessario per la creazione degli oggetti DAO remoti
* @param dbURL L'URL del database remoto
* @return  DatabaseService
*/
public static DatabaseService getService(SQLiteDaoFactory sqliteDaoFactory, RemoteDaoFactory remoteDaoFactory, String dbURL);

}


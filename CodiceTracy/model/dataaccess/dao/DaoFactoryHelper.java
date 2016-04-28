package com.leaf.clips.model.dataaccess.dao;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che rappresenta un aiutante per ottenere un'istanza di una delle due Factory di DAO (locali o remoti)
*/ 
public class DaoFactoryHelper { 

/** 
* Istanza di DaoFactoryHelper salvata per poter essere condivisa 
*/
private static DaoFactoryHelper instance;

/**
* Costruttore della classe DaoFactoryHelper
*/
private DaoFactoryHelper();

/**
* Metodo che ritorna un'istanza di DaoFactoryHelper
* @return  DaoFactoryHelper
*/
public static DaoFactoryHelper getInstance();

/**
* Metodo che viene utilizzato per ottenere un'istanza di RemoteDaoFactory
* @return  RemoteDaoFactory
*/
public RemoteDaoFactory getRemoteDaoFactory();

/**
* Metodo che viene utilizzato per ottenere un'istanza di SQLiteDaoFactory
* @param database Il database locale
* @return  SQLiteDaoFactory
*/
public SQLiteDaoFactory getSQLiteDaoFactory(SQLiteDatabase database);

}


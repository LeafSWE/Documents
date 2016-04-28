package com.leaf.clips.model.dataaccess.dao;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che rappresenta la factory per creare tutti gli oggetti DAO remoti
*/ 
public class RemoteDaoFactory { 

/**
* Costruttore di default per la classe RemoteDaoFactory
*/
public RemoteDaoFactory();

/**
* Metodo che viene utilizzato per ottenere un'istanza di RemoteBuildingDao
* @return  RemoteBuildingDao
*/
public RemoteBuildingDao getBuildingDao();

/**
* Metodo che viene utilizzato per ottenere un'istanza di RemoteCategoryDao
* @return  RemoteCategoryDao
*/
public RemoteCategoryDao getCategoryDao();

/**
* Metodo che viene utilizzato per ottenere un'istanza di RemoteEdgeDao
* @return  RemoteEdgeDao
*/
public RemoteEdgeDao getEdgeDao();

/**
* Metodo che viene utilizzato per ottenere un'istanza di RemoteEdgeTypeDao
* @return  RemoteEdgeTypeDao
*/
public RemoteEdgeTypeDao getEdgeTypeDao();

/**
* Metodo che viene utilizzato per ottenere un'istanza di RemotePhotoDao
* @return  RemotePhotoDao
*/
public RemotePhotoDao getPhotoDao();

/**
* Metodo che viene utilizzato per ottenere un'istanza di RemotePointOfInterestDao
* @return  RemotePointOfInterestDao
*/
public RemotePointOfInterestDao getPointOfInterestDao();

/**
* Metodo che viene utilizzato per ottenere un'istanza di RemoteRegionOfInterestDao
* @return  RemoteRegionOfInterestDao
*/
public RemoteRegionOfInterestDao getRegionOfInterestDao();

/**
* Metodo che viene utilizzato per ottenere un'istanza di RemoteRoiPoiDao
* @return  RemoteRoiPoiDao
*/
public RemoteRoiPoiDao getRoiPoiDao();

}


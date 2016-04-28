package com.leaf.clips.model.dataaccess.dao;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che rappresenta la factory per creare tutti gli oggetti DAO locali
*/ 
public class SQLiteDaoFactory { 

/** 
* Il database locale 
*/
private final SQLiteDatabase database;

/**
* Costruttore della classe SQLiteDaoFactory
* @param database Il database locale 
*/
public SQLiteDaoFactory(SQLiteDatabase database);

/**
* Metodo che viene utilizzato per ottenere un'istanza di SQLiteBuildingDao
* @return  BuildingDao
*/
public BuildingDao getBuildingDao();

/**
* Metodo che viene utilizzato per ottenere un'istanza di SQLiteCategoryDao
* @return  CategoryDao
*/
public CategoryDao getCategoryDao();

/**
* Metodo che viene utilizzato per ottenere un'istanza di SQLiteEdgeDao
* @return  EdgeDao
*/
public EdgeDao getEdgeDao();

/**
* Metodo che viene utilizzato per ottenere un'istanza di SQLiteEdgeTypeDao
* @return  EdgeTypeDao
*/
public EdgeTypeDao getEdgeTypeDao();

/**
* Metodo che viene utilizzato per ottenere un'istanza di SQLitePhotoDao
* @return  PhotoDao
*/
public PhotoDao getPhotoDao();

/**
* Metodo che viene utilizzato per ottenere un'istanza di SQLitePointOfInterestDao
* @return  PointOfInterestDao
*/
public PointOfInterestDao getPointOfInterestDao();

/**
* Metodo che viene utilizzato per ottenere un'istanza di SQLiteRegionOfInterestDao
* @return  RegionOfInterestDao
*/
public RegionOfInterestDao getRegionOfInterestDao();

/**
* Metodo che viene utilizzato per ottenere un'istanza di SQLiteRoiPoiDao
* @return  RoiPoiDao
*/
public RoiPoiDao getRoiPoiDao();

}


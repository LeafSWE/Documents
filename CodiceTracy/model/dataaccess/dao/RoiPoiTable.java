package com.leaf.clips.model.dataaccess.dao;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che rappresenta una ennupla della tabella RoiPoi del database locale
*/ 
public class RoiPoiTable { 

/** 
* Identificativo del POI 
*/
private int poiID;

/** 
* Identificativo del ROI 
*/
private int roiID;

/**
* Costruttore della classe RoiPoiTable
* @param roiID Identificativo del ROI
* @param poiID Identificativo del POI
*/
public RoiPoiTable(int roiID, int poiID);

/**
* Metodo che restituisce l'identificativo del POI
* @return  int
*/
public int getPoiID();

/**
* Metodo che restituisce l'identificativo del ROI
* @return  int
*/
public int getRoiID();

}


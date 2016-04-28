package com.leaf.clips.model.dataaccess.dao;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che rappresenta un DAO per la tabella “ROI" del database locale
*/ 
public class SQLiteRegionOfInterestDao implements RegionOfInterestDao { 

/**
* Costruttore della classe SQLiteRegionOfInterestDao
* @param database Il database locale
*/
public SQLiteRegionOfInterestDao(SQLiteDatabase database);

/**
* Metodo che viene utilizzato per convertire il risultato della query sulla tabella "ROI" del database locale in un oggetto RegionOfInterestTable
* @param cursor Risultato della query sulla tabella "ROI" del database locale
* @return  RegionOfInterestTable
*/
@Override 
public RegionOfInterestTable cursorToType(Cursor cursor);

/**
* Metodo che permette la rimozione delle informazioni di una RegionOfInterest dalla tabella "ROI" del database locale
* @param id Identificativo della RegionOfInterest di cui rimuovere le informazioni dal database locale
* @return  void
*/
@Override 
public void deleteRegionOfInterest(int id);

/**
* Metodo che viene utilizzato per recuperare le informazioni di tutte le RegionOfInterest associato ad certo edificio, dato il major dell'edificio
* @param major Major dell'edificio
* @return  Collection<RegionOfInterestTable>
*/
@Override 
public Collection<RegionOfInterestTable> findAllRegionsWithMajor(int major);

/**
* Metodo per recuperare le informazioni di una RegionOfInterest dal database locale tramite il suo identificativo, sotto forma di oggetto RegionOfInterestTable
* @param id Identificativo della RegionOfInterest di cui recuperare le informazioni
* @return  RegionOfInterestTable
*/
@Override 
public RegionOfInterestTable findRegionOfInterest(int id);

/**
* Metodo che permette l'inserimento delle informazioni di una RegionOfInterest in una entry della tabella "ROI" del database locale
* @param toInsert Oggetto di tipo RegionOfInterestTable che contiene le informazioni della RegionOfInterest
* @return  int
*/
@Override 
public int insertRegionOfInterest(RegionOfInterestTable toInsert);

/**
* Metodo per aggiornare le informazioni di una RegionOfInterest nella tabella "ROI" del database locale
* @param id Identificativo della RegionOfInterest di cui aggiornare le informazioni
* @param toUpdate Oggetto che contiene le informazioni aggiornate della RegionOfInterest
* @return  boolean
*/
@Override 
public boolean updateRegionOfInterest(int id, RegionOfInterestTable toUpdate);

}


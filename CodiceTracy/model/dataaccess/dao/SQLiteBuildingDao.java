package com.leaf.clips.model.dataaccess.dao;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che rappresenta un DAO per la tabella "Building" del database locale
*/ 
public class SQLiteBuildingDao implements BuildingDao { 

/**
* Costruttore della classe SQLiteBuildingDao
* @param database Il database locale
*/
public SQLiteBuildingDao(SQLiteDatabase database);

/**
* Metodo che viene utilizzato per convertire il risultato della query sulla tabella "Building" del database locale in un oggetto BuildingTable
* @param cursor Risultato della query sulla tabella "Building" del database locale
* @return  BuildingTable
*/
@Override 
public BuildingTable cursorToType(Cursor cursor);

/**
* Metodo che permette la rimozione delle informazioni di un edificio dalla tabella "Building" del database locale 
* @param id Identificativo dell'edificio di cui rimuovere le informazioni dal database locale
* @return  void
*/
@Override 
public void deleteBuilding(int id);

/**
* Metodo che viene utilizzato per recuperare le informazioni di tutti gli edifici presenti nella tabella "Building" del database locale
* @return  Collection<BuildingTable>
*/
@Override 
public Collection<BuildingTable> findAllBuildings();

/**
* Metodo per recuperare le informazioni di un edificio dal database locale tramite il suo identificativo, sotto forma di oggetto BuildingTable
* @param id Identificativo dell'edificio di cui recuperare le informazioni
* @return  BuildingTable
*/
@Override 
public BuildingTable findBuildingById(int id);

/**
* Metodo per recuperare le informazioni di un edificio dal database locale tramite il suo major, sotto forma di oggetto BuildingTable
* @param major Major dell'edificio di cui recuperare le informazioni
* @return  BuildingTable
*/
@Override 
public BuildingTable findBuildingByMajor(int major);

/**
* Metodo che permette l'inserimento delle informazioni di un edificio in una entry della tabella "Building" del database locale
* @param toInsert Oggetto di tipo BuildingTable che contiene le informazioni dell'edificio
* @return  int
*/
@Override 
public int insertBuilding(BuildingTable toInsert);

/**
* Metodo per verificare la presenza nel database locale delle informazioni di un edificio
* @param major major dell'edificio
* @return  boolean
*/
public boolean isBuildingMapPresent(int major);

/**
* Metodo per aggiornare le informazioni di un edificio nella tabella "Building" del database locale
* @param id Identificativo dell'edificio di cui aggiornare le informazioni
* @param toUpdate Oggetto che contiene le informazioni aggiornate dell'edificio
* @return  boolean
*/
@Override 
public boolean updateBuilding(int id, BuildingTable toUpdate);

}


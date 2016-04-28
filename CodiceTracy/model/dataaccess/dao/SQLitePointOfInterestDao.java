package com.leaf.clips.model.dataaccess.dao;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che rappresenta un POI per la tabella “POI" del database locale
*/ 
public class SQLitePointOfInterestDao implements PointOfInterestDao { 

/**
* Costruttore della classe SQLitePointOfInterestDao
* @param database Il database locale
*/
public SQLitePointOfInterestDao(SQLiteDatabase database);

/**
* Metodo che viene utilizzato per convertire il risultato della query sulla tabella "POI" del database locale in un oggetto PointOfInterestTable
* @param cursor Risultato della query sulla tabella "POI" del database locale
* @return  PointOfInterestTable
*/
@Override 
public PointOfInterestTable cursorToType(Cursor cursor);

/**
* Metodo che permette la rimozione delle informazioni di un edificio dalla tabella "POI" del database locale 
* @param id Identificativo del POI di cui rimuovere le informazioni dal database locale
* @return  void
*/
@Override 
public void deletePointOfInterest(int id);

/**
* Metodo che viene utilizzato per recuperare le informazioni di tutti gli edifici presenti nella tabella "POI" del database locale
* @param major Identificativo Major associato a tutti i beacon presenti in uno stesso edificio
* @return  Collection<PointOfInterestTable>
*/
@Override 
public Collection<PointOfInterestTable> findAllPointsWithMajor(int major);

/**
* Metodo per recuperare le informazioni di un edificio dal database locale tramite il suo identificativo, sotto forma di oggetto PointOfInterestTable
* @param id Identificativo del POI di cui recuperare le informazioni
* @return  PointOfInterestTable
*/
@Override 
public PointOfInterestTable findPointOfInterest(int id);

/**
* Metodo che permette l'inserimento delle informazioni di un edificio in una entry della tabella "POI" del database locale
* @param toInsert Oggetto di tipo PointOfInterestTable che contiene le informazioni dell'edificio
* @return  int
*/
@Override 
public int insertPointOfInterest(PointOfInterestTable toInsert);

/**
* Metodo per aggiornare le informazioni di un edificio nella tabella "POI" del database locale
* @param id Identificativo del POI di cui aggiornare le informazioni
* @param toUpdate Oggetto che contiene le informazioni aggiornate del POI
* @return  boolean
*/
@Override 
public boolean updatePointOfInterest(int id, PointOfInterestTable toUpdate);

}


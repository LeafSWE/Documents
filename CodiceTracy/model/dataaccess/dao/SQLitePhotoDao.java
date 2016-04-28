package com.leaf.clips.model.dataaccess.dao;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che rappresenta un DAO per la tabella “Photo" del database locale
*/ 
public class SQLitePhotoDao implements PhotoDao { 

/**
* Costruttore della classe SQLitePhotoDao
* @param database Il database locale
*/
public SQLitePhotoDao(SQLiteDatabase database);

/**
* Metodo che viene utilizzato per convertire il risultato della query sulla tabella "Photo" del database locale in un oggetto PhotoTable
* @param cursor Risultato della query sulla tabella "Photo" del database locale
* @return  PhotoTable
*/
@Override 
public PhotoTable cursorToType(Cursor cursor);

/**
* Metodo che permette la rimozione delle informazioni di una foto dalla tabella "Photo" del database locale
* @param id Identificativo della foto di cui rimuovere le informazioni dal database locale
* @return  void
*/
@Override 
public void deletePhoto(int id);

/**
* Metodo che viene utilizzato per recuperare le informazioni di tutte foto associate ad un Edge presenti nella tabella "Photo" del database locale
* @param id Identificativo dell'Edge
* @return  Collection<PhotoTable>
*/
@Override 
public Collection<PhotoTable> findAllPhotosOfEdge(int id);

/**
* Metodo per recuperare le informazioni di una foto dal database locale tramite il suo identificativo, sotto forma di oggetto PhotoTable
* @param id Identificativo della foto
* @return  PhotoTable
*/
@Override 
public PhotoTable findPhoto(int id);

/**
* Metodo che permette l'inserimento delle informazioni di una foto in una entry della tabella "Photo" del database locale
* @param toInsert Oggetto di tipo Photo che contiene le informazioni della foto
* @return  int
*/
@Override 
public int insertPhoto(PhotoTable toInsert);

/**
* Metodo per aggiornare le informazioni di una foto nella tabella "Photo" del database locale
* @param id Identificativo della foto di cui aggiornare le informazioni
* @param toUpdate Oggetto che contiene le informazioni aggiornate della foto
* @return  boolean
*/
@Override 
public boolean updatePhoto(int id, PhotoTable toUpdate);

}


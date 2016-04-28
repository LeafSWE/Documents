package com.leaf.clips.model.dataaccess.dao;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che rappresenta un DAO per la tabella “EdgeType" del database locale
*/ 
public class SQLiteEdgeTypeDao implements EdgeTypeDao { 

/**
* Costruttore della classe SQLiteEdgeTypeDao
* @param database Il database locale
*/
public SQLiteEdgeTypeDao(SQLiteDatabase database);

/**
* Metodo che viene utilizzato per convertire il risultato della query sulla tabella "EdgeType" del database locale in un oggetto EdgeTypeTable
* @param cursor Risultato della query sulla tabella "EdgeType" del database locale
* @return  EdgeTypeTable
*/
@Override 
public EdgeTypeTable cursorToType(Cursor cursor);

/**
* Metodo che permette la rimozione delle informazioni di un tipo di Edge dalla tabella "EdgeType" del database locale
* @param id Identificativo del tipo di Edge di cui rimuovere le informazioni dal database locale
* @return  void
*/
@Override 
public void deleteEdgeType(int id);

/**
* Metodo per recuperare le informazioni di un tipo di Edge dal database locale tramite il suo identificativo, sotto forma di oggetto EdgeTypeTable
* @param id Identificativo del tipo di Edge di cui recuperare le informazioni
* @return  EdgeTypeTable
*/
@Override 
public EdgeTypeTable findEdgeType(int id);

/**
* Metodo che permette l'inserimento delle informazioni del tipo di Edge in una entry della tabella "EdgeType" del database locale
* @param toInsert Oggetto di tipo EdgeTypeTable che contiene le informazioni di un tipo di Edge
* @return  int
*/
@Override 
public int insertEdgeType(EdgeTypeTable toInsert);

/**
* Metodo per aggiornare le informazioni di un tipo di Edge nella tabella "EdgeType" del database locale
* @param id Identificativo del tipo di Edge di cui aggiornare le informazioni
* @param toUpdate Oggetto che contiene le informazioni aggiornate del tipo di Edge
* @return  boolean
*/
@Override 
public boolean updateEdgeType(int id, EdgeTypeTable toUpdate);

}


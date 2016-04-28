package com.leaf.clips.model.dataaccess.dao;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che rappresenta un DAO per la tabella “Edge" del database locale
*/ 
public class SQLiteEdgeDao implements EdgeDao { 

/**
* Costruttore della classe SQLiteEdgeDao
* @param database Il database locale
*/
public SQLiteEdgeDao(SQLiteDatabase database);

/**
* Metodo che viene utilizzato per convertire il risultato della query sulla tabella "Edge" del database locale in un oggetto EdgeTable
* @param cursor Risultato della query sulla tabella "Edge" del database locale
* @return  EdgeTable
*/
@Override 
public EdgeTable cursorToType(Cursor cursor);

/**
* Metodo che permette la rimozione delle informazioni di un edificio dalla tabella "Edge" del database locale 
* @param id Identificativo dell'arco di cui rimuovere le informazioni dal database locale
* @return  void
*/
@Override 
public void deleteEdge(int id);

/**
* Metodo che viene utilizzato per recuperare le informazioni di tutti gli archi presenti nella tabella "Edge" del database locale
* @param major Identificativo major dell'edificio di cui si vogliono recuperare tutti gli archi
* @return  Collection<EdgeTable>
*/
@Override 
public Collection<EdgeTable> findAllEdgesOfBuilding(int major);

/**
* Metodo per recuperare le informazioni di un arco dal database locale tramite il suo identificativo, sotto forma di oggetto EdgeTable
* @param id Identificativo dell'arco di cui recuperare le informazioni
* @return  EdgeTable
*/
@Override 
public EdgeTable findEdge(int id);

/**
* Metodo che permette l'inserimento delle informazioni di un edificio in una entry della tabella "Edge" del database locale
* @param toInsert Oggetto di tipo EdgeTable che contiene le informazioni dell'arco
* @return  int
*/
@Override 
public int insertEdge(EdgeTable toInsert);

/**
* Metodo per aggiornare le informazioni di un edificio nella tabella "Edge" del database locale
* @param id Identificativo dell'arco di cui aggiornare le informazioni
* @param toUpdate Oggetto che contiene le informazioni aggiornate dell'arco
* @return  boolean
*/
@Override 
public boolean updateEdge(int id, EdgeTable toUpdate);

}


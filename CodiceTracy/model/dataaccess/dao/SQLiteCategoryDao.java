package com.leaf.clips.model.dataaccess.dao;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che rappresenta un DAO per la tabella “Category" del database locale
*/ 
public class SQLiteCategoryDao implements CategoryDao { 

/**
* Costruttore della classe SQLiteCategoryDao
* @param database Il database locale
*/
public SQLiteCategoryDao(SQLiteDatabase database);

/**
* Metodo che viene utilizzato per convertire il risultato della query sulla tabella "Category" del database locale in un oggetto CategoryTable
* @param cursor Risultato della query sulla tabella "Category" del database locale
* @return  CategoryTable
*/
@Override 
public CategoryTable cursorToType(Cursor cursor);

/**
* Metodo che permette la rimozione delle informazioni di un edificio dalla tabella "Category" del database locale
* @param id Identificativo della categoria da rimuovere dal database locale
* @return  void
*/
@Override 
public void deleteCategory(int id);

/**
* Metodo per recuperare le informazioni di una categoria dal database locale tramite il suo identificativo, sotto forma di oggetto CategoryTable
* @param id Identificativo della categoria di cui recuperare le informazioni
* @return  CategoryTable
*/
@Override 
public CategoryTable findCategory(int id);

/**
* Metodo che permette l'inserimento di una categoria nella tabella "Category" del database locale
* @param toInsert Oggetto di tipo CategoryTable che contiene le informazioni della categoria
* @return  int
*/
@Override 
public int insertCategory(CategoryTable toInsert);

/**
* Metodo per aggiornare le informazioni di una categoria nella tabella "Category" del database locale
* @param id Identificativo della categoria di cui aggiornare le informazioni
* @param toUpdate Oggetto che contiene le informazioni aggiornate della categoria
* @return  boolean
*/
@Override 
public boolean updateCategory(int id, CategoryTable toUpdate);

}


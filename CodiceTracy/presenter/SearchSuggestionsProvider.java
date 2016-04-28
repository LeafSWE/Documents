package com.leaf.clips.presenter;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import android.content.ContentProvider(Android);

/** 
*Classe che estende content Provider e si occupa della gestione suggerimenti di ricerca per la navigazione
*/ 
public class SearchSuggestionsProvider { 

/** 
* Identifica la struttura di un singolo suggerimento 
*/
private final static String COLUMNS;

/** 
* Riferimento all'activity che gestisce la ricerca dei POI in base al nome 
*/
private HomeActivity homeActivity;

/**
* Metodo che ritorna il MIME type associato al parametro passato
* @param uri URI su cui fare la query
* @return  String
*/
@Override 
public String getType(Uri uri);

/**
* Metodo che serve per inserire i suggerimenti nel content provider
* @param uri URI in cui fare l'inserimento
* @param values Insieme di coppie nome-colonna/valore da inserire nel content provider 
* @return  Uri
*/
@Override 
public Uri insert(Uri uri, ContentValues values);

/**
* Metodo che inizializza un oggetto di tipo SearchSuggestionProvider
* @return  void
*/
@Override 
public void onCreate();

/**
* Metodo che serve per popolare i suggerimenti della SearchView in base al testo inserito
* @param uri URI su cui fare la query
* @param projection Lista delle colonne della tabella del content provider
* @param selection Criterio da applicare per filtrare le righe del content provider
* @param selectionArgs Insieme di argomenti su cui fare la selezione
* @param sortOrder Ordine dei risultati
* @return  Cursor
*/
@Override 
public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder);

/**
* Metodo utilizzato per aggiornare il content provider
* @param uri URI su cui fare la query
* @param values Valori da aggiungere
* @param selection Criterio da applicare per filtrare le righe del content provider
* @param selectionArgs Insieme di argomenti su cui fare la selezione
* @return  int
*/
@Override 
public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs);

}


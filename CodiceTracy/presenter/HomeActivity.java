package com.leaf.clips.presenter;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import android.support.v7.app.AppCompatActivity;

/** 
*Classe che estende AppCompcatActivity per la gestione dell'interazione tra HomeView ed il model
*/ 
public class HomeActivity { 

/** 
* Riferimento utilizzato per accedere alle informazioni trattate dal model 
*/
private InformationManager informationManager;

/** 
* View associata a tale Activity 
*/
private HomeView view;

/**
* Metodo che permette di attivare la lista dei possibili POI raggiungibili a partire da una stringa
* @return  void
*/
public void enableSuggestions();

/**
* Metodo che inizializza la View associata e recupera un riferimento all'InformationManager
* @param bundle Componente per salvare lo stato dell'applicazione
* @return  void
*/
@Override 
public void onCreate(Bundle bundle);

/**
* Metodo che viene invocato a seguito della richiesta di visualizzazione della modalità esplora
* @return  void
*/
public void showExplorer();

/**
* Metodo che viene invocato a seguito della richiesta di visualizzazione della guida
* @return  void
*/
public void showHelp();

/**
* Metodo che viene invocato a seguito della richiesta di visualizzazione della mappe salvate nel database locale
* @return  void
*/
public void showLocalMaps();

/**
* Metodo che viene invocato a seguito della richiesta di visualizzazione di tutti i POI appartenenti ad un certa categoria
* @param categoryName Nome della categoria di cui visualizzare l'insieme di POI appartenente
* @return  void
*/
public void showPoisCategory(String categoryName);

/**
* Metodo che viene invocato a seguito della richiesta di visualizzazione delle preferenze dell'utente
* @return  void
*/
public void showPreferences();

/**
* Metodo che viene invocato a seguito della richiesta di inizio della navigazione
* @param poiPosition Identificativo del POI verso il quale si vuole effettuare una navigazione
* @return  void
*/
public void startNavigation(int poiPosition);

/**
* Metodo che recupera l'indirizzo dell'edificio e lo passa alla View corrispondente
* @return  void
*/
public void updateBuildingAddress();

/**
* Metodo che recupera la descrizione dell'edificio e lo passa alla View corrispondente
* @return  void
*/
public void updateBuildingDescription();

/**
* Metodo che recupera il nome dell'indirizzo dell'edificio e lo passa alla View corrispondente
* @return  void
*/
public void updateBuildingName();

/**
* Metodo che recupera l'orario di apertura dell'edificio e lo passa alla View corrispondente
* @return  void
*/
public void updateBuildingOpeningHours();

/**
* Metodo che recupera la lista di categorie di POI nell'edificio e lo passa alla View corrispondente
* @return  void
*/
public void updatePoiCategoryList();

}


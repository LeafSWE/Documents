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
*Classe che estende AppCompactActivity e per la gestione dell'interazione tra LocalMapView ed il model
*/ 
public class LocalMapActivity { 

/** 
* View associata a tale Activity 
*/
private LocalMapManagerView view;

/**
* Metodo che permettere di rimuovere una mappa del database locale
* @param mapPosition Posizione occupata dalla mappa da rimuovere
* @return  void
*/
public void deleteMap(int mapPosition);

/**
* Metodo che inizializza la View associata a tale Activity
* @param bundle Componente per salvare lo stato dell'applicazione
* @return  void
*/
@Override 
public void onCreate(Bundle bundle);

/**
* Metodo che permette di aggiornare una mappa del database locale
* @param mapPosition Posizione della mappa da aggiornare
* @return  void
*/
public void updateMap(int mapPosition);

}


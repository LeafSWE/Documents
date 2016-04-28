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
*È una classe che estende AppCompactActivity che recupera tutte le mappe in remoto dal model e gestisce RemoteMapManagerView
*/ 
public class RemoteMapManagerActivity { 

/** 
* View associata a tale Activity 
*/
private RemoteMapManagerView view;

/**
* Metodo che permette di eseguire il download di una mappa da un database remoto
* @param mapPosition Posizione della mappa di cui fare il download
* @return  void
*/
public void downloadMap(int mapPosition);

/**
* Metodo che inizializza la View associata
* @param bundle Componente per salvare lo stato dell'applicazione
* @return  void
*/
@Override 
public void onCreate(Bundle bundle);

}


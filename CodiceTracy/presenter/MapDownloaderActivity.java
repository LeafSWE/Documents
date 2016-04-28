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
*È una classe che estende AppCompactActivity che consente di gestire il download o l'aggiornamento delle mappe

*/ 
public class MapDownloaderActivity { 

/** 
* View associata a tale Activity 
*/
private MapDownloaderView view;

/**
* Metodo che gestisce la View per visualizzare il completamento del download di una mappa
* @return  void
*/
public void downloadFinished();

/**
* Metodo che inizializza la View associata
* @param bundle Componente per salvare lo stato dell'applicazione
* @return  void
*/
@Override 
public void onCreate(Bundle bundle);

}


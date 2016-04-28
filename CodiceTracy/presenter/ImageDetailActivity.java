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
*Classe che implementa AppCompcatActivity per la gestione dell'interazione tra ImageDetailView ed il model
*/ 
public class ImageDetailActivity { 

/** 
* ImagePageAdapter per la gestione dello slideshow delle immagini relative ad una certa istruzione di navigazione 
*/
private ImagePageAdapter imgPgAdpt;

/** 
* Lista contenenti gli URI delle foto 
*/
private List<String> listPhotos;

/** 
* Elemento di partenza sul quale l'utente ha cliccato 
*/
private int startItem;

/** 
* View associata a tale Activity 
*/
private ImageDetailView view;

/**
* Metodo che inizializza ImageDetailView
* @param bundle Componente per salvare lo stato dell'applicazione
* @return  void
*/
@Override 
public void onCreate(Bundle bundle);

}


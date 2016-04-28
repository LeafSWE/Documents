package com.leaf.clips.presenter;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import android.app.Fragment(Android);

/** 
*Classe che estende BaseAdapter per la gestione della lista di immagini relative ad una istruzione di navigazione
*/ 
public class ImageListFragment { 

/** 
* Collegamento tra la lista di URL relative ad un certo POI e la View che mostra quelle anteprime 
*/
private ImageAdapter imgAdapter;

/** 
* Gli URL delle foto 
*/
private List<String> photosUrls;

/**
* Costruttore della classe ImageListFragment
*/
private ImageListFragment();

/**
* Metodo che ritorna una nuova istanza di un ImageListFragment a partire da una lista di foto
* @param photsUrls Lista di URL delle foto
* @return  ImageListFragment
*/
public static ImageListFragment newInstance(List<String> photsUrls);

/**
* Metodo che inizializza ImageListView
* @param bundle Componente per salvare lo stato dell'applicazione
* @return  void
*/
@Override 
public void onCreate(Bundle bundle);

/**
* Metodo che crea il layout di un fragment
* @param lay Oggetto rappresentante il file XML della View e farne l'inflate
* @param viewGr Layout della lista di anteprime
* @param bundle Componente per salvare lo stato dell'applicazione
* @return  View
*/
@Override 
public View onCreateView(LayoutInflater lay, ViewGroup viewGr, Bundle bundle);

/**
* Metodo che viene invocato alla pressione di un bottone
* @return  void
*/
@Override 
public void onItemClick();

}


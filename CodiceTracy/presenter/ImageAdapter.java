package com.leaf.clips.presenter;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import android.widget.BaseAdapter(Android);

/** 
*Classe che estende FragmentStatePageAdapter per gestire la lista di immagini associate ad una certa istruzione di navigazione
*/ 
public class ImageAdapter { 

/** 
* Contesto dell'applicativo 
*/
private Context context;

/**
* Costruttore della classe ImageAdapter
*/
public ImageAdapter();

/**
* Metodo che viene utilizzato per ottenere il numero di immagini relative a quel POI
* @return  int
*/
@Override 
public int getCount();

/**
* Metodo che ritorna l'URL di una foto in una certa posizione
* @param position Posizione della foto di cui si vuole recuperare l'URL
* @return  Object
*/
@Override 
public Object getItem(int position);

/**
* Metodo che ritorna l'identificativo numerico di una foto in una certa posizione
* @param position  Posizione della foto di cui si vuole recuperare l'identificativo numerico
* @return  long
*/
@Override 
public long getItemId(int position );

/**
* Metodo che restituisce la foto in una certa posizione
* @param position  Posizione della foto che si vuole recuperare
* @param convertView Il layout dell'anteprima della foto restituita
* @param parent Il layout della lista di anteprime
* @return  View
*/
@Override 
public View getView(int position , View convertView, ViewGroup parent);

}


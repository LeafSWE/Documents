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
*Classe che estende BaseAdapter per la gestione della lista di istruzioni di navigazione
*/ 
public class NavigationAdapter { 

/**
* Costruttore della classe NavigationAdapter
*/
public NavigationAdapter();

/**
* Metodo che ritorna il numero di istruzioni relative alla tua destinazione
* @return  int
*/
@Override 
public int getCount();

/**
* Metodo che viene utilizzato per recuperare un'istruzione in una certa posizione della lista di istruzioni
* @param position Posizione dell'istruzione da recuperare
* @return  Object
*/
@Override 
public Object getItem(int position);

/**
* Metodo che viene utilizzato per recuperare l'id di un'istruzione in una certa posizione nella lista di istruzioni
* @param position Posizione dell'istruzione di cui recuperare l'identificativo numerico
* @return  long
*/
@Override 
public long getItemId(int position);

/**
* Metodo che viene utilizzare per recuperare un'istruzione in una certa posizione
* @param position Posizione dell'istruzione da recuperare
* @param convertView Layout dell'istruzione recuperata
* @param parent Layout della lista di istruzioni
* @return  View
*/
@Override 
public View getView(int position, View convertView, ViewGroup parent);

}


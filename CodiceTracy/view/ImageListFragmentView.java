package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import android.widget.AdapterView.OnItemClickListener(Android);

/** 
*Interfaccia che espone i metodi per aggiornare la UI contenente le anteprime delle immagini relative al prossimo POI
*/ 
public interface ImageListFragmentView { 

/**
* Metodo utilizzato per visualizzare la lista delle anteprime delle immagine relative ad un certo POI
* @param adp Collegamento tra la lista delle immagini e la view in cui esse devono essere mostrate
* @return  void
*/
 void setImageAdapter(Adapter adp);

}


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
*Classe che implementa AppCompcatActivity per la gestione dell'interazione tra PoiCategoryView ed il model
*/ 
public class PoiCategoryActivity { 

/** 
* Lista di POI associati ad una certa categoria 
*/
private List<PointOfInterest> poiList;

/** 
* View associata a tale Activity 
*/
private PoiCategoryView view;

/**
* Metodo che implementa la PoiCategoryView
* @param bundle Componente per salvare lo stato dell'applicazione
* @return  void
*/
@Override 
public void onCreate(Bundle bundle);

/**
* Metodo che permette di avviare la navigazione tramite l'oggetto navigator
* @param selectedPoi POI da raggiungere selezionato tramite la View
* @return  void
*/
public void startNavigation(int selectedPoi);

}


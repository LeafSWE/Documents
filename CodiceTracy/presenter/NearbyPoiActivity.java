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
*Classe che estende AppCompactActivity è gestisce tutte le possibili interazioni tra NearbyPoiView ed il model
*/ 
public class NearbyPoiActivity { 

/** 
* Insieme di POI rilevati nelle circostanze 
*/
private Collection<PointOfInterest> pois;

/** 
* View associata a tale Activity 
*/
private NearbyPoiView view;

/**
* Metodo che istanzia NearbyPoiView
* @param bundle Componente per salvare lo stato dell'applicazione
* @return  void
*/
@Override 
public void onCreate(Bundle bundle);

}


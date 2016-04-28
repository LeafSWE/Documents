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
*Classe che estende AppCompactActivity per la gestione delle informazioni dettagliate riguardo alla navigazione
*/ 
public class DetailedInformationActivity { 

/** 
* Contiene la lista di tutte le anteprime delle immagini associate ad un certo Edge 
*/
private ImageListFragment imgListFragment;

/** 
* ProcessedInformation associata all'Edge corrente 
*/
private ProcessedInformation processedInfo;

/** 
* View associata a tale Activity 
*/
private DetailedInformationView view;

/**
* Metodo che inizializza la DetailedInformationView
* @param bundle Componente per salvare lo stato dell'applicazione
* @return  void
*/
@Override 
public void onCreate(Bundle bundle);

/**
* Metodo che aggiorna le informazioni testuali estese visualizzate sulla View
* @return  void
*/
public void updateDetailedDescription();

/**
* Metodo che aggiorna la foto visualizzata sulla View
* @return  void
*/
public void updatePhoto();

}


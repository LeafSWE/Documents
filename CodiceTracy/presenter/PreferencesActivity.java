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
*È una classe che estende AppCompactActivity che consente di gestire le preferenze utente recuperandole dal model
*/ 
public class PreferencesActivity { 

/** 
* View associata a tale Activity 
*/
private PreferencesView view;

/**
* Metodo che inizializza la View associata
* @param bundle Componente per salvare lo stato dell'applicazione
* @return  void
*/
@Override 
public void onCreate(Bundle bundle);

/**
* Metodo che permette di salvare le preferenze utente
* @return  void
*/
public void savePreferences();

}


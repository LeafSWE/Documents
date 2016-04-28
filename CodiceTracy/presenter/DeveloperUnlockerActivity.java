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
*È una classe che estende AppCompactActivity che consente di gestire l'interazione tra DeveloperUnlockerView ed il model
*/ 
public class DeveloperUnlockerActivity { 

/** 
* Impostazioni dell'utente 
*/
private Setting userSetting;

/** 
* View associata a tale Activity 
*/
private DeveloperUnlockerView view;

/**
* Metodo che inizializza la View associata e recupera un riferimento alle impostazioni dell'utente
* @param bundle Componente per salvare lo stato dell'applicazione
* @return  void
*/
@Override 
public void onCreate(Bundle bundle);

/**
* Metodo che permette di attivare le funzionalità sviluppatore
* @param code Codice di sblocco delle attività sviluppatore
* @return  boolean
*/
public boolean unlockDeveloper(String code);

}


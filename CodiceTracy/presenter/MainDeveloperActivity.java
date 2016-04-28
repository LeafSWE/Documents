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
*È una classe che estende AppCompactActivity e consente di gestire l'interazione tra MainDeveloperView ed il model
*/ 
public class MainDeveloperActivity { 

/** 
* Oggetto del Model per la gestione delle informazioni 
*/
private InformationManager infoManager;

/** 
* View associata a tale Activity 
*/
private DeveloperUnlockerView view;

/**
* Metodo che inizializza MainDeveloperView
* @param bundle Componente per salvare lo stato dell'applicazione
* @return  void
*/
@Override 
public void onCreate(Bundle bundle);

/**
* Metodo che permette di visualizzare il contenuto di un log
* @param logPosition  Intero rappresentante la posizione del log selezionato all'interno della lista
* @return  void
*/
public void showDetailedLog(int logPosition );

/**
* Metodo che avvia un nuovo log
* @return  void
*/
public void startNewLog();

}


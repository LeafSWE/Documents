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
*Classe che estende AppCompactActivity per la gestione dell'interazione tra NavigationView ed il model
*/ 
public class NavigationActivity { 

/** 
* Consente di gestire l'insieme di funzioni per la navigazione 
*/
private NavigationAdapter navigationAdapter;

/** 
* View associata a tale Activity 
*/
private NavigationView view;

/**
* Metodo che permette di aggiornare le informazioni
* @param info Informazioni utili alla navigazione
* @return  void
*/
public void informationUpdate(ProcessedInformation info);

/**
* Metodo che inizializza NavigationView
* @param bundle Componente per salvare lo stato dell'applicazione
* @return  void
*/
@Override 
public void onCreate(Bundle bundle);

/**
* Metodo che viene invocato dal Model per segnalare un errore durante la navigazione
* @return  void
*/
public void pathError();

/**
* Metodo che permette la visualizzazione delle informazioni dettagliate
* @param instructionPosition Intero rappresentante la posizione dell'informazione a cui accedere
* @return  void
*/
public void showDetailedInformation(int instructionPosition);

/**
* Metodo che permette di interrompere la navigazione
* @return  void
*/
public void stopNavigation();

}


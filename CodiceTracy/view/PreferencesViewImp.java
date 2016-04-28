package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che si occupa di mostrare la UI utile alla modifica delle preferenze dell'utente
*/ 
public class PreferencesViewImp implements PreferencesView { 

/** 
* Presenter della View 
*/
private PreferencesActivity presenter;

/**
* Costruttore della classe PreferencesViewImp
* @param presenter Presenter della View che viene creata
* @param presenter Presenter della View che viene creata
*/
public PreferencesViewImp(PreferencesActivity presenter, PreferencesActivity presenter);

/**
* Metodo utilizzato per visualizzare le preferenze dell'utente riguardo la fruizione delle istruzioni di navigazione
* @param adp Collegamento tra le preferenze riguardanti la fruizione delle istruzioni di navigazione e la view in cui esse devono essere mostrate
* @return  void
*/
@Override 
public void setInstructionPreferences(Adapter adp);

/**
* Metodo utilizzato per visualizzare le preferenze dell'utente relative al percorso proposto
* @param adp Collegamento tra le preferenze riguardanti le preferenze del percorso di navigazione e la view in cui esse devono essere mostrate
* @return  void
*/
@Override 
public void setPathPreferences(Adapter adp);

}


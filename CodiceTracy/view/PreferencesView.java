package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Interfaccia che espone i metodi per aggiornare la UI contenente le preferenze dell'utente rispetto al percorso consigliato e alla modalità di fruizione delle istruzioni di navigazione
*/ 
public interface PreferencesView { 

/**
* Metodo utilizzato per visualizzare le preferenze dell'utente riguardo la fruizione delle istruzioni di navigazione
* @param adp Collegamento tra le preferenze riguardanti la fruizione delle istruzioni di navigazione e la view in cui esse devono essere mostrate
* @return  void
*/
 void setInstructionPreferences(Adapter adp);

/**
* Metodo utilizzato per visualizzare le preferenze dell'utente relative al percorso proposto
* @param adp Collegamento tra le preferenze riguardanti le preferenze del percorso di navigazione e la view in cui esse devono essere mostrate
* @return  void
*/
 void setPathPreferences(Adapter adp);

}


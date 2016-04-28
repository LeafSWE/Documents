package com.leaf.clips.model.usersetting;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Interfaccia che espone i metodi per accedere alle preferenze di un utente riguardo il percorso di navigazione e le istruzioni di navigazione. Espone inoltre i metodi per verificare se è stato inserito un codice sviluppatore valido e per verificare i codici inseriti
*/ 
public interface Setting { 

/**
* Metodo che ritorna le preferenze riguardanti la modalità di fruizione delle informazioni
* @return  InstructionPreference
*/
 InstructionPreference getInstructionPreference();

/**
* Metodo che ritorna le preferenze di percorso
* @return  PathPreference
*/
 PathPreference getPathPreference();

/**
* Metodo che verifica se è stato inserito in precedenza un codice sviluppatore valido
* @return  booolean
*/
 booolean isDeveloper();

/**
* Metodo che permette di modificare le impostazioni riguardanti le preferenze di fruizione delle istruzioni di navigazione
* @param instructionPreference Preferenza riguardante la fruizione delle istruzioni di navigazione.
* @return  void
*/
 void setInstructionPreference(InstructionPreference instructionPreference);

/**
* Metodo che permette di modificare le impostazioni riguardanti le preferenze sul percorso di navigazione
* @param pathPreference Preferenza riguardante il percorso di navigazione.
* @return  void
*/
 void setPathPreference(PathPreference pathPreference);

/**
* Metodo che passato una stringa in ingresso controlla se tale stringa rappresenta un codice sviluppatore valido
* @return  boolean
*/
 boolean unlockDeveloper();

}


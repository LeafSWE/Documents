package com.leaf.clips.model.usersetting;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/** 
*Classe che implementa l'interfaccia Setting. Implementa tutti i metodi per la gestione delle impostazioni dell'utente
*/ 
public class SettingImp implements Setting { 

/** 
* Preferenze dell'utente riguardanti le modalità di fruizione delle informazioni per la navigazione 
*/
private InstructionPreference instructionPreference;

/** 
* Preferenze di percorso dell'utente 
*/
private PathPreference pathPreference;

/**
* Metodo che ritorna le preferenze riguardanti la modalità di fruizione delle informazioni
* @return  InstructionPreference
*/
@Override 
public InstructionPreference getInstructionPreference();

/**
* Metodo che ritorna le preferenze di percorso
* @return  PathPreference
*/
@Override 
public PathPreference getPathPreference();

/**
* Metodo che verifica se è stato inserito in precedenza un codice sviluppatore valido
* @return  boolean
*/
@Override 
public boolean isDeveloper();

/**
* Metodo che permette di modificare le impostazioni riguardanti le preferenze di fruizione delle istruzioni di navigazione
* @param instructionPreference Questo parametro richiede il tipo di istruzioni che si vuole ricevere durante la navigazione 
* @return  void
*/
@Override 
public void setInstructionPreference(InstructionPreference instructionPreference);

/**
* Metodo che permette di modificare le impostazioni riguardanti le preferenze sul percorso di navigazione
* @param pathPreference Questo parametro richiede le preferenze di percorso che un utente vuole impostare
* @return  void
*/
@Override 
public void setPathPreference(PathPreference pathPreference);

/**
* Metodo che passato una stringa in ingresso controlla se tale stringa rappresenta un codice sviluppatore valido
* @param code Questo parametro richiede il codice per attivare la modalità sviluppatore
* @return  boolean
*/
@Override 
public boolean unlockDeveloper(String code);

}


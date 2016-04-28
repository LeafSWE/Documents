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
*Classe che estende AppCompactActivity e gestisce l'interazione tra LogInformationView ed il model
*/ 
public class LogInformationActivity { 

/** 
* Oggetto del Model per la gestione dei log 
*/
private InformationManager infoManager;

/** 
* View associata a tale Activity 
*/
private LogInformationView view;

/**
* Metodo che viene utilizzato per rimuovere un log salvato
* @param name Nome del log da eliminare
* @return  void
*/
public void deleteLog(String name);

}


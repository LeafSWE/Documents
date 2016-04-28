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
*Classe che estende AppCompactActivity per la gestione dell'interazione tra il model e LoggingView
*/ 
public class LoggingActivity { 

/** 
* Riferimento utile per gestire i log 
*/
private InformationManager infoManager;

/** 
* View associata a tale Activity 
*/
private LoggingView view;

/**
* Metodo che viene utilizzato per interrompere l'attività di log
* @return  void
*/
public void stopLogging();

}


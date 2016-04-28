package com.leaf.clips.presenter;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import android.app.Application(Android);

/** 
*Classe che estende Application e recupera il riferimento a InformationManager del model
*/ 
public class InformationManagerPresenter { 

/** 
* Riferimento utilizzato per accedere alle informazioni trattate dal model 
*/
private InformationManager informationManager;

/**
* Metodo che restituisce un InformationManger per accedere alle informazioni del presenter
* @return  InformationManager
*/
@Override 
public InformationManager getInformationManager();

}


package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Interfaccia che espone i metodi per aggiornare la UI contenente le informazioni relative ad un singolo beacon
*/ 
public interface LogInformationView { 

/**
* Metodo utilizzato per visualizzare la lista delle informazioni di un certo beacon
* @param logInfo Collegamento tra la lista delle informazione dei log e la view in cui esse devono essere mostrate
* @return  void
*/
 void setBeaconAdapter(String logInfo);

}


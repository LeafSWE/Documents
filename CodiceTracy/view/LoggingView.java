package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Interfaccia che espone i metodi per aggiornare la UI contenente gli identificativi dei beacon rilevati
*/ 
public interface LoggingView { 

/**
* Metodo utilizzato per visualizzare la lista dei beacon rilevati 
* @param adp Collegamento tra la lista dei beacon rilevati e la view in cui essi devono essere mostrati
* @return  void
*/
 void setBeaconListAdapter(Adapter adp);

}


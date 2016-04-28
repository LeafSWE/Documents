package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Interfaccia che espone i metodi per aggiornare la UI contenente la lista dei log salvati e disponibili ad essere consultati
*/ 
public interface MainDeveloperView { 

/**
* Metodo utilizzato per visualizzare la lista di tutti i log salvati in locale
* @param adp Collegamento tra la lista dei log e la view in cui essi devono essere mostrati
* @return  void
*/
 void setLogsAdapter(Adapter adp);

}


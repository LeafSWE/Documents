package com.leaf.clips.model;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che si occupa della gestione della navigazione
*/ 
public class NavigationManagerImp extends AbsBeaconReceiverManager implements NavigationManager { 

/** 
* Oggetto che permette di recuperare I dati della bussola 
*/
private final Compass compass;

/** 
* Grafo rappresentante la mappa dell'edificio 
*/
private final MapGraph graph;

/** 
* PriorityQueue, eventualmente vuota, contenente gli ultimi beacon rilevati 
*/
private PriorityQueue<MyBeacon> lastBeaconsSeen;

/** 
* Collezione contenenti tutti I listener da aggiornare ad ogni nuova istruzione da inviare 
*/
private Collection<NavigationListener> listeners;

/** 
* Oggetto per la navigazione 
*/
private Navigator navigator;

/**
* Costruttore della classe NavigationManagerImp
* @param graph Grafo dell'edificio in cui si desidera navigare
* @param context Contesto dell'applicazione
*/
@Override 
public NavigationManagerImp(MapGraph graph, Context context);

/**
* Metodo che permette di registrare un listener
* @param listener Listener che deve essere aggiunto alla lista di NavigationListener
* @return  void
*/
@Override 
public void addBeaconListener(NavigationListener listener);

/**
* Metodo che permette di recuperare tutte le istruzioni di navigazione per un percorso calcolato. Viene lanciata una eccezione di tipo NoNavigationInformationException nel caso in cui venga richiamato questo metodo senza aver prima avviato la navigazione
* @return  List<ProcessedInformation>
*/
@Override 
public List<ProcessedInformation> getAllNavigationInstruction();

/**
* Metodo che permette di recuperare tutte le istruzioni di navigazione per un percorso calcolato in base al beacon più potente ricavato dalla PriorityQueue<MyBeacon> passata come argomento. Viene lanciata una eccezione di tipo NoNavigationInformationException nel caso in cui venga richiamato questo metodo senza aver prima avviato la navigazione.
* @return  ProcessedInformation
*/
@Override 
public ProcessedInformation getNextInstruction();

/**
* Metodo che si occupa di settare il campo dati lastBeaconsSeen con la PriorityQueue<MyBeacon> contenente gli ultimi beacon rilevati e di aggiornare tutti I listeners con le ultime istruzioni di navigazione
* @return  void
*/
@Override 
public void onReceive();

/**
* Metodo che permette di rimuovere un listener
* @param listener Listener che deve essere rimosso dalla lista di NavigationListener
* @return  void
*/
@Override 
public void removeBeaconListener(NavigationListener listener);

/**
* Metodo che setta il campo dati lastBeaconsSeen
* @param beacons Collection di beacon rilevati nell'area circostante
* @return  void
*/
@Override 
private void setVisibleBeacon(PriorityQueue<MyBeacon> beacons);

/**
* Metodo che permette di fermare il rilevamento dei dati ottenuti dalla bussola
* @return  void
*/
@Override 
public void startCompass();

/**
* Metodo che permette di avviare la navigazione verso uno specifico POI
* @return  ProcessedInformation
*/
@Override 
public ProcessedInformation startNavigation();

/**
* Metodo che permette di attivare il rilevamento dei dati dalla bussola
* @return  void
*/
@Override 
public void stopCompass();

/**
* Metodo che permette di fermare la navigazione
* @return  void
*/
@Override 
public void stopNavigation();

}


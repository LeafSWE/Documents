package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che si occupa di mostrare: informazioni relative all'edificio, categorie di POI presenti nell'edificio. La UI legata a questa classe permette all'utente di accedere alle sezioni principali dell'applicazione e alla lista dei POI che si trovano nelle vicinanze dell'utente
*/ 
public class HomeViewImp implements HomeView { 

/** 
* TextView all'interno della quale viene visualizzato l'indirizzo dell'edificio 
*/
private TextView buildingAddress;

/** 
* TextView all'interno della quale viene visualizzata la descrizione dell'edificio 
*/
private TextView buildingDescription;

/** 
* TextView all'interno della quale viene visualizzato il nome dell'edificio 
*/
private TextView buildingName;

/** 
* TextView all'interno della quale viene visualizzato l'orario di apertura dell'edificio 
*/
private TextView buildingOpeningHours;

/** 
* Permette di estrarre delle view dagli angoli dello schermo 
*/
private DrawerLayout drawer;

/** 
* Bottone che permette di trovare i POI intorno all'utente 
*/
private FloatingActionButton exploreButton;

/** 
* View che gestisce la navigazione 
*/
private NavigationView navigationView;

/** 
* View che si occupa di mostrare tutte le categorie dei POI 
*/
private ListView poiCategories;

/** 
* Presenter della View 
*/
private HomeActivity presenter;

/** 
* View che permette la ricerca delle destinazioni di navigazione 
*/
private SearchView searchView;

/** 
* Barra degli strumenti che permette la visualizzazione del menu 
*/
private Toolbar toolbar;

/**
* Costruttore della classe HomeViewImp
* @param presenter Presenter della View che viene creata
*/
public HomeViewImp(HomeActivity presenter);

/**
* Metodo utilizzato per visualizzare l'indirizzo di un edificio
* @param address Indirizzo dell'edificio
* @return  void
*/
@Override 
public void setBuildingAddress(String address);

/**
* Metodo utilizzato per visualizzare la descrizione di un edificio
* @param description Descrizione dell'edificio
* @return  void
*/
@Override 
public void setBuildingDescription(String description);

/**
* Metodo utilizzato per visualizzare il nome di un edificio
* @param name Nome dell'edificio
* @return  void
*/
@Override 
public void setBuildingName(String name);

/**
* Metodo utilizzato per visualizzare gli orari di apertura di un edificio
* @param hours Orari di apertura dell'edificio
* @return  void
*/
@Override 
public void setBuildingOpeningHours(String hours);

/**
* Metodo utilizzato per visualizzare la lista di categorie dei POI dell'edificio
* @param adapter Collegamento tra la lista delle categorie di POI dell'edificio e la view in cui esse devono essere mostrate
* @return  void
*/
@Override 
public void setPoiCategoryListAdapter(ListAdapter adapter);

}


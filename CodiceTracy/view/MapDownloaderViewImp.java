package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che si occupa di mostrare il progresso del download di una mappa.
*/ 
public class MapDownloaderViewImp implements MapDownloaderView { 

/** 
* Presenter della View 
*/
private MapDowloaderActivity presenter;

/**
* Costruttore della classe MapDownloaderViewImp
* @param presenter Presenter della View che viene creata
*/
public MapDownloaderViewImp(MapDowloaderActivity presenter);

/**
* Metodo utilizzato per visualizzare la mappa che si sta scaricando
* @param adp Collegamento tra la mappa che si sta scaricando e la view in cui essa deve essere mostrata
* @return  void
*/
@Override 
public void setDowloadingMap(Adapter adp);

/**
* Metodo utilizzato per visualizzare il progresso nel download di una mappa
* @param prg Attuale progresso del download
* @return  void
*/
@Override 
public void setProgressDowload(int prg);

}


package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che si occupa di mostrare una foto relativa ad un certo POI. La UI legata a questa classe permette all'utente di accedere a tutte le foto relative allo stesso POI
*/ 
public class ImageDetailViewImp implements ImageDetailView { 

/** 
* Manager del layout che permette di capovolgere la view 
*/
private ViewPager pager;

/** 
* Presenter della View 
*/
private ImageDetailActivity presenter;

/**
* Costruttore della classe ImageDetailViewImp
* @param presenter Presenter della View che viene creata
* @return  void
*/
public void ImageDetailViewImp(ImageDetailActivity presenter);

/**
* Metodo utilizzato per visualizzare una slideshow di immagini relative al POI da raggiungere
* @param adp Collegamento tra la lista delle immagini e la view in cui esse devono essere mostrate
* @return  void
*/
@Override 
public void setAdapter(Adapter adp);

}


package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che si occupa di mostrare la lista delle anteprime delle immagini relative ad un certo POI. La UI legata a questa classe permette all'utente di accedere alle immagini relative ad un certo POI
*/ 
public class ImageListFragmentViewImp implements ImageListFragmentView { 

/** 
* Lista delle anteprime delle foto 
*/
private ListView listViewImages;

/** 
* Presenter della View 
*/
private ImageListFragment presenter;

/**
* Costruttore della classe ImageListFragmentViewImp
* @param presenter Presenter della View che viene creata
*/
public ImageListFragmentViewImp(ImageListFragment presenter);

/**
* Metodo utilizzato per visualizzare la lista delle anteprime delle immagine relative ad un certo POI
* @param adp Collegamento tra la lista delle informazioni e la view in cui esse devono essere mostrate
* @return  void
*/
@Override 
public void setImageAdapter(Adapter adp);

}


package com.leaf.clips.presenter;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import android.support.v4.app.FragmentStatePagerAdapter(Android);

/** 
*Classe che estende FragmentStatePagerAdapter per la gestione dello slideshow delle immagini relative ad una certa istruzione di navigazione
*/ 
public class ImagePageAdapter { 

/** 
* Numero di elementi della slideshow 
*/
private int size;

/**
* Costruttore della classe ImagePageAdapter
* @param fm Interfaccia che serve per l'interazione con un Fragment
* @param size Numero di immagini passate
*/
public ImagePageAdapter(FragmentManager fm, int size);

/**
* Metodo che fornisce il numero di elementi all'interno dello slideshow
* @return  int
*/
public int getCount();

/**
* Metodo che permette di ottenere un'immagine all'intero dello slideshow
* @param position Intero che indica la posizione dell'immagine da recuperare all'interno dello slideshow
* @return  Fragment
*/
public Fragment getItem(int position);

}


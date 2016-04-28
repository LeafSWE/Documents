package com.leaf.clips.model.beacon;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import android.os.Binder;

/** 
*Classe definita per permettere la comunicazione tra processi (IPC), in questo caso permette di comunicare con i metodi pubblici definiti internamente ad una classe Service. Estende la classe android.os.Binder
*/ 
public class LocalBinder { 

/**
* Questo metodo restituisce il riferimento al Service BeaconManagerAdapter
* @return  BeaconManagerAdapter
*/
public BeaconManagerAdapter getService();

}


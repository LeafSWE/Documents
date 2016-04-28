package com.leaf.clips.presenter;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import android.bluetooth.BluetoothAdapter(Android);

/** 
*Classe che utilizza BluetoothAdapter e permette di effettuare controlli sullo stato del dispositivo e dell'applicativo
*/ 
public class Checker { 

/** 
* Utilizzato per accedere al Bluetooth del dispositivo 
*/
private BluetoothAdapter bluetoothAdapter;

/**
* Metodo che controlla se sono stati rilevati dei beacon
* @return  boolean
*/
public static boolean isBeaconDetected();

/**
* Metodo che controlla se è stato attivato il Bluetooth del dispositivo
* @return  boolean
*/
public static boolean isBluetoothEnabled();

/**
* Metodo che controlla se una mappa è presente sul database locale
* @return  boolean
*/
public static boolean isTheBuildingMapInLocalDB();

}


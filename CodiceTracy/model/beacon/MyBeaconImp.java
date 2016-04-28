package com.leaf.clips.model.beacon;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import org.altbeacon.beacon.Beacon;

/** 
*Classe che implementa l'interfaccia MyBeacon. Offre tutti i metodi per accedere alle informazioni di un beacon. Estende la classe org.altbeacon.beacon.Beacon
*/ 
public class MyBeaconImp implements MyBeacon { 

/** 
* Attributo richiesto per rendere la classe Parcelable 
*/
private final static List<NavigationInformationImp,Parcelable.Creator<MyBeaconImp> CREATOR;

/**
* Costruttore della classe
* @param beacon Questo parametro richiede un beacon
*/
public MyBeaconImp(Beacon beacon);

/**
* Metodo che ritorna il livello di batteria del beacon rilevato
* @return  long
*/
@Override 
public long getBatteryLevel();

/**
* Metodo che ritorna il codice rappresentante il tipo di beacon che è stato rilevato
* @return  int
*/
@Override 
public int getBeaconTypeCode();

/**
* Metodo che ritorna l'indirizzo Bluetooth del beacon
* @return  String
*/
@Override 
public String getBluetoothAddress();

/**
* Metodo che ritorna la distanza del beacon dal dispositivo che lo ha rilevato
* @return  double
*/
@Override 
public double getDistance();

/**
* Metodo che ritorna l'identificativo Major del beacon
* @return  int
*/
@Override 
public int getMajor();

/**
* Metodo che ritorna l'identificativo Minor del beacon
* @return  int
*/
@Override 
public int getMinor();

/**
* Metodo che ritorna la potenza ricevuta del segnale del beacon
* @return  int
*/
@Override 
public int getRssi();

/**
* Metodo che ritorna la potenza di trasmissione del beacon
* @return  int
*/
@Override 
public int getTxPower();

/**
* Metodo che ritorna l'identificativo UUID del beacon
* @return  String
*/
@Override 
public String getUUID();

/**
* Questo metodo permette di ricalcolare la distanza tra il beacon e il dispositivo
* @return  void
*/
public void recalculateDistance();

/**
* Questo metodo permette di fornire una conversione di MyBeaconImp a tipo String
* @return  String
*/
public String toString();

}


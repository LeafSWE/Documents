package com.leaf.clips.model.beacon;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Interfaccia che espone tutti i metodi che possono essere invocati su di un beacon gestito all'interno della nostra applicazione. Estende l'interfaccia java.io.Serializable
*/ 
public interface MyBeacon { 

/**
* Metodo che ritorna il livello di batteria del beacon rilevato
* @return  long
*/
 long getBatteryLevel();

/**
* Metodo che ritorna il codice rappresentante il tipo di beacon che è stato rilevato
* @return  int
*/
 int getBeaconTypeCode();

/**
* Metodo che ritorna l'indirizzo Bluetooth del beacon
* @return  String
*/
 String getBluetoothAddress();

/**
* Metodo che ritorna la distanza del beacon dal dispositivo che lo ha rilevato
* @return  double
*/
 double getDistance();

/**
* Metodo che ritorna l'identificativo Major del beacon
* @return  int
*/
 int getMajor();

/**
* Metodo che ritorna l'identificativo Minor del beacon
* @return  int
*/
 int getMinor();

/**
* Metodo che ritorna la potenza ricevuta del segnale del beacon
* @return  int
*/
 int getRssi();

/**
* Metodo che ritorna la potenza di trasmissione del beacon
* @return  int
*/
 int getTxPower();

/**
* Metodo che ritorna l'identificativo UUID del beacon
* @return  String
*/
 String getUUID();

}


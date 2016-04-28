package com.leaf.clips.model.beacon;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import org.altbeacon.beacon.distance.DistanceCalculator;

/** 
*Classe che implementa l'interfaccia org.altbeacon.beacon.distance.DistanceCaluclator
*/ 
public class MyDistanceCalculator { 

/**
* Questo metodo calcola la distanza di un beacon dal dispositivo
* @param i Questo parametro richiede la potenza del beacon di cui si vuole calcolare la distanza
* @param v Questo parametro richiede il valore rssi del beacon di cui si vuole calcolare la distanza
* @return  double
*/
public double calculateDistance(int i, double v);

}


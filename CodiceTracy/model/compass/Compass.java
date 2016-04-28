package com.leaf.clips.model.compass;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/** 
*Classe che si occupa di gestire i dati ricavabili dai sensori e calcolare l'orientamento del device
*/ 
public class Compass { 

/** 
* Sensore che misura l'accelerazione del device sui tre assi fisici 
*/
private Sensor accelerometer;

/** 
* variabile di guardia per accertarsi il reperimento di almeno un dato dall'accelerometro 
*/
private boolean lastAccelerometerSet;

/** 
* variabile di guardia per accertarsi il reperimento di almeno un dato dal magnetometro 
*/
private boolean lastMagnetometerSet;

/** 
* Sensore che misura il campo magnetico per i tre assi fisici 
*/
private Sensor magnetometer;

/** 
* gradi di orientamento sui tre assi fisici 
*/
private float[] orientation;

/** 
* matrice di rotazione ottenuta dai dati rilevati dai sensori 
*/
private float[] rotationMatrix;

/** 
* oggetto fornito dal sistema Android per ottenere le istanze dei sensori 
*/
private SensorManager sensorManager;

/**
* Costruttore della classe Compass
*/
public Compass();

/**
* Metodo che restituisce l'ultimo dato calcolato dai dati ricavati dai sensori che indica l'orientamento del dispositivo.
* @return  float
*/
public float getLastCoordinate();

/**
* Metodo che viene chiamato nel caso in cui l'accuratezza dei sensori è cambiata. Attualmente non viene utilizzato dall'applicativo
* @param sensor Riferimento al sensore che ha scatenato l'evento
* @param accuracy Nuova accuratezza impostata al sensore 
* @return  void
*/
@Override 
public void onAccuracyChanged(Sensor sensor, int accuracy);

/**
* Metodo invocato ad ogni evento generato dai sensori attivi di Compass. Fornisce quindi i dati misurati dal sensore e elaborandoli ne ricava l'orientamento del device
* @param event Rappresenta un evento scatenato da un sensore del dispositivo e detiene al suo interno tutti i dati rilevati da quel sensore
* @return  void
*/
@Override 
public void onSensorChanged(SensorEvent event);

/**
* Metodo che permette all'oggetto Compass di ricevere dati dai sensori e quindi accenderli
* @return  void
*/
public void registerListener();

/**
* Metodo che permette all'oggetto Compass di smettere di ricevere dati dai sensori e quindi spegnerli
* @return  void
*/
public void unregisterListener();

}


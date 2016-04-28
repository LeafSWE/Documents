package com.leaf.clips.model.navigator.graph.edge;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe astratta che rappresenta l'implementazione di base utilizzata per gli archi del grafo
*/ 
public abstract class AbsEnrichedEdge implements EnrichedEdge { 

/** 
* Angolo rispetto al Nord polare tra il punto di inizio dell'arco e il punto finale dell'arco 
*/
private final int coordinate;

/** 
* Lunghezza dell'arco 
*/
private final double distance;

/** 
* Punto di arrivo dell'arco 
*/
private final RegionOfInterest endROI;

/** 
* Identificativo numerico di un arco 
*/
private final int id;

/** 
* Informazioni associate ad un arco per il superamento dello stesso 
*/
private final NavigationInformation navInfo;

/** 
* Punto di partenza dell'arco 
*/
private final RegionOfInterest startROI;

/** 
* Preferenze dell'utente rispetto agli archi che prevedono un ascensore 
*/
private final int userElevatorPreference;

/** 
* Preferenze dell'utente rispetto agli archi che prevedono delle scale 
*/
protected final int userStairPreference;

/**
* Costruttore della classe AbsEnrichedEdge
* @param startROI Punto di partenza dell'arco
* @param endROI Punto di arrivo dell'arco
* @param distance Lunghezza dell'arco
* @param coordinate Angolo rispetto al Nord polare tra il punto di partenza dell'arco e il punto di arrivo dell'arco
* @param id Identificativo numerico dell'arco
* @param navInfo Informazioni associate ad un arco per il superamento dello stesso
*/
public AbsEnrichedEdge(RegionOfInterest startROI, RegionOfInterest endROI, double distance, int coordinate, int id, NavigationInformation navInfo);

/**
* Metodo astratto che ritorna le informazioni di base associate all'arco
* @return  String
*/
@Override 
public abstract String getBasicInformation();

/**
* Metodo che ritorna le coordinate di un arco
* @return  int
*/
@Override 
public int getCoordinate();

/**
* Metodo astratto che ritorna le informazioni di base associate all'arco
* @return  String
*/
@Override 
public abstract String getDetailedInformation();

/**
* Metodo che ritorna la lunghezza di un arco
* @return  double
*/
@Override 
public double getDistance();

/**
* Metodo che ritorna la RegionOfInterest di arrivo dell'arco
* @return  RegionOfInterest
*/
@Override 
public RegionOfInterest getEndPoint();

/**
* Metodo che ritorna l'identificativo numerico associato all'oggetto AbsEnrichedEdge
* @return  int
*/
@Override 
public int getId();

/**
* Metodo che ritorna le informazioni di navigazione associate ad un arco
* @return  NavigationInformation
*/
protected NavigationInformation getNavigationInformation();

/**
* Metodo che ritorna la un oggetto PhotoInformation contente un riferimento alle fotografie associate all'arco
* @return  PhotoInformation
*/
@Override 
public PhotoInformation getPhotoInformation();

/**
* Metodo che ritorna la RegionOfInterest di partenza dell'arco
* @return  RegionOfInterest
*/
@Override 
public RegionOfInterest getStarterPoint();

/**
* Metodo astratto che ritorna il peso dell'arco
* @return  int
*/
@Override 
public abstract int getWeight();

/**
* Metodo che permette di impostare le preferenze di un utente per il calcolo del peso dell'arco
* @param setting Preferenze da impostare
* @return  void
*/
public static void setUserPreference(Setting setting);

}


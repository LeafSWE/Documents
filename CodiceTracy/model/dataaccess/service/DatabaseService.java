package com.leaf.clips.model.dataaccess.service;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Interfaccia che espone tutti i metodi per l'accesso alle mappe contenute nel database locale o remoto
*/ 
public interface DatabaseService { 

/**
* Metodo per cancellare una mappa a partire dall'identificativo di un edificio
* @param id Identificativo numerico di un oggetto BuildingMap
* @return  void
*/
 void deleteBuilding(int id);

/**
* Metodo che ritorna la lista di tutti gli oggetti BuildingTable presenti nel database locale
* @return  Collection<BuildingTable>
*/
 Collection<BuildingTable> findAllBuildings();

/**
* Metodo che ritorna la lista di tutti gli oggetti BuildingTable presenti nel database remoto
* @return  Collection<BuildingTable>
*/
 Collection<BuildingTable> findAllRemoteBuildings();

/**
* Metodo per il recupero di un oggetto BuildingMap da un database locale o remoto tramite l'identificativo Major uguale in tutti i beacon presenti in uno stesso edificio
* @param major Identificativo major uguale per tutti i beacon presenti in uno stesso edificio
* @return  BuildingMap
*/
 BuildingMap findBuildingByMajor(int major);

/**
* Metodo per effettuare il download di una mappa dal database remoto a partire dall'identificativo major uguale per tutti i beacon presenti in un certo edificio
* @param major Identificativo major uguale per tutti i beacon presenti in uno stesso edificio
* @return  BuildingMap
*/
 BuildingMap findRemoteBuildingByMajor(int major);

/**
* Metodo per verificare la presenza di una mappa di un edificio nel database locale
* @param major Major dell'edificio
* @return  boolean
*/
 boolean isBuildingMapPresent(int major);

/**
* Metodo per verificare se la mappa di un edificio è aggiornata all'ultima versione
* @param major Major dell'edificio
* @return  boolean
*/
 boolean isBuildingMapUpdated(int major);

/**
* Metodo per aggiornare la mappa di un edificio all'ultima versione disponibile
* @param major Major dell'edificio
* @return  void
*/
 void updateBuildingMap(int major);

}


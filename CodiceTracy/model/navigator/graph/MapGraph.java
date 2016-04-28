package com.leaf.clips.model.navigator.graph;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che rappresenta un grafo da utilizzare per il calcolo del percorso di navigazione
*/ 
public class MapGraph { 

/** 
* Rappresentazione a grafo dell'edificio 
*/
private SimpleDirectedWeightedGraph<RegionOfInterest,EnrichedEdge> graph;

/**
* Metodo che permette di aggiungere più archi al grafo che rappresenta l'edificio
* @param edges Archi da aggiungere al grafo che rappresenta l'edificio
* @return  void
*/
public void addAllEdges(Collection<EnrichedEdge> edges);

/**
* Metodo che permette di aggiungere più RegionOfInterest al grafo che rappresenta l'edificio
* @param regions Collezione di RegionOfInterest da aggiungere al grafo che rappresenta l'edificio
* @return  void
*/
public void addAllRegions(Collection<RegionOfInterest> regions);

/**
* Metodo che permette di aggiungere un arco al grafo che rappresenta l'edificio
* @param edge Arco da aggiungere al grafo che rappresenta l'edificio
* @return  void
*/
public void addEdge(EnrichedEdge edge);

/**
* Metodo che permette di aggiungere una RegionOfInterest al grafo che rappresenta l'edificio
* @param roi RegionOfInterest da aggiungere al grafo che rappresenta l'edificio
* @return  void
*/
public void addRegionOfInterest(RegionOfInterest roi);

/**
* Metodo che
* @return  SimpleDirectedWeightedGraph<RegionOfInterest,EnrichedEdge>
*/
public SimpleDirectedWeightedGraph<RegionOfInterest,EnrichedEdge> getGraph();

}


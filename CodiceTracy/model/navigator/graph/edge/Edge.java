package com.leaf.clips.model.navigator.graph.edge;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Interfaccia che serve per descrivere le funzionalità di un arco di un grafo
*/ 
public interface Edge { 

/**
* Metodo che restituisce il Vertex di arrivo dell'arco
* @return  Vertex
*/
 Vertex getEndPoint();

/**
* Metodo che ritorna l'identificativo numerico dell'arco
* @return  int
*/
 int getId();

/**
* Metodo che restituisce il Vertex di partenza dell'arco
* @return  Vertex
*/
 Vertex getStarterPoint();

/**
* Metodo che ritorna il peso dell'arco
* @return  int
*/
 int getWeight();

}


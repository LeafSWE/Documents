package com.leaf.clips.model.navigator.graph.vertex;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe rappresentante il vertice (o nodo) di un grafo
*/ 
public class VertexImp implements Vertex { 

/** 
* Identificativo numerico di un VertexImp 
*/
private final int id;

/**
* Costruttore della classe VertexImp
* @param id Identificativo numerico di un oggetto VertexImp
*/
public VertexImp(int  id);

/**
* Metodo che ritorna l'identificativo numerico associato all'oggetto VertexImp
* @return  int
*/
@Override 
public int getId();

}


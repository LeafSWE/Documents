package com.leaf.clips.view;
/**
* @author
* @version 0.00 
* @since 0.00
* 
* 
*/

/** 
*Classe che si occupa di mostrare i campi utili all'inserimento del codice sviluppatore

*/ 
public class DeveloperUnlockerViewImp implements DeveloperUnlockerView { 

/** 
* Bottone per confermare l'inserimento del codice sviluppatore 
*/
private Button btnInsertCode;

/** 
* EditText in cui è possibile inserire il codice sviluppatore 
*/
private EditText plainTxtCode;

/** 
* Presenter della View 
*/
private DeveloperUnlockerActivity presenter;

/** 
* TextView all'interno della quale viene visualizzato un suggerimento per l'inserimento del codice sviluppatore 
*/
private TextView txtInsertCode;

/**
* Costruttore della classe DeveloperUnlockerViewImp
* @param presenter Presenter della View che viene creata
*/
public DeveloperUnlockerViewImp(DeveloperUnlokerActivity presenter);

/**
* Metodo utilizzato per visualizzare un errore relativo all'errato inserimento del codice sviluppatore
* @return  void
*/
@Override 
public void showWrongCode();

}


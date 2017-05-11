/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja_8;

/**
 *
 * @author Juan Pablo Merck
 */
public class WordSetFactory {
    // Metodo que genera un objeto que implementa WordSet
	// parametro tipo: 1 = SimpleSet
	//                         2 = implementado con Red black tree
	//                         3 = implementado con Splay Tree
	//                         4 = implementado con Hash Table
	//                         5 = implementado con TreeMap (de Java Collection Framework)
	
	public static WordSet generateSet(int tipo)
	{
	    if (tipo == 1)
		    return new SimpleSet();
		else
		    // aqui se regresara el set empleando sus implementaciones:
            if (tipo == 2) 
                    return new RedBlackTree(); 
                else
            if (tipo == 3)
                    return new SplayTree(); 
            if (tipo == 4) 
                    return new hash(); 
            if (tipo == 5) 
                    return (WordSet) new tree(); 
            else return null; // modificarlo para que regrese la implementacion seleccionada
	}
	
}

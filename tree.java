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
import java.util.TreeMap;
public class tree {
    TreeMap tree = new TreeMap();
    
    public void add(Word wordObject)
    {
        tree.put(wordObject, wordObject);
    }
    public Word get(Word word)
    {
         Object valor = tree.get(word);
         return (Word) valor;
        
    }
}

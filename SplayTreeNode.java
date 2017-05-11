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
public class SplayTreeNode {
    SplayTreeNode left, right, parent;
     Word element;
 
     /** Constructor **/
     public SplayTreeNode()
     {
         this(0, null, null, null);
     }          
     /** Constructor **/
     public SplayTreeNode(Word ele)
     {
         this(ele, null, null, null);
     } 
     /** Constructor **/
     public SplayTreeNode(Word ele, SplayTreeNode left, SplayTreeNode right, SplayTreeNode parent)
     {
         this.left = left;
         this.right = right;
         this.parent = parent;
         this.element = ele;         
     }    

    private SplayTreeNode(int i, Object object, Object object0, Object object1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

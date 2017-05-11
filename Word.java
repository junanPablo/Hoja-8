/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja_8;

import java.util.Objects;

/**
 *
 * @author Juan Pablo Merck
 */
public class Word implements Comparable<Word>{
    private String word;
    private String type;

    // Constructor, inicializa la palabra con su tipo
    public Word(String word, String type)
    {
            this.word=word;
            this.type=type;
    }

    public Word()
    {
            this.word= "";
            this.type="";
    }

    // Comparadores, solo importa comparar la palabra, no el tipo.
    @Override
    public int compareTo(Word o)
    {
            return this.word.compareTo(o.getWord());
    }

    @Override
    public boolean equals(Object obj)
    {
            return (obj instanceof Word && getWord().equals(((Word)obj).getWord()));
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.word);
        hash = 71 * hash + Objects.hashCode(this.type);
        return hash;
    }

    // Métodos de acceso..
    public void setWord(String word)
    {
            this.word=word;
    }
    public void setType(String type)
    {
            this.type=type;
    }
    public String getWord()
    {
            return word;
    }

    public String getType()
    {
            return type;
    }
    
}

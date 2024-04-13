package org.example;

import java.util.Iterator;

public class IteratorInterface implements Iterator<String> {
    String [] scores ;
    public int currIndex;
    public IteratorInterface(String [] scores){
        this.scores = scores;
    }




    @Override
    public boolean hasNext() {
        return currIndex < scores.length;
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("No more elements to iterate");
        }
        String nextElement = scores[currIndex];
        currIndex++;
        return nextElement;
    }

    public static void main(String[] args) {
        String [] scores = {"one", "two", "three", "four" , "five" , "six"};
       IteratorInterface iter = new IteratorInterface(scores);
       while(iter.hasNext()){
           System.out.println(iter.next());
       }
    }
}

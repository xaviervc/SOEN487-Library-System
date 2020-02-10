/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soen487.library.system;
import java.util.concurrent.ConcurrentHashMap;
import soen487.library.core.Book;

/**
 *
 * @author Xavier Vani-Charron
 */
public class Library {
    
    private ConcurrentHashMap bookList = null;
    private Book book = null;

    public Library(){
        if(bookList == null){
            bookList = new ConcurrentHashMap();
        }
    }
    
    public Library(ConcurrentHashMap bookList) {
        this.bookList = bookList;
    }
    
    public void createBook(){
        
    }
    
    public void addBook(){
        
    }
    
    private void incrementId(){
        
    }
}

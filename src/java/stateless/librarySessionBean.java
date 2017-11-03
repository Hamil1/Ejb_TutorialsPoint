/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stateless;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author hamil
 */
@Stateless
public class librarySessionBean implements librarySessionBeanRemote {

    List<String> bookShelf;
    public librarySessionBean(){
        bookShelf = new ArrayList<String>();
    }
    public void addBook(String bookName) {
        bookShelf.add(bookName);
    }

    
    public List getBooks() {
        return bookShelf;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}

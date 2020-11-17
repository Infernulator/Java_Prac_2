/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Author;

/**
 *
 * @author user
 */
public class TestAutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Author a1 = new Author("Иван", "ivan@mail.hj", 'M');
       System.out.println(a1);
       a1.setEmail("ivanov@email.bk");
       System.out.println(a1);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ball;

/**
 *
 * @author user
 */
public class TestBall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
    }
}

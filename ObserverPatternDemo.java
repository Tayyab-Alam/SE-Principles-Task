/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_pattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        HexaObserver hexObserver = new HexaObserver(subject);
        OctalObserver octObserver = new OctalObserver(subject);
        BinaryObserver binObserver = new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);

        System.out.println("Removing HexaObserver...");
        subject.detach(hexObserver);

        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}

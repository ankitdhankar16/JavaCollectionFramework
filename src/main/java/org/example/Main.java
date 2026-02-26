package org.example;

import List1.ArrayList1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    static void main() {
        ArrayList1 l1 = new ArrayList1();
        l1.viewList();
        System.out.println("Element at index 4 is "+ l1.get(4));
    }
}

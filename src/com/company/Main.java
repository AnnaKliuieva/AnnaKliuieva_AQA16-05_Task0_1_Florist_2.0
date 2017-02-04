package com.company;

public class Main {

    public static void main(String[] args) {

        Bouquet bouquet1 = new Bouquet();
        Rose rose1 = new Rose(2, 30);
        Rose rose2 = new Rose(1, 45);
        Rose rose3 = new Rose( 3, 40);
        Rose rose = new Rose( 3,58);
        Lily lily1 = new Lily(3, 40);
        Lily lily2 = new Lily(1, 40);
        Alstroemeria alstroemeria1 = new Alstroemeria(3, 45);
        Alstroemeria alstroemeria2 = new Alstroemeria(1, 45);
        Paper paper = new Paper( 1.5);
        Tape tape = new Tape( 1);
        bouquet1.addComponents(rose1);
        bouquet1.addComponents(rose1);
        bouquet1.addComponents(rose2);
        bouquet1.addComponents(lily2);
        bouquet1.addComponents(lily2);
        bouquet1.addComponents(alstroemeria2);
        bouquet1.addComponents(alstroemeria2);
        bouquet1.addComponents(paper);
        bouquet1.addComponents(tape);
        System.out.println("Стоимость букета составляет " + bouquet1.bouquetCost() + " грн.");
        bouquet1.showFlowersByStemLength(40,45);
        bouquet1.sortFlowersByFreshnessLevel();
        System.out.println("Цветы в букете по степени свежести: ");
        System.out.println(bouquet1);

    }
}

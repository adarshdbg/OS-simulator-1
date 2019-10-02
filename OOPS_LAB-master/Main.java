package com.company;

public class Main {

    public static void main(String[] args)
    {
        Leaf aLeaf = new Leaf();
        Page aPage = new Page();
        Pancake aCake = new Pancake();
        aLeaf.turn();
        aPage.turn();
        aCake.turn();
    }

    public static class Pancake implements Turning
    {
        public void turn()
        {
            System.out.println("Flipping.");
        }
    }
}

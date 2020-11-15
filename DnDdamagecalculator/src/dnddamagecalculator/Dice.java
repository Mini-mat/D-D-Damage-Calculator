package dnddamagecalculator;

import java.util.Random;

/**
 *
 * @author Minimat
 */
public class Dice {
    //Adding random number generation
    Random rng = new Random();
    
    
    //Creating dice attributes
    private int d4 = rng.nextInt(4)+1;
    private int d6 = rng.nextInt(6)+1;
    private int d8 = rng.nextInt(8)+1;
    private int d10 = rng.nextInt(10)+1;
    private int d12 = rng.nextInt(12)+1;
    private int d20 = rng.nextInt(20)+1;

    //Adding getters

    public int getD4() {
        return d4;
    }

    public int getD6() {
        return d6;
    }

    public int getD8() {
        return d8;
    }

    public int getD10() {
        return d10;
    }

    public int getD12() {
        return d12;
    }

    public int getD20() {
        return d20;
    }
    
    
}

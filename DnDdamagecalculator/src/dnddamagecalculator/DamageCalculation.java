package dnddamagecalculator;

import static java.lang.Math.round;



/**
 *
 * @author Minimat
 */
public class DamageCalculation {
    //Creates dice object
    Dice die = new Dice();
        
    //Attack bonus
    private int attackBonus;
    
    //Crit
    private int critical;
    
    //Advantage
    private String advantage;
    
    //Damage
    private int damageDice;
    
    
    //Damage calculation code
    public String calcDamage(){
        int ac;
        float avgDamage = 0;
        float avgCalculator = 0;
        for (ac = 10;ac <= 32; ac++){     
            for (int i = 1; i <=2000000; i++){
                int natScore = die.getD20();
                int attackScore = natScore + this.getAttackBonus();
                if (natScore >= this.getCritical()){
                    avgCalculator += this.getDamageDice();
                    avgCalculator += this.getDamageDice();
                } else if (attackScore >= ac && natScore != 1) {
                    avgCalculator += this.getDamageDice();
                }
            avgDamage = round(avgCalculator / 2000000);
            }
        }
        String returnVariable = "Average damage for AC " + ac + ":" + avgDamage;
        return returnVariable;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public int getCritical() {
        return critical;
    }

    public String getAdvantage() {
        return advantage;
    }

    public int getDamageDice() {
        return damageDice;
    }
    
    
}

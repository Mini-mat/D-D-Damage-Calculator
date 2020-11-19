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
    private int damageBonus;
    
    
    //damage calculation code switch statement version
    public String calcDamageSwitch(){
        int ac;
        float avgDamage = 0;
        float avgCalculator = 0;
        String returnString = "";
        switch(this.getAdvantage()) {
            case "Normal":
                    for (ac = 10;ac <= 32; ac++){     
                        for (int i = 1; i <=2000000; i++){
                            int natScore = die.getD20();
                            int attackScore = natScore + this.getAttackBonus();
                                if (natScore >= this.getCritical()){
                                    avgCalculator += this.getDamageDice();
                                    avgCalculator += this.getDamageDice();
                                    avgCalculator += this.getDamageBonus();
                                } else if (attackScore >= ac && natScore != 1) {
                                    avgCalculator += this.getDamageDice();
                                    avgCalculator += this.getDamageBonus();
                                }
                        avgDamage = round(avgCalculator / 2000000);
                        }
                    returnString += "Average damage for AC " + ac + ": " + avgDamage + System.lineSeparator();
                    }
                    break;
                    
            case "Advantage":
                for (ac = 10;ac <= 32; ac++){     
                        for (int i = 1; i <=2000000; i++){
                            int natScore = Math.max(die.getD20(), die.getD20());
                            int attackScore = natScore + this.getAttackBonus();
                                if (natScore >= this.getCritical()){
                                    avgCalculator += this.getDamageDice();
                                    avgCalculator += this.getDamageDice();
                                    avgCalculator += this.getDamageBonus();
                                } else if (attackScore >= ac && natScore != 1) {
                                    avgCalculator += this.getDamageDice();
                                    avgCalculator += this.getDamageBonus();
                                }
                        avgDamage = round(avgCalculator / 2000000);
                        }
                        returnString += "Average damage for AC " + ac + ": " + avgDamage + System.lineSeparator();
                    }
                    break;
            
            case "Disavantage":
                for (ac = 10;ac <= 32; ac++){     
                        for (int i = 1; i <=2000000; i++){
                            int natScore = Math.min(die.getD20(), die.getD20());
                            int attackScore = natScore + this.getAttackBonus();
                                if (natScore >= this.getCritical()){
                                    avgCalculator += this.getDamageDice();
                                    avgCalculator += this.getDamageDice();
                                    avgCalculator += this.getDamageBonus();
                                } else if (attackScore >= ac && natScore != 1) {
                                    avgCalculator += this.getDamageDice();
                                    avgCalculator += this.getDamageBonus();
                                }
                        avgDamage = round(avgCalculator / 2000000);
                        }
                        returnString += "Average damage for AC " + ac + ": " + avgDamage + System.lineSeparator();
                    }
                    break;
                    
            case "Elven Accuracy":
                for (ac = 10;ac <= 32; ac++){     
                            for (int i = 1; i <=2000000; i++){
                                int natScore = Math.max(die.getD20(), Math.max(die.getD20(), die.getD20()));
                                int attackScore = natScore + this.getAttackBonus();
                                    if (natScore >= this.getCritical()){
                                        avgCalculator += this.getDamageDice();
                                        avgCalculator += this.getDamageDice();
                                        avgCalculator += this.getDamageBonus();
                                    } else if (attackScore >= ac && natScore != 1) {
                                        avgCalculator += this.getDamageDice();
                                        avgCalculator += this.getDamageBonus();
                                    }
                            avgDamage = round(avgCalculator / 2000000);
                            }
                            returnString += "Average damage for AC " + ac + ": " + avgDamage + System.lineSeparator();
                        }
                        break;
            
        }
        return returnString;
    }

    public int getAttackBonus(){
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

    public int getDamageBonus() {
        return damageBonus;
    }

    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    public void setCritical(int critical) {
        this.critical = critical;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage;
    }

    public void setDamageDice(int damageDice) {
        this.damageDice = damageDice;
    }

    public void setDamageBonus(int damageBonus) {
        this.damageBonus = damageBonus;
    }
    
    
    
}

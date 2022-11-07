
/**
 * Write a description of class Dice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dice extends Die6
{
    private Die6 die;
    private Die6 die1;
    
    public Dice() {
        die = new Die6();
        die1 = new Die6();
        this.roll();
    }
    
    public int getValue() {
        return this.die.getValue() + this.die1.getValue();
    }
    
    public int getValue(int diceNumber) {
        if (diceNumber == 1) {
            return this.die.getValue();
        } else if (diceNumber == 2) {
            return this.die1.getValue();
        } else {
            return 0;
        }
    }
    
    public void roll() {
                
    }
    
    public int rollAndGetValue() {
        roll();
        return getValue();
    }
}

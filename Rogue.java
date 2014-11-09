public class Rogue extends Adventurer{
    private int stamina;
    public int getStamina(){
	return this.stamina;
    }
    public void setStamina(int energy){
	this.stamina = energy;
    }
    public Rogue(String namae,int health,int energy){
	super(namae,health);
	this.stamina = energy;
    }
    public Rogue(String namae,int health){
	this(namae,health,10);
    }
    public Rogue(String namae){
	this(namae,20,10);
    }
    public Rogue(){
	this("Marthus",20,10);
    }
    public void attack(Adventurer other){
	System.out.println(this+" Stabbed "+other+" with "+this.getWeapon());
    }
    public void specialAttack(Adventurer other){
	System.out.println(this+" dodged an attack from "+other);
    }
	public void getStats(){
	super.getStats();
	System.out.println("Stamina: "+stamina);
}
}

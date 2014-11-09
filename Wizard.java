public class Wizard extends Adventurer{
    private int mana;
    public int getMana(){
	return this.mana;
    }
    public void setMana(int mp){
	this.mana = mp;
    }
    public Wizard(String namae,int health,int mp){
	super(namae,health);
	this.setMana(mp);
    }
    public Wizard(String namae,int health){
	this(namae,health,10);
    }
    public Wizard(String namae){
	this(namae,20,10);
    }
    public Wizard(){
	this("merlin",20,10);
    }
    public void specialAttack(Adventurer other){
	System.out.println(this+" exploded "+other);
    }
	public void getStats(){
	super.getStats();
	System.out.println("Mana: "+mana);
}
}

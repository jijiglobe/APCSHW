public class Warrior extends Adventurer{
    private int rage;
    public void setRage(int fury){
	this.rage = fury;
    }
    public int getRage(){
	return this.rage;
    }
    public Warrior(String namae,int health,int fury){
	super(namae,health);
	this.setRage(fury);
    }
    public Warrior(String namae,int health){
	this(namae,health,10);
    }
    public Warrior(String namae){
	this(namae,20,10);
    }
    public Warrior(){
	this("Garrosh",20,10);
    }
    public void attack(Adventurer other){
	System.out.println(this+" cut "+other+"  with "+this.getWeapon());
    }
    public void specialAttack(Adventurer other){
	System.out.println(this+" blocked an attack from "+other);
    }
	public void getStats(){
	super.getStats();
	System.out.println("Rage: "+rage);
}
}

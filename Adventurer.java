import java.util.Random;
public class Adventurer{
    private String weapon,name;
    private int INT,DEX,ATK,HP,XP;

    public void setName(String namae){
	this.name = namae;
    }
    public void setHP(int health){
	this.HP = health;
    }
    public String getName(){
	return this.name;
    }
    public int getHP(){
	return HP;
    }
    public String getWeapon(){
	return this.weapon;
    }
    public void setWeapon(String equip){
	this.weapon = equip;
    }
    // public void setXP(int 
    public Adventurer(){
	this("Lester",20);
    }
    public Adventurer(String namae){
	this(namae,20);
    }
    public Adventurer(String namae, int HP){
	this.name = namae;
	this.setHP(20);
	this.weapon = "a stick";
	this.DEX = 10;
	this.ATK = 10;
	this.INT = 10;
    }
    public int getDex(){
	return DEX;
    }
    public int getInt(){
	return INT;
    }
    public int getAtk(){
	return ATK;
    }
    public void setDex(int dex){
	DEX = dex;
    }
    public void setAtk(int atk){
	ATK = atk;
    }
    public void setInt(int Int){
	INT = Int;
    }
    public String toString(){
	return this.name;
    }
    public void attack(Adventurer other){
	System.out.println(this+" poked "+other+" with "+this.getWeapon());
    }
    public void specialAttack(Adventurer other){
	System.out.println(this+" threw a rock at "+other);
    }
    Random random = new Random();
    public boolean hit(Adventurer other){
	return random.nextInt(100)<(50 + (DEX - other.getDex()));
    }
    public void getStats(){
	String ans = "";
	ans += "Name: " + name+"\n";
	ans += "HP: " + HP+"\n";                                            
	ans += "XP: " + XP+"\n";                                            
	ans += "Atk: " + ATK+"\n";                                            
	ans += "Dex: " + DEX+"\n";
	ans += "int: " + INT;                                            
	System.out.println(ans);    
	
	
    }
}

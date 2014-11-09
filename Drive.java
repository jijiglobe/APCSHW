public class Drive{
    public static void main(String[]args){
	Wizard p1 = new Wizard("Julian");
	Warrior p2 = new Warrior("Colin");
	Rogue p3 = new Rogue("Aidan");
	Adventurer p4 = new Adventurer("Ian");
	p1.setDex(50);
	/*p1.setWeapon("a morellonomicon");
	p2.setWeapon("a shuriken");
	p3.setWeapon("a phone");
	p4.setWeapon("a pencil");
	p1.attack(p2);
	p2.attack(p3);
	p3.attack(p4);
	p4.attack(p1);
*/
	p1.getStats();
	p2.getStats();
	p3.getStats();
	p4.getStats();
    }
}

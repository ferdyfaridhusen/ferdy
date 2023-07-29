package inheritance_overriding;

class Hero{
	// attribute
	String name;
	double attackPower, health;

	// constructor
	Hero(String nameInput, double attackInput, double healthInput){
		this.name = nameInput;
		this.attackPower = attackInput;
		this.health = healthInput;
	}

	// method attack
	void attack(Hero enemy){
		System.out.println("\n" + this.name + " attack " + enemy.name);
		enemy.takeDamage(this.attackPower);
	}

	void takeDamage(double damage){
		System.out.println(this.name + " receive damage " + damage);
		this.health = this.health - damage;
	}

	void display(){
		System.out.println("\nName: " + this.name);
		System.out.println("Health: " + this.health);
		System.out.println("Power: " + this.attackPower);
	}

}

class HeroMage extends Hero{
	String type = "Mage";
	double magicDamage;

	// subclass constructor
	HeroMage(String nameInput, double attackInput, double healthInput, double magicDamage){
		super(nameInput, attackInput, healthInput);
		this.magicDamage = magicDamage;
	}
	
	@Override
	void display(){
		super.display();
		System.out.println("magic damage: " + this.magicDamage);
		System.out.println("Type : " + this.type);
	}

	@Override
	void takeDamage(double damage){
		System.out.println(this.name + " receive half damage " + damage + " -> " + 0.5*damage);
		this.health = this.health - 0.5*damage;
	}
}

public class App {
	public static void main(String[] args) {
		Hero hero1 = new Hero("lalapu",10,100);
		HeroMage hero2 = new HeroMage("nana", 20, 100, 10);

		hero1.display();
		hero2.display();

		hero1.attack(hero2);
		// hero2.attack(hero1);

		// hero1.display();
		// hero2.display();
	}
}
public class Items {

	String name;
	String itemdescription;
	String inventoryitemdescription;
	int weight;
	int attackPower;
	
public Items(String s, String i, String id, int w, int a) {
		name= s;
		itemdescription= i;
		inventoryitemdescription= id;
		weight = w;
		attackPower = a;
	}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getItemdescription() {
	return itemdescription;
}

public void setItemdescription(String itemdescription) {
	this.itemdescription = itemdescription;
}

public String getInventoryitemdescription() {
	return inventoryitemdescription;
}

public void setInventoryitemdescription(String inventoryitemdescription) {
	this.inventoryitemdescription = inventoryitemdescription;
}

public int getWeight() {
	return weight;
}

public void setWeight(int weight) {
	this.weight = weight;
}

public int getAttackPower() {
	return attackPower;
}

public void setAttackPower(int attackPower) {
	this.attackPower = attackPower;
}








}

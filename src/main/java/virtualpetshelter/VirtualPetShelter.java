package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private Map<String, VirtualPet> shelter = new HashMap<>();

	public void admitPet(VirtualPet newPet) {
		shelter.put(newPet.getName(), newPet);
	}

	public VirtualPet findPet(String petName) {
		return shelter.get(petName);
	}

	public Collection<VirtualPet> petList() {
		return shelter.values();
	}

	public void adoptPet(String petName) {
		shelter.remove(petName);
	}

	public void feedAllPets() {
		for (VirtualPet pets : shelter.values()) {
			pets.feedPet();
		}
	}

	public int getPetHungerLevel(String petName) {
		for (VirtualPet pets : shelter.values()) {
			if (pets.getName().equals(petName)) {
				return pets.getHunger();
			}
		}
		return -1;
	}

	public void waterAllPets() {
		for (VirtualPet pets : shelter.values()) {
			pets.waterPet();
		}
	}

	public int getPetThirstLevel(String petName) {
		for (VirtualPet pets : shelter.values()) {
			if (pets.getName().equals(petName)) {
				return pets.getThirst();
			}
		}
		return -1;
	}

	public void playWithAllPets() {
		for (VirtualPet pets : shelter.values()) {
			pets.playWithPet();
		}
	}

	public void playWithOnePet(String petName) {
		for (VirtualPet pets : shelter.values()) {
			if (pets.getName().equals(petName)) {
				pets.playWithPet();
			}
		}
	}

	public int getPetBoredomLevel(String petName) {
		for (VirtualPet pets : shelter.values()) {
			if (pets.getName().equals(petName)) {
				return pets.getBoredom();
			}
		}
		return -1;
	}

	public void tickAllPets() {
		for (VirtualPet pets : shelter.values()) {
			pets.tick();
		}
	}

	public String getPetToString(String petName) {
		for (VirtualPet pets : shelter.values()) {
			if (pets.getName().equals(petName)) {
				return pets.toString();
			}
		}
		return "";
	}
}

package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private Map<String, VirtualPet> shelter = new HashMap<>();
	
	public void admitPet(VirtualPet newPet) {
		shelter.put(newPet.getName(), newPet);

	}

	public Collection<VirtualPet> petList() {
		return shelter.values();
	}

}

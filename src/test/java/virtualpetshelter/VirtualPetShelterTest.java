package virtualpetshelter;

import java.util.Collection;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class VirtualPetShelterTest {
	
	private VirtualPetShelter underTest;
	
	private VirtualPet newPet;
	
	@Test
	public void shouldAddPetToShelter() {
		underTest = new VirtualPetShelter();
		VirtualPet newPet = new VirtualPet("", "", 0, 0, 0);
		underTest.admitPet(newPet);
		Collection<VirtualPet> check = underTest.petList();
		assertThat(check, contains(newPet));
	}
	
	
}

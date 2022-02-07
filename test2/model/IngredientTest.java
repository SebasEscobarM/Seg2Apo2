package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exception.NegativeNumberException;

class IngredientTest {
	//Instancias
	private Ingredient ingr1;
	//Escenarios
	public void setupStage1() {
		ingr1=new Ingredient("Tomate",245);
	}

	@Test
	void addWeightTest() {
		setupStage1();
		try {
			ingr1.addWeight(54);
		} catch (NegativeNumberException e) {
			System.out.println(e.getMessage());
		}
		
		//Asserts
		assertEquals(ingr1.getWeight(), 299);
	}
	
	@Test
	void addWeightExceptionTest() {
		setupStage1();
		boolean exceptionIsThrown=false;
		try {
			ingr1.addWeight(-100);
		} catch (NegativeNumberException e) {
			exceptionIsThrown=true;
			System.out.println(e.getMessage());
		}
		
		//Asserts
		assertTrue(exceptionIsThrown);
	}
	
	@Test
	void removeWeightTest() {
		setupStage1();
		try {
			ingr1.removeWeight(45);
		} catch (NegativeNumberException e) {
			System.out.println(e.getMessage());
		}
		
		//Asserts
		assertEquals(ingr1.getWeight(), 200);
	}
	
	@Test
	void removeWeightExceptionTest() {
		setupStage1();
		boolean exceptionIsThrown=false;
		try {
			ingr1.removeWeight(-100);
		} catch (NegativeNumberException e) {
			exceptionIsThrown=true;
			System.out.println(e.getMessage());
		}
		
		//Asserts
		assertTrue(exceptionIsThrown);
	}
}

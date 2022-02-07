package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecipeTest {
	
	private Recipe recipe1;
	//Escenarios
	public void setupStage1() {
		recipe1=new Recipe();
	}
	
	public void setupStage2() {
		recipe1=new Recipe();
		recipe1.addIngredient("Cebolla", 315);
		recipe1.addIngredient("Ajo", 58);
		recipe1.addIngredient("Arroz", 520);
	}
	@Test
	void addIngredientTest() {
		setupStage1();
		String n="Sal";
		double w=12;
		recipe1.addIngredient(n, w);
		//Asserts
		assertEquals(recipe1.getIngredients().size(), 1);
		assertEquals(recipe1.getIngredients().get(0).getName(),n);
		assertEquals(recipe1.getIngredients().get(0).getWeight(),w);
	}
	
	@Test
	void addIngredientTest2() {
		setupStage2();
		String n="Pimienta";
		double w=6;
		recipe1.addIngredient(n, w);
		//Asserts
		assertEquals(recipe1.getIngredients().size(), 4);
		assertEquals(recipe1.getIngredients().get(3).getName(),n);
		assertEquals(recipe1.getIngredients().get(3).getWeight(),w);
	}
	
	@Test
	void addSameIngredientTest() {
		setupStage2();
		String n="Ajo";
		double w=21;
		recipe1.addIngredient(n, w);
		//Asserts
		assertEquals(recipe1.getIngredients().size(), 3);
		//El ajo ahora debe pesar 79
		assertEquals(recipe1.getIngredients().get(1).getName(),n);
		assertEquals(recipe1.getIngredients().get(1).getWeight(),79);
	}
	
	@Test
	void removeIngredientTest() {
		setupStage2();
		String n="Ajo";
		//Programar remove
		recipe1.removeIngredient(n);
		//Asserts
		assertEquals(recipe1.getIngredients().size(), 2);
		assertEquals(recipe1.getIngredients().get(0).getName(),"Cebolla");
		assertEquals(recipe1.getIngredients().get(1).getName(),"Arroz");
	}
}

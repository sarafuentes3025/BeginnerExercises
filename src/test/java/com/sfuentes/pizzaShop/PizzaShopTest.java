package com.sfuentes.pizzaShop;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PizzaShopTest {

  @Test
  void validateVariablePizzaSize_ExceptionThrown() {
    List<String> extraIngredients = List.of();

    Exception exception = assertThrows(IllegalArgumentException.class, () ->
        new PizzaShop("tiny", extraIngredients));

    assertThat(exception.getMessage()).isEqualTo("Error, the size is invalid");
  }

  @Test
  void validateVariableExtraIngredients_ExceptionThrown() {
    List<String> extraIngredients = List.of("chicken");

    Exception exception = assertThrows(IllegalArgumentException.class, () ->
        new PizzaShop("small", extraIngredients));

    assertThat(exception.getMessage()).isEqualTo("Error, the ingredient is invalid");
  }

  @Test
  void calculatePricePizza_smallPizza_simplePizzaPrice() {
    List<String> extraIngredients = List.of();
    PizzaShop pizza = new PizzaShop("small", extraIngredients);
    pizza.calculatePricePizza();

    assertThat(pizza.getTotalPrice()).isEqualTo(300);
  }

  @Test
  void calculatePricePizza_smallPizza_pizzaPriceWith1Ingredient() {
    List<String> extraIngredients = List.of("pickles");
    PizzaShop pizza = new PizzaShop("small", extraIngredients);
    pizza.calculatePricePizza();

    assertThat(pizza.getTotalPrice()).isEqualTo(315);
  }

  @Test
  void calculatePricePizza_mediumPizza_pizzaPriceWith2Ingredients() {
    List<String> extraIngredients = List.of("pickles", "onion");
    PizzaShop pizza = new PizzaShop("medium", extraIngredients);
    pizza.calculatePricePizza();

    assertThat(pizza.getTotalPrice()).isEqualTo(360);
  }

  @Test
  void calculatePricePizza_bigPizza_pizzaPriceWith3Ingredients() {
    List<String> extraIngredients = List.of("pickles", "onion", "mushrooms");
    PizzaShop pizza = new PizzaShop("big", extraIngredients);
    pizza.calculatePricePizza();

    assertThat(pizza.getTotalPrice()).isEqualTo(435);
  }

  @Test
  void calculatePricePizza_bigPizza_UpperCase() {
    List<String> extraIngredients = List.of("PICKLES", "ONION", "MUSHROOMS");
    PizzaShop pizza = new PizzaShop("BIG", extraIngredients);
    pizza.calculatePricePizza();

    assertThat(pizza.getTotalPrice()).isEqualTo(435);
  }
}

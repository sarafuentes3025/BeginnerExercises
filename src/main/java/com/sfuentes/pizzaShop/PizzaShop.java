package com.sfuentes.pizzaShop;

import lombok.Getter;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Getter
public class PizzaShop {

  private final String pizzaSize;
  private List<String> extraIngredients;
  double totalPrice;

  public PizzaShop(String pizzaSize, List<String> extraIngredients) {
    pizzaSize = pizzaSize.toLowerCase();

    extraIngredients = extraIngredients.stream().map(String::toLowerCase)
        .collect(toList());

    if (pizzaSize.equals("small") || pizzaSize.equals("medium") || pizzaSize.equals("big"))
      this.pizzaSize = pizzaSize;
    else
      throw new IllegalArgumentException("Error, the size is invalid");

    List<String> finalExtraIngredients = extraIngredients;
    extraIngredients.forEach(extraIngredient -> {
      if (extraIngredient.equals("pickles") || extraIngredient.equals("onion") ||
          extraIngredient.equals("mushrooms"))
        this.extraIngredients = finalExtraIngredients;
      else
        throw new IllegalArgumentException("Error, the size is invalid");
    });

    if (this.extraIngredients == null)
      this.extraIngredients = extraIngredients;
  }

  public void calculatePricePizza() {
    SmallPizza small = new SmallPizza();
    MediumPizza medium = new MediumPizza();
    BigPizza big = new BigPizza();

    switch (getPizzaSize()) {

      case "small" -> totalPrice = small.getPizzaPreparationCost() + small.getBaseCost();
      case "medium" -> totalPrice = medium.getPizzaPreparationCost() + medium.getBaseCost();
      case "big" -> totalPrice = big.getPizzaPreparationCost() + big.getBaseCost();
      default -> throw new IllegalStateException("Unexpected value: " + getPizzaSize());
    }

    totalPrice += getExtraIngredients().size() * 10;
    totalPrice *= 1.5;
  }
}

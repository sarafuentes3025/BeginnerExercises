package com.sfuentes.pizzaShop;

import lombok.Getter;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
public class PizzaShop {

  private final String pizzaSize;
  private final List<String> extraIngredients;
  double totalPrice;
  private final Map<String, Integer> small = Map.of("pizzaPreparationCost", 50, "baseCost", 10);
  private final Map<String, Integer> medium = Map.of("pizzaPreparationCost", 60, "baseCost", 12);
  private final Map<String, Integer> big = Map.of("pizzaPreparationCost", 80, "baseCost", 16);

  public PizzaShop(String pizzaSize, List<String> extraIngredients) {
    pizzaSize = pizzaSize.toLowerCase();

    extraIngredients = extraIngredients.stream().map(String::toLowerCase)
        .collect(Collectors.toList());

    if (pizzaSize.contains("small") || pizzaSize.contains("medium") || pizzaSize.contains("big"))
      this.pizzaSize = pizzaSize;
    else
      throw new IllegalArgumentException("Error, date is invalid");

    if (extraIngredients.contains("pickles") || extraIngredients.contains("onion") ||
        extraIngredients.contains("mushrooms") || extraIngredients.isEmpty())
      this.extraIngredients = extraIngredients;
    else
      throw new IllegalArgumentException("Error, date is invalid");
  }

  public void calculatePricePizza() {
    double sumIngredients = 0;

    for (int i = 0; i < getExtraIngredients().size(); i++) {
      sumIngredients = getExtraIngredients().size() * 10;
    }

    if (getPizzaSize().toLowerCase().contains("small"))
      totalPrice = small.get("pizzaPreparationCost") + small.get("baseCost");
    else if (getPizzaSize().contains("medium"))
      totalPrice = medium.get("pizzaPreparationCost") + medium.get("baseCost");
    else if (getPizzaSize().contains("big"))
      totalPrice = big.get("pizzaPreparationCost") + big.get("baseCost");

    totalPrice += sumIngredients;
    totalPrice += 1.5 * totalPrice;
  }
}

class VeggieBuilder extends PizzaBuilder {
    public VeggieBuilder() {
        this.type   = PizzaType.VEGGIE;
        this.crust  = "whole-wheat";
        this.sauce  = "pesto";
        this.cheese = "vegan cheese";
        this.toppings.add("bell peppers");
        this.toppings.add("mushrooms");
        this.toppings.add("sun-dried tomatoes");
        this.toppings.add("spinach");
    }
}

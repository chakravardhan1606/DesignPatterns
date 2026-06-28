class BBQChickenBuilder extends PizzaBuilder {
    public BBQChickenBuilder() {
        this.type   = PizzaType.BBQ_CHICKEN;
        this.crust  = "thick";
        this.sauce  = "smoky BBQ";
        this.cheese = "cheddar";
        this.toppings.add("grilled chicken");
        this.toppings.add("red onion");
        this.toppings.add("jalapeños");
    }
}

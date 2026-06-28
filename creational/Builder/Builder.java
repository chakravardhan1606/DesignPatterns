// ─── Builder Interface ───────────────────────────────────────────────────────

interface Builder {
    Builder setPizzaType(PizzaType type);
    Builder setPizzaCrust(String crust);
    Builder setToppings(String topping);     
    Builder setSauce(String sauce);
    Builder setCheese(String cheese);
    Pizza build();
}

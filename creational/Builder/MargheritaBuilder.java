// ─── Concrete Builders ───────────────────────────────────────────────────────

class MargheritaBuilder extends PizzaBuilder {
    public MargheritaBuilder() {
        this.type   = PizzaType.MARGHERITA;
        this.crust  = "thin";
        this.sauce  = "san-marzano tomato";
        this.cheese = "fresh mozzarella";
        this.toppings.add("fresh basil");
        this.toppings.add("olive oil drizzle");
    }
}

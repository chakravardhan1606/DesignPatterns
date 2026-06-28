import java.util.ArrayList;
import java.util.List;

// ─── Concrete Builder ────────────────────────────────────────────────────────

class PizzaBuilder implements Builder {

    // package-private so concrete subclasses can read them
    PizzaType    type     = PizzaType.CUSTOM;
    String       crust    = "regular";
    List<String> toppings = new ArrayList<>();  // was String — fixed
    String       sauce    = "tomato";
    String       cheese   = "mozzarella";

    @Override
    public Builder setPizzaType(PizzaType type) {
        this.type = type;
        return this;
    }

    @Override
    public Builder setPizzaCrust(String crust) {
        this.crust = crust;
        return this;
    }

    @Override
    public Builder setToppings(String topping) {   // adds one topping
        this.toppings.add(topping);
        return this;
    }

    @Override
    public Builder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    @Override
    public Builder setCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(this);   // passes PizzaBuilder, not Builder interface
    }
}

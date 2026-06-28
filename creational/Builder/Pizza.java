import java.util.List;

// ─── Product ─────────────────────────────────────────────────────────────────

class Pizza {
    private final PizzaType    type;
    private final String       crust;
    private final List<String> toppings;   // was String — fixed
    private final String       sauce;
    private final String       cheese;

    // Takes PizzaBuilder (not Builder interface) so fields are accessible
    Pizza(PizzaBuilder builder) {          // was "priavte" — fixed typo
        this.type     = builder.type;
        this.crust    = builder.crust;
        this.sauce    = builder.sauce;
        this.cheese   = builder.cheese;
        this.toppings = List.copyOf(builder.toppings);
    }

    @Override
    public String toString() {
        return String.format(
            "Pizza[type=%s, crust=%s, sauce=%s, cheese=%s, toppings=%s]",
            type, crust, sauce, cheese, toppings
        );
    }
}

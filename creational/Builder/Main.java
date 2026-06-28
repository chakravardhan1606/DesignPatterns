// ─── Main ────────────────────────────────────────────────────────────────────

public class Main {
    public static void main(String[] args) {

        // 1. Preset builders
        Pizza margherita = new MargheritaBuilder().setToppings("Cheese burst").build();
        System.out.println(margherita);

        Pizza bbq = new BBQChickenBuilder()
                .setToppings("extra cheese")   // extend defaults
                .build();
        System.out.println(bbq);

        Pizza veggie = new VeggieBuilder().build();
        System.out.println(veggie);

        // 2. Fully custom via fluent chain
        Pizza custom = new PizzaBuilder()
                .setPizzaType(PizzaType.CUSTOM)
                .setPizzaCrust("cauliflower")
                .setSauce("white garlic")
                .setCheese("ricotta")
                .setToppings("arugula")
                .setToppings("prosciutto")
                .build();
        System.out.println(custom);
    }
}

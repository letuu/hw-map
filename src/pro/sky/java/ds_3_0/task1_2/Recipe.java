package pro.sky.java.ds_3_0.task1_2;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Recipe {

    private final String name;
    private Map<Product, Integer> products;

    public Recipe(String name, Map<Product, Integer> products) {
        if (name == null || name.isBlank() || products == null || products.size() == 0) {
            throw new IllegalArgumentException("Заполните карточку рецепта полностью");
        }
        this.name = name;
        setProducts(products);
    }

    public void setProducts(Map<Product, Integer> products) {
        for (Map.Entry<Product, Integer> product : products.entrySet()) {
            if (product.getValue() == 0) {
                products.put(product.getKey(), 1);
            }
        }
        this.products = products;
    }

    public float getRecipePrice() {
        float sum = 0f;
        for (Map.Entry<Product, Integer> product : products.entrySet()) {
            sum += product.getKey().getPrice() * product.getValue();
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nРецепт: ").append(name).append('\n');
        int count = 1;
        for (Map.Entry<Product, Integer> product : products.entrySet()) {
            stringBuilder
                    .append(count)
                    .append(" ")
                    .append(product.getKey().getName())
                    .append(" - ")
                    .append(product.getValue())
                    .append(" шт, по ")
                    .append(product.getKey().getPrice())
                    .append(" руб/шт\n");
            count++;
        }
        stringBuilder.append("Стоимость рецепта: ").append(getRecipePrice()).append(" руб\n");
        return stringBuilder.toString();
    }
}

package pro.sky.java.ds_3_0.task1_2;

import java.util.*;

public class MainProduct {
    static int intDefault;

    public static void main(String[] args) {

        Product milk = new Product("Молоко", 70f, 3);
        Product apple = new Product("Яблоко", 80f, 2);
        Product potato = new Product("Картофель", 30f, 5);
        Product tomato = new Product("Помидор", 75f, 1);

        ProductList list1 = new ProductList();

        list1.addProduct(milk);
        list1.addProduct(apple);
        list1.addProduct(potato);
        list1.addProduct(tomato);

        System.out.println(list1);

        Product appleGreen = new Product("Яблоко зеленое", 90f, 4);
        Product apple2 = new Product("Яблоко", 100f, 1);

        list1.addProduct(appleGreen);
//        list1.addProduct(apple2);    //Выбрасывается исключение - продукт уже добавлен
        list1.removeProductName("Яблоко");
        list1.removeProduct(tomato);
        list1.buyProduct("Молоко");
        list1.buyProduct("Картофель");

        System.out.println(list1);
        System.out.println();

        Recipe recipe1 = new Recipe("Recipe1", Map.of(potato, 5, tomato, 4));
        Recipe recipe2 = new Recipe("Recipe2", Map.of(potato, 4, tomato, 2, apple, 6));
        Recipe recipe3 = new Recipe("Recipe3", Map.of(potato, 1, tomato, 1, apple2, 2));

        //Исключение - IllegalArgumentException - duplicate key:
//        Recipe recipe5 = new Recipe("Recipe5", Map.of(potato, 5, tomato, 4, tomato, 4));

        Recipe recipeDoubleName = new Recipe("Recipe1", Map.of(potato, 4, tomato, 4, milk, 4));
        Recipe recipeDoubleList = new Recipe("Recipe4", Map.of(potato, 5, tomato, 4));

        System.out.println(recipe1);
        System.out.println(recipe2);
        System.out.println(recipe3);
        System.out.println(recipeDoubleName);
        System.out.println(recipeDoubleList);
        System.out.println();

        RecipeList recipeList = new RecipeList();

        recipeList.addRecipe(recipe1);
        recipeList.addRecipe(recipe2);
        recipeList.addRecipe(recipe3);
//        recipeList.addRecipe(recipeDoubleName); //Исключение - Рецепт 'Recipe1' уже существует
        recipeList.addRecipe(recipeDoubleList); //Нет исключения - список одинаковый, имена разные

        System.out.println(recipeList);


        Map<Product, Integer> productsRecipe100 = new HashMap<>();

        productsRecipe100.put(potato, 2);
        productsRecipe100.put(tomato, 3);
        productsRecipe100.put(apple, 0);
        productsRecipe100.put(milk, intDefault);

        Recipe recipe100 = new Recipe("Recipe100", productsRecipe100);

        System.out.println(recipe100);

    }
}

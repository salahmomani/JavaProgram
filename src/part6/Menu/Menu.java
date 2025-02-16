package part6.Menu;
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal)
    {
        this.meals.add(meal);
    }
    public void printMeals(){
        for (String meal: this.meals) {
            System.out.println(meal);
        }



    }
    public void clearMenu(){
     for (String meal: this.meals) {
        this.meals.remove(meal);
    }
}}
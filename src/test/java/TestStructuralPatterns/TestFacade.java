package TestStructuralPatterns;

import StructuralPatterns.Facade.Meal.Breakfast;
import StructuralPatterns.Facade.Meal.Dinner;
import StructuralPatterns.Facade.Meal.Lunch;
import org.junit.jupiter.api.Test;

public class TestFacade {
    @Test
    public void testMain() {
        Breakfast breakfast = new Breakfast();
        breakfast.prepare();
        breakfast.eat();

        Lunch lunch = new Lunch();
        lunch.prepare();
        lunch.eat();

        Dinner dinner = new Dinner();
        dinner.prepare();
        dinner.eat();
    }
}

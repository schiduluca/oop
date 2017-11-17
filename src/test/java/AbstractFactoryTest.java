import com.ipp.sckeedoo.abstractfactory.Factory;
import com.ipp.sckeedoo.abstractfactory.meal.Meal;
import com.ipp.sckeedoo.abstractfactory.SingletonEnum;
import com.ipp.sckeedoo.abstractfactory.meal.Burger;
import com.ipp.sckeedoo.abstractfactory.meal.MealType;
import com.ipp.sckeedoo.abstractfactory.meal.Pizza;
import com.ipp.sckeedoo.abstractfactory.meal.Spagetti;
import com.ipp.sckeedoo.abstractfactory.shape.Circle;
import com.ipp.sckeedoo.abstractfactory.shape.Rectangle;
import com.ipp.sckeedoo.abstractfactory.shape.Shape;
import com.ipp.sckeedoo.abstractfactory.shape.ShapeType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


@RunWith(JUnit4.class)
public class AbstractFactoryTest {
    private Factory factory;


    @Before
    @Test
    public void prepare() {
        factory = SingletonEnum.INSTANCE.getFactory();
        assertNotNull(factory);
    }


    @Test
    public void shouldGetAllShapes() {
        Shape circle = factory.getShape(ShapeType.CIRCLE);
        assertTrue(circle instanceof Circle);
        Shape rectangle = factory.getShape(ShapeType.RECTANGLE);
        assertTrue(rectangle instanceof Rectangle);

    }

    @Test
    public void shouldNotGetNull() {
        Shape circle = factory.getShape(ShapeType.CIRCLE);
        assertNotNull(circle);
        Shape rectangle = factory.getShape(ShapeType.RECTANGLE);
        assertNotNull(rectangle);
    }

    @Test
    public void shouldGetAllMeals() {
        Meal burger = factory.getMeal(MealType.BURGER);
        assertTrue(burger instanceof Burger);
        Meal pizza = factory.getMeal(MealType.PIZZA);
        assertTrue(pizza instanceof Pizza);
        Meal spagetti = factory.getMeal(MealType.SPAGETTI);
        assertTrue(spagetti instanceof Spagetti);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForMeal() {
        Meal alienPizza = factory.getMeal(MealType.ALIEN_PIZZA);
        alienPizza.prepare();
    }


    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForShape() {
        Shape fourthDimensionShape = factory.getShape(ShapeType.FOURTH_DIMENTION_SHAPE);
        fourthDimensionShape.draw();
    }

}

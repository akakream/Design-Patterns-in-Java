package TestCreationalPatterns;

import CreationalPatterns.Prototype.Ball;
import CreationalPatterns.Prototype.Felidae;
import CreationalPatterns.Prototype.FelidaeCloner;
import CreationalPatterns.Prototype.Lion;
import org.junit.jupiter.api.Test;

public class TestPrototype {

    @Test
    public void TestMain() {
        Lion lion = new Lion(120);
        lion.setSomeVar(34);
        Lion lion_clone = (Lion) lion.clone();
        System.out.println(lion_clone.getSomevar());
    }

    @Test
    public void TestDatabank() {
        FelidaeCloner felCloner = new FelidaeCloner();
        Lion lion = (Lion) felCloner.get("the lion");
        System.out.println(lion.getSomevar());
        System.out.println(lion.getHeight());
        Felidae anotherlion = felCloner.get("the lion");
        System.out.println(anotherlion.getSomevar());
    }

    @Test
    public void TestTwo() throws CloneNotSupportedException {
        Ball ball = new Ball(5,20);
        Ball meatBall = ball.clone();
        System.out.println(meatBall.getRadius());
    }
}

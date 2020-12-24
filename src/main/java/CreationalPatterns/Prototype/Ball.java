package CreationalPatterns.Prototype;

// Joshua Bloch advises not to use Clonable interface,
// instead implement a copy(clone) method yourself
public class Ball implements Cloneable{
    private int radius;
    private int weight;

    public Ball(int radius, int weight) {
        this.radius = radius;
        this.weight = weight;
    }

    // WTF does that even mean?
    public Ball clone()throws CloneNotSupportedException{
        return (Ball) super.clone();
    }

    public int getRadius() {
        return this.radius;
    }

    public int getWeight() {
        return this.weight;
    }

    public void kickBall() {
        System.out.println("The ball is kicked");
    }
}

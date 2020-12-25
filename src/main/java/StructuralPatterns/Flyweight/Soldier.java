package StructuralPatterns.Flyweight;

public class Soldier {
    private int posX;
    private int posY;
    private SoldierType type;

    public Soldier(int posX, int posY, SoldierType type) {
        this.posX = posX;
        this.posY = posY;
        this.type = type;
    }

    public void moveTo(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public SoldierType getType() {
        return type;
    }
}

package DEVOPS_SPARK;

public class Fruit {
    private String name;
    private int count = 0;
    public Fruit(String name) {
    this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getCount() {
        return count;
    }
    public void count() {
        count++;
    }
}
    
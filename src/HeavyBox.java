public class HeavyBox {
    private String name;
    private double weight;

    public HeavyBox() {
    }

    public HeavyBox(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public HeavyBox setWeight(double weight) {
        this.weight = weight;
        return null;
    }

    @Override
    public String toString() {
        return "Имя: " + name +
                "\nВес: " + weight + " кг." +
                "\n-------------------------\n";
    }
}

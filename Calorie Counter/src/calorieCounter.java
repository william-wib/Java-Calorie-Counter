public class calorieCounter {
    private int energy;
    private int gram;


    public calorieCounter(int calories, int weight) {
        this.energy = calories;
        this.gram = weight;
    }

    public int getEnergy() {
        return this.energy;
    }

    public int getGram() {
        return this.gram;
    }

    public double totalCalories(int weight, int kcal) {
        double converter = (double) kcal / 100;
        return converter * weight;
    }


    @Override
    public String toString() {
        return "The total calories of this product is: " + totalCalories(this.gram, this.energy);
    }
}

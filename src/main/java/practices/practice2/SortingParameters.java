package practices.practice2;

public class SortingParameters {

    private String name;

    private double score;

    public SortingParameters(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SortingParameters{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
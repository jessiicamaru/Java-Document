public class Player {

    private String name;
    private int age, score, positionX, positionY;

    public Player(String name, int age, int score, int positionX, int positionY) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

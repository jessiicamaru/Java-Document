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

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getPositionX() {
        return this.positionX;
    }

    public int getPositionY() {
        return this.positionY;
    }

    public int getScore() {
        return this.score;
    }

    public void increaseScore() {
        this.score += 1;
    }

    public void decreaseScore() {
        this.score -= 1;
    }

    public void increaseScore(int n) {
        this.score += n;
    }

    public void decreaseScore(int n) {
        this.score -= n;
    }

    public boolean isWinner() {
        return this.score >= 100;
    }
}

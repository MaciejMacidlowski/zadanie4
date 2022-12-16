package sample;

public class Rzut {
    private int count;
    private int punkty;

    public Rzut( int punkty) {
        this.count = count;
        this.punkty = punkty;
        count++;
    }

    @Override
    public String toString() {
        return "Rzut{" +
                "count=" + count +
                ", punkty=" + punkty +
                '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPunkty() {
        return punkty;
    }

    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }
}

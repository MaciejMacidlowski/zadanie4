package sample;

import java.util.Arrays;

public class Gracz {

    private int id=0;
    private Rzut[] punktyzRzutow = new Rzut[20];

    @Override
    public String toString() {
        return "Gracz{" +

                ", id=" + id +
                ", rzuty=" + Arrays.toString(punktyzRzutow) +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Rzut[] getPunktyzRzutow() {
        return punktyzRzutow;
    }

    public void setPunktyzRzutow(Rzut[] punktyzRzutow) {
        this.punktyzRzutow = punktyzRzutow;
    }

    public Gracz(int id) {
        this.id = id;
        this.punktyzRzutow = punktyzRzutow;
    }

    public void addRzut(Rzut rzut){
        for (int i = 0; i < punktyzRzutow.length; i++) {
            if (punktyzRzutow[i]==null){
                punktyzRzutow[i] = rzut;
                break;
            }
        }
    }
}

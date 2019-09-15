package beans;

import java.util.Map;

public class BeanWithConstructorAndProperty {
    private int r;
    private Map<String, Integer> map;

    public BeanWithConstructorAndProperty(int r, Map<String, Integer> map) {
        this.r = r;
        this.map = map;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public Map<String, Integer> getMap() {
        return map;
    }
}

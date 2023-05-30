package model.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Meteore {
    private int x;
    private int y;

    public Meteore(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Tile {
    private int shopValue;
    private int victoryPoint;

    public Tile(Tile t){
        this.shopValue = t.shopValue;
        this.victoryPoint = t.victoryPoint;
    }
}


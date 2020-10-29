package pojo;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Pot {
    private List<Tile> tileList;

    public Pot(){
        initPot();
    }

    public Pot(Pot tileList){
        this.tileList = new ArrayList<>();
        for (Tile t : tileList.tileList){
            this.tileList.add(new Tile(t));
        }
    }

    private void initPot(){
        this.tileList = new ArrayList<>();
        tileList.add(new Tile(0,0));
        tileList.add(new Tile(1,0));
        tileList.add(new Tile(2,0));
        tileList.add(new Tile(3,0));
        tileList.add(new Tile(4,0));
        tileList.add(new Tile(5,0));
        tileList.add(new Tile(6,1));
        tileList.add(new Tile(7,1));
        tileList.add(new Tile(8,1));
        tileList.add(new Tile(9,1));
        tileList.add(new Tile(10,2));
        tileList.add(new Tile(11,2));
        tileList.add(new Tile(12,2));
        tileList.add(new Tile(13,2));
        tileList.add(new Tile(14,3));
        tileList.add(new Tile(15,3));
        tileList.add(new Tile(15,3));
        tileList.add(new Tile(16,3));
        tileList.add(new Tile(16,4));
        tileList.add(new Tile(17,4));
        tileList.add(new Tile(17,4));
        tileList.add(new Tile(18,4));
        tileList.add(new Tile(18,5));
        tileList.add(new Tile(19,5));
        tileList.add(new Tile(19,5));
        tileList.add(new Tile(20,5));
        tileList.add(new Tile(20,6));
        tileList.add(new Tile(21,6));
        tileList.add(new Tile(21,6));
        tileList.add(new Tile(22,7));
        tileList.add(new Tile(22,7));
        tileList.add(new Tile(23,7));
        tileList.add(new Tile(23,8));
        tileList.add(new Tile(24,8));
        tileList.add(new Tile(24,8));
        tileList.add(new Tile(25,9));
        tileList.add(new Tile(25,9));
        tileList.add(new Tile(26,9));
        tileList.add(new Tile(26,10));
        tileList.add(new Tile(27,10));
        tileList.add(new Tile(27,10));
        tileList.add(new Tile(28,11));
        tileList.add(new Tile(28,11));
        tileList.add(new Tile(29,11));
        tileList.add(new Tile(29,12));
        tileList.add(new Tile(30,12));
        tileList.add(new Tile(30,12));
        tileList.add(new Tile(31,12));
        tileList.add(new Tile(31,13));
        tileList.add(new Tile(32,13));
        tileList.add(new Tile(32,13));
        tileList.add(new Tile(33,14));
        tileList.add(new Tile(33,14));
        tileList.add(new Tile(35,15));
    }
}

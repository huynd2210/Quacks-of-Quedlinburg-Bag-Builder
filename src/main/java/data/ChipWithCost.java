package data;

import algorithm.perfectsum.ObjectWithInteger;
import lombok.Getter;
import lombok.ToString;
import pojo.Chip;

@ToString
@Getter
public class ChipWithCost implements ObjectWithInteger {
    private Chip chip;
    private Integer cost;

    public ChipWithCost(Chip chip, Integer cost){
        this.chip = chip;
        this.cost = cost;
    }

    @Override
    public Integer getInteger() {
        return cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChipWithCost)) return false;

        ChipWithCost that = (ChipWithCost) o;

        if (chip != null ? !chip.equals(that.chip) : that.chip != null) return false;
        return cost != null ? cost.equals(that.cost) : that.cost == null;
    }

    @Override
    public int hashCode() {
        int result = chip != null ? chip.hashCode() : 0;
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        return result;
    }
}

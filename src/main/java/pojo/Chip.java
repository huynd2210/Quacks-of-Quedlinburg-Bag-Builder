package pojo;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class Chip {
    private String abbreviation;
    private int value;
    private String color;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Chip{");
        sb.append("abbreviation='").append(abbreviation).append('\'');
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }

    public Chip(Chip chip){
        this.abbreviation = chip.abbreviation;
        this.value = chip.value;
        this.color = chip.color;
    }


}

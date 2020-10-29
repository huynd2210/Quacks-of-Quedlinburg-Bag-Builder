package pojo;

import data.ChipWithCost;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingList {
    private List<ChipWithCost> chips;
}

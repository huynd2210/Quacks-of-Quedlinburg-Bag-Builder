package controller;

import data.StateData;
import pojo.Bag;
import pojo.Chip;

public class ActionController {

    public static StateData pullChip(StateData stateData) {
        final int potEndPosition = 35;
        Chip chip = stateData.getBag().popChip();
        StateData sd = new StateData(stateData);

        if (chip.getColor().equalsIgnoreCase("white")) {
            if (isExploded(sd, chip, 7)) {
                sd.setExploded(true);
                return sd;
            } else {
                sd.setCurrentWhiteChipValue(sd.getCurrentWhiteChipValue() + chip.getValue());
            }

        } else if (chip.getColor().equalsIgnoreCase("yellow")) {
            if (sd.getPreviousChip().getColor().equalsIgnoreCase("white")) {
                sd.setCurrentWhiteChipValue(sd.getCurrentWhiteChipValue() - sd.getPreviousChip().getValue());
            }
        }

        if (sd.getCurrentPosition() + chip.getValue() <= potEndPosition) {
            sd.setCurrentPosition(sd.getCurrentPosition() + chip.getValue());
            sd.setPreviousChip(chip);
        } else {
            sd.setCurrentPosition(potEndPosition);
        }
        return sd;
    }

    private static boolean isExploded(StateData sd, Chip whiteChip, int explodeValue) {
        return sd.getCurrentWhiteChipValue() + whiteChip.getValue() > explodeValue;
    }


}

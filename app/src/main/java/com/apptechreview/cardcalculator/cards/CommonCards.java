package com.apptechreview.cardcalculator.cards;

import com.apptechreview.cardcalculator.ItemObject;
import com.apptechreview.cardcalculator.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alkesh on 14-11-2017.
 */

public class CommonCards {
    public static List<ItemObject> getAllItemList() {

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("Skeletons", R.drawable.skeletons_common));
        allItems.add(new ItemObject("Ice Spirit", R.drawable.ice_spirit_common));
        allItems.add(new ItemObject("Goblins", R.drawable.goblins_common));
        allItems.add(new ItemObject("Zap", R.drawable.zap_common));
        allItems.add(new ItemObject("Bats", R.drawable.bats_common));
        allItems.add(new ItemObject("Fire Spirit", R.drawable.fire_spirits_common));
        allItems.add(new ItemObject("Spear Goblins", R.drawable.spear_goblins_common));
        allItems.add(new ItemObject("Knight", R.drawable.knight_common));
        allItems.add(new ItemObject("Archer", R.drawable.archers_common));
        allItems.add(new ItemObject("Arrows", R.drawable.arrows_common));
        allItems.add(new ItemObject("Minions", R.drawable.minions_common));
        allItems.add(new ItemObject("Cannon", R.drawable.cannon_common));
        allItems.add(new ItemObject("Skeleton Barrel", R.drawable.skeleton_barrel_common));
        allItems.add(new ItemObject("Bomber", R.drawable.bomber_common));
        allItems.add(new ItemObject("Goblin Gang", R.drawable.goblin_gang_common));
        allItems.add(new ItemObject("Tesla", R.drawable.tesla_common));
        allItems.add(new ItemObject("Mortar", R.drawable.mortar_common));
        allItems.add(new ItemObject("Barbarians", R.drawable.barbarians_common));
        allItems.add(new ItemObject("Minion Horde", R.drawable.minion_horde_common));
        allItems.add(new ItemObject("Elite Barbarians", R.drawable.elite_barbarians_common));
        allItems.add(new ItemObject("Royal Giant", R.drawable.royal_giant_common));
        return allItems;
    }
}

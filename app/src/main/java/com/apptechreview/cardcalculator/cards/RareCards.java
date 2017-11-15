package com.apptechreview.cardcalculator.cards;

import com.apptechreview.cardcalculator.ItemObject;
import com.apptechreview.cardcalculator.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alkesh on 14-11-2017.
 */

public class RareCards {
    public static List<ItemObject> getAllItemList() {

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("Skeletons", R.drawable.ice_golem_rare));
        allItems.add(new ItemObject("Ice Spirit", R.drawable.tombstone_rare));
        allItems.add(new ItemObject("Goblins", R.drawable.heal_rare));
        allItems.add(new ItemObject("Zap", R.drawable.dart_goblin_rare));
        allItems.add(new ItemObject("Bats", R.drawable.mega_minion_rare));
        allItems.add(new ItemObject("Fire Spirit", R.drawable.mini_pekka_rare));
        allItems.add(new ItemObject("Spear Goblins", R.drawable.hog_rider_rare));
        allItems.add(new ItemObject("Knight", R.drawable.flying_machine_rare));
        allItems.add(new ItemObject("Archer", R.drawable.furnace_rare));
        allItems.add(new ItemObject("Arrows", R.drawable.valkyrie_rare));
        allItems.add(new ItemObject("Minions", R.drawable.fireball_rare));
        allItems.add(new ItemObject("Cannon", R.drawable.musketeer_rare));
        allItems.add(new ItemObject("Skeleton Barrel", R.drawable.battle_ram_rare));
        allItems.add(new ItemObject("Bomber", R.drawable.giant_rare));
        allItems.add(new ItemObject("Goblin Gang", R.drawable.wizard_rare));
        allItems.add(new ItemObject("Tesla", R.drawable.goblin_hut_rare));
        allItems.add(new ItemObject("Mortar", R.drawable.inferno_tower_rare));
        allItems.add(new ItemObject("Barbarians", R.drawable.bomb_tower_rare));
        allItems.add(new ItemObject("Minion Horde", R.drawable.rocket_rare));
        allItems.add(new ItemObject("Minion Horde", R.drawable.elixir_collector_rare));
        allItems.add(new ItemObject("Minion Horde", R.drawable.barbarian_hut_rare));
        allItems.add(new ItemObject("Minion Horde", R.drawable.three_musketeers_rare));
        return allItems;
    }
}

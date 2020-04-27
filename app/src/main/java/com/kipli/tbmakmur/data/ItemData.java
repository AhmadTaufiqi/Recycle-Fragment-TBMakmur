package com.kipli.tbmakmur.data;

import com.kipli.tbmakmur.R;
import com.kipli.tbmakmur.model.ItemModel;

import java.util.ArrayList;
import java.util.Collection;

public class ItemData {
    private static String [] itemsNames ={
          "semen",
          "bata merah",
          "batako",
          "pasir",
          "cat ember besar",
          "cat ember kecil",
          "sekop",
          "cangkul",
          "serok",
          "pipa 3/4 inch",
          "pipa 1 inch",
          "pipa 2 inch",
          "pipa 4 inch"
    };
    private static String[] itemsStock = {
            "40 sack",
            "3 rit",
            "4 rit",
            "4,5 rit",
            "5 pcs",
            "15 pcs",
            "20 pcs",
            "15 pcs",
            "50 pcs",
            "25 pcs 4 meter",
            "20 pcs 4 meter",
            "15 pcs 4 meter",
            "15 pcs 4 meter"
    };
    private static int[] itemsImages = {
            R.drawable.semen,
            R.drawable.batamerah,
            R.drawable.batako,
            R.drawable.pasir,
            R.drawable.catbesar,
            R.drawable.catkecil,
            R.drawable.sekop,
            R.drawable.cangkul,
            R.drawable.serok,
            R.drawable.pipa,
            R.drawable.pipa,
            R.drawable.pipa,
            R.drawable.pipa
    };
    public static Collection<? extends ItemModel> getListData() {
        ArrayList<ItemModel> list = new ArrayList<>();
        for (int position = 0; position < itemsNames.length; position++) {
            ItemModel hero = new ItemModel();
            hero.setName(itemsNames[position]);
            hero.setStock(itemsStock[position]);
            hero.setPhoto(itemsImages[position]);
            list.add(hero);
        }
        return list;
    }
}

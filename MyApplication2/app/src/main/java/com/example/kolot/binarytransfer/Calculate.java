package com.example.kolot.binarytransfer;

import android.support.annotation.NonNull;

import java.util.ArrayList;

import static java.lang.Math.pow;

/**
 * Created by kolot on 12.09.2017.
 */

public class Calculate {

    @NonNull
    public String toTen (String string) {
        double sum=0,v=0;
        final int basis = 2;
        int disconnect, size;
        ArrayList<String > stringArrayList = new ArrayList<>();
        for (String k:string.split("")){
            stringArrayList.add(k);
        }

        disconnect = stringArrayList.indexOf(",");
        disconnect--;

        stringArrayList.remove(string.indexOf(","));

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (String k: stringArrayList){
            integerArrayList.add(Integer.valueOf(k));
        }


        for (int i = 0; i<integerArrayList.size(); i++){
            v = integerArrayList.get(i) * pow(basis, disconnect);
            System.out.println(v + " + ");
            disconnect--;
            sum +=v;
        }
        string=String.valueOf(sum);
        System.out.println(string);
        return string;
    }
}

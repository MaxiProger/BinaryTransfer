package com.example.kolot.binarytransfer;

import java.util.ArrayList;

import static java.lang.Math.pow;

/**
 * Created by kolot on 12.09.2017.
 */

public class Calculate {


    public static String toTen (String string) {

        double sum=0,v=0;
        final int basis = 2;
        int disconnect=0, disconnect1=0, disconnect2=0;
        boolean check =false;

            ArrayList<Integer> integerArrayList = new ArrayList<>();

            for (String k : string.split("")) {
                if(k.isEmpty()){
                    continue;
                }
                if (!k.contains(",") ) {
                 integerArrayList.add(Integer.valueOf(k));
                    disconnect1=integerArrayList.size();
                } else {
                    check=true;
                    disconnect2 = string.indexOf(k);
                    continue;
                }
            }

        if(check){
            disconnect=disconnect2--;
        }else disconnect=disconnect1;

        for (int i = 0; i<integerArrayList.size(); i++){
            v = integerArrayList.get(i) * pow(basis, --disconnect);
            sum +=v;
        }
        string=String.valueOf(sum);
        return string;
    }
}

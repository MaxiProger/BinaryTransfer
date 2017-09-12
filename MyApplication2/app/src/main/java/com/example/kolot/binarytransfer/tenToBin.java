package com.example.kolot.binarytransfer;

import java.util.ArrayList;

import static java.lang.Math.IEEEremainder;

/**
 * Created by kolot on 12.09.2017.
 */

public class tenToBin {
    public static void main(String[] args) {
       System.out.println(IEEEremainder(5,2));
        tenToBinary("157,375");
    }

    public static void tenToBinary (String string) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (String k: string.split(",",2)) {
            integerArrayList.add(Integer.valueOf(k));
        }
        double undivided=integerArrayList.get(0), divided=integerArrayList.get(1);

        System.out.println(undivided + " " + divided);

        
       /**
        if(wholeRow.contains(",")) {
            int i = wholeRow.indexOf(",");
            for (++i; i < wholeRow.size(); i++) {
                divided.add(Integer.valueOf(wholeRow.get(i)));
            }
        }

        System.out.println(undivided);
        System.out.println(divided);
        /**
        if(check){
            disconnect=disconnect2--;
        }else disconnect=disconnect1;

        double sum=0,v=0;
        final int basis = 2;

        for (int i = 0; i<integerArrayList.size(); i++){
            v = integerArrayList.get(i) * pow(basis, --disconnect);
            sum +=v;
        }
        string = String.valueOf(sum); **/


    }


}

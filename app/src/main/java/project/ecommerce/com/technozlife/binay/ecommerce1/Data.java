package project.ecommerce.com.technozlife.binay.ecommerce1;

import java.util.ArrayList;

/**
 * Created by Binay on 01/10/2016.
 */

public class Data {


    public static ArrayList<Information> getData() {


        ArrayList<Information> data = new ArrayList<>();

        int images[] = {


                R.drawable.biscuits,
                R.drawable.cocacola,
                R.drawable.dalmod,
                R.drawable.kurkure,
                R.drawable.gulcose,
                R.drawable.horlicks,
                R.drawable.papad,
                R.drawable.rechargencell,
                R.drawable.rechargentc,
                R.drawable.rice,
                R.drawable.rice1,
                R.drawable.soap,
                R.drawable.soap1,
                R.drawable.sugar,
                R.drawable.sugar1,
                R.drawable.waiwai,
                R.drawable.wheel
        };
    String name[] = {
           "Biscuit","Coca Cola","Dalmod","KurKure","Gulcose","Horlicks","Papad","Recharge Ncell","Recharge Ntc","Rice","Rice1","soap","soap",
            "Soap1","Sugar","Sugar1","Wai Wai","Wheel",
    };

   for (int i = 0 ; i<images.length;i++ ){

       Information newData = new Information();
       newData.ImageId = images[i];
       newData.title = name[i];
       data.add(newData);

   }

    return data;
    }
}

 class Information{

     public int ImageId;
     public String title;


 }
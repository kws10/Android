package com.example.hankki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Res_Adapter extends ArrayAdapter<com.example.hankki.Res_class> {
    public Res_Adapter(Context context, int resource, List <com.example.hankki.Res_class> Res_list){
        super(context, resource, Res_list);
    }
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        int distance;
        int minute;
        double x;
        double y;
        com.example.hankki.Res_class restaurant = getItem(position);
        User_Class user = new User_Class("id", "1234", "이상호", 1, 0, 37.6410, 126.980);

        x = Math.pow (user.getLatitude() - restaurant.getLatitude(),2);
        y = Math.pow (user.getLongitude() - restaurant.getLongitude(),2);

        distance = (int) ((x+y)*1000000);

        minute = distance/66;



        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.restaurant_item,parent,false);
        }
        TextView tv = convertView.findViewById(R.id.res_name);
        ImageView iv = convertView.findViewById(R.id.res_img);
        TextView str = convertView.findViewById(R.id.star_pnt);
        TextView work = convertView.findViewById(R.id.working);
        TextView minuate = convertView.findViewById(R.id.minuate);


        tv.setText(restaurant.getRes_name());
        iv.setImageResource(restaurant.getRes_img());
        str.setText(String.valueOf(restaurant.getStar()));
        work.setText(String.valueOf(distance));
        work.append("m   ");
        minuate.setText(String.valueOf(minute));
        minuate.append("분");


        return convertView;
    }
}

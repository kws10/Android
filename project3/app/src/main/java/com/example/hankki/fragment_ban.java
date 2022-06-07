package com.example.hankki;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_ban#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_ban extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment_ban() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_2.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_ban newInstance(String param1, String param2) {
        fragment_ban fragment = new fragment_ban();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ban, container, false);

        CheckBox sea_btn = view.findViewById(R.id.sea_btn);
        CheckBox mush_btn = view.findViewById(R.id.mush_btn);
        CheckBox cucum_btn = view.findViewById(R.id.cucum_btn);
        CheckBox gosu_btn = view.findViewById(R.id.gosu_btn);
        CheckBox gut_btn = view.findViewById(R.id.gut_btn);

       /* if(RestaurantActivity.user.getSea() == 1){
            sea_btn.setChecked(true);
        }

        else if(RestaurantActivity.user.getSea() == 0){
            sea_btn.setChecked(false);
        }

        if(RestaurantActivity.user.getMush() == 1){
            mush_btn.setChecked(true);
        }

        if(RestaurantActivity.user.getCucum() == 1){
            cucum_btn.setChecked(true);
        }

        if(RestaurantActivity.user.getGosu() == 1){
            gosu_btn.setChecked(true);
        }

        if(RestaurantActivity.user.getGut() == 1){
            gut_btn.setChecked(true);
        } */

        // Inflate the layout for this fragment

        if(sea_btn.isChecked()){ // 0 == 못먹는다 체크되면 못먹는다.
            RestaurantActivity.user.setSea(0);
        }

        else{ // 체크 안돼있으면 먹을수 있다.
            RestaurantActivity.user.setSea(1);
        }

        if(mush_btn.isChecked()){
            RestaurantActivity.user.setMush(0);
        }

        else{
            RestaurantActivity.user.setMush(1);
        }

        if(cucum_btn.isChecked()){
            RestaurantActivity.user.setCucum(0);
        }

        else{
            RestaurantActivity.user.setCucum(1);
        }

        if(gosu_btn.isChecked()){
            RestaurantActivity.user.setGosu(0);
        }

        else{
            RestaurantActivity.user.setGosu(1);
        }

        if(gut_btn.isChecked()){
            RestaurantActivity.user.setGut(0);
        }

        else{
            RestaurantActivity.user.setGut(1);
        }


        return view;
        //return inflater.inflate(R.layout.fragment_genre, container, false);
    }
}
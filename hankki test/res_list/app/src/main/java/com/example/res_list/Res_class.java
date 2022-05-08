package com.example.res_list;

public class Res_class {
    private String Res_id;
    private String Res_name;
    private int Res_img;

    public Res_class(String Res_id,String Res_name, int Res_img){
        this.Res_id = Res_id;
        this.Res_name = Res_name;
        this.Res_img = Res_img;
    }

    public String getRes_id(){
        return Res_id;
    }

    public void setRes_id(String Res_id){
        this.Res_id = Res_id;
    }

    public String getRes_name(){
        return Res_name;
    }

    public void setRes_name(String Res_name){
        this.Res_name = Res_name;
    }

    public int getRes_img(){
        return Res_img;
    }

    public void setRes_img(int Res_img){
        this.Res_img = Res_img;
    }


}

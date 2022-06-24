package com.example.customspinneractivity;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class MyCustomAdapter  extends BaseAdapter {

    String[] city;
    int[] flag;
    MainActivity mainActivity;

    public MyCustomAdapter(String[] city, int[] flag, MainActivity mainActivity) {

        this.city =city;
        this.mainActivity = mainActivity;
        this.flag = flag;

    }

    @Override
    public int getCount() {
        return city.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View View, ViewGroup parent) {

        View = LayoutInflater.from(mainActivity).inflate(R.layout.txt_spinner_activity,null);
        TextView  txtSpinner = View.findViewById(R.id.txtSpinner);
        txtSpinner.setText(city[position]);
        ImageView imgFlag = View.findViewById(R.id.imgFlag);
        imgFlag.setBackgroundResource(flag[position]);
        return View;
    }
}

package com.example.minhhoang.bai1;

import android.app.Activity;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

        int[] image={R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5,R.drawable.image6};
        String[] tensanpham={"Vegetables","Fruits","Flower Buds","Legumes","Bulbs","Tubers"};
        String [] sosanpham={"65 items","17 items","5 items","33 items","18 items","43 items"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView)findViewById(R.id.listView);
        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);
    }
    class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return image.length;
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
        public View getView(int position, View view, ViewGroup parent) {

            view = getLayoutInflater().inflate(R.layout.listview_layout,null);
            ImageView anhsp=(ImageView)view.findViewById(R.id.anhsp);
            TextView tensp=(TextView)view.findViewById(R.id.tensp);
            TextView sosp=(TextView)view.findViewById(R.id.sosp);

            anhsp.setImageResource(image[position]);
            tensp.setText(tensanpham[position]);
            sosp.setText(sosanpham[position]);
            return view;
        }
    }

}

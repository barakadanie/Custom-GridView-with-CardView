package com.example.customgriviewwithcustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    Context context;
    List<Pojo> listPjos;
    public  MyAdapter(Context context,List<Pojo> listPjos)
    {
        this.context=context;
        this.listPjos=listPjos;
    }

    @Override
    public int getCount() {
        return listPjos.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view= LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        ImageView image=view.findViewById(R.id.image);
        TextView title=view.findViewById(R.id.title);
        TextView description=view.findViewById(R.id.desc);
        title.setText(listPjos.get(position).getTitle());
        description.setText(listPjos.get(position).getDescription());
        image.setImageResource(listPjos.get(position).getImage());
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Position"+position,Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}


package com.example.correctweekone.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.correctweekone.R;
import com.example.correctweekone.gsonbean.DataEntity;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private Context context;
    private List<DataEntity.DataBean> dataBeans;

    public Adapter(Context context) {
        this.context = context;
        dataBeans=new ArrayList<>();
    }

    public void setData(List<DataEntity.DataBean> dataBeans) {
        this.dataBeans.clear();
        if (dataBeans!=null){
            this.dataBeans.addAll(dataBeans);
        }
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = View.inflate(this.context, R.layout.recycler_view, null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder viewHolder, final int i) {
        viewHolder.title.setText(dataBeans.get(i).getTitle());
        String[] image = this.dataBeans.get(i).getImages().split("\\|");
        if (image!=null&&image.length>0){
            Glide.with(context).load(image[0]).into(viewHolder.image);
        }else{
            viewHolder.image.setImageResource(R.mipmap.ic_launcher);
        }
        viewHolder.title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //点击事件
                Toast.makeText(context,"点击了",Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return this.dataBeans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView title;
        private final ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            image = itemView.findViewById(R.id.image);
        }
    }
}

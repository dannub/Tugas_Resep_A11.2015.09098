package com.example.d2j_00.menus;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by D2J-00 on 04/10/2017.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyOwnHolder> {
    String data1[],data2[],data3[];
    int img[];
    Context ctx;
    public MyAdapter(Context ct,String s1[],String s2[], int i[])
    {
        ctx=ct;
        data1=s1;
        data2=s2;

        img=i;
    }

    @Override
    public MyOwnHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater myInflator = LayoutInflater.from(ctx);
        View Myownview = myInflator.inflate(R.layout.my_row,parent,false);
        return new MyOwnHolder(Myownview);
    }

    @Override
    public void onBindViewHolder(MyOwnHolder holder, final int position) {
        holder.t1.setText(data1[position]);
        holder.t2.setText(data2[position]);
        holder.myimage.setImageResource(img[position]);
        holder.Relativ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a= new Intent(ctx,Tampilan.class);
                a.putExtra("judul", data1[position]);
                a.putExtra("keterangan", data2[position]);
                a.putExtra("gambar", img[position]);
                ctx.startActivity(a);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data2.length;
    }

    public class MyOwnHolder extends RecyclerView.ViewHolder{
        TextView t1,t2;
        ImageView myimage;
        RelativeLayout Relativ;
        public MyOwnHolder(View itemView) {

            super(itemView);
           t1=(TextView)itemView.findViewById(R.id.text1);
            t2=(TextView)itemView.findViewById(R.id.text2);

            myimage=(ImageView)itemView.findViewById(R.id.image);
            Relativ=(RelativeLayout)itemView.findViewById(R.id.Menu);
        }
    }
}

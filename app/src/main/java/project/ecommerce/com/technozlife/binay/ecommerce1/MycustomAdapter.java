package project.ecommerce.com.technozlife.binay.ecommerce1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Binay on 01/10/2016.
 */

public class MycustomAdapter extends RecyclerView.Adapter<MycustomAdapter.MyViewHolder>{


    Context context;
    ArrayList<Information> data;
    LayoutInflater inflater;

    public MycustomAdapter(Context content, ArrayList<Information> data) {

        this.context = content;
        this.data = data;
        inflater = LayoutInflater.from(content);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view  = inflater.inflate(R.layout.list_row_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.text.setText(data.get(position).title);
        holder.img.setImageResource(data.get(position).ImageId);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends  RecyclerView.ViewHolder{

        TextView text;
        ImageView img;

         public MyViewHolder(View itemView) {
             super(itemView);

             text =(TextView) itemView.findViewById(R.id.row_title);
             img = (ImageView) itemView.findViewById(R.id.row_img);


         }
     }
}

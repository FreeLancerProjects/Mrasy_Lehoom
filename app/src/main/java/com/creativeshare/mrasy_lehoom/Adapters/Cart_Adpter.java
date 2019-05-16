package com.creativeshare.mrasy_lehoom.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.creativeshare.mrasy_lehoom.Model.Orders_Cart_Model;
import com.creativeshare.mrasy_lehoom.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class Cart_Adpter extends RecyclerView.Adapter<Cart_Adpter.Eyas_Holder> {
    List<Orders_Cart_Model> list;
    Context context;

    public Cart_Adpter(List<Orders_Cart_Model> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public Eyas_Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_cart, viewGroup, false);
        Eyas_Holder eas = new Eyas_Holder(v);
        return eas;
    }

    @Override
    public void onBindViewHolder(@NonNull final Cart_Adpter.Eyas_Holder viewHolder, int i) {
        Orders_Cart_Model model = list.get(i);
        viewHolder.name.setText(model.getName() + "");
        viewHolder.price.setText(model.getOrder_total());


        viewHolder.total.setText(model.getQuantity() + "");
        Picasso.with(context).load(model.getImage()).fit().into(viewHolder.frameLayout);


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class Eyas_Holder extends RecyclerView.ViewHolder {
        TextView name;
        TextView price;
        TextView total;

        CircleImageView frameLayout;

        public Eyas_Holder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.cart_name);
            price = (TextView) itemView.findViewById(R.id.cart_price);
            total = (TextView) itemView.findViewById(R.id.total_cart);

            frameLayout = (CircleImageView) itemView.findViewById(R.id.image_cart);


        }
    }
}



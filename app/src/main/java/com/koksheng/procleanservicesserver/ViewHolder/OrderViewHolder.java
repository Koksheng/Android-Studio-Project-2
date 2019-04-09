package com.koksheng.procleanservicesserver.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.koksheng.procleanservicesserver.Interface.ItemClickListener;
import com.koksheng.procleanservicesserver.R;

public class OrderViewHolder extends RecyclerView.ViewHolder {

    public TextView txtOrderId, txtOrderStatus, txtOrderPhone, txtOrderAddress;

    public Button btnEdit, btnRemove, btnDetail, btnDirection;


    public OrderViewHolder(@NonNull View itemView) {
        super(itemView);

        txtOrderAddress = (TextView)itemView.findViewById(R.id.order_address);
        txtOrderId = (TextView)itemView.findViewById(R.id.order_id);
        txtOrderStatus = (TextView)itemView.findViewById(R.id.order_status);
        txtOrderPhone = (TextView)itemView.findViewById(R.id.order_phone);

        btnEdit = (Button)itemView.findViewById(R.id.btnEdit);
        btnDetail = (Button)itemView.findViewById(R.id.btnDetail);
        btnRemove = (Button)itemView.findViewById(R.id.btnRemove);
        btnDirection = (Button)itemView.findViewById(R.id.btnDirection);



    }


//    @Override
//    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo menuInfo) {
//        contextMenu.setHeaderTitle("Select The Action");
//
//        contextMenu.add(0,0,getAdapterPosition(), "Update");
//        contextMenu.add(0,1,getAdapterPosition(), "Delete");
//    }


}


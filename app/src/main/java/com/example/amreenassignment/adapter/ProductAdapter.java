package com.example.amreenassignment.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.amreenassignment.R;
import com.example.amreenassignment.activities.ProductDetailsActivity;
import com.example.amreenassignment.classes.Product;

import java.util.List;

public class ProductAdapter extends BaseAdapter {
    private Context mContext;

    List<Product> product;

    // Constructor
    public ProductAdapter(Context c, List<Product> TITLE) {
        mContext = c;
        this.product = TITLE;
    }

    public int getCount() {
        return product.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return product.size();
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(final int position, View convertView, ViewGroup parent) {
        TextView productTitleTV;
        ImageView productImageIV;

        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.product, null);
        }
        productImageIV = convertView.findViewById(R.id.productImageIV);
        productTitleTV = convertView.findViewById(R.id.titleTV);
        productTitleTV.setText(product.get(position).getTitle());
        productImageIV.setImageResource(product.get(position).getDrawable());
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext, ProductDetailsActivity.class));
            }
        });


        return convertView;
    }


}

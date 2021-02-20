package com.example.amreenassignment.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.amreenassignment.adapter.ExpandableHeightGridView;
import com.example.amreenassignment.classes.Product;
import com.example.amreenassignment.adapter.ProductAdapter;
import com.example.amreenassignment.R;

import java.util.ArrayList;
import java.util.List;

public class ProductListActivity extends AppCompatActivity {
    private ExpandableHeightGridView gridView;
    private ExpandableHeightGridView gridView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        init();
        adaapter();

    }

    private void adaapter() {
        List<Product>products = new ArrayList<>();
        products.add(new Product("High Heels",R.drawable.position1));
        products.add(new Product("Earthy Tones For Fall",R.drawable.position3));
        products.add(new Product("High Heels",R.drawable.position1));
        ProductAdapter productAdapter = new ProductAdapter(this,products);
        gridView.setExpanded(true);
        gridView.setVerticalScrollBarEnabled(false);
        gridView.setAdapter(productAdapter);
        List<Product>products2 = new ArrayList<>();
        products2.add(new Product("Fall Experience",R.drawable.position2));
        products2.add(new Product("My Day As Marilyn",R.drawable.position4));
        products2.add(new Product("Earthy Tones For Fall",R.drawable.position3));
        products2.add(new Product("Fall Experience",R.drawable.position5));
        ProductAdapter productAdapter2 = new ProductAdapter(this,products2);
        gridView2.setVerticalScrollBarEnabled(false);
        gridView2.setExpanded(true);
        gridView2.setAdapter(productAdapter2);
    }

    private void init() {
        gridView=findViewById(R.id.gridview);
        gridView2=findViewById(R.id.gridview2);
    }

    public void clickMenu(View view) {
        startActivity(new Intent(this, MenuActivity.class));
    }
}
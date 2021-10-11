package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.dto.ProductDTO;
import com.example.myapplication.productview.ProductAdapter;

import java.util.ArrayList;
import java.util.List;

public class ProductActivity extends AppCompatActivity {

    private ProductAdapter adapter;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        recyclerView = findViewById(R.id.rcv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1,
                LinearLayoutManager.VERTICAL, false));

        List<ProductDTO> list = new ArrayList<>();
        list.add(new ProductDTO("Сало",200,"https://www.gastronom.ru/binfiles/images/20150626/bc2762c5.jpg"));
        list.add(new ProductDTO("Морква",10,"https://fruit-time.ua/images/cache/products/04/morkva-mita-500x500.jpeg"));
        list.add(new ProductDTO("Сало",200,"https://www.gastronom.ru/binfiles/images/20150626/bc2762c5.jpg"));
        list.add(new ProductDTO("Морква",10,"https://fruit-time.ua/images/cache/products/04/morkva-mita-500x500.jpeg"));
        list.add(new ProductDTO("Сало",200,"https://www.gastronom.ru/binfiles/images/20150626/bc2762c5.jpg"));
        list.add(new ProductDTO("Морква",10,"https://fruit-time.ua/images/cache/products/04/morkva-mita-500x500.jpeg"));

        adapter = new ProductAdapter(list);
        recyclerView.setAdapter(adapter);

    }
}
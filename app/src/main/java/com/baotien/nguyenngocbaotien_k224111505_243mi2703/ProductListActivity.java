package com.baotien.nguyenngocbaotien_k224111505_243mi2703;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.baotien.nguyenngocbaotien_k224111505_243mi2703.Adapters.ProductAdapter;

import java.util.ArrayList;

import Models.*;

public class ProductListActivity extends AppCompatActivity {

    ListView lvProduct;
    ArrayList<Product> products;
    ProductAdapter adapter;

    private static final int REQUEST_CODE_ADD_PRODUCT = 999;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lvProduct = findViewById(R.id.lvProduct);
        loadProducts();
    }

    private void loadProducts() {
        products = new ArrayList<>(Datasimulation.simulateProducts());
        adapter = new ProductAdapter(this, products);
        lvProduct.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menuAdd) {
            startActivityForResult(new Intent(this, AddProductActivity.class), REQUEST_CODE_ADD_PRODUCT);
            return true;
        } else if (id == R.id.menuAbout) {
            startActivity(new Intent(this, AboutActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_ADD_PRODUCT && resultCode == RESULT_OK && data != null) {
            Product newProduct = (Product) data.getSerializableExtra("newProduct");
            if (newProduct != null) {
                newProduct.setId(products.size() + 1);
                products.add(newProduct);
                adapter.notifyDataSetChanged(); // cập nhật adapter
            }
        }
    }
}

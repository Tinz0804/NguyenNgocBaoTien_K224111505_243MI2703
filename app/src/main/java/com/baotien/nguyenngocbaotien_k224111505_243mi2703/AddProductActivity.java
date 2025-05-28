package com.baotien.nguyenngocbaotien_k224111505_243mi2703;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

import Models.Product;

public class AddProductActivity extends AppCompatActivity {

    EditText edtProductCode, edtProductName, edtProductPrice;
    Button btnSaveProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);

        edtProductCode = findViewById(R.id.edtProductCode);
        edtProductName = findViewById(R.id.edtProductName);
        edtProductPrice = findViewById(R.id.edtProductPrice);
        btnSaveProduct = findViewById(R.id.btnSaveProduct);

        btnSaveProduct.setOnClickListener(v -> {
            String code = edtProductCode.getText().toString().trim();
            String name = edtProductName.getText().toString().trim();
            String priceStr = edtProductPrice.getText().toString().trim();

            if (code.isEmpty() || name.isEmpty() || priceStr.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                return;
            }

            double price;
            try {
                price = Double.parseDouble(priceStr);
            } catch (NumberFormatException e) {
                Toast.makeText(this, "Price must be a number", Toast.LENGTH_SHORT).show();
                return;
            }

            Product newProduct = new Product(0, code, name, price, ""); // Không có ImageLink

            Intent resultIntent = new Intent();
            resultIntent.putExtra("newProduct", newProduct);
            setResult(Activity.RESULT_OK, resultIntent);
            finish();
        });
    }
}

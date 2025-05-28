package com.baotien.nguyenngocbaotien_k224111505_243mi2703.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.baotien.nguyenngocbaotien_k224111505_243mi2703.R;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

import Models.Product;

public class ProductAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Product> list;

    public ProductAdapter(Context context, ArrayList<Product> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Product getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    // ViewHolder pattern giúp tái sử dụng view hiệu quả
    private static class ViewHolder {
        ImageView imgProduct;
        TextView txtProductCode, txtProductName, txtProductPrice;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            // Inflate layout item_product.xml
            convertView = LayoutInflater.from(context).inflate(R.layout.item_product, parent, false);
            holder = new ViewHolder();
            holder.imgProduct = convertView.findViewById(R.id.imgProduct);
            holder.txtProductCode = convertView.findViewById(R.id.txtProductCode);
            holder.txtProductName = convertView.findViewById(R.id.txtProductName);
            holder.txtProductPrice = convertView.findViewById(R.id.txtProductPrice);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        // Lấy đối tượng product tại vị trí
        Product product = getItem(position);

        // Set dữ liệu lên view
        holder.txtProductCode.setText(product.getProductCode());
        holder.txtProductName.setText(product.getProductName());
        holder.txtProductPrice.setText(String.format("$%.2f", product.getUnitPrice()));

        // Load ảnh bằng Glide với placeholder và error image
        Glide.with(context)
                .load(product.getImageLink())
                .placeholder(android.R.drawable.progress_indeterminate_horizontal) // ảnh đang tải
                .error(R.drawable.ic_launcher_background) // ảnh khi lỗi
                .into(holder.imgProduct);

        return convertView;
    }
}

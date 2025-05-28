package com.baotien.nguyenngocbaotien_k224111505_243mi2703;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ImageView imgAvatar = findViewById(R.id.imgAvatar);
        TextView txtId = findViewById(R.id.txtStudentId);
        TextView txtName = findViewById(R.id.txtStudentName);
        TextView txtEmail = findViewById(R.id.txtEmail);
        TextView txtClass = findViewById(R.id.txtClass);

        // Set thông tin sinh viên
        txtId.setText("Student ID: K224111505");
        txtName.setText("Student Name: Nguyễn Ngọc Bảo Tiên");
        txtEmail.setText("Email: baotien@example.com");
        txtClass.setText("Class: 243MI2703");

        // Set avatar từ drawable
        imgAvatar.setImageResource(R.drawable.avatar);
    }
}

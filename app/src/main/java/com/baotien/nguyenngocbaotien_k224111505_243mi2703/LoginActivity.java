package com.baotien.nguyenngocbaotien_k224111505_243mi2703;

import android.content.*;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
import Models.*;

public class LoginActivity extends AppCompatActivity {

    EditText edtUser, edtPass;
    CheckBox chkSave;
    SharedPreferences prefs;
    List<Account> accounts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUser = findViewById(R.id.edtUsername);
        edtPass = findViewById(R.id.edtPassword);
        chkSave = findViewById(R.id.chkSaveLogin);
        prefs = getSharedPreferences("loginPrefs", MODE_PRIVATE);

        if (prefs.getBoolean("saveLogin", false)) {
            edtUser.setText(prefs.getString("username", ""));
            edtPass.setText(prefs.getString("password", ""));
            chkSave.setChecked(true);
        }

        accounts = Datasimulation.simulateAccounts(); // Lấy danh sách tài khoản

        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this::do_login);
    }

    public void do_login(View view) {
        String u = edtUser.getText().toString().trim();
        String p = edtPass.getText().toString().trim();

        for (Account acc : accounts) {
            if (acc.getUsername().equals(u) && acc.getPassword().equals(p)) {
                if (chkSave.isChecked()) {
                    prefs.edit().putBoolean("saveLogin", true)
                            .putString("username", u)
                            .putString("password", p)
                            .apply();
                } else {
                    prefs.edit().clear().apply(); // nếu không lưu thì xóa prefs
                }
                startActivity(new Intent(this, ProductListActivity.class));
                finish();
                return;
            }
        }
        Toast.makeText(this, "Login failed", Toast.LENGTH_SHORT).show();
    }
}

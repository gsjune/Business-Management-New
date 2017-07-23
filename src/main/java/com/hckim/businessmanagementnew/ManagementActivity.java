package com.hckim.businessmanagementnew;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class ManagementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management);

        Intent intent = getIntent();
        if (intent != null) {
            String login = intent.getStringExtra("data");
            Toast.makeText(this, login, Toast.LENGTH_SHORT).show();
        }
    }

    public void onCustomerManagementButtonClicked(View view) {
        Intent intent = new Intent();
        intent.putExtra("message", "고객관리");
        setResult(RESULT_OK, intent);
        finish();
    }

    public void onSalesManagementButtonClicked(View view) {
        Intent intent = new Intent();
        intent.putExtra("message", "매출관리");
        setResult(RESULT_OK, intent);
        finish();
    }

    public void onMerchandiseManagementButtonClicked(View view) {
        Intent intent = new Intent();
        intent.putExtra("message", "상품관리");
        setResult(RESULT_OK, intent);
        finish();
    }
}

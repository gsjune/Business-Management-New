package com.hckim.businessmanagementnew;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ManagementOhActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management_oh);

        findViewById(R.id.customer_management_button).setOnClickListener(this); // (1) Alt Enter
        findViewById(R.id.sales_management_button).setOnClickListener(this); // (2) Ctrl c Ctrl v
        findViewById(R.id.merchandise_management_button).setOnClickListener(this);

        if (getIntent() != null) {
            String id = getIntent().getStringExtra("id");
            String password = getIntent().getStringExtra("password");

            Toast.makeText(this, id + ", " + password, Toast.LENGTH_SHORT).show();
        }
    }

//    @Override
//    public void onClick(View view) { // 클릭된 것이 view로 넘어오므로 B(2)
//        Intent intent = new Intent();
//        String text = ((Button) view).getText().toString(); B(2)'
//        switch (view.getId()) {
//            case R.id.customer_management_button:
////                Intent intent = new Intent(); // 위 밖으로 B(1)
//                intent.putExtra("text", "고객관리");
////                setResult(RESULT_OK); // 아래 밖으로 B(1)'
////                finish(); // 아래 밖으로
//                break;
//            case R.id.sales_management_button:
//                intent.putExtra("text", "매출관리");
//                break;
//            case R.id.merchandise_management_button:
//                intent.putExtra("text", "상품관리");
//                break;
//        }
//        setResult(RESULT_OK);
//        finish();
//    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        String text = ((Button) view).getText().toString();
        intent.putExtra("text", text);
        setResult(RESULT_OK);
        finish();
    }
}

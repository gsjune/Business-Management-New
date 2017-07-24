package com.hckim.businessmanagementnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainOhActivity extends AppCompatActivity implements View.OnClickListener {

    public static final int REQUEST_CODE_LOGIN = 1000;
    private EditText mIdEditText; // (2)
    private EditText mPasswordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_oh);

        mIdEditText = (EditText) findViewById(R.id.id_edit); // (3)
        mPasswordEditText = (EditText) findViewById(R.id.password_edit);

        findViewById(R.id.login_button).setOnClickListener(this); // (1) this Alt Enter 위implements 아래Override
    }

    @Override
    public void onClick(View view) { // (1)''
        Intent intent = new Intent(); // (4)
        intent.putExtra("id", mIdEditText.getText().toString());
        intent.putExtra("password", mPasswordEditText.getText().toString());
        startActivityForResult(intent, REQUEST_CODE_LOGIN);
    }

    @Override // onac... 받을 때
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_LOGIN && resultCode == RESULT_OK && data != null) {
            String text =data.getStringExtra("text"); // data는 위로 셋째 줄 Intent data의 data
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        }
    }

}

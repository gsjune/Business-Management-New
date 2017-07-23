package com.hckim.businessmanagementnew;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE_MANAGEMENT = 1;
    private EditText mIdEditText;
    private EditText mPasswordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mIdEditText = (EditText) findViewById(R.id.identification_editText);
        mPasswordEditText = (EditText) findViewById(R.id.password_editText);

        findViewById(R.id.login_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "로그인", Toast.LENGTH_SHORT).show();
                String messageId = mIdEditText.getText().toString();
                String messagePassword = mPasswordEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, ManagementActivity.class);
                intent.putExtra("data", messageId + "\n" + messagePassword);
                startActivityForResult(intent, REQUEST_CODE_MANAGEMENT);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_MANAGEMENT && resultCode == RESULT_OK && data != null) {
            String management = data.getStringExtra("message");
            Toast.makeText(this, management, Toast.LENGTH_SHORT).show();
        }

    }
}

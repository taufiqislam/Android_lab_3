package com.example.lab3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private DeviceExpert expert = new DeviceExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }

    public void onSendMessage(View view) {

        Spinner messageView =  findViewById(R.id.deviceSpinner);
        String messageText = messageView.getSelectedItem().toString();
        List<String> menuList = expert.getDevices(messageText);
        StringBuilder devicesFormatted = new StringBuilder();
        for(String item : menuList)
        {
            devicesFormatted.append(item).append('\n');
        }
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, devicesFormatted.toString());
        startActivity(intent);
    }
}
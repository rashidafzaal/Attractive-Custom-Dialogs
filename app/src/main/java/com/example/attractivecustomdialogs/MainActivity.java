package com.example.attractivecustomdialogs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickNow();
    }

    private void clickNow()
    {
        AttractiveCustomDialogs.cameraGalleryDialog(MainActivity.this, new AttractiveCustomDialogInterface() {
            @Override
            public void onCameraClick() {
                Toast.makeText(MainActivity.this, "Camera Clicked", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onGalleryClick() {
                Toast.makeText(MainActivity.this, "Gallery Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

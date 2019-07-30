package com.example.attractivecustomdialogs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //clickNow();
        //openTermsDialog();
        showToast();
        AttractiveCustomDialogs.setStatusBarColor(this, ContextCompat.getColor(this, R.color.black));
    }

    private void showToast() {
        AttractiveCustomDialogs.showCustomToast(this, "A White text with Black background");
    }

    private void openTermsDialog() {

        AttractiveCustomDialogs.privacyTermsDialog(this,
                getResources().getString(R.string.terms),
                "Privacy Policy",
                new PrivacyTermsInterface() {
            @Override
            public void onButtonClick() {
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void clickNow() {
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

package com.example.attractivecustomdialogs;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class AttractiveCustomDialogs {

    public static void cameraGalleryDialog(Context thisContext, final AttractiveCustomDialogInterface listener) {
        final LayoutInflater inflater = (LayoutInflater) thisContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final AlertDialog.Builder builder = new AlertDialog.Builder(thisContext);
        final View layout = inflater.inflate(R.layout.camera_gallery_custom_dialog, null);
        builder.setView(layout);
        RelativeLayout useCamera = (RelativeLayout) layout.findViewById(R.id.useCameraRelative);
        RelativeLayout useGallery = (RelativeLayout) layout.findViewById(R.id.useGalleryRelative);
        final AlertDialog dialog = builder.show();

        useCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                listener.onCameraClick();
            }
        });
        useGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                listener.onGalleryClick();
            }
        });
    }


    public static void privacyTermsDialog(Context thisContext, String bodyText, String title, final PrivacyTermsInterface listener) {
        final LayoutInflater inflater = (LayoutInflater) thisContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final AlertDialog.Builder builder = new AlertDialog.Builder(thisContext);
        final View layout = inflater.inflate(R.layout.privacy_terms_dialog, null);
        builder.setView(layout);

        TextView titleTextView = (TextView) layout.findViewById(R.id.popup_title);
        TextView bodyTextView = (TextView) layout.findViewById(R.id.popup_text);
        TextView okTextView = (TextView) layout.findViewById(R.id.popup_ok);
        titleTextView.setText(title);
        bodyTextView.setText(bodyText);

        final AlertDialog dialog = builder.show();

        okTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                listener.onButtonClick();
            }
        });

    }

}

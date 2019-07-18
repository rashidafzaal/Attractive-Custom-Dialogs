package com.example.attractivecustomdialogs;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

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

}

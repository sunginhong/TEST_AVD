package com.example.test_avd;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;

import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

public class XmlAnimControl {

    public XmlAnimControl(ImageView view) {

        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                if (drawable instanceof AnimatedVectorDrawable) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    animatedVectorDrawable.start();
                }
            } else {
                if (drawable instanceof AnimatedVectorDrawableCompat) {
                    AnimatedVectorDrawableCompat animatedVectorDrawableCompat = (AnimatedVectorDrawableCompat) drawable;
                    animatedVectorDrawableCompat.start();
                }
            }
        }
    }
}

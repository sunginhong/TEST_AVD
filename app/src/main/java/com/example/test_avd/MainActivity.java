package com.example.test_avd;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

import com.example.test_avd.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    Context ctx;
    Button btnclick;
    ImageView xmlAnimT1;
    ImageView xmlAnimT2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ctx = this.getApplicationContext();

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        btnclick = findViewById(R.id.btnclick);
        // 파일 하나로 재생일 경우 xml 테스트를 위해서는 res/drawable/activity_main.xml
        // <ImageView id="@+id/xml_anim_t1" app:srcCompat="@drawable/xml_anim_t1" 경로 변경 해주시면 됩니다.
        xmlAnimT1 = findViewById(R.id.xml_anim_t1);
        // 파일 두개로 재생일 경우 (ON/OFF) xml 테스트를 위해서는 res/drawable/activity_main.xml
        // <ImageView id="@+id/xml_anim_t2" app:srcCompat="@drawable/xml_anim_t2" 경로 변경 해주시면 됩니다.
        xmlAnimT2 = findViewById(R.id.xml_anim_t2);

        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 파일 하나로 재생일 경우 재생 컨트롤
                new XmlAnimControl(xmlAnimT1);
                // 파일 두개로 재생일 경우 (ON/OFF) 재생 컨트롤
                xmlAnimT2.setSelected(!xmlAnimT2.isSelected());
            }
        });
    }
}
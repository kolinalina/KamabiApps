package com.example.kamabi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class KeyboardActivity extends AppCompatActivity {
    TextView judul, penjelasan;
    ImageView refresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_keyboard);
        getSupportActionBar().hide();

        judul = findViewById(R.id.tv_judul);
        penjelasan = findViewById(R.id.tv_penjelasan);
        refresh = findViewById(R.id.iv_refresh);

        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                judul.setText(R.string.title_keyboard);
                penjelasan.setText(R.string.opening_keyboard);
            }
        });
    }

    public void k1(View view) {
        judul.setText(R.string.k1);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk1)));
    }
    public void k2(View view) {
        judul.setText(R.string.k2);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk2)));
    }
    public void k3(View view) {
        judul.setText(R.string.k3);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk3)));
    }
    public void k4(View view) {
        judul.setText(R.string.k4);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk4)));
    }
    public void k5(View view) {
        judul.setText(R.string.k5);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk5)));
    }
    public void k6(View view) {
        judul.setText(R.string.k6);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk6)));
    }
    public void k7(View view) {
        judul.setText(R.string.k7);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk7)));
    }
    public void k8(View view) {
        judul.setText(R.string.k8);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk8)));
    }
    public void k9(View view) {
        judul.setText(R.string.k9);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk9)));
    }
    public void k10(View view) {
        judul.setText(R.string.k10);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk10)));
    }


    public void k11(View view) {
        judul.setText(R.string.k11);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk11)));
    }
    public void k12(View view) {
        judul.setText(R.string.k12);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk12)));
    }
    public void k13(View view) {
        judul.setText(R.string.k13);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk13)));
    }
    public void k14(View view) {
        judul.setText(R.string.k14);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk14)));
    }
    public void k15(View view) {
        judul.setText(R.string.k15);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk15)));
    }
    public void k16(View view) {
        judul.setText(R.string.k16);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk16)));
    }
    public void k17(View view) {
        judul.setText(R.string.k17);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk17)));
    }
    public void k18(View view) {
        judul.setText(R.string.k18);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk18)));
    }
    public void k19(View view) {
        judul.setText(R.string.k19);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk19)));
    }
    public void k20(View view) {
        judul.setText(R.string.k20);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk20)));
    }


    public void k21(View view) {
        judul.setText(R.string.k21);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk21)));
    }
    public void k22(View view) {
        judul.setText(R.string.k22);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk22)));
    }
    public void k23(View view) {
        judul.setText(R.string.k23);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk23)));
    }
    public void k24(View view) {
        judul.setText(R.string.k24);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk24)));
    }
    public void k25(View view) {
        judul.setText(R.string.k25);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk25)));
    }
    public void k26(View view) {
        judul.setText(R.string.k26);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk26)));
    }
    public void k27(View view) {
        judul.setText(R.string.k27);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk27)));
    }
    public void k28(View view) {
        judul.setText(R.string.k28);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk28)));
    }
    public void k29(View view) {
        judul.setText(R.string.k29);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk29)));
    }
    public void k30(View view) {
        judul.setText(R.string.k30);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk30)));
    }

    public void k31(View view) {
        judul.setText(R.string.k31);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk31)));
    }
    public void k32(View view) {
        judul.setText(R.string.k32);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk32)));
    }
    public void k33(View view) {
        judul.setText(R.string.k33);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk33)));
    }
    public void k34(View view) {
        judul.setText(R.string.k34);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk34)));
    }
    public void k35(View view) {
        judul.setText(R.string.k35);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk35)));
    }
    public void k36(View view) {
        judul.setText(R.string.k36);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk36)));
    }
    public void k37(View view) {
        judul.setText(R.string.k37);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk37)));
    }
    public void k38(View view) {
        judul.setText(R.string.k38);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk38)));
    }
    public void k39(View view) {
        judul.setText(R.string.k39);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk39)));
    }
    public void k40(View view) {
        judul.setText(R.string.k40);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk40)));
    }


    public void k41(View view) {
        judul.setText(R.string.k41);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk41)));
    }
    public void k42(View view) {
        judul.setText(R.string.k42);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk42)));
    }
    public void k43(View view) {
        judul.setText(R.string.k43);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk43)));
    }
    public void k44(View view) {
        judul.setText(R.string.k44);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk44)));
    }
    public void k45(View view) {
        judul.setText(R.string.k45);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk45)));
    }
    public void k46(View view) {
        judul.setText(R.string.k46);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk46)));
    }
    public void k47(View view) {
        judul.setText(R.string.k47);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk47)));
    }
    public void k48(View view) {
        judul.setText(R.string.k48);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk48)));
    }
    public void k49(View view) {
        judul.setText(R.string.k49);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk49)));
    }
    public void k50(View view) {
        judul.setText(R.string.k50);
        penjelasan.setText(Html.fromHtml(getString(R.string.kk50)));
    }
}
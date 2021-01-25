package com.example.kamabi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;


public class PenerapanActivity extends AppCompatActivity {
    TextView tvklik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_penerapan);
        getSupportActionBar().hide();

        tvklik = findViewById(R.id.tv_klik);

        String a1ax = String.valueOf(R.string.aa1a);
        String a1a = "<sup> خ</sup>فَصْلٌ";
        String a1b = "<sup> ظز</sup>فِيْ مَاهِيَةِ الْعِلْمِ ";
        String a1c = "وَالْفِقْهِ وَفَضْلِهِ";

        String a2a = "قَالَ ";
        String a2b = "<sup> فا</sup>رَسُوْلُ اللّهِ ";
        String a2c = ".ص.م : ";
        String a2d = "<sup> م </sup>طَلَبُ الْعِلْمِ ";
        String a2e = "<sup> خ</supفَرِيْضَةٌ ";
        String a2f = "عَلَى كُلِّ مُسْلِمٍ وَمُسْلِمَةٍ. اِعْلَمْ ";
        String a2g = "<sup> مط </sup>بِاَنَّهُ ";
        String a2h = "<sup> خ </sup>لَا يُفْتَرَضٌ ";

        String a3ax = "عَلَى كُلِّ مُسْلِمٍ وَمُسْلِمَةٍ ";
        String a3b = "<sup>ف</sup>طَلَبٌ ";
        String a3cx = "كُلِّ عِلْمٍ بَلْ يُفْتَرَضُ عَلَيْهِ ";
        String a3d = "<sup>ف</sup>طَلَبٌ ";
        String a3ex = "عِلْمِ الْحَالِ كَمَا ";
        String a3f = "<sup>ص</sup>يُقَالُ";

        String a4a = "<sup>م</sup>اَفْضَلُ الْعِلْمِ ";
        String a4b = "<sup>خ</sup>عِلْمُ الْحَالِ ";
        String a4cx = "وَ";
        String a4d = "<sup>م</sup>اَفْضَلُ الْعَمَلِ ";
        String a4e = "<sup>خ</sup>حِفْظُ الْحَالِ ";
        String a4fx = "وَيُفْتَرَضُ عَلَى الْمُسْلِمِ ";
        String a4g = "<sup>ف</sup>طَلَبُ عِلْمِ";

        String a5a = "مَا<sup>ص</sup>يَقَعُ";
        String a5b = "<sup>ل</sup>لَهُ ";
        String a5c = "<sup>ظز</sup>فِيْ حَالِهِ ";
        String a5d = "فِيْ اَىِّ حَالٍ<sup>ظز</sup> ";
        String a5e = "<sup>ن</sup>كَانَ ";
        String a5f = "<sup>خ ج</sup>فَاِنَّهُ ";
        String a5g = "<sup>خ</sup>لَا بُدَّ ";
        String a5h = "<sup>ل</sup>لَهُ ";
        String a5i = "<sup>ف</sup>مِنَ الصَّلَاةِ ";
        String a5j = "<sup>ج</sup>فَيُفْتَرَضُ ";
        String a5kx = "عَلَيْهِ";

        String a6a = "<sup>ف</sup>عِلْمُ مَا ";
        String a6b = "<sup>ص</sup>يَقَعُ ";
        String a6c = "<sup>ل</sup>لَهُ ";
        String a6d = "<sup>ظز</sup>فِيْ صَلَاتِهِ ";
        String a6e = "<sup>مط</sup>بِقَدْرِمَا ";
        String a6f = "<sup>ص</sup>يُؤَدِّىْ ";
        String a6g = "<sup>مط</sup>بِهِ ";
        String a6h = "<sup>مف</sup>فَرْضَ الصَّلَاةِ ";
        String a6ix = "وَيَجِبُ عَلَيْهِ ";
        String a6j = "<sup>ف</sup>عِلْمُ مَا";

        String a7a = "<sup>ص</sup>يَقَعُ ";
        String a7b = "<sup>ل</sup>لَهُ ";
        String a7c = "<sup>مط</sup>بِقَدْرِ مَا ";
        String a7d = "<sup>ص</sup>يُؤَدِّىْ ";
        String a7e = "<sup>مط</sup>بِهِ ";
        String a7f = "<sup>مف</sup>الْوَاجِبَ ";
        String a7g = "<sup>ع</sup>لِاَنَّ مَا ";
        String a7h = "<sup>ص</sup>يُتَوَسَّلُ ";
        String a7i = "<sup>ف</sup>بِهِ ";
        String a7j = "<sup>ما</sup>اِلَى اِقَامَةِ الْفَرْضِ";

        String a8a = "<sup>خ</sup>يَكُوْنُ ";
        String a8b = "<sup>خ</sup>فَرْضًا ";
        String a8cx = "وَمَا ";
        String a8d = "<sup>ص</sup>يُتَوَسَّلُ ";
        String a8e = "<sup>ف</sup>بِهِ ";
        String a8f = "<sup>ما</sup>اِلَى اِقَامَةِ الْوَاجِبِ  ";
        String a8g = "<sup>خ</sup>يَكُوْنُ ";
        String a8h = "<sup>خ</sup>وَاجِبًا ";
        String a8ix = "وَكَذَلِكَ ";
        String a8j = "<sup>ظز</sup>فِيْ الصَّوْمِ وَالزَّكَاةِ ";

        String a9a = "<sup>ش</sup>اِنْ كَانَ ";
        String a9b = "<sup>خ</sup>لَهُ ";
        String a9c = "<sup>ف</sup>مَالٌ ";
        String a9dx = "وَالْحَجِّ اِنْ وَجَبَ عَلَيْهِ وَكَذَلِكَ ";
        String a9e = "<sup>ظز</sup>فِيْ الْبُيُوْعِ ";
        String a9f = "<sup>ش</sup>اِنْ كَانَ  ";
        String a9g = "<sup>خ</sup>يَتَّجِرُ ";
        String a9hx = "قِيْلَ ";


        String a10a = "<sup>ما</sup>لِمُحَمَّدِبْنِ الْحَسَنِ ";
        String a10b = "<sup>د</sup>رَحِمَهُ  ";
        String a10c = "<sup>فا</sup>اللّهُ ";
        String a10dx = "اَلَا تُصَنِّفُ ";
        String a10e = "<sup>مف</sup>كِتَابًا ";
        String a10f = "<sup>ظز</sup>فِىْ الزُّهْدِ  ";
        String a10gx = "قَالَ : ";
        String a10h = "<sup>بد</sup>صَنَّفْتُ  ";
        String a10i = "<sup>مف</sup>كِتَابًا  ";
        String a10j = "<sup>ظز</sup>فِى البُيُوْعِ ";

//        11/8 ax,hx
//        12/10 dx,gx,ix
//        13/3 ax cx
//        14/8 fx
//        15/8 gx
//        16/5 ax, cx
//        17/9 bx ex hx
//        18/9 cx gx ix
//        19/7 ax gx
//        20/5 ax ex
//        21/2 ax
//        22/5 ax ex
//        23/2 ax
//        24/5 ax ex
//        25/1 ax
//        26/4 dx
//        27/4 dx
//        28/4 dx
//        29/2 bx
//        30/4 ax dx
//        31/8 bx dx gx
//        32/4 ax
//        33/9 ax cx fx ix
//        34/7 bx gx
//        35/10 ex
//        36/8 ex hx
//        37/6 dx
//        38/5 ex
//        39/9 dx hx
//        40/8 ax cx
//        41/7 ax dx
//        42/4 ax cx
//        43/9
//        44/6 bx dx ex
//        45/9 ex hx
//        46/6 bx ex
//        47/10 ax ex gx
//        48/8 bx ex gx
//        49/12 ex gx
//        50/12 ax ex ix kx
//        51/9 hx
//        52/10 ax cx fx jx
//        53/11 bx dx fx ix kx
//        54/11 bx ex jx






        SpannableStringBuilder spanText = new SpannableStringBuilder();
        spanText.append(a1ax);
        spanText.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                com.example.kamabi.a1a exampleDialog = new a1a();
                exampleDialog.show(getSupportFragmentManager(), "example dialog");
            }

            @Override
            public void updateDrawState(TextPaint textPaint) {
                textPaint.setColor(getResources().getColor(R.color.purple_200));    // you can use custom color
                textPaint.setUnderlineText(false);    // this remove the underline
            }
        }, spanText.length() - a1ax.length(), spanText.length(), 0);

//        spanText.append(a1b);
//        spanText.setSpan(new ClickableSpan() {
//            @Override
//            public void onClick(View widget) {
//                com.example.kamabi.a1b exampleDialog = new a1b();
//                exampleDialog.show(getSupportFragmentManager(), "example dialog");
//            }
//
//            @Override
//            public void updateDrawState(TextPaint textPaint) {
//                textPaint.setColor(getResources().getColor(R.color.purple_500));    // you can use custom color
//                textPaint.setUnderlineText(false);    // this remove the underline
//            }
//        }, spanText.length() - a1b.length(), spanText.length(), 0);
//        spanText.append(a1c);


        tvklik.setMovementMethod(LinkMovementMethod.getInstance());
//        Spanned parseText = Html.fromHtml(String.valueOf(spanText));
        tvklik.setText(spanText,TextView.BufferType.SPANNABLE);


    }
}
package com.aneeshkreatives.materialpalette;

import android.databinding.DataBindingUtil;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.aneeshkreatives.materialpalette.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityMainBinding bind;
    private ActionBar mActionBar;
    private Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mActionBar = getSupportActionBar();
        window = getWindow();
        bind.redButton.setOnClickListener(MainActivity.this);
        bind.pinkButton.setOnClickListener(MainActivity.this);
        bind.purpleButton.setOnClickListener(MainActivity.this);
        bind.deepPurpleButton.setOnClickListener(MainActivity.this);
        bind.indigoButton.setOnClickListener(MainActivity.this);
        bind.blueButton.setOnClickListener(MainActivity.this);
        bind.lightBlueButton.setOnClickListener(MainActivity.this);
        bind.cyanButton.setOnClickListener(MainActivity.this);
        bind.tealButton.setOnClickListener(MainActivity.this);
        bind.greenButton.setOnClickListener(MainActivity.this);
        bind.lightGreenButton.setOnClickListener(MainActivity.this);
        bind.limeButton.setOnClickListener(MainActivity.this);
        bind.yellowButton.setOnClickListener(MainActivity.this);
        bind.amberButton.setOnClickListener(MainActivity.this);
        bind.orangeButton.setOnClickListener(MainActivity.this);
        bind.deepOrangeButton.setOnClickListener(MainActivity.this);
        bind.brownButton.setOnClickListener(MainActivity.this);
        bind.greyButton.setOnClickListener(MainActivity.this);
        bind.blueGreyButton.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View view) {
        TextView textView = (TextView) view;
        switch (view.getId()) {
            case R.id.redButton:
                mActionBar.setTitle(textView.getText().toString().toUpperCase());
                window.setStatusBarColor(getResources().getColor(R.color.colorRedAccent));
                mActionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorRed)));
                break;
            case R.id.pinkButton:
                mActionBar.setTitle(textView.getText().toString().toUpperCase());
                window.setStatusBarColor(getResources().getColor(R.color.colorPinkAccent));
                mActionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPink)));
                break;
            case R.id.purpleButton:
                mActionBar.setTitle(textView.getText().toString().toUpperCase());
                window.setStatusBarColor(getResources().getColor(R.color.colorPurpleAccent));
                mActionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPurple)));
                break;
            case R.id.deepPurpleButton:
                mActionBar.setTitle(textView.getText().toString().toUpperCase());
                window.setStatusBarColor(getResources().getColor(R.color.colorDeepPurpleAccent));
                mActionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorDeepPurple)));
                break;
            case R.id.indigoButton:
                mActionBar.setTitle(textView.getText().toString().toUpperCase());
                window.setStatusBarColor(getResources().getColor(R.color.colorIndigoAccent));
                mActionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorIndigo)));
                break;
            case R.id.blueButton:
                mActionBar.setTitle(textView.getText().toString().toUpperCase());
                window.setStatusBarColor(getResources().getColor(R.color.colorBlueAccent));
                mActionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorBlue)));
                break;
            case R.id.lightBlueButton:
                mActionBar.setTitle(textView.getText().toString().toUpperCase());
                window.setStatusBarColor(getResources().getColor(R.color.colorLightBlueAccent));
                mActionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorLightBlue)));
                break;
            case R.id.cyanButton:
                mActionBar.setTitle(textView.getText().toString().toUpperCase());
                window.setStatusBarColor(getResources().getColor(R.color.colorCyanAccent));
                mActionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorCyan)));
                break;
            case R.id.tealButton:
                mActionBar.setTitle(textView.getText().toString().toUpperCase());
                window.setStatusBarColor(getResources().getColor(R.color.colorTealAccent));
                mActionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorTeal)));
                break;
            case R.id.greenButton:
                mActionBar.setTitle(textView.getText().toString().toUpperCase());
                window.setStatusBarColor(getResources().getColor(R.color.colorGreenAccent));
                mActionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorGreen)));
                break;
            case R.id.lightGreenButton:
                mActionBar.setTitle(textView.getText().toString().toUpperCase());
                window.setStatusBarColor(getResources().getColor(R.color.colorLightGreenAccent));
                mActionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorLightGreen)));
                break;
            case R.id.limeButton:
                mActionBar.setTitle(textView.getText().toString().toUpperCase());
                window.setStatusBarColor(getResources().getColor(R.color.colorLimeAccent));
                mActionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorLime)));
                break;
            case R.id.yellowButton:
                mActionBar.setTitle(textView.getText().toString().toUpperCase());
                window.setStatusBarColor(getResources().getColor(R.color.colorYellowAccent));
                mActionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorYellow)));
                break;
            case R.id.amberButton:
                mActionBar.setTitle(textView.getText().toString().toUpperCase());
                window.setStatusBarColor(getResources().getColor(R.color.colorAmberAccent));
                mActionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorAmber)));
                break;
            case R.id.orangeButton:
                mActionBar.setTitle(textView.getText().toString().toUpperCase());
                window.setStatusBarColor(getResources().getColor(R.color.colorOrangeAccent));
                mActionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorOrange)));
                break;
            case R.id.deepOrangeButton:
                mActionBar.setTitle(textView.getText().toString().toUpperCase());
                window.setStatusBarColor(getResources().getColor(R.color.colorDeepOrangeAccent));
                mActionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorDeepOrange)));
                break;
            case R.id.brownButton:
                mActionBar.setTitle(textView.getText().toString().toUpperCase());
                window.setStatusBarColor(getResources().getColor(R.color.colorBrownAccent));
                mActionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorBrown)));
                break;
            case R.id.greyButton:
                mActionBar.setTitle(textView.getText().toString().toUpperCase());
                window.setStatusBarColor(getResources().getColor(R.color.colorGreyAccent));
                mActionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorGrey)));
                break;
            case R.id.blueGreyButton:
                mActionBar.setTitle(textView.getText().toString().toUpperCase());
                window.setStatusBarColor(getResources().getColor(R.color.colorBlueGreyAccent));
                mActionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorBlueGrey)));
                break;
        }

    }
}

package com.eaglet.unigo.Match;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.eaglet.unigo.R;

public class MathDialog extends Dialog{
    public Activity c;
    public Dialog d;
    public Button cancel;
    public TextView txtMessage;
    public TextView txtTitle;
    public Button btnYes;

    public MathDialog(@NonNull Activity activity) {
        super(activity);
        this.c = activity;
        d = this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.match_dialog);
        setCancelable(false);

        cancel = (Button) findViewById(R.id.btn_cancel);
        txtMessage = (TextView) findViewById(R.id.txt_dialog_message);
        txtTitle = (TextView) findViewById(R.id.txt_dialog_title);
        btnYes = (Button) findViewById(R.id.btn_yse);
    }


}

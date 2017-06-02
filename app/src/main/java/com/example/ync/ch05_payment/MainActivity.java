package com.example.ync.ch05_payment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View v) {
        //display selection when click button
        TextView qualityHint = (TextView) findViewById(R.id.quantityHint);
        RadioGroup qtyType = (RadioGroup) findViewById(R.id.quantityType);
        int id = qtyType.getCheckedRadioButtonId();
        RadioButton select = (RadioButton) findViewById(id);
        qualityHint.setText(select.getText());

        //Other way: display selection when click button
        TextView txvPayHint = (TextView) findViewById(R.id.paymentHint);
        RadioGroup payType = (RadioGroup) findViewById(R.id.paymentType);

        switch (payType.getCheckedRadioButtonId()) {
            case R.id.paymentCOD:
                txvPayHint.setText(getString(R.string.paymentCOD));
                break;
            case R.id.paymentCredit:
                txvPayHint.setText(R.string.paymentCredit);
                break;
            case R.id.paymentPalPay:
                txvPayHint.setText(getResources().getString(R.string.paymentPalPay));
                break;
                /*default:
                txvPayHint.setText(R.string.paymentCOD);
                雖會顯示, 但沒有選取Button, 最好選取checked屬性*/
        }

    }
}
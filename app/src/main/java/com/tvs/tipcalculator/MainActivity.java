package com.tvs.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Declaration of variables
    private EditText mAmountEditText;
    private ImageButton mExcellent, mAverage, mSad;
    private TextView mDiscount;
    private TextView mTotalAmount;

    private static final int TEN_PER = 10;
    private static final int FIFTEEN_PER = 15;
    private static final int TWENTY_PER = 20;

    float amount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // defining , giving the memory
        mAmountEditText = findViewById(R.id.amount);
        mExcellent = findViewById(R.id.excellent);
        mAverage = findViewById(R.id.average);
        mSad = findViewById(R.id.sad);
        mDiscount=findViewById(R.id.discount);
        mTotalAmount=findViewById(R.id.total_amount_tv);

        //usage  and setting listener
        mSad.setOnClickListener(this);
        mExcellent.setOnClickListener(this);
        mAverage.setOnClickListener(this);
        String amount = mAmountEditText.getText().toString();

    }

    @Override
    public void onClick(View v) {
        amount = Float.parseFloat(mAmountEditText.getText().toString());
        float discountAmount = 0;
        float totalToBePaid = 0;
        int id = v.getId();
        switch (id){
            case R.id.sad:
                discountAmount =(amount*TEN_PER/100);
                mDiscount.setText(String.valueOf(discountAmount));
                totalToBePaid = amount -discountAmount;
                mTotalAmount.setText(String.valueOf(totalToBePaid));
                break;
            case R.id.average:
                discountAmount =(amount*FIFTEEN_PER/100);
                mDiscount.setText(String.valueOf(discountAmount));
                totalToBePaid = amount -discountAmount;
                mTotalAmount.setText(String.valueOf(totalToBePaid));
                break;
            case R.id.excellent:
                discountAmount =(amount*TWENTY_PER/100);
                mDiscount.setText(String.valueOf(discountAmount));
                totalToBePaid = amount -discountAmount;
                mTotalAmount.setText(String.valueOf(totalToBePaid));
                break;

        }
    }
}

package com.example.quizno1;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
     
        public class MainActivity extends AppCompatActivity 
        {
      
          @Override
           protected void onCreate(Bundle savedInstanceState) 
           {
           super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_main);
           }
           public void submitAnswers(View view)
           {
           EditText answerQ1 = (EditText) findViewById(R.id.answer_powerhouse);
           String answer = answerQ1.getText().toString();
           RadioButton buenos_aires = (RadioButton) findViewById(R.id.buenos_aires);
           boolean isbuenos_aires = buenos_aires.isChecked();
           RadioButton lima = (RadioButton) findViewById(R.id.lima);
           boolean islima = lima.isChecked();
           RadioButton nicosia = (RadioButton) findViewById(R.id.nicosia);
           boolean isnicosia = nicosia.isChecked();
           CheckBox samsung = (CheckBox) findViewById(R.id.samsung);
           boolean issamsung = samsung.isChecked();
           CheckBox ios = (CheckBox) findViewById(R.id.ios);
           boolean isios = ios.isChecked();
           CheckBox android = (CheckBox) findViewById(R.id.android);
           boolean isandroid = android.isChecked();
           RadioButton stan = (RadioButton) findViewById(R.id.stan);
           boolean isstan = stan.isChecked();
           RadioButton cartman = (RadioButton) findViewById(R.id.cartman);
           boolean iscartman = cartman.isChecked();
           RadioButton butters = (RadioButton) findViewById(R.id.butters);
           boolean isbutters = butters.isChecked();
           RadioButton tu = (RadioButton) findViewById(R.id.tu) ;
           boolean istu = tu. isChecked();
           RadioButton ta = (RadioButton) findViewById(R.id.ta) ;
           boolean ista = ta. isChecked();
           RadioButton w = (RadioButton) findViewById(R.id.w) ;
           boolean isw = w. isChecked();
           int resultQ1 = calculateResultQ1(answer);
           int resultQ2 = calculateResultQ2(islima);
           int resultQ3 = calculateResultQ3(issamsung, isios, isandroid);
           int resultQ4 = calculateResultQ4(iscartman);      
           int resultQ5 = calculateResultQ5(isw);     
           int result = resultQ1 + resultQ2 + resultQ3 + resultQ4 + resultQ5;
           Toast.makeText(this, "Good job! Your score is " + result + ". Thank you for participating!", Toast.LENGTH_LONG).show();
             }
          
            private int calculateResultQ1(String userAnswer)
            {
            int result = 0;
            String answer = "Mitochondria";
            if (userAnswer.equals(answer)) {
            result = 1;
             }
             return result;
               }
            private int calculateResultQ2(boolean lima) 
            {
            int result = 0;
            if (lima) 
            {
            result = 1;
            }      
            return result;
            }
      
             private int calculateResultQ3(boolean samsung, boolean ios, boolean android) {
             int result = 0;
             if (ios && android) 
             {
             result = 1;
              }
            if (samsung) 
            {
             result = 0;
            }
            return result;
            }
        
            private int calculateResultQ4(boolean cartman)
            {
            int result = 0;
            if (cartman)
            {
            result = 1;
            }
            return result;
            }
            private int calculateResultQ5(boolean w) 
            {
            int result = 0;
            if (w) 
            {
            result = 1;
             }
            return result;
             }
         }

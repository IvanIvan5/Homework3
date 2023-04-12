package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        float Adulttickets = 9;
        float Childrentickets = 11;
        float Oldpeopletickets = 5;
        float account = 0;


        account = 70*Adulttickets+ (70-(70/100*50))*Childrentickets + (70-(70/100*30))*Oldpeopletickets;

        //Вывод результатов
        TextView AdultticketsTextView = findViewById(R.id.Adulttickets);
        AdultticketsTextView.setText(Adulttickets + " Билетов для взрослых ");
        TextView ChildrenticketsTextView = findViewById(R.id.Childrentickets);
        ChildrenticketsTextView.setText(Childrentickets + " Детских билетов " );
        TextView  OldpeopleticketsTextView = findViewById(R.id. Oldpeopletickets);
        OldpeopleticketsTextView.setText(Oldpeopletickets + " Билетов для пожилых  ");
        TextView accountTextView = findViewById(R.id.account);
        accountTextView.setText("Стоимость всех билетов составляет" + account + "монет");
    }
}
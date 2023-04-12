package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

package com.example.homework1;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Гардероб
        float coat = 70;
        byte coatDiscount = 45;
        float hat = 25;
        byte hatDiscount = 37;
        //Счет
        double account = 100;

        //Сумма всех товаров
        double sumAll= (coat-(coat * coatDiscount/100)) + (hat -(hat * hatDiscount/100));

        //Вывод результатов
        TextView resultTextView = findViewById(R.id.resultTextView);
        if (account>=sumAll) resultTextView.setText("Имеющихся средств для покупки делового гардероба достаточно");
        else resultTextView.setText("Денег недостаточно");
        TextView coatTextView = findViewById(R.id.coat);
        coatTextView.setText(" Стоимость пальто " + coat + " монет ");
        TextView coatDiscountTextView = findViewById(R.id.coatDiscount);
        coatDiscountTextView.setText(" Скидка на пальто " + coatDiscount );
        TextView  hatTextView = findViewById(R.id. hat);
        hatTextView.setText(" Стоимость шляпы " + hat + " монет ");
        TextView hatDiscountTextView = findViewById(R.id.hatDiscount);
        hatDiscountTextView.setText(" Скидка на шляпу " + hatDiscount);
        TextView accountTextView = findViewById(R.id.account);
        accountTextView.setText(" Ваш баланс составляет " + account + " монет ");
    }
}
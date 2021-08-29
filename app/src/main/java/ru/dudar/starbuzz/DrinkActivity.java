package ru.dudar.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {
    public static final String EXTRA_DRINKID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

//        ActionBar actionBar = getActionBar();
//        actionBar.setDisplayHomeAsUpEnabled(true);

        //Get the drink from the intent
        int drinkId = (Integer)getIntent().getExtras().get(EXTRA_DRINKID);
        Drink drink = Drink.drinks[drinkId];

        //Populate the drink name
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(drink.getName());

        //Populate the drink description
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(drink.getDescription());

        //Populate the drink image
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());
    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Заполнение меню; элементы (если они есть)
//        // добавляются на панель действий.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return super.onCreateOptionsMenu(menu);
//    }
}
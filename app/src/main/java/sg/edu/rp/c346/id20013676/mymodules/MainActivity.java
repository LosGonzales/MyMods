package sg.edu.rp.c346.id20013676.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView c346Text = findViewById(R.id.c346);
        TextView c349Text = findViewById(R.id.c349);

        c346Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("modCode", "C346");
                intent.putExtra("modName", "Android Programming");
                intent.putExtra("modYear", 2021);
                intent.putExtra("modSem", 2);
                intent.putExtra("modCred", 4);
                intent.putExtra("modVenue", "E62E");
                startActivity(intent);
            }
        });

        c349Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("modCode", "C349");
                intent.putExtra("modName", "iPad Programming");
                intent.putExtra("modYear", 2021);
                intent.putExtra("modSem", 2);
                intent.putExtra("modCred", 4);
                intent.putExtra("modVenue", "W66M");
                startActivity(intent);
            }
        });

    }
}
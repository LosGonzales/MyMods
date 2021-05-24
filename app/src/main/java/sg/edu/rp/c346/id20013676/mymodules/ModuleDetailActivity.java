package sg.edu.rp.c346.id20013676.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        TextView code = findViewById(R.id.code);
        TextView name = findViewById(R.id.name);
        TextView year = findViewById(R.id.year);
        TextView sem = findViewById(R.id.sem);
        TextView credits = findViewById(R.id.credits);
        TextView venue = findViewById(R.id.venue);
        Button back = findViewById(R.id.buttonBack);


        Intent intentReceived = getIntent();
        String modCode = intentReceived.getStringExtra("modCode");
        code.setText(modCode);
        String modName = intentReceived.getStringExtra("modName");
        name.setText(modName);
        int modYear = intentReceived.getIntExtra("modYear", 0);
        year.setText(Integer.toString(modYear));
        int modSem = intentReceived.getIntExtra("modSem", 0);
        sem.setText(Integer.toString(modSem));
        int modCred = intentReceived.getIntExtra("modCred", 0);
        credits.setText(Integer.toString(modCred));
        String modVenue = intentReceived.getStringExtra("modVenue");
        venue.setText(modVenue);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
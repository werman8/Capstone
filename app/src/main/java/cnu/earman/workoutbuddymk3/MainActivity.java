package cnu.earman.workoutbuddymk3;

import android.content.Intent;
import android.os.Bundle;

import com.github.clans.fab.FloatingActionMenu;
import com.github.clans.fab.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    FloatingActionMenu floatingActionMenu;
    FloatingActionButton editWorkout, logWorkout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        floatingActionMenu = (FloatingActionMenu) findViewById(R.id.floatingActionMenu);
        logWorkout = (FloatingActionButton) findViewById(R.id.logWorkoutFAButton);
        editWorkout = (FloatingActionButton) findViewById(R.id.editWorkoutFAButton);
        
        logWorkout.setOnClickListener(v -> logWorkoutActivity());
        editWorkout.setOnClickListener(v -> editWorkoutActivity());
    }

    private void editWorkoutActivity() {
    }

    private void logWorkoutActivity() {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, MainSettingsActivity.class));

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

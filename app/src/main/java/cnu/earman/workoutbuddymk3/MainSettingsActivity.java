package cnu.earman.workoutbuddymk3;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.MenuItem;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

class MainSettingsActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupActionBar();

        setTitle(R.string.settings);
        addPreferencesFromResource(R.xml.preferences_main);

        findPreference("userInterface").setOnPreferenceClickListener(preference -> {
            startActivity(new Intent(this, InterfaceSettingsActivity.class));
            return true;
        });
    }

    protected void showErrorDialog(Exception e, @StringRes int title, @StringRes int message) {
        new AlertDialog.Builder(this)
                .setTitle(title)
                .setMessage(getString(message) + "\n\n" + e.getMessage())
                .setPositiveButton(R.string.okay, null)
                .create().show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

 /*   @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
            return true;
        }
        return super.onMenuItemSelected(featureId, item);
    }*/
    /**
     * Set up the {@link android.app.ActionBar}, if the API is available.
     */
    protected void setupActionBar() {
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            // Show the Up button in the action bar.
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
}


package cnu.earman.workoutbuddymk3;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.Toast;


public class InterfaceSettingsActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupActionBar();

        setTitle(R.string.preferencesUserInterfaceTitle);

        addPreferencesFromResource(R.xml.preferences_user_interface);

        findPreference("weight").setOnPreferenceClickListener(preference -> {
            showWeightPicker();
            return true;
        });

    }

    private void setupActionBar() {
    }

    private void showWeightPicker() {

        final AlertDialog.Builder d = new AlertDialog.Builder(this);
        final SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        d.setTitle(getString(R.string.pref_weight));
        View v = getLayoutInflater().inflate(R.layout.dialog_weight_picker, null);
        NumberPicker np = v.findViewById(R.id.weightPicker);
        final String preferenceVariable = "weight";
        np.setWrapSelectorWheel(false);

        d.setView(v);

        d.setNegativeButton(R.string.cancel, null);
        d.setPositiveButton(R.string.okay, (dialog, which) -> {
            int unitValue = np.getValue();
        });

        d.create().show();
    }

}

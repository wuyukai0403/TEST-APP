package xyz.c312314;

import android.app.AlertDialog;
import android.database.DataSetObserver;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import xyz.c312314.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.fab.setOnClickListener(view -> {
            View root = getLayoutInflater()
                    .inflate(R.layout.dialog, null);
            EditText editText = root.findViewById(R.id.editText2);
            AlertDialog res = new AlertDialog.Builder(this)
                    .setView(root)
                    .setPositiveButton("OK", (dialog, id) -> {
                        ServerListAdapter.setServerName(editText.getText().toString());
                    })
                    .create();
            res.show();
        });

        binding.list.setAdapter(new ServerListAdapter(this));
    }
}
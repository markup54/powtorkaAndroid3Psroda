package pl.zabrze.zs10.powtorka3psroda2sem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity_2022 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2022);

        ArrayList<String> notatkiLista = new ArrayList<>();
        notatkiLista.add("zakupy");
        notatkiLista.add("do zrobienia obiad");
        notatkiLista.add("weekend kino");
        ArrayAdapter <String> notatkiAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                notatkiLista);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(notatkiAdapter);
        EditText editText = findViewById(R.id.editTextTextPersonName);
        Button button = findViewById(R.id.button2);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String coZrobic = editText.getText().toString();
                        notatkiLista.add(coZrobic);
                        notatkiAdapter.notifyDataSetChanged();
                    }
                }
        );

    }
}
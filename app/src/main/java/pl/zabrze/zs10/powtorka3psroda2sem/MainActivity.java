package pl.zabrze.zs10.powtorka3psroda2sem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String [] powitaniaCytaty = new String[]{"Dzień dobry", "Good Morning", "Buenos Dias"};
    public  int licznikWyswietlania = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView2);
        TextView textViewRozmiar = findViewById(R.id.textView);
        SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                        textViewRozmiar.setText("Rozmiar: "+Integer.toString(i));
                        textView.setTextSize(i);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        licznikWyswietlania++;
                        if(licznikWyswietlania == powitaniaCytaty.length)
                        {
                            licznikWyswietlania =0;
                        }
                       textView.setText(powitaniaCytaty[licznikWyswietlania]);
                    }
                }
        );




    }
}
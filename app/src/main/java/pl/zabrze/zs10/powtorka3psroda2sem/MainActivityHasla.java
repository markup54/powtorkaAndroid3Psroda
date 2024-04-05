package pl.zabrze.zs10.powtorka3psroda2sem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityHasla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hasla);
        EditText editTextEmail = findViewById(R.id.editTextTextPersonName2);
        EditText editTextHaslo1 = findViewById(R.id.editTextTextPersonName3);
        EditText editTextHaslo2 = findViewById(R.id.editTextTextPersonName4);
        TextView textViewKomentarz = findViewById(R.id.textView7);
        Button button = findViewById(R.id.button3);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String email = editTextEmail.getText().toString();
                        if(!email.contains("@")){
                            textViewKomentarz.setText("Email musi zawierać @");
                        }
                        else{
                            textViewKomentarz.setText("");
                        }
                    }
                }
        );
    }
}
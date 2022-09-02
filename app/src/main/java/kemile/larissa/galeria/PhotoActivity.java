package kemile.larissa.galeria;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PhotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        //obtém da Activity a ActionBar padrão
        ActionBar actionBar = getSupportActionBar();
            //habilita o botão de voltar na ActionBar
            actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
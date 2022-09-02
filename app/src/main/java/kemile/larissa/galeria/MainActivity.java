package kemile.larissa.galeria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //obtem o elemento tbMain
        Toolbar toolbar =  findViewById(R.id.tbMain);

        // indica para MainActivity que tbMain deve ser considerado como a ActionBar padrão da tela
        setSupportActionBar(toolbar);

    }
}
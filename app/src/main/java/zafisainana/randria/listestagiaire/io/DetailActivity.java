package zafisainana.randria.listestagiaire.io;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    ImageView MainImageView;
    TextView myNom, myAdresse, myEmail;

    String data1,data2,data3;
    int myImages;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        MainImageView = findViewById(R.id.MainImageView);
        myNom = findViewById(R.id.MyName);
        myAdresse = findViewById(R.id.MyAdresse);
        myEmail = findViewById(R.id.MyEmail);


        //initialisation
        getData();
        setData();
    }
    private void getData(){

        // on vérifie qu'il y a des données pour renvoyer à l'interface
        // les noms  doivent etre exactement ceux de MyAdapter
        if (getIntent().hasExtra("myImages") && getIntent().hasExtra("data1") &&
                getIntent().hasExtra("data2")&& getIntent().hasExtra("data3")){

            data1=getIntent().getStringExtra("data1");
            data2=getIntent().getStringExtra("data2");
            data3=getIntent().getStringExtra("data3");
            myImages=getIntent().getIntExtra("myImages",1);

        }else{
            // si pas de data, mais il n'y a pas de raison
            Toast.makeText(this,"pas d'entree",Toast.LENGTH_SHORT).show();
        }


    }
    private void setData(){

        myNom.setText(data1);
        myAdresse.setText(data2);
        myEmail.setText(data3);
        MainImageView.setImageResource(myImages);


    }
}

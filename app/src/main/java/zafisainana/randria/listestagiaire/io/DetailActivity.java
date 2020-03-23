package zafisainana.randria.listestagiaire.io;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    ImageView MainImageView;
    TextView Nom_Txt, Adresse_Txt, Email_Txt;

    String data1,data2,data3;
    int myImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        MainImageView = findViewById(R.id.MainImageView);
        Nom_Txt = findViewById(R.id.Nom_Txt);
        Adresse_Txt = findViewById(R.id.Adresse_Txt);
        Email_Txt = findViewById(R.id.Email_txt);

        //getData();
        //setData();
    }
    private void getData(){

        // on vérifie qu'il y a des données pour renvoyer la vue
        if (getIntent().hasExtra("myImage") && getIntent().hasExtra("data1") &&
                getIntent().hasExtra("data2")&& getIntent().hasExtra("data3")){
            data1=getIntent().getStringExtra("data1");
            data2=getIntent().getStringExtra("data2");
            data3=getIntent().getStringExtra("data3");
            myImage=getIntent().getIntExtra("myImage",1);

        }else{
            // si pas de data
            Toast.makeText(this,"pas d'entree",Toast.LENGTH_SHORT).show();
        }


    }
    private void setData(){

        Nom_Txt.setText(data1);
        Adresse_Txt.setText(data2);
        Email_Txt.setText(data3);
        MainImageView.setImageResource(myImage);


    }
}

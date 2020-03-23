package zafisainana.randria.listestagiaire.io;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class StagiaireActivity extends AppCompatActivity {

    String Nom_S[], Adresse_S[], Email_S[];
    int images[] = {R.drawable.avatar,R.drawable.avatar,R.drawable.avatar,R.drawable.avatar,
            R.drawable.avatar,R.drawable.avatar,R.drawable.avatar,R.drawable.avatar,R.drawable.avatar,
            R.drawable.avatar,R.drawable.avatar,R.drawable.avatar,
            R.drawable.avatar,R.drawable.avatar,R.drawable.avatar};
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stagiaire);

        recyclerView = findViewById(R.id.recyclerView);

        Nom_S = getResources().getStringArray(R.array.Nom_Stagiaire);
        Adresse_S = getResources().getStringArray(R.array.Adresse_Stagiaire);
        Email_S = getResources().getStringArray(R.array.Email_Stagiaire);

        MyAdapter myAdapter = new MyAdapter(this, Nom_S, Adresse_S,Email_S,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}

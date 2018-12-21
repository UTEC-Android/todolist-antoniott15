package pe.utec.cs.androidcourse.ui.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import pe.utec.cs.androidcourse.R;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    private MainPresenter presenter;

    private RecyclerView rvTasks;
    private TasksAdapter adapter;
    ArrayList<String> listDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);
        setupUI();
    }

    private void setupUI() {

        rvTasks = findViewById(R.id.rvTasks);
        rvTasks.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        listDatos = new ArrayList<String>();
        for(int i = 0; i <= 10; i++){
            listDatos.add("Dato #" + i +" de la lista");
        }
        TasksAdapter adapter = new TasksAdapter(listDatos);
        rvTasks.setAdapter(adapter);
    }

    @Override
    public void updateText(String text) {

    }
}

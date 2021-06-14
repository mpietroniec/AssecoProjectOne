package com.example.assecoprojectone;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ItemClickListener itemClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Model> models = new ArrayList<>();

        // 1
        models.add(new Model(
                "Cube",
                "https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/Cube/screenshot/screenshot.jpg",
                "https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/Cube/glTF/Cube.gltf"
        ));

        // 2
        models.add(new Model(
                "Avocado",
                "https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/Avocado/screenshot/screenshot.jpg",
                "https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/Avocado/glTF/Avocado.gltf"
        ));

        // 3
        models.add(new Model(
                "CesiumMilkTruck",
                "https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/CesiumMilkTruck/screenshot/screenshot.gif",
                "https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/CesiumMilkTruck/glTF/CesiumMilkTruck.gltf"
        ));

        // 4
        models.add(new Model(
                "DamagedHelmet",
                "https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/DamagedHelmet/screenshot/screenshot.png",
                "https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/DamagedHelmet/glTF/DamagedHelmet.gltf"
        ));

        // 5
        models.add(new Model(
                "Duck",
                "https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/Duck/screenshot/screenshot.png",
                "https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/Duck/glTF/Duck.gltf"
        ));

        // 6
        models.add(new Model(
                "Fox",
                "https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/Fox/screenshot/screenshot.jpg",
                "https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/Fox/glTF/Fox.gltf"
        ));

        // 7
        models.add(new Model(
                "Lantern",
                "https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/Lantern/screenshot/screenshot.jpg",
                "https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/Lantern/glTF/Lantern.gltf"
        ));

        // 8
        models.add(new Model(
                "BoomBox",
                "https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/BoomBox/screenshot/screenshot.jpg",
                "https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/BoomBox/glTF/BoomBox.gltf"
        ));

        // 9
        models.add(new Model(
                "FlightHelmet",
                "https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/FlightHelmet/screenshot/screenshot.jpg",
                "https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/FlightHelmet/glTF/FlightHelmet.gltf"
        ));

        // 10
        models.add(new Model(
                "BoxTextured",
                "https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/BoxTextured/screenshot/screenshot.png",
                "https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/FlightHelmet/glTF/FlightHelmet.gltf"
        ));

        mRecyclerView = findViewById(R.id.modelsRecyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ReviewAdapter(models, MainActivity.this, itemClickListener);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        
    }
}

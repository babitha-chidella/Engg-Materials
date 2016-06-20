package org.enggmat.application.engineeringmaterials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class CIVIL extends AppCompatActivity {
    String[] civil= {
            "Advanced Structural Engineering",
            "Bridge Engineering",
            "Building Materials and Construction",
            "Building Planning and Drawing",
            "Concrete Technology ",
            "Design and Drawing of Irrigation Structures ",
            "Design and Drawing of Reinforced Concrete Structures",
            "Design and Drawing of Steel Structures",
            "Engineering Drawing",
            "Engineering Geology",
            "Environmental Engineering",
            "Estimating, Costing and Valuation",
            "Fluid Mechanics",
            "Geotechnical Engineering",
            "Hydraulics and Hydraulic Machinery",
            "Strength of Materials ",
            "Structural Analysis",
            "Surveying",
            "Transportation Engineering",
            "Water Resources Engineering"

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.listvie,civil);
        ListView listee= (ListView) findViewById(R.id.list);
        listee.setAdapter(adapter);
    }
}

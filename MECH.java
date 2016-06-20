package org.enggmat.application.engineeringmaterials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MECH extends AppCompatActivity {
    String[] mech= {
            "Automation and Robotics",
            "Automobile Engineering",
            "CAD/CAM",
            "Design of Machine Members",
            "Dynamics of Machinery",
            "Electrical and Electronics Engineering",
            "Engineering Drawing",
            "Engineering Mechanics",
            "Finite Element Methods",
            "Heat Transfer",
            "Hydraulic Machinery",
            "Industrial Engineering and Management",
            "Kinematics of Machinery",

            "Machine Drawing",
            "Machine Tools",

            "Manufacturing Technology",
            "Material Science and Engineering",
            "Mechanics of Fluids ",
            "Mechanics of Solids",
            "Metal Forming Processes",
            "Metrology and Measurements",
            "Operations Research",
            "Power Plant Engineering",
            "Refrigeration and Air Conditioning",
            "Thermal Engineering",

            "Thermodynamics"

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mech);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.listvie,mech);
        ListView listee= (ListView) findViewById(R.id.list);
        listee.setAdapter(adapter);

    }
}

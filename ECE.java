package org.enggmat.application.engineeringmaterials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ECE extends AppCompatActivity {
    String[] ece= {
            "Analog Electronic Circuits",
            "Control Systems Engineering",
            "Electrical Circuits ",
            "Electrical Distribution Systems",
            "Electrical Machines",
            "Electrical Power Generating Systems",
            "Electrical Power Transmission Systems",
            "Electromagnetic Fields",
            "Electronic Devices and circuits",
            "Engneering Graphics",
            "Flexible AC Transmission Systems ",
            "Fluid Mechanics and Hydraulic Machinery",
            "HVDC Transmission",
            "Linear and Digital IC Applications",
            "Microprocessors and Microcontrollers",
            "Power Electronics",
            "Power Quality",
            "Power Semiconductor Drives",
            "Power System Analysis",
            "Power System Operation and Control",
            "Power System Protection ",
            "Switching Theory and logic design",
            "Utilization Of Electrical Energy"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.listvie,ece);
        ListView listee= (ListView) findViewById(R.id.list);
        listee.setAdapter(adapter);
    }
}

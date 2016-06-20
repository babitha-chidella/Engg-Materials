package org.enggmat.application.engineeringmaterials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CSE extends AppCompatActivity {

    String[] cse={
            "Advanced Data Structures",
            "Advanced Java Programming",
            "C Programming",
            "C++ Programing(OOPS)",
            "Compiler Design",
            "Computer Networks",
            "Computer Organisation",
            "Cryptography and Network Security",
            "Data Communications",
            "Data Structures",
            "Data Warehousing and Mining",
            "Database Management Systems",
            "Design and Analysis Of Algorithm",
            "Digital Logic Design",
            "Distributed Systems",
            "Formal Languages and Automata Theory",
            "Java Programming",
            "Management Science",
            "Mathematical Opimization",
            "Mobile Computing",
            "Operating Systems",
            "Principles of Programming Languages",
            "Software Engineering",
            "Software Testing",
            "UML and Design Patterns",
            "Web Technologies"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.listvie,cse);
        ListView listee= (ListView) findViewById(R.id.list);
        listee.setAdapter(adapter);
        listee.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent j = new Intent(CSE.this, CSE_ADS.class);
                        startActivity(j);
                        break;
                    case 1:
                        Intent k = new Intent(CSE.this, CSE_AJP.class);
                        startActivity(k);
                        break;
                    case 2:
                        Intent l = new Intent(CSE.this, CSE_CP.class);
                        startActivity(l);
                        break;
                    case 3:
                        Intent m = new Intent(CSE.this, CSE_CPP.class);
                        startActivity(m);
                        break;
                    case 4:
                        Intent n=new Intent(CSE.this,CSE_CD.class);
                        startActivity(n);
                        break;
                    case 5:
                        Intent o=new Intent(CSE.this,CSE_CN.class);
                        startActivity(o);
                        break;
                    case 6:
                        Intent p=new Intent(CSE.this,CSE_CO.class);
                        startActivity(p);
                        break;
                    case 7:
                        Intent q=new Intent(CSE.this,CSE_CNS.class);
                        startActivity(q);
                        break;
                    case 8:
                        Intent r=new Intent(CSE.this,CSE_DC.class);
                        startActivity(r);
                        break;
                    case 9:
                        Intent s=new Intent(CSE.this,CSE_DS.class);
                        startActivity(s);
                        break;
                    case 10:
                        Intent t=new Intent(CSE.this,CSE_DWDM.class);
                        startActivity(t);
                        break;
                    case 11:
                        Intent u=new Intent(CSE.this,CSE_DBMS.class);
                        startActivity(u);
                        break;
                    case 12:
                        Intent v=new Intent(CSE.this,CSE_DAA.class);
                        startActivity(v);
                        break;
                    case 13:
                        Intent w=new Intent(CSE.this,CSE_DLD.class);
                        startActivity(w);
                        break;
                    case 14:
                        Intent x=new Intent(CSE.this,CSE_DIS.class);
                        startActivity(x);
                        break;
                    case 15:
                        Intent y=new Intent(CSE.this,CSE_FLAT.class);
                        startActivity(y);
                        break;
                    case 16:
                        Intent z=new Intent(CSE.this,CSE_JP.class);
                        startActivity(z);
                        break;
                    case 17:
                        Intent a=new Intent(CSE.this,CSE_MS.class);
                        startActivity(a);
                        break;
                    case 18:
                        Intent b=new Intent(CSE.this,CSE_MO.class);
                        startActivity(b);
                        break;
                    case 19:
                        Intent c=new Intent(CSE.this,CSE_MC.class);
                        startActivity(c);
                        break;
                    case 20:
                        Intent d=new Intent(CSE.this,CSE_OS.class);
                        startActivity(d);
                        break;
                    case 21:
                        Intent e=new Intent(CSE.this,CSE_PPL.class);
                        startActivity(e);
                        break;
                    case 22:
                        Intent f=new Intent(CSE.this,CSE_SE.class);
                        startActivity(f);
                        break;
                    case 23:
                        Intent g=new Intent(CSE.this,CSE_ST.class);
                        startActivity(g);
                        break;
                    case 24:
                        Intent h=new Intent(CSE.this,CSE_UML.class);
                        startActivity(h);
                        break;
                    case 25:
                        Intent i=new Intent(CSE.this,CSE_WT.class);
                        startActivity(i);
                        break;
                }
            }
        });

    }
}

package com.deverdie.array;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashSet;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {
    private HashSet<String> strSet;
    private HashSet<String> folderSet;
    private HashSet<String> folderConfigSet;
    private HashSet<String> folderConfigBlankSet;
    private TextView Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        strSet = new HashSet<String>();
        strSet.add("Cat");
        strSet.add("Dog");
        strSet.add("Pig");
        strSet.add("Rat");

        folderSet = new HashSet<String>();
        folderSet.add("Marquee");
        folderSet.add("Folder1");
        folderSet.add("Photo");
        folderSet.add("Folder2");
        folderSet.add("Folder3");
        folderSet.add("Video");
        folderSet.add("Folder4");
        folderSet.add("Program");
        folderSet.add("Folder5");
        folderSet.add("Folder6");
        folderSet.add("Folder7");

        folderConfigSet = new HashSet<String>();
//        folderConfigSet.add("Marquee");
//        folderConfigSet.add("Photo");
//        folderConfigSet.add("Video");
//        folderConfigSet.add("Program");

        folderConfigBlankSet = new HashSet<String>();

        Text = (TextView) findViewById(R.id.text);
        Button Btn = (Button) findViewById(R.id.button);
        Button Btn2 = (Button) findViewById(R.id.button2);

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean bo = strSet.contains("Cat");
                Text.setText(String.valueOf(bo));
            }
        });

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "folderSet.size():" + folderSet.size(), Toast.LENGTH_SHORT).show();

                Iterator folder = folderSet.iterator();
                while (folder.hasNext()) {
                    Log.i("dlg", "Folder Read: " + folder.next());
                }

                Iterator folderconfig = folderConfigSet.iterator();
                while (folderconfig.hasNext()) {
                    Log.i("dlg", "FolderSet Read: " + folderconfig.next());
                }

                for (String strSet : folderSet) {
                    if (folderConfigSet.contains(strSet)) {
                        Log.i("dlg", "Intersec " + strSet + " : " + folderConfigSet.contains(strSet));
                    } else {
                        Log.i("dlg", "Intersec " + strSet + " : " + folderConfigSet.contains(strSet));
                    }
                }

//                for (String strSet : folderSet) {
//                    if (folderConfigBlankSet.contains(strSet)) {
//                        Log.i("dlg", "Intersec " + strSet + " : " + folderConfigBlankSet.contains(strSet));
//                    } else {
//                        Log.i("dlg", "Intersec " + strSet + " : " + folderConfigBlankSet.contains(strSet));
//                    }
//                }

            }
        });


    }
}

package com.stackoverflow.q58278782;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fileTest();
    }

    private void fileTest() {
        byte[] data = {0, 1, 2, 3, 4};
        try (FileOutputStream stream = openFileOutput("file.dat", Context.MODE_PRIVATE)) {
            stream.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

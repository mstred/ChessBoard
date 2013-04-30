package br.aeso;

import android.app.Activity;
import android.os.Bundle;

public class ChessBoardActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Board(this));
    }
}
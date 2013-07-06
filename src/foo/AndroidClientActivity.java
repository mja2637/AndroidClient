package foo;

import maa.de.code.R;
import android.app.Activity;
import android.os.Bundle;

public class AndroidClientActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
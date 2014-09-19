package cn.gyyx.android_maven2;

import cn.gyyx.common.util.MathUtill2;
import cn.gyyx.libary.MathUtil;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.Toast;

public class HelloAndroidActivity extends Activity {

    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after 
     * previously being shut down then this Bundle contains the data it most 
     * recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        MathUtil mathUtil = new MathUtil();
        int sum = mathUtil.getSun(10, 20);
        Toast.makeText(this, sum+"", 0).show();
        
        
        MathUtill2 mathUtill2 = new MathUtill2();
       int acc = mathUtill2.getAcc(2, 3);
        
       Toast.makeText(this, acc+"", 0).show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(cn.gyyx.android_maven2.R.menu.main, menu);
	return true;
    }

}


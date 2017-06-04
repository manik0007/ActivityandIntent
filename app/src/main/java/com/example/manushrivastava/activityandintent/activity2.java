package com.example.manushrivastava.activityandintent;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        Bundle b=getIntent().getExtras();
        String data=b.getString("value1");
        int data2=b.getInt("value2");
        Toast.makeText(this,data+data2, Toast.LENGTH_LONG).show();
    }
    public void ImplicitIntent1(View v)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
       if(isIntentAvailable(getBaseContext(),i))
        startActivity(i);
    }
    public static boolean isIntentAvailable(Context ctx, Intent intent) {
        final PackageManager mgr = ctx.getPackageManager();
        List<ResolveInfo> list =
                mgr.queryIntentActivities(intent,
                        PackageManager.MATCH_DEFAULT_ONLY);
        return list.size() > 0;
    }
}

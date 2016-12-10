package com.radiantridge.restoradiantridge.activities;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.radiantridge.restoradiantridge.R;
import com.radiantridge.restoradiantridge.asynctasks.GetReviewsTask;
import com.radiantridge.restoradiantridge.listadapters.ReviewAdapter;
import com.radiantridge.restoradiantridge.objects.Restaurant;
import com.radiantridge.restoradiantridge.objects.Review;

/**
 * Created by Rafia on 2016-12-08.
 */

public class ShowReviewsActivity extends MenuActivity {
    private static final String TAG = "ShowReviewsActivity";
    private ListAdapter adapter;

    /**
     * Overridden Lifecycle method.
     * @param savedInstanceState stores the value when screen rotated
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_reviews);

        Bundle bundle = getIntent().getExtras();
        Restaurant resto = (Restaurant) bundle.getSerializable("resto");
        if (resto == null)
        {
            Log.e(TAG, "resto is null");
        }

        int id = resto.getHerokuId();

        // TODO : MAKE A LIST VIEW FOR REVIEWS

        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            new GetReviewsTask(this).execute(id);
        }
        //no connection
        else {
            Log.d(TAG, "No connection available.");
            Toast.makeText(this, R.string.net_error, Toast.LENGTH_SHORT).show();
        }
    }

    public void setListAdapter(Review[] list) {
        if (list != null)  {
            Log.i(TAG, "creating review adapter");
            ListView lv=(ListView) findViewById(R.id.review_list);
            ListAdapter adapter = new ReviewAdapter(this, list);
            lv.setAdapter(adapter);
            lv.setDivider(new ColorDrawable(ContextCompat.getColor(this, R.color.grey)));
            lv.setDividerHeight(1);
        }
    }
}


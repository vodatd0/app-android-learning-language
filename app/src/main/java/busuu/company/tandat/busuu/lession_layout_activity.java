package busuu.company.tandat.busuu;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by Windows 10 Version 2 on 9/3/2016.
 */
public class lession_layout_activity extends FragmentActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.lession_layout_activity);

        viewPager = (ViewPager) findViewById(R.id.fragment_container);
        SwipeAdapter swipeAdapter = new SwipeAdapter(getSupportFragmentManager());
        viewPager.setAdapter(swipeAdapter );
    }


}

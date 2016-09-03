package busuu.company.tandat.busuu;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Windows 10 Version 2 on 9/3/2016.
 */
public class lession_activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lession_activity);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        vocabularyFragment vocabularyFragment = new vocabularyFragment();

        fragmentTransaction.add(R.id.fragment_container, vocabularyFragment);
        fragmentTransaction.commit();
    }
}

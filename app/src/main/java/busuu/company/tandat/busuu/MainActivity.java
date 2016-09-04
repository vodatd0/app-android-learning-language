package busuu.company.tandat.busuu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Currency;

public class MainActivity extends AppCompatActivity {
    public static String PACKAGE_NAME;

    ArrayList<Lession> lstLession1 = new ArrayList<Lession>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PACKAGE_NAME = getApplicationContext().getPackageName();

        doCreateFakeData1();
        doCreateFakeData2();
        doCreateFakeData3();
        doCreateFakeData4();
        doCreateFakeData5();

        //Lấy ListView từ layout xuống
        ListView listView = (ListView) findViewById(R.id.lstView);
        //Tạo Adapter
        AdapterCustom adapter = new AdapterCustom(MainActivity.this, R.layout.custom_display, lstLession1);
        //Đỗ dữ liệu lên ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new ItemList());
    }

    class ItemList implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent intent = new Intent(MainActivity.this, lession_layout_activity.class);
            startActivity(intent);

        }
    }

    private void doCreateFakeData5() {
        Lession ls1 = new Lession();
        ls1.setNameLession("Lession 5");
        ls1.setTitle("Appearances");
        ls1.setPicture(R.drawable.lessons5);

        lstLession1.add(ls1);
    }

    private void doCreateFakeData4() {
        Lession ls1 = new Lession();
        ls1.setNameLession("Lession 4");
        ls1.setTitle("Personal");
        ls1.setPicture(R.drawable.lessons4);

        lstLession1.add(ls1);
    }

    private void doCreateFakeData3() {
        Lession ls1 = new Lession();
        ls1.setNameLession("Lession 3");
        ls1.setTitle("How are you?");
        ls1.setPicture(R.drawable.lessons3);

        lstLession1.add(ls1);
    }

    private void doCreateFakeData2() {
        Lession ls1 = new Lession();
        ls1.setNameLession("Lession 2");
        ls1.setTitle("About me");
        ls1.setPicture(R.drawable.lessons2);

        lstLession1.add(ls1);

    }


    private void doCreateFakeData1() {
        Lession ls1 = new Lession();
        ls1.setNameLession("Lession 1");
        ls1.setTitle("Greeting people");
        ls1.setPicture(R.drawable.lessons1);

        lstLession1.add(ls1);

    }
}
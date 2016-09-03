package busuu.company.tandat.busuu;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class vocalbulary_lession_fragment_layout extends Fragment {

    TextView textView;

    public vocalbulary_lession_fragment_layout() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vocalbulary_lession_fragment_layout,container,false);
        textView = (TextView) view.findViewById(R.id.txtView_test);
        Bundle bundle = getArguments();
        String messag = Integer.toString(bundle.getInt("count"));
        textView.setText("this is the " + messag + " message");
        return inflater.inflate(R.layout.fragment_vocalbulary_lession_fragment_layout, container, false);
    }

}

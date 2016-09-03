package busuu.company.tandat.busuu;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.HashMap;

/**
 * Created by Windows 10 Version 2 on 9/2/2016.
 */
public class vocabularyFragment extends android.app.Fragment implements View.OnClickListener {

    TextView txtView_next;
    int[] Array_illustration = {R.drawable.hello_in_japanese_grande,R.drawable.good_evening,R.drawable.hajimemashite};
    HashMap vocalbulary = new HashMap();

    ImageView imageView_illustration;
    TextView txtView_japanese;
    TextView txtView_Kanji;

    String[] Japanese = {"Konnichiwa", "Konbanwa","Hajimemashite"};
    String[] Romaji = {"Good Morning", "Good Evening", "Nice to meet you"};

    int i = 1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vocabulary_fragment_layout, container, false);
        txtView_next = (TextView)view.findViewById(R.id.txtView_next);
        txtView_next.setOnClickListener((View.OnClickListener) this);
        findviewbyId(view);
        return view;
    }

    private void findviewbyId(View view) {
        imageView_illustration = (ImageView) view.findViewById(R.id.imageView_illustration);
        txtView_japanese = (TextView) view.findViewById(R.id.txtView_Japanese);
        txtView_Kanji = (TextView) view.findViewById(R.id.txtView_Kanji);
    }

    @Override
    public void onClick(View v){

        imageView_illustration.setImageResource(Array_illustration[i]);
        txtView_japanese.setText(Japanese[i]);
        txtView_Kanji.setText(Romaji[i]);
        i++;

    }

}

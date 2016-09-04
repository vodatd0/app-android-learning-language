package busuu.company.tandat.busuu;


import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.InputStream;
import java.util.List;

import busuu.company.tandat.busuu.busuu.xmlpaser.Vocalbulary;
import busuu.company.tandat.busuu.busuu.xmlpaser.XMLPullParserHandler;


/**
 * A simple {@link Fragment} subclass.
 */
public class vocalbulary_lession_fragment_layout extends Fragment {

    MediaPlayer japanese_sound_words;

    TextView txtView_japanese;
    TextView txtView_english;
    TextView txtView_romaji;

    ImageView imageView_illustration;


    public vocalbulary_lession_fragment_layout() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        Bundle bundle = getArguments();
        int position = bundle.getInt("position");

        Log.i("POSITION :", " Value :" + Integer.toString(position));

        List<Vocalbulary> vocalbularyList = null;

        XMLPullParserHandler parserHandler = new XMLPullParserHandler();
        vocalbularyList = parserHandler.parse(this.getResources().openRawResource(R.raw.lessions));

//        findViewById(view);

//        txtView_japanese = (TextView)getView().findViewById(R.id.txtView_Japanese);
//        txtView_english = (TextView)getView().findViewById(R.id.txtView_Engilsh);
//        txtView_romaji = (TextView)getView().findViewById(R.id.txtView_Japanese);
//        imageView_illustration = (ImageView) getView().findViewById(R.id.imageView_illustration);
//
//        String japanese = vocalbularyList.get(position).getJapanese();
//        txtView_japanese.setText(japanese);
//
//        String english = vocalbularyList.get(position).getEnglish();
//        txtView_english.setText(english);
//
//        //change imageview dynamically
//        String imageview_illusName = vocalbularyList.get(position).getIllustration();
//        String uri_img = "@drawable/" + imageview_illusName;
//
//        int imageResource = getResources().getIdentifier(uri_img, null, MainActivity.PACKAGE_NAME);
//        Drawable res_img = getResources().getDrawable(imageResource);
//        imageView_illustration.setImageDrawable(res_img);
//
//        //change sound dunamically
//        String sound_japanese = vocalbularyList.get(position).getSound();
//        String uri_sound = "@raw/" + sound_japanese;
//
//        int res_sound = getResources().getIdentifier(uri_sound, null, MainActivity.PACKAGE_NAME);
//        japanese_sound_words = MediaPlayer.create(this.getContext(), res_sound);
//        japanese_sound_words.start();
//        View view = inflater.inflate(R.layout.fragment_vocalbulary_lession_fragment_layout,container,false);
        return inflater.inflate(R.layout.fragment_vocalbulary_lession_fragment_layout,container,false);
    }

    private void findViewById(View view) {
        txtView_japanese = (TextView)view.findViewById(R.id.txtView_Japanese);
        txtView_english = (TextView)view.findViewById(R.id.txtView_Engilsh);
        txtView_romaji = (TextView)view.findViewById(R.id.txtView_Japanese);
        imageView_illustration = (ImageView) view.findViewById(R.id.imageView_illustration);

    }

}

package busuu.company.tandat.busuu.busuu.xmlpaser;

import android.content.Context;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import busuu.company.tandat.busuu.R;

/**
 * Created by Windows 10 Version 2 on 9/4/2016.
 */
public class XMLPullParserHandler {

    List<Vocalbulary> vocalbularyList;

    private Vocalbulary vocalbulary;
    private String text;

    public  XMLPullParserHandler(){
        vocalbularyList = new ArrayList<Vocalbulary>();
    }

    public List<Vocalbulary> getVocalbularyList(){
        return vocalbularyList;
    }

    public List<Vocalbulary> parse(InputStream is){
        XmlPullParserFactory factory = null;
        XmlPullParser parser = null;

        try {
            factory = XmlPullParserFactory.newInstance();
            factory.setNamespaceAware(true);

            parser = factory.newPullParser();
            parser.setInput(is, null);

            int eventType = parser.getEventType();
            while (eventType != XmlPullParser.END_DOCUMENT){
                String tagname = parser.getName();
                switch (eventType){
                    case XmlPullParser.START_TAG:
                        if(tagname.equalsIgnoreCase("word")){
                            vocalbulary = new Vocalbulary();
                        }
                        break;

                    case XmlPullParser.TEXT:
                        text = parser.getText();
                        break;

                    case XmlPullParser.END_TAG:

                        if(tagname.equalsIgnoreCase("word")){
                            vocalbularyList.add(vocalbulary);
                        } else if(tagname.equalsIgnoreCase("japanese")){
                            vocalbulary.setJapanese(text);
                        } else if(tagname.equalsIgnoreCase("english")){
                            vocalbulary.setEnglish(text);
                        } else if(tagname.equalsIgnoreCase("romaji")){
                            vocalbulary.setRomaji(text);
                        } else if(tagname.equalsIgnoreCase("illustration")){
                            vocalbulary.setIllustration(text);
                        } else if(tagname.equalsIgnoreCase("sound")){
                            vocalbulary.setSound(text);
                        }
                        break;
                    default:
                        break;
                }
                eventType = parser.next();
            }

        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return vocalbularyList;
    }

}

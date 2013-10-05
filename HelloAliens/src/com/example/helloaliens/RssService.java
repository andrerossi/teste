package com.example.helloaliens;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;


import android.os.AsyncTask;


public class RssService extends AsyncTask<Rsshandler, Void, RssItem>{
	
	private MainActivity activity;
	
	public RssService(MainActivity activity){
		this.activity = activity;
	}
	
	protected RssItem doInBackground(RssHandler...args){
		RssHandler handler = arg0[0];
		RssItem item = null;
		
		try{
			SAXParserFactory spf = SAXParserFactory.newInstance();
			SAXParser sp = spf.newSAXParser();
			XMLReader xr = sp.getXMLReader();
			xr.setContentHandler(handler);
			
			xr.parse(new InputSource(activity.getAssets().open("iotd.xml")));
			
			item = handler.getItem();
			
		}catch (Exception e){
			e.printStackTrace();
		}
}

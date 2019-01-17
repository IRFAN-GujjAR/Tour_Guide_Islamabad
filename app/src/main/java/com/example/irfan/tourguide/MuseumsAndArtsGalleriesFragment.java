package com.example.irfan.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsAndArtsGalleriesFragment extends Fragment {


    public MuseumsAndArtsGalleriesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.places_details,container,false);

        //Creating ArrayList of type PlacesDetails Class
        ArrayList<PlacesDetails> placesDetailsArrayList=new ArrayList<PlacesDetails>();

        //Adding data to ArrayList by creating new objects of PlacesDetails Class.
        placesDetailsArrayList.add(new PlacesDetails("National Monument Islamabad","Garden Avenue، Shakarparian Rd, Islamabad",R.drawable.lok_virsa_museum,"The Pakistan Monument is a national monument and heritage museum located on the western Shakarparian Hills in Islamabad, Pakistan. The monument was constructed to symbolize the unity of the Pakistani people. Its elevation makes the monument visible from across the Islamabad-Rawalpindi metropolitan area and is a popular tourist destination.","https://en.wikipedia.org/wiki/Pakistan_Monument","10:00 AM-7:00 PM","+92-51-9249209"));
        placesDetailsArrayList.add(new PlacesDetails("National Art Gallery","F-5/1 F-5, Islamabad",R.drawable.islamabad_national_art_gallery,"National Art Gallery in Islamabad, Pakistan is the country's first national art gallery. Built on a small hillock opposite the Majlis-e-Shoora (the Parliament of Pakistan) and the Aiwan-e-Sadr. It opened to the public on Sunday, August 26, 2007. National Art Gallery, Pakistan is a part of the larger organization called Pakistan National Council of the Arts","https://en.wikipedia.org/wiki/National_Art_Gallery,_Pakistan","9:00 AM-5:00 AM","+92-51-9205273"));
        placesDetailsArrayList.add(new PlacesDetails("Pakistan Museum of Natural History","Shakarparian National Park, Garden Ave, Islamabad",R.drawable.pakistan_museum_of_natural_history,"Pakistan Museum of Natural History (PMNH), established in 1976, is a public natural history museum situated in Islamabad, the federal capital of Pakistan.[2] It has exhibits and galleries which display and provide information about the ecology, geology and palaeontology of the country. Currently, the museum houses a collection of over 300,000 objects.[1] The museum also acts as a research center and works closely with the Lok Virsa Museum.","https://en.wikipedia.org/wiki/Pakistan_Museum_of_Natural_History","9:30 AM–7:00 PM"," +92-51-9249239"));


        //Creating an ArrayAdapter
        PlacesDetailsArrayAdapter placesDetailsArrayAdapter=new PlacesDetailsArrayAdapter(getActivity(),placesDetailsArrayList,R.color.tanBackground);

        //Creating listView for dynamically displaying Lists
        ListView listView=(ListView) rootView.findViewById(R.id.lists);
        listView.setAdapter(placesDetailsArrayAdapter);

        return rootView;
    }

}

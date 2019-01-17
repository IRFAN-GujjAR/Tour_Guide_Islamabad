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
public class MainMarketsFragment extends Fragment {


    public MainMarketsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.places_details,container,false);

        //Creating ArrayList of type PlacesDetails Class
        ArrayList<PlacesDetails> placesDetailsArrayList=new ArrayList<PlacesDetails>();

        //Adding data to ArrayList by creating new objects of PlacesDetails Class.
        placesDetailsArrayList.add(new PlacesDetails("Aabpara Market","699 Khayaban-e-Suhrwardy, Aabpara G 6/1 G-6, Islamabad",R.drawable.aabpara_market,"Aabpara Market is a commercial zone located at the south west of Sector G-6, Islamabad, along Khayaban-e-Suharwardy. It is the oldest market of Islamabad, having been built in 1960. There is an official campsite in the Aabpara area.","https://en.wikipedia.org/wiki/Aabpara_Market","10:00 AM-10:00 PM"));
        placesDetailsArrayList.add(new PlacesDetails("Allah Wali Market","Street 33, F-8/1 F 8/1 F-8, Islamabad",R.drawable.allah_wali_market,"Traditionally bound to offer only regional products, especially food on the Allah Wali Market. Locals like to shop here. Tourists are only recommended to visit the Allah Wali Market.","http://wikimapia.org/1830643/Allah-Wali-Market","6:00 AM-11:45 PM"));
        placesDetailsArrayList.add(new PlacesDetails("Ayyub Market","F-8 Markaz F 8 Markaz F-8, Islamabad",R.drawable.ayyub_market,"Ayub Market, also known as F-8 Markaz is a commercial center located in Sector F-8, Islamabad. The market is mainly occupied by District courts, government offices of the Islamabad Capital Territory Administration and Margalla police station. There is also a foreigners registration center in the market.","https://en.wikipedia.org/wiki/Ayub_Market","8:00 AM–10:00 PM"));
        placesDetailsArrayList.add(new PlacesDetails("Jinnah Super Market","Opposite To Flower Market، College Rd, F-7 Markaz, Islamabad",R.drawable.jinnah_super_market__school_road__islamabad,"Jinnah Super Market is the main hub of Islamabad and one of the best choice for the customers who prefer quality and style. A must visit place.",null,"9:00 AM-12:00 AM"));
        placesDetailsArrayList.add(new PlacesDetails("Centaurs Mall","F8، 4 Jinnah Avenue, F 8/4 F-8, Islamabad",R.drawable.centaurus_mall_islamabad,"The Centaurus is a mixed use real estate development in the city of Islamabad, Pakistan.[1] The project includes a 36-floor hotel, three 23-floor residential and office towers and a five-storey shopping mall. Designed by British architectural firm WS Atkins, it consists of three skyscrapers, containing corporate offices, residential apartments, and a hotel.","https://en.wikipedia.org/wiki/The_Centaurus","11:00 AM-11:00 PM"));
        placesDetailsArrayList.add(new PlacesDetails("Safa Gold Mall","Jinnah Super، College Rd, F-7 Markaz F 7 Markaz F-7, Islamabad",R.drawable.safa_gold_mall,"The Safa Gold Mall is a unique experience of shopping and entertainment with the class of environment you would love to live with, located in the hub of Islamabad’s most sophisticated area. Safa Gold Mall has an average footfall of 10-12 thousand visitors per day in which 30-40% visitors are our esteemed foreign guests. Safa Mall has everything for every type of visitor from shopping to the health and state of the art fitness club, sauna bath and a swimming pool.","http://www.safagold.com/","11:00 AM-11:00 PM"));


        //Creating an ArrayAdapter
        PlacesDetailsArrayAdapter placesDetailsArrayAdapter=new PlacesDetailsArrayAdapter(getActivity(),placesDetailsArrayList,R.color.tanBackground);

        //Creating listView for dynamically displaying Lists
        ListView listView=(ListView) rootView.findViewById(R.id.lists);
        listView.setAdapter(placesDetailsArrayAdapter);

        return rootView;
    }

}

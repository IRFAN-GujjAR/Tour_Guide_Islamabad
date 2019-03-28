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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.places_details,container,false);

        //Creating ArrayList of type PlacesDetails Class
        ArrayList<PlacesDetails> placesDetailsArrayList=new ArrayList<PlacesDetails>();

        //Adding data to ArrayList by creating new objects of PlacesDetails Class.
        placesDetailsArrayList.add(new PlacesDetails("Islamabad Marriott Hotel","Agha Khan Rd, F-5/1 Shalimar 5، Islamabad",R.drawable.islamabad_marriott_hotel, "The five-star international Islamabad Marriott Hotel is located at the foot steps of the famous Margalla Hills and is within close proximity to Rawal Lake, the town centre, President & Prime Minister Houses, Ministry of Foreign Affairs, Senate, Parliament House, Foreign Missions, World Bank, Government Offices, corporate sector, Print and Electronic media offices etc. The Hotel is a favourite rendezvous of politicians, diplomats, businessmen and movers and shakers of the country. Owing to the perfect location of the hotel, it hardly takes half an hour to commute between the Hotel, the Islamabad International Airport and the places of interests.","https://www.marriott.com/hotels/travel/isbpk-islamabad-marriott-hotel/","24 Hours","+92 51 2826121"));
        placesDetailsArrayList.add(new PlacesDetails("Islamabad Serena Hotel","Opposite Convention Centre، Khayaban-e-Suhrwardy, G-5, Islamabad",R.drawable.islamabad_serena_hotel,"A visit to Islamabad Serena Hotel is more than just a comfortable stay at the only 5-star deluxe hotel in Pakistan, an affiliated member of the Leading Hotels of the World. It is a vivid immersion into the culture, heritage and lifestyles of Pakistan’s capital, a relatively undiscovered city boasting exhilarating scenery as well as some of the most colourful musical and culinary traditions in the world.","https://www.serenahotels.com/serenaislamabad/en/default.html","24 Hours","+92 111 133 133"));
        placesDetailsArrayList.add(new PlacesDetails("Ramada Islamabad","1 Club Road، Murree Rd, Shakar Parian, Islamabad",R.drawable.ramada_islamabad,"Ramada Islamabad is very close to the Benazir International Airport Islamabad, and its strategic location on Murree Road, ensures a smooth 20-minute drive to the airport, making it easily accessible for business & leisure travellers, hugely saving on time and transportation, as you visit Islamabad.","http://ramadaislamabad.com/","24 Hours","+92 51 111 379379"));
        placesDetailsArrayList.add(new PlacesDetails("Envoy Continental Hotel","111-East A.K. Fazl-ul-Haq Rd, Block I G 7/2 Blue Area, Islamabad",R.drawable.envoy_continental_hotel,"The aim at envoy continental hotel In Islamabad is to create smiles and memories. Our service philosophy is about delivering a relaxed, uncomplicated experience that makes our guests happy. We call it natural enjoyment. We are conveniently located in the heart of key business vicinity, Blue Area (Hotel In Islamabad) a business hub. Its operation / services started in August 2000. Our main mission is to create loyal, satisfied customers who will return to our property repeatedly because of its quality and at par services","http://envoyhotel.com/","24 Hours","+92 51 2348246"));
        placesDetailsArrayList.add(new PlacesDetails("Bella View Lounge","2A, Kaghan Road، Main Faisal Ave, F 8/4 F-8, Islamabad",R.drawable.bella_view_lounge,"Bella View Lounge is located in the heart of Islamabad; the Capital of Pakistan, which makes its easily accessible from all aspects and just 35 minutes drive from the Airport. When you arrive at the Bella View Lounge; you will not just be welcomed, but will truly feel welcome. Sometimes you just want to be able to walk into a place and feel at ease. We understand. We’ll make sure you do because it’s cozy, comfortable, and spacious rooms are designed to be your home away from home that provides a private and tranquil atmosphere so you can enjoy the serenity away from the hustle and bustle of the city","http://www.bellaviewlounge.com/","24 Hours","+92 51-2287612"));
        placesDetailsArrayList.add(new PlacesDetails("Serai","2-A, School Road-Street 16, F-6/3, Islamabad",R.drawable.serai,"With food as exuberant as its atmosphere, this family favourite joint will win you over upon your first visit. Our fresh and healthy menu offers local, Italian and continental cuisines cooked to perfection.Bedrooms for ultimate comfort and privacy. 24 hours room service with modern features like 24 hour free WIFI.","http://serai.com.pk/","24 Hours","+92 51 2277117"));
        placesDetailsArrayList.add(new PlacesDetails("Le Royal Guest House","House 2,Street 57, F-8/4, Islamabad",R.drawable.le_royal_guest_house,"Le Royal; Best Guest House in Islamabad has set a mark in providing luxury and comfort. It’s just you give us a chance and we make you enjoy a comfortable and worthwhile style. Royal encompasses a unique set of iconic properties that deliver truly unforgettable experiences with a good trend and new professional staff. Apart from that, we also provide hotel and room for rent for foreigners and domestic businessman in Islamabad.","https://www.leroyal.com.pk/","24 Hours"," +92 51 228781517"));

        //Creating an ArrayAdapter
        PlacesDetailsArrayAdapter placesDetailsArrayAdapter=new PlacesDetailsArrayAdapter(getActivity(),placesDetailsArrayList,R.color.tanBackground);

        //Creating listView for dynamically displaying Lists
        ListView listView=(ListView)  rootView.findViewById(R.id.lists);
        listView.setAdapter(placesDetailsArrayAdapter);

        return rootView;
    }

}

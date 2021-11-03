package com.example.irfan.tourguide;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class GeneralPlacesFragment extends Fragment {


    public GeneralPlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.places_details,container,false);
        //Creating ArrayList of type PlacesDetails Class
        ArrayList<PlacesDetails> placesDetailsArrayList=new ArrayList<PlacesDetails>();

        //Adding data to ArrayList by creating new objects of PlacesDetails Class.
        placesDetailsArrayList.add(new PlacesDetails("Daman-e-Koh","Daman -e- Koh Rd, E-7, Islamabad",R.drawable.daman_e_koh_generall_places,"Daman-e-Koh is a viewing point and hill top garden north of Islamabad and located in the middle of the Margalla Hills. Its name is a conjunction of two Persian words, which together means foot hills. It is about 2400ft from sea level and almost 500ft from the city of Islamabad. It is a popular destination for the residents as well as the visitors to the capital.","https://en.wikipedia.org/wiki/Daman-e-Koh","9:00am–11:00pm"));
        placesDetailsArrayList.add(new PlacesDetails("Islamabad Zoo","Pir Sohawa Road، Saidpur, Islamabad",R.drawable.islamabad_zoo_general_places,"Islamabad Zoo previously Marghazar Zoo, is an 82-acre (33 ha) zoo in Islamabad Capital Territory. It was opened in 1978, and is under the administration of Capital Development Authority of Pakistan.","https://en.wikipedia.org/wiki/Islamabad_Zoo","9:00 AM–7:00 PM","+92300-4545686"));
        placesDetailsArrayList.add(new PlacesDetails("Margalla Hills","Located within the Margalla Hills National Park",R.drawable.marghala_hills_general_places,"The Margalla Hills is a hill range which is part of the Himalayan foothills located within the Margalla Hills National Park, north of Islamabad, Pakistan. The Margalla range has an area of 12,605 hectares. The hills are a part of Murree hills. It is a range with many valleys as well as high mountains.","https://en.wikipedia.org/wiki/Margalla_Hills"));
        placesDetailsArrayList.add(new PlacesDetails("National Herbarium","Park Rd, National Agricultural Research Center, Islamabad",R.drawable.national_herbarium_general_places,"The largest herbarium in Pakistan, it was established in 1975 with Dr. Ralph Randles Stewart's collection as its initial beginning. It has a collection of over 100,000 plants. The plants in the herbarium are divided into magnoliophytes (dicotyledons and monocotyledons), gymnosperms and pteridophytes (or ferns) and they are placed according to families, genera; and species arranged in alphabetical order.","https://en.wikipedia.org/wiki/National_Herbarium,_Islamabad","8:00 AM-4:00 PM","+92-51-0800-84420"));
        placesDetailsArrayList.add(new PlacesDetails("Pak-China Friendship Centre","Garden Avenue، Shakarparian Rd, Islamabad",R.drawable.pakistan_china_frienship_center_general_places,"Pakistan-China Friendship Centre is an art, conference and exhibition centre in Islamabad, Pakistan. It is developed with the help of China–Pakistan relations. Its construction was started in April 2005 when the Premier of the State Council of the People's Republic of China Wen Jiabao visited Pakistan. It was inaugurated on December 18, 2010 by the Pakistani Prime Minister Yousaf Raza Gillani and Chinese Premier Wen Jiabao. Currently it is running by the Ministry of Culture.","https://en.wikipedia.org/wiki/Pak-China_Friendship_Centre","10:00 AM-8:00 PM"));
        placesDetailsArrayList.add(new PlacesDetails("Rawal Lake","Rawal Lake is located within an isolated section of the Village Malpur, Bani Gala and Margalla Hills National Park",R.drawable.rawal_lake_general_places,"Rawal Lake in Pakistan is an artificial reservoir that provides the water needs for the cities of Rawalpindi and Islamabad. Korang River along with some other small streams coming from Margalla Hills have been set to form this artificial lake which covers an area of 8.8 km². Korang River is the outlet stream of Rawal Dam. Rawal Lake is located within an isolated section of the Village Malpur, Bani Gala and Margalla Hills National Park.","https://en.wikipedia.org/wiki/Rawal_lake","10:00 AM-21:00 PM","+92 51 9253021"));





        //Creating an ArrayAdapter
        PlacesDetailsArrayAdapter placesDetailsArrayAdapter=new PlacesDetailsArrayAdapter(getActivity(),placesDetailsArrayList,R.color.tanBackground);

        //Creating listView for dynamically displaying Lists
        ListView listView=(ListView) rootView.findViewById(R.id.lists);
        listView.setAdapter(placesDetailsArrayAdapter);

        return rootView;
    }

}

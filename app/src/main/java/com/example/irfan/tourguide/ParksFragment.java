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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.places_details,container,false);

        //Creating ArrayList of type PlacesDetails Class
        ArrayList<PlacesDetails> placesDetailsArrayList=new ArrayList<PlacesDetails>();

        //Adding data to ArrayList by creating new objects of PlacesDetails Class.
        placesDetailsArrayList.add(new PlacesDetails("Ankara Park","Ankara Park, Rawal Dam Road, Rawal Dam, Islamabad",R.drawable.ankara_park,"This Park is one of the most visited parks in Islamabad. It is well known becasuse of its natural beauty. The whole park is covered with green grass and trees and different beautiful colors of flowers.",null));
        placesDetailsArrayList.add(new PlacesDetails("Fatima Jinnah Park","F-9, Islamabad",R.drawable.fatimah_jinnah_park,"Fatima Jinnah Park is a public recreational park situated within the Sector F-9 of Islamabad, Pakistan. It is named after Fatima Jinnah, the younger sister of Muhammad Ali Jinnah, the founder of Pakistan. Fatima Jinnah Park vast acreage is mostly covered by greenery, with a few man-made structures dotting the landscape. Most of the park area is effectively a wildlife sanctuary, except for a few areas of the park that are close to residential districts.","https://en.wikipedia.org/wiki/Fatima_Jinnah_Park","5:00 AM-10:00 PM"));
        placesDetailsArrayList.add(new PlacesDetails("Japanese Park","khayaban-e-iqbal, Saidpur, Islamabad",R.drawable.japanese_park,"Japanese Park and Garden, located at foothills of Margallas next to Marghazar Zoo, used to be the most popular entertainment space for children that grew up in 90s. The Park served as a popular tourist and picnic spot from 1985 until about a decade ago. Since then, this beautiful park in the bed of Margalla Hills had been a favourite destination for the children and their families in Islamabad, he said. But due to lack of maintenance, the condition of swings and monkey bars deteriorated causing several accidents and injuries leading to fewer visitors.",null,"8:00 AM–11:00 PM"));
        placesDetailsArrayList.add(new PlacesDetails("Lake View Park","Murree Road، LAKE VIEW PARK, Islamabad",R.drawable.lake_view_park,"Lake View Park (also known as Rawal Lake View Point or Rawal Lake Promenade) is a recreational area and wildlife park located near Village Malpur Rawal Lake, on Murree Road in Islamabad, Capital Territory, Pakistan. It runs under the administration of Capital Development Authority. This park also contains Pakistan's largest bird cage.","https://en.wikipedia.org/wiki/Lake_View_Park","9:00 AM–9:00 PM"));
        placesDetailsArrayList.add(new PlacesDetails("Play Land","Saidpur, Islamabad",R.drawable.play_land_park,"Green space for children with trails, swings & playground equipment in a garden–like setting.",null,"24 hours"));
        placesDetailsArrayList.add(new PlacesDetails("Rose & Jasmine Garden","Kashmir Hwy, Islamabad",R.drawable.rose_and_jasmine_garden_park,"Rose and Jasmine garden is situated in Islamabad near Aabpara. The garden has about 250 types of roses and dozens types of jasmines. It is quite popular among tourists and local residents. This garden is famous for flower exhibitions which held in mostly in spring season which is definitely worth a visit.",null,"24 Hours"));



        //Creating an ArrayAdapter
        PlacesDetailsArrayAdapter placesDetailsArrayAdapter=new PlacesDetailsArrayAdapter(getActivity(),placesDetailsArrayList,R.color.tanBackground);

        //Creating listView for dynamically displaying Lists
        ListView listView=(ListView) rootView.findViewById(R.id.lists);
        listView.setAdapter(placesDetailsArrayAdapter);

        return rootView;
    }

}

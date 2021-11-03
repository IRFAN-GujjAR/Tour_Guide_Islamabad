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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.places_details,container,false);

        //Creating ArrayList of type PlacesDetails Class
        ArrayList<PlacesDetails> placesDetailsArrayList=new ArrayList<PlacesDetails>();

        //Adding data to ArrayList by creating new objects of PlacesDetails Class.
        placesDetailsArrayList.add(new PlacesDetails("Monal","9KM Pir Sohawa Rd, Islamabad",R.drawable.monal_restaurant,"Sitting on top of the Potohar, nestled against the pristine Margallas, and looking over the plains of Peshawar and Lahore, the brick and mortar of Islamabad may be modern, but its culture and traditions are embedded in the centuries of our history that have unfolded between the ranges of Khyber and Bolan and the valley of Mehran.","http://monal.themonal.com/","9:00 AM–12:30 AM","+92-51-2898044"));
        placesDetailsArrayList.add(new PlacesDetails("Kabul","Sgop No.2, Plot No. 17, F-7 Markaz, Jinnah Super Market, Next to Hill view Hotel، F 7 Markaz, Islamabad",R.drawable.kabul_restaurant,"Kabul restaurant is one of its kind. Offering very good variety of Afghani cuisine especially Afghani pulao (carrot n dry fruit garnished rice dish with steamed meat piece) and bbq afghani tikka (skews with meat n fat chunks) & afghani kabab (skews of meat mince n tomato) are almost every one's favourite.",null,"12:00 PM–4:00 PM, 6:00 PM–12:00 AM","+92-51-2650953"));
        placesDetailsArrayList.add(new PlacesDetails("Chaaye Khana","Shop # 11, Block B United Bakery Plaza Super market، F 6 Markaz, Islamabad",R.drawable.chaaye_khana_restaurant,"Pakistan is a country where tea is not just a beverage; it is a thirst quencher, a reason for a friendly get-together, a day-starter, a peace-offering, a relaxant, a snack, a meal, a deal-breaker tradition. We are a people that will conduct a multi-million rupee deal over a cup of tea. It is an essential ingredient of our social fabric, had at all formal and casual occasions and at all levels of our social strata. It is not a beverage. It’s a social lubricant.","https://www.chaayekhana.com/","8:00 AM–12:00 AM","+92-51-8312193"));
        placesDetailsArrayList.add(new PlacesDetails("Street 1 Cafe","Kohsar Market &، Street 10, F 6/3 Diplomatic Enclave, Islamabad",R.drawable.street_1_cafe_restaurant,"Street 1 Cafe is the famous name of Fast Food Italian food restaurant in Islamabad. It is very popular in Islamabad. There are variety of foods available in this restaurant.",null,"8:00 AM–11:00 PM","+9251-2823431"));
        placesDetailsArrayList.add(new PlacesDetails("Tuscany Courtyard","House No. 4, Kohsar market، Street 3, F-6/3 G 6 Markaz F-6, Islamabad",R.drawable.tuscany_courtyard_restaurant,"The restaurant offers unique experience of an outdoor street café as well as rooftop courtyard ambiance with the lovely view of the Margalla hills while enjoying delicios food. The new location at Kohsar market has ample seating both indoors and outdoors.  Outdoor seating is best for those who want to make the best of food with the view and weather which is a trend in the upscale Kohsar Market.",null,"12:00 PM–12:00 AM","+92-51-8445544"));
        placesDetailsArrayList.add(new PlacesDetails("Qishmisch","Bhittai Rd, F-7 Markaz, Islamabad",R.drawable.qishmisch_restaurant,"As you make your way into the restaurant, you are welcomed by friendly staff and a gorgeous, spacious setting. The restaurant is well suited for private dinners as well as large parties as it can fairly accommodate around 100 people. The eatery is popular among youngsters, families as well as foreigners looking for original Pakistani cuisine. It is also great for best for corporate lunch and dinner events.",null,"11:00 AM–11:00 PM","+92333-1904050"));


        //Creating an ArrayAdapter
        PlacesDetailsArrayAdapter placesDetailsArrayAdapter=new PlacesDetailsArrayAdapter(getActivity(),placesDetailsArrayList,R.color.tanBackground);

        //Creating listView for dynamically displaying Lists
        ListView listView=(ListView) rootView.findViewById(R.id.lists);
        listView.setAdapter(placesDetailsArrayAdapter);

        return rootView;
    }

}

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
public class HistoricalPlacesFragment extends Fragment {


    public HistoricalPlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View rootView=inflater.inflate(R.layout.places_details,container,false);

        //Creating ArrayList of type PlacesDetails Class
        ArrayList<PlacesDetails> placesDetailsArrayList=new ArrayList<PlacesDetails>();

        //Adding data to ArrayList by creating new objects of PlacesDetails Class.
        placesDetailsArrayList.add(new PlacesDetails("Rawal Fort","Grand Trunk Rd, Rawat, Islamabad, Islamabad Capital Territory",R.drawable.rawl_fort,"Rawat Fort is an early 16th century fort in the Pothohar plateau of Pakistan, near the city of Rawalpindi in the province of Punjab. The fort was built to defend the Pothohar plateau from the forces of the Pashtun king Sher Shah Suri.","https://en.wikipedia.org/wiki/Rawat_Fort","6:15 AM-7:30 PM","+92 51 9252310"));
        placesDetailsArrayList.add(new PlacesDetails("Loh-e-Dandi","Islamabad, Islamabad Capital Territory",R.drawable.loh_e_dandhi,null,null,"6am–5pm"));
        placesDetailsArrayList.add(new PlacesDetails("Saidpur Village","Village is located in a ravine in the Margalla Hills",R.drawable.sadipur_village,"Saidpur is a historic Pakistani village located in a ravine in the Margalla Hills, near Islamabad and the Daman-e-Koh overlook. The village's historic core, its abandoned Hindu temple, and its Sikh gurdwara were restored in 2006. The village now houses several high-end restaurants, and attracts Islamabad residents and tourists alike.","https://en.wikipedia.org/wiki/Saidpur,_Islamabad"));
        placesDetailsArrayList.add(new PlacesDetails("Jaulian","Jaulian is located on a hill 100 metres above the nearby modern village of Jaulian",R.drawable.jaulian,"Jaulian is a ruined Buddhist monastery dating from the 2nd century CE, located in Pakistan. Jaulian is located in Haripur District, Khyber Pakhtunkhwa province, near the provincial border with Punjab and the city of Taxila.","https://en.wikipedia.org/wiki/Jaulian",null," +92 55 6053329"));



        //Creating an ArrayAdapter
        PlacesDetailsArrayAdapter placesDetailsArrayAdapter=new PlacesDetailsArrayAdapter(getActivity(),placesDetailsArrayList,R.color.tanBackground);

        //Creating listView for dynamically displaying Lists
        ListView listView=(ListView) rootView.findViewById(R.id.lists);
        listView.setAdapter(placesDetailsArrayAdapter);
        return rootView;
    }

}

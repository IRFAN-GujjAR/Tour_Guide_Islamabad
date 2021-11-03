package com.example.irfan.tourguide;

import android.app.Activity;

import androidx.core.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class PlacesDetailsArrayAdapter extends ArrayAdapter<PlacesDetails> {

    //Creating state for storing background color for list Item View
    private int mColorResourceID;

    public PlacesDetailsArrayAdapter(Activity context, ArrayList<PlacesDetails> placesDetailsArrayList, int colorResourceID){
        super(context,0,placesDetailsArrayList);
        mColorResourceID=colorResourceID;
    }


    @Override
    public View getView(int position,View convertView,ViewGroup parent) {


        //Creating listItemView for Recycling to save memory
        View listItemView=convertView;
        if(listItemView==null){
            listItemView=LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        //Creating object of PlacesDetails Class  and specifying the position
        final PlacesDetails currentPlacesDetails=getItem(position);



        //Creating TextView for Dynamically displaying Name of Places
        TextView nameOfPlaceTextView=(TextView) listItemView.findViewById(R.id.Name_Text_View);
        nameOfPlaceTextView.setText(currentPlacesDetails.getmNameOfPlace());


        //Creating TextView for Dynamically displaying Location of Places
        TextView locationOfPlaceTextView=(TextView) listItemView.findViewById(R.id.Location_Text_View);
        locationOfPlaceTextView.setText(currentPlacesDetails.getmLocationOfPlace());


        /*
            *Creating LinearLayout for making it visible and invisible according to the OpenHours Value.
            *Creating TextView for Dynamically displaying Open Hours of Places
         */
        LinearLayout openHoursLinearLayout=(LinearLayout) listItemView.findViewById(R.id.Open_Hours_Linear_Layout);
        TextView openHoursTextView=(TextView) listItemView.findViewById(R.id.Open_Hours_Text_View);
        if(currentPlacesDetails.getmOpenHours()!=null)
        {
            openHoursLinearLayout.setVisibility(View.VISIBLE);
            openHoursTextView.setText(currentPlacesDetails.getmOpenHours());
            openHoursTextView.setVisibility(View.VISIBLE);
        }
        else
        {
            openHoursLinearLayout.setVisibility(View.GONE);
            openHoursTextView.setVisibility(View.GONE);
        }



        /*
        *Creating LinearLayout for making it visible and invisible according to the Phone Number Value.
        *Creating TextView for Dynamically displaying Phone Number of Places
         */
        LinearLayout phoneNumberLinearLayout=(LinearLayout) listItemView.findViewById(R.id.Phone_Number_Linear_Layout);
        TextView phoneNumberTextView=(TextView) listItemView.findViewById(R.id.Phone_Number_Text_view);
        if(currentPlacesDetails.getmPhoneNumber()!=null)
        {
            phoneNumberLinearLayout.setVisibility(View.VISIBLE);
            phoneNumberTextView.setText(currentPlacesDetails.getmPhoneNumber());
            phoneNumberTextView.setVisibility(View.VISIBLE);
        }
        else
        {
            phoneNumberLinearLayout.setVisibility(View.GONE);
            phoneNumberTextView.setVisibility(View.GONE);
        }



        //Creating TextView for Dynamically displaying Description of Places
        TextView descriptionTextView=(TextView) listItemView.findViewById(R.id.Description_Text_view);
        if(currentPlacesDetails.getmDescription()!=null)
        {
            descriptionTextView.setText(currentPlacesDetails.getmDescription());
            descriptionTextView.setVisibility(View.VISIBLE);
        }
        else {
            descriptionTextView.setVisibility(View.GONE);
        }


        /*
        *Creating LinearLayout for making it visible and invisible according to the website value.
        *Creating TextView for Dynamically displaying websites Link of Places
         */
        TextView webLinkTextView=(TextView) listItemView.findViewById(R.id.Website_Text_View);
        LinearLayout webLinkLinearLayout=(LinearLayout) listItemView.findViewById(R.id.Website_Linear_Layout);
        if(currentPlacesDetails.getmWebLink()!=null)
        {
            webLinkLinearLayout.setVisibility(View.VISIBLE);
            webLinkTextView.setText(currentPlacesDetails.getmWebLink());
            webLinkTextView.setVisibility(View.VISIBLE);
        }
        else
        {
            webLinkLinearLayout.setVisibility(View.GONE);
            webLinkTextView.setVisibility(View.GONE);
        }


        //Creating Image for Dynamically displaying images of places
        ImageView imageView=(ImageView) listItemView.findViewById(R.id.image_view);
        if(currentPlacesDetails.hasImage()){
            imageView.setImageResource(currentPlacesDetails.getmImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        /*Creating A View Object and Attaching it with Relative Layout of list_item.xml
        * Changing the background color of Relative Layout.
        * */
        View relativeLayoutContainer=listItemView.findViewById(R.id.Relative_Layout_Container);
        int color=ContextCompat.getColor(getContext(),mColorResourceID);
        relativeLayoutContainer.setBackgroundColor(color);

        return listItemView;
    }

}

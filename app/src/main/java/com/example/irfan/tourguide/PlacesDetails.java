package com.example.irfan.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

import java.util.ArrayList;

public class PlacesDetails {

     private String mNameOfPlace;
     private String mLocationOfPlace;
     private int mImageResourceID;
     private static final int noImageProvided=-1;
     private String mOpenHours;
     private String mPhoneNumber;
     private String mDescription;
     private String mWebLink;


    public PlacesDetails(String nameOfPlace,String locationOfPlace,int imageResourceID,String description,String webLink){
        mNameOfPlace=nameOfPlace;
        mLocationOfPlace=locationOfPlace;
        mImageResourceID=imageResourceID;
        mDescription=description;
        mWebLink=webLink;
    }


    public PlacesDetails(String nameOfPlace,String locationOfPlace,int imageResourceID,String description,String webLink,String openHours){
        mNameOfPlace=nameOfPlace;
        mLocationOfPlace=locationOfPlace;
        mImageResourceID=imageResourceID;
        mOpenHours=openHours;
        mDescription=description;
        mWebLink=webLink;
    }

     public PlacesDetails(String nameOfPlace,String locationOfPlace,int imageResourceID,String description,String webLink,String openHours,String phoneNumber){
            mNameOfPlace=nameOfPlace;
            mLocationOfPlace=locationOfPlace;
            mImageResourceID=imageResourceID;
            mOpenHours=openHours;
            mPhoneNumber=phoneNumber;
            mDescription=description;
            mWebLink=webLink;
     }

     public String getmNameOfPlace(){return mNameOfPlace;}

     public String getmLocationOfPlace(){return mLocationOfPlace;}

     public int getmImageResourceID(){return mImageResourceID;}

     public boolean hasImage(){return mImageResourceID!=noImageProvided;}

     public String getmOpenHours(){return mOpenHours;}

     public String getmPhoneNumber(){return mPhoneNumber;}

     public String getmDescription(){return mDescription;}

     public String getmWebLink(){return mWebLink;}
}

package com.frinder.frinder.model;

import android.content.res.TypedArray;

import java.util.ArrayList;

/**
 * Created by mallikaviswas on 10/22/17.
 */

public class Interest {

    int mIcon;
    String mLabel;
    String mDBValue;
    Boolean mselected;
    int origArrayPosition;

    public Interest(int mIcon, String mLabel, String mDBValue, int origArrayPosition) {
        this.mIcon = mIcon;
        this.mLabel = mLabel;
        this.mDBValue = mDBValue;
        this.mselected = false;
        this.origArrayPosition = origArrayPosition;
    }

    public int getIcon() {
        return mIcon;
    }

    public void setIcon(int mIcon) {
        this.mIcon = mIcon;
    }

    public String getLabel() {
        return mLabel;
    }

    public void setLabel(String mLabel) {
        this.mLabel = mLabel;
    }

    public String getDBValue() {
        return mDBValue;
    }

    public void setDBValue(String mDBValue) {
        this.mDBValue = mDBValue;
    }

    public Boolean isSelected() {
        return this.mselected;
    }

    public void setSelected(Boolean selected) {
        this.mselected = selected;
    }

    public int getOrigArrayPosition() {
        return origArrayPosition;
    }

    public void setOrigArrayPosition(int origArrayPosition) {
        this.origArrayPosition = origArrayPosition;
    }

    public static ArrayList<Interest> createFilterInterestList(String[] filterInterestLabelArray, TypedArray filterInterestIconArray, String[] filterInterestDBValueArray) {
        ArrayList<Interest> filterInterestList = new ArrayList<Interest>();

        for (int i = 0; i < filterInterestLabelArray.length; i++) {
            filterInterestList.add(new Interest(filterInterestIconArray.getResourceId(i, 0), filterInterestLabelArray[i], filterInterestDBValueArray[i], i));
        }

        return filterInterestList;
    }
}
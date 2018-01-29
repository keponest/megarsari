package com.marketprice.marketpriceapp.User;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.marketprice.marketpriceapp.R;

public class UserOngoingFragment extends Fragment {

    public UserOngoingFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_user_ongoing, container, false);
    }

}

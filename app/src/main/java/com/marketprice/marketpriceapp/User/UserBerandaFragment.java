package com.marketprice.marketpriceapp.User;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.marketprice.marketpriceapp.R;

public class UserBerandaFragment extends Fragment {
    public UserBerandaFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_user_beranda, container, false);
    }

}

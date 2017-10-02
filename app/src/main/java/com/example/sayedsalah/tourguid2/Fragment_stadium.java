package com.example.sayedsalah.tourguid2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_stadium extends Fragment {


    public Fragment_stadium() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ArrayList<Item> itemArrayList = new ArrayList<>();
        View viewroot = inflater.inflate(R.layout.item_list, container, false);
        itemArrayList.add(new Item(R.drawable.stadiumm, "Santiago Bernabéu", "Europe Largest Stadium", R.drawable.marker));
        ListView listView = (ListView) viewroot.findViewById(R.id.list);
        ListAdapter itemsAdapter = new ListAdapter(getActivity(), itemArrayList);
        listView.setAdapter(itemsAdapter);
        return viewroot;
    }

}

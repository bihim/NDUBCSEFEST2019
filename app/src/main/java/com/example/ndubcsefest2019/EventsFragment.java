package com.example.ndubcsefest2019;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

public class EventsFragment extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_events, container, false);

        List<String> eventLists = new ArrayList<>();

        eventLists.add("Graphics Contest – Single (10 Oct 2019)");
        eventLists.add("Buzzer Quiz – Group (11 Nov 2019)");
        eventLists.add("Idea Presentation – Group (13 Nov 2019)");
        eventLists.add("Treasure Hunt – Group (1 Nov 2019)");
        eventLists.add("Project Show (Software + Hardware) – Group (2 Nov 2019)");
        eventLists.add("Olympiad –Single (2 Nov 2019)");
        eventLists.add("1 Min Video –Single (7 Nov 2019)");
        eventLists.add("Tech Public Speaking –Single (12 Nov 2019)");
        eventLists.add("Programming Contest – Group (13 Nov 2019)");
        eventLists.add("Teachers Game – Single (14 Nov 2019)");
        eventLists.add("Prize Giving Ceremony - (14 Nov 2019)");
        eventLists.add("Cultural Night - (14 Nov 2019)");

        ListView listView = view.findViewById(R.id.list_events);

        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, eventLists);
        listView.setAdapter(arrayAdapter);

        return view;
    }
}

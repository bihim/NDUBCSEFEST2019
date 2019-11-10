package com.example.ndubcsefest2019;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;
import com.hanks.htextview.HTextView;
import com.hanks.htextview.HTextViewType;

import java.util.Date;

public class CalendarFragment extends Fragment
{
    HTextView textView;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_calendar, container, false);

        CompactCalendarView compactCalendarView = view.findViewById(R.id.compactcalendar_view);
        compactCalendarView.setUseThreeLetterAbbreviation(true);
        textView = view.findViewById(R.id.text_view_event);
        textView.animateText("Click on date to show the events");

        final Event eventBuzzer = new Event(Color.RED, 1573430400000L, "Buzzer Quiz");
        final String stringBuzzer = "Mon Nov 11 00:00:00 GMT+06:00 2019";

        Event eventIdeaPresentation = new Event(Color.RED, 1573603200000L, "Idea Presentation");
        final String stringIdeaPresentation = "Wed Nov 13 00:00:00 GMT+06:00 2019";

        Event eventTreasureHunt = new Event(Color.RED, 1572566400000L, "Treasure Hunt");
        final String stringTreasureHunt = "Fri Nov 01 00:00:00 GMT+06:00 2019";

        Event eventProjectShow_Olympiad = new Event(Color.RED, 1572652800000L, "Project Show and Olympiad");
        final String stringProjectShow_Olympiad = "Sat Nov 02 00:00:00 GMT+06:00 2019";

        Event event1MinVideo = new Event(Color.RED, 1573084800000L, "1 minute Video");
        final String string1MinVideo = "Thu Nov 07 00:00:00 GMT+06:00 2019";

        Event eventTechPublicSpeaking = new Event(Color.RED, 1573516800000L, "Tech Public Speaking");
        final String stringTechPublicSpeaking = "Tue Nov 12 00:00:00 GMT+06:00 2019";

        Event eventProgrammingContest = new Event(Color.RED, 1573603200000L, "Programming Contest");

        Event eventTeachersGame_Prize_Cultural = new Event(Color.RED, 1573689600000L, "Gala Event");
        final String stringTeachersGame_Prize_Cultural = "Thu Nov 14 00:00:00 GMT+06:00 2019";

        Event eventGamingContest15 = new Event(Color.RED, 1573776000000L, "Gaming Contest");
        final String stringGamingContest15 = "Fri Nov 15 00:00:00 GMT+06:00 2019";

        Event eventGamingContest16 = new Event(Color.RED, 1573862400000L, "Gaming Contest");
        final String stringGamingContest16 = "Sat Nov 16 00:00:00 GMT+06:00 2019";

        compactCalendarView.addEvent(eventBuzzer);
        compactCalendarView.addEvent(eventIdeaPresentation);
        compactCalendarView.addEvent(eventTreasureHunt);
        compactCalendarView.addEvent(eventProjectShow_Olympiad);
        compactCalendarView.addEvent(event1MinVideo);
        compactCalendarView.addEvent(eventTechPublicSpeaking);
        compactCalendarView.addEvent(eventProgrammingContest);
        compactCalendarView.addEvent(eventTeachersGame_Prize_Cultural);
        compactCalendarView.addEvent(eventGamingContest15);
        compactCalendarView.addEvent(eventGamingContest16);

        compactCalendarView.shouldScrollMonth(false);

        compactCalendarView.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {

                if (dateClicked.toString().compareTo(stringBuzzer)== 0)
                {
                    setNames("Buzzer Quiz");
                }

                else if (dateClicked.toString().compareTo(stringIdeaPresentation)== 0)
                {
                    setNames("Idea Presentation\n and Programming Contest");
                }

                else if (dateClicked.toString().compareTo(stringTreasureHunt)== 0)
                {
                    setNames("Treasure Hunt");
                }

                else if (dateClicked.toString().compareTo(stringProjectShow_Olympiad)== 0)
                {
                    setNames("Project Show (Software+Hardware)\nand\nOlympiad");
                }

                else if (dateClicked.toString().compareTo(string1MinVideo)== 0)
                {
                    setNames("1 Min Video");
                }

                else if (dateClicked.toString().compareTo(stringTechPublicSpeaking)== 0)
                {
                    setNames("Tech Public Speaking");
                }


                else if (dateClicked.toString().compareTo(stringTeachersGame_Prize_Cultural)== 0)
                {
                    setNames("Cultural Night and Prize Giving Ceremony");
                }

                else if (dateClicked.toString().compareTo(stringGamingContest15)== 0)
                {
                    setNames("Gaming Contest");
                }

                else if (dateClicked.toString().compareTo(stringGamingContest16)== 0)
                {
                    setNames("Gaming Contest");
                }

                else
                {
                    setNames("No Other Events");
                }
            }

            @Override
            public void onMonthScroll(Date firstDayOfNewMonth)
            {

            }
        });

        return view;
    }

    private void setNames (String textViewText)
    {
        textView.setAnimateType(HTextViewType.SCALE);
        textView.animateText(textViewText);
    }
}

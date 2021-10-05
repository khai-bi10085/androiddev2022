package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ForecastFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ForecastFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ForecastFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ForecastFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ForecastFragment newInstance(String param1, String param2) {
        ForecastFragment fragment = new ForecastFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout kk = new LinearLayout(getActivity());
        kk.setBackgroundColor(0x7FFF00);
        kk.setOrientation(LinearLayout.VERTICAL);

        TextView Sunday = new TextView(getActivity());
        Sunday.setText("Sunday is a rainy day <3");
        ImageView rainyday = new ImageView(getActivity());
        rainyday.setImageResource(R.drawable.rainyday);

        kk.addView(Sunday);
        kk.addView(rainyday);

        //-------------------
        TextView Monday = new TextView(getActivity());
        Monday.setText("Monday is gonna be sunny day (I hate sunny day :<)");
        ImageView sunny = new ImageView(getActivity());
        sunny.setImageResource(R.drawable.sunny);

        kk.addView(Monday);
        kk.addView(sunny);

        //--------------------
        TextView Tuesday = new TextView(getActivity());
        Tuesday.setText("Tuesday will be a clody day and it is great to go out :> ");
        ImageView cloudy = new ImageView(getActivity());
        cloudy.setImageResource(R.drawable.cloudy);

        kk.addView(Tuesday);
        kk.addView(cloudy);


        return kk;
    }
}
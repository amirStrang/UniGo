package com.eaglet.unigo.Registering;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.eaglet.unigo.R;

/**
 * Created by mohsal on 2/27/2019.
 */

public class StudentFormFragment extends Fragment {

    private Spinner citySpinner,areaSpinner,schoolSpinner;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.student_form,container,false);
        citySpinner = (Spinner) view.findViewById(R.id.cityList);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(),
                R.array.cities, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        citySpinner.setAdapter(adapter);


        areaSpinner = (Spinner) view.findViewById(R.id.areaList);

        ArrayAdapter<CharSequence> areaAdapter = ArrayAdapter.createFromResource(getContext(),
                R.array.sh_cities, android.R.layout.simple_spinner_item);

        areaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        areaSpinner.setAdapter(areaAdapter);

        schoolSpinner = (Spinner) view.findViewById(R.id.schoolList);

        ArrayAdapter<CharSequence> schoolAdapter = ArrayAdapter.createFromResource(getContext(),
                R.array.school_cities, android.R.layout.simple_spinner_item);

        schoolAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        schoolSpinner.setAdapter(schoolAdapter);
        return view;
    }
}

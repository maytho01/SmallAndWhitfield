package com.example.smallandwhitfield.ui.interbid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.smallandwhitfield.R;

public class InterbidFragment extends Fragment {

    private InterbidViewModel interbidViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        interbidViewModel =
                ViewModelProviders.of(this).get(InterbidViewModel.class);
        View root = inflater.inflate(R.layout.fragment_interbid, container, false);
        final TextView textView = root.findViewById(R.id.text_interbid);
        interbidViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
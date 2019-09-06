package com.example.smallandwhitfield.ui.catalogues;

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

public class CatalogueFragment extends Fragment {

    private CatalogueViewModel catalogueViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        catalogueViewModel =
                ViewModelProviders.of(this).get(CatalogueViewModel.class);
        View root = inflater.inflate(R.layout.fragment_catalogue, container, false);
        final TextView textView = root.findViewById(R.id.text_catalogue);
        catalogueViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
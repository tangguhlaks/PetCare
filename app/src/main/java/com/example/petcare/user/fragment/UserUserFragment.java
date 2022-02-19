package com.example.petcare.user.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.petcare.R;
import com.example.petcare.login.LoginActivity;
import com.example.petcare.user.EditaccActivity;
import com.google.android.material.button.MaterialButton;

public class UserUserFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.user_user_fragment, container, false);

        Button gologout = view.findViewById(R.id.gologout);
        gologout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), LoginActivity.class));
            }
        });
        Button goedit = view.findViewById(R.id.goedit);
        goedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), EditaccActivity.class));
            }
        });


        return view;
    }
}

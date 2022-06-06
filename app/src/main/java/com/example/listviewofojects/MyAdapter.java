package com.example.listviewofojects;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listviewofojects.Student;

import org.w3c.dom.Text;

import java.util.List;

public class MyAdapter extends ArrayAdapter<Student> {
    public MyAdapter(@NonNull Context context, int resource, @NonNull List<Student> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Student student = getItem(position);
        Log.d("Student",student.getName());
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.studentlayout,null ,false);
        TextView textViewName =(TextView) convertView.findViewById(R.id.textViewName);
        textViewName.setText(student.getName());
        TextView textViewId =(TextView) convertView.findViewById(R.id.textViewId);
        textViewId.setText(student.getId());
        TextView textViewSection =(TextView) convertView.findViewById(R.id.textViewSection);
        textViewSection.setText(student.getSection());
        ImageView imageView =(ImageView) convertView.findViewById(R.id.imageView);
        imageView.setImageResource(student.getImageId());

        textViewName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(getContext());
                Log.d("Tag",textViewName.getText().toString());
            }
        });
        return convertView;
    }
}
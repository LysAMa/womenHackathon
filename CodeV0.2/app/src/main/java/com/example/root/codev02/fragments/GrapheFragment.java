package com.example.root.codev02.fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.root.codev02.R;
import com.intrusoft.scatter.ChartData;
import com.intrusoft.scatter.PieChart;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class GrapheFragment extends Fragment {


    PieChart pieChart;
    List<ChartData> data, data1;

    public GrapheFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_graphe, container, false);
        pieChart = (PieChart) v.findViewById(R.id.pie_chart);
        data = new ArrayList<>();
        data.add(new ChartData("35%", 35));
        data.add(new ChartData("25%", 25));
        data.add(new ChartData("30%", 30));
        data.add(new ChartData("10%", 10));

        data1 = new ArrayList<>();
        data1.add(new ChartData("35%", 35, Color.WHITE, Color.parseColor("#0091EA")));
        data1.add(new ChartData("25%", 25, Color.WHITE, Color.parseColor("#33691E")));
        data1.add(new ChartData("30%", 30, Color.DKGRAY, Color.parseColor("#F57F17")));
        data1.add(new ChartData("10%", 10, Color.DKGRAY, Color.parseColor("#FFD600")));

        pieChart.setChartData(data);

        return v;
    }
    public void withPartition(View view) {
        pieChart.partitionWithPercent(true);
    }

    public void withOutPartition(View view) {
        pieChart.partitionWithPercent(false);
    }

    public void singleColor(View view) {
        pieChart.setChartData(data);
    }

    public void multiColor(View view) {
        pieChart.setChartData(data1);
    }

}

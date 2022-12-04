package com.dam.evaluaciont1_daha_1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dam.evaluaciont1_daha_1.data.Result;
public class ResultadoFragmento extends Fragment {

    private static final String ARG_PHASE = "phase";
    private static final String ARG_TEAM1 = "team1";
    private static final String ARG_TEAM2 = "team2";
    private static final String ARG_GOALS_T1 = "goals1";
    private static final String ARG_GOALS_T2 = "goals2";
    private static final String ARG_DATE = "date";

    private String phase;
    private String team1;
    private String team2;
    private String goals1;
    private String goals2;
    private String date;

    public ResultadoFragmento() {
        // Required empty public constructor
    }

    public static ResultadoFragmento newInstance(String param1, String param2) {
        ResultadoFragmento fragment = new ResultadoFragmento();
        Bundle args = new Bundle();
        args.putString(ARG_PHASE, Result.getPhase());
        args.putString(ARG_TEAM1, Result.getTeam1());
        args.putString(ARG_TEAM2, Result.getTeam2());
        args.putString(ARG_GOALS_T1, String.valueOf(Result.getGoals1()));
        args.putString(ARG_GOALS_T2, String.valueOf(Result.getGoals2()));
        args.putString(ARG_DATE, Result.getDate());
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            phase = getArguments().getString(ARG_PHASE);
            team1 = getArguments().getString(ARG_TEAM1);
            team2 = getArguments().getString(ARG_TEAM2);
            goals1 = getArguments().getString(ARG_GOALS_T1);
            goals2 = getArguments().getString(ARG_GOALS_T2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_resultado_fragmento, container, false);
        //TODO: Implementar el código para mostrar los datos del partido
        TextView tvPhase = view.findViewById(R.id.tv_frag_phase);
        TextView tvTeam1 = view.findViewById(R.id.tv_frag_team1);
        TextView tvTeam2 = view.findViewById(R.id.tv_frag_team2);
        TextView tvGoals1 = view.findViewById(R.id.tv_frag_goals1);
        TextView tvGoals2 = view.findViewById(R.id.tv_frag_goals2);
        TextView tvDate = view.findViewById(R.id.tv_frag_date);

        tvPhase.setText(phase);
        tvTeam1.setText(team1);
        tvTeam2.setText(team2);
        tvGoals1.setText(goals1);
        tvGoals2.setText(goals2);
        tvDate.setText(date);
        return view;
    }
}
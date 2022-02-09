package com.example.news.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.news.R;
import com.example.news.WebViewController;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ZEE_NEWSFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ZEE_NEWSFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ZEE_NEWSFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ZEE_NEWSFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ZEE_NEWSFragment newInstance(String param1, String param2) {
        ZEE_NEWSFragment fragment = new ZEE_NEWSFragment();
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
        View view =  inflater.inflate(R.layout.fragment_z_e_e__n_e_w_s, container, false);

        WebView webView = view.findViewById(R.id.webViewZEE);
        webView.loadUrl("https://zeenews.india.com/");
        webView.setWebViewClient(new WebViewController());

        return view;
    }
}
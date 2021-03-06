package first.quizemaine.com.fragmenttransaction;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rahul on 6/19/2016.
 */



public class FragmentFirst extends Fragment {


   String TAG="fragment1";


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG,"onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG,"onCreate");

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        Log.d(TAG,"onCreateView");
        View view=inflater.inflate(R.layout.fragment_1,container,false);




        return view;
    }

    @Override
    public void onStart() {
        super.onStart();

        Log.d(TAG,"onStart");
    }


    @Override
    public void onResume() {
        super.onResume();

        Log.d(TAG,"onResume");
    }


    @Override
    public void onPause() {
        super.onPause();

        Log.d(TAG,"onPause");

    }


    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG,"onPause");
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();

        Log.d(TAG,"onDestroyView");
    }


    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.d(TAG,"onDestroy");
    }


    @Override
    public void onDetach() {
        super.onDetach();


        Log.d(TAG,"onDetach");
    }
}

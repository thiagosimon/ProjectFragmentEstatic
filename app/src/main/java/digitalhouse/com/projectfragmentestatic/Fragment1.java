package digitalhouse.com.projectfragmentestatic;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {


    private Button btnFrag1;

    public Fragment1() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment1, container,false);
        btnFrag1 = (Button) view.findViewById(R.id.btn_frag1);

        btnFrag1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getActivity().getBaseContext(),"Voce esta no Fragmento 1",Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

}

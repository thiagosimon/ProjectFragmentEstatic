package digitalhouse.com.projectfragmentestatic;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragment2 extends Fragment {

    private Button btnFrag2;
    public Fragment2() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment2, container,false);
        btnFrag2 = (Button) view.findViewById(R.id.btn_frag2);
        btnFrag2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getActivity().getBaseContext(),"Voce esta no Fragmento",Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

}

package in.compsgeek.javafy;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import in.compsgeek.javafy.tutorials.Ch01TutorialIntroduction;
import in.compsgeek.javafy.tutorials.Ch02TutorialOperators;
import in.compsgeek.javafy.tutorials.Ch03TutorialCtrlStmts;
import in.compsgeek.javafy.tutorials.Ch04TutorialClassesNObjects;
import in.compsgeek.javafy.tutorials.Ch05TutorialIoArrays;
import in.compsgeek.javafy.tutorials.Ch06TutorialStrings;
import in.compsgeek.javafy.tutorials.Ch07TutorialInheritance;
import in.compsgeek.javafy.tutorials.Ch08TutorialInterface;
import in.compsgeek.javafy.tutorials.Ch09TutorialJavaPackages;
import in.compsgeek.javafy.tutorials.Ch10TutorialAssertions;
import in.compsgeek.javafy.tutorials.Ch11TutorialFundamentalClasses;
import in.compsgeek.javafy.tutorials.Ch12Tutorial_AdvJavaClasses;
import in.compsgeek.javafy.tutorials.Ch13TutorialSerialFiles;
import in.compsgeek.javafy.tutorials.Ch14TutorialThreads;
import in.compsgeek.javafy.tutorials.Ch15TutorialNumFormat;
import in.compsgeek.javafy.tutorials.Ch16TutorialCollections;
import in.compsgeek.javafy.tutorials.Ch17TutorialJavaDeployment;
import in.compsgeek.javafy.tutorials.Ch18TutorialAppletGUI;
import in.compsgeek.javafy.tutorials.Ch19TutorialSwings;
import in.compsgeek.javafy.tutorials.Ch20TutorialNetworking;
import in.compsgeek.javafy.tutorials.Ch21TutorialJDBC;
import in.compsgeek.javafy.tutorials.Ch22TutorialMiscellaneous;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Tutorials.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Tutorials#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tutorials extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Tutorials() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Tutorials.
     */
    // TODO: Rename and change types and number of parameters
    public static Tutorials newInstance(String param1, String param2) {
        Tutorials fragment = new Tutorials();
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
        //return inflater.inflate(R.layout.fragment_tutorials, container, false);
        View view = inflater.inflate(R.layout.fragment_tutorials,container, false);


        ImageView imageView1 = view.findViewById(R.id.Intro);
        ImageView imageView2 = view.findViewById(R.id.operators);
        ImageView imageView3 = view.findViewById(R.id.ctrlstmt);
        ImageView imageView4 = view.findViewById(R.id.classes);
        ImageView imageView5 = view.findViewById(R.id.arrays);
        ImageView imageView6 = view.findViewById(R.id.strings);
        ImageView imageView7 = view.findViewById(R.id.inheritance);
        ImageView imageView8 = view.findViewById(R.id.abs_interface);
        ImageView imageView9 = view.findViewById(R.id.pkg_jar);
        ImageView imageView10 = view.findViewById(R.id.exc_assert);
        ImageView imageView11 = view.findViewById(R.id.fundamentals);
        ImageView imageView12 = view.findViewById(R.id.adv_java);
        ImageView imageView13 = view.findViewById(R.id.serial);
        ImageView imageView14 = view.findViewById(R.id.thread);
        ImageView imageView15 = view.findViewById(R.id.num_format);
        ImageView imageView16 = view.findViewById(R.id.col_gen);
        ImageView imageView17 = view.findViewById(R.id.jav);
        ImageView imageView18 = view.findViewById(R.id.applet);
        ImageView imageView19 = view.findViewById(R.id.swings);
        ImageView imageView20 = view.findViewById(R.id.nw_java);
        ImageView imageView21 = view.findViewById(R.id.jdbc);
        ImageView imageView22 = view.findViewById(R.id.misc);

        Glide.with(this).load("https://i.ibb.co/cK5RhPL/t-intro.jpg").thumbnail(0.5f).transition(withCrossFade()).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView1);
        Glide.with(this).load("https://i.ibb.co/1vHvMmJ/t-operators.jpg").thumbnail(0.5f).transition(withCrossFade()).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView2);
        Glide.with(this).load("https://i.ibb.co/QXrZGWP/t-ctrlstmt.jpg").thumbnail(0.5f).transition(withCrossFade()).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView3);
        Glide.with(this).load("https://i.ibb.co/PGJh5L5/t-classes.jpg").thumbnail(0.5f).transition(withCrossFade()).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView4);
        Glide.with(this).load("https://i.ibb.co/SNTW3jS/t-array.jpg").thumbnail(0.5f).transition(withCrossFade()).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView5);
        Glide.with(this).load("https://i.ibb.co/5K7dkX3/t-string.jpg").thumbnail(0.5f).transition(withCrossFade()).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView6);
        Glide.with(this).load("https://i.ibb.co/hYYPDjp/t-inheritance.jpg").thumbnail(0.5f).transition(withCrossFade()).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView7);
        Glide.with(this).load("https://i.ibb.co/pxbKpHn/t-interface.jpg").thumbnail(0.5f).transition(withCrossFade()).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView8);
        Glide.with(this).load("https://i.ibb.co/NNvQt2D/t-package.jpg").thumbnail(0.5f).transition(withCrossFade()).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView9);
        Glide.with(this).load("https://i.ibb.co/p1zLhtv/t-assert.jpg").thumbnail(0.5f).transition(withCrossFade()).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView10);
        Glide.with(this).load("https://i.ibb.co/ngm2YJ1/t-fundamentals.jpg").thumbnail(0.5f).transition(withCrossFade()).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView11);
        Glide.with(this).load("https://i.ibb.co/VgG1GRL/t-advjava.jpg").thumbnail(0.5f).transition(withCrossFade()).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView12);
        Glide.with(this).load("https://i.ibb.co/xs1HhVB/t-serialize.jpg").thumbnail(0.5f).transition(withCrossFade()).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView13);
        Glide.with(this).load("https://i.ibb.co/Z6fjx2H/t-threads.jpg").thumbnail(0.5f).transition(withCrossFade()).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView14);
        Glide.with(this).load("https://i.ibb.co/B4HSbxS/t-formatters.jpg").thumbnail(0.5f).transition(withCrossFade()).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView15);
        Glide.with(this).load("https://i.ibb.co/tHRtGqj/t-collgen.jpg").thumbnail(0.5f).transition(withCrossFade()).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView16);
        Glide.with(this).load("https://i.ibb.co/9gs6WZ3/t-deploy.jpg").thumbnail(0.5f).transition(withCrossFade()).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView17);
        Glide.with(this).load("https://i.ibb.co/HXWqGdm/t-applets.jpg").thumbnail(0.5f).transition(withCrossFade()).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView18);
        Glide.with(this).load("https://i.ibb.co/xX2JGSw/t-swings.jpg").thumbnail(0.5f).transition(withCrossFade()).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView19);
        Glide.with(this).load("https://i.ibb.co/L9nmmq1/t-network.jpg").thumbnail(0.5f).transition(withCrossFade()).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView20);
        Glide.with(this).load("https://i.ibb.co/MVDgCGS/t-jdbc.jpg").thumbnail(0.5f).transition(withCrossFade()).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView21);
        Glide.with(this).load("https://i.ibb.co/cJ2KvjY/t-misc.jpg").thumbnail(0.5f).transition(withCrossFade()).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView22);


        Button expbtn1 = view.findViewById(R.id.explorebtn1);      //intro
        Button expbtn2 = view.findViewById(R.id.explorebtn2);      //operators
        Button expbtn3 = view.findViewById(R.id.explorebtn3);      //control statements
        Button expbtn4 = view.findViewById(R.id.explorebtn4);      //classes
        Button expbtn5 = view.findViewById(R.id.explorebtn5);      //arrays
        Button expbtn6 = view.findViewById(R.id.explorebtn6);      //strings
        Button expbtn7 = view.findViewById(R.id.explorebtn7);      //inheritance
        Button expbtn8 = view.findViewById(R.id.explorebtn8);      //abstract n interface
        Button expbtn9 = view.findViewById(R.id.explorebtn9);      //packages and jars
        Button expbtn10 = view.findViewById(R.id.explorebtn10);    //assertions
        Button expbtn11 = view.findViewById(R.id.explorebtn11);    //fundamentals
        Button expbtn12 = view.findViewById(R.id.explorebtn12);    //adv java classes
        Button expbtn13 = view.findViewById(R.id.explorebtn13);    //serializable
        Button expbtn14 = view.findViewById(R.id.explorebtn14);    //thread
        Button expbtn15 = view.findViewById(R.id.explorebtn15);    //numb formatter
        Button expbtn16 = view.findViewById(R.id.explorebtn16);    //coll and gen
        Button expbtn17 = view.findViewById(R.id.explorebtn17);    //java deploy
        Button expbtn18 = view.findViewById(R.id.explorebtn18);    //applets
        Button expbtn19 = view.findViewById(R.id.explorebtn19);    //swings
        Button expbtn20 = view.findViewById(R.id.explorebtn20);    //nw jwa
        Button expbtn21 = view.findViewById(R.id.explorebtn21);    //jdbc
        Button expbtn22 = view.findViewById(R.id.explorebtn22);    //misc


        expbtn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    Intent t_intro = new Intent(getActivity(), Ch01TutorialIntroduction.class);
                    //tutorial.setClassName(in.compsgeek.javafy.MainActivity, in.compsgeek.javafy.tutorials.Ch01TutorialIntroduction);
                    startActivity(t_intro);
                    Toast.makeText(getActivity(), "Now viewing : Introduction", Toast.LENGTH_LONG).show();
                }
            });


        expbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent t_operators = new Intent(getActivity(), Ch02TutorialOperators.class);
                //tutorial.setClassName(in.compsgeek.javafy.MainActivity, in.compsgeek.javafy.tutorials.Ch01TutorialIntroduction);
                startActivity(t_operators);
                Toast.makeText(getActivity(), "Now viewing : Operators", Toast.LENGTH_LONG).show();
            }
        });

        expbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent t_ctrlstmts = new Intent(getActivity(), Ch03TutorialCtrlStmts.class);
                //tutorial.setClassName(in.compsgeek.javafy.MainActivity, in.compsgeek.javafy.tutorials.Ch01TutorialIntroduction);
                startActivity(t_ctrlstmts);
                Toast.makeText(getActivity(), "Now viewing : Control Statements", Toast.LENGTH_LONG).show();
            }
        });
        expbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent t_classnobj = new Intent(getActivity(), Ch04TutorialClassesNObjects.class);
                //tutorial.setClassName(in.compsgeek.javafy.MainActivity, in.compsgeek.javafy.tutorials.Ch01TutorialIntroduction);
                startActivity(t_classnobj);
                Toast.makeText(getActivity(), "Now viewing : Classes & Objects", Toast.LENGTH_LONG).show();
            }
        });
        expbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent t_ioArrays = new Intent(getActivity(), Ch05TutorialIoArrays.class);
                //tutorial.setClassName(in.compsgeek.javafy.MainActivity, in.compsgeek.javafy.tutorials.Ch01TutorialIntroduction);
                startActivity(t_ioArrays);
                Toast.makeText(getActivity(), "Now viewing : Arrays", Toast.LENGTH_LONG).show();
            }
        });
        expbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent t_strings = new Intent(getActivity(), Ch06TutorialStrings.class);
                //tutorial.setClassName(in.compsgeek.javafy.MainActivity, in.compsgeek.javafy.tutorials.Ch01TutorialIntroduction);
                startActivity(t_strings);
                Toast.makeText(getActivity(), "Now viewing : Strings", Toast.LENGTH_LONG).show();
            }
        });
        expbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent t_inheritance = new Intent(getActivity(), Ch07TutorialInheritance.class);
                //tutorial.setClassName(in.compsgeek.javafy.MainActivity, in.compsgeek.javafy.tutorials.Ch01TutorialIntroduction);
                startActivity(t_inheritance);
                Toast.makeText(getActivity(), "Now viewing : Inheritance", Toast.LENGTH_LONG).show();
            }
        });
        expbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent t_interface = new Intent(getActivity(), Ch08TutorialInterface.class);
                //tutorial.setClassName(in.compsgeek.javafy.MainActivity, in.compsgeek.javafy.tutorials.Ch01TutorialIntroduction);
                startActivity(t_interface);
                Toast.makeText(getActivity(), "Now viewing : Abstract class and Interface", Toast.LENGTH_LONG).show();
            }
        });
        expbtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent t_javapackage = new Intent(getActivity(), Ch09TutorialJavaPackages.class);
                //tutorial.setClassName(in.compsgeek.javafy.MainActivity, in.compsgeek.javafy.tutorials.Ch01TutorialIntroduction);
                startActivity(t_javapackage);
                Toast.makeText(getActivity(), "Now viewing : Packages and JARs", Toast.LENGTH_LONG).show();
            }
        });
        expbtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent t_assertions = new Intent(getActivity(), Ch10TutorialAssertions.class);
                //tutorial.setClassName(in.compsgeek.javafy.MainActivity, in.compsgeek.javafy.tutorials.Ch01TutorialIntroduction);
                startActivity(t_assertions);
                Toast.makeText(getActivity(), "Now viewing : Assertions", Toast.LENGTH_LONG).show();
            }
        });
        expbtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent t_fundaclass = new Intent(getActivity(), Ch11TutorialFundamentalClasses.class);
                //tutorial.setClassName(in.compsgeek.javafy.MainActivity, in.compsgeek.javafy.tutorials.Ch01TutorialIntroduction);
                startActivity(t_fundaclass);
                Toast.makeText(getActivity(), "Now viewing : Fundamental Classes", Toast.LENGTH_LONG).show();
            }
        });
        expbtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent t_advjavaclass = new Intent(getActivity(), Ch12Tutorial_AdvJavaClasses.class);
                //tutorial.setClassName(in.compsgeek.javafy.MainActivity, in.compsgeek.javafy.tutorials.Ch01TutorialIntroduction);
                startActivity(t_advjavaclass);
                Toast.makeText(getActivity(), "Now viewing : Advanced Java Classes", Toast.LENGTH_LONG).show();
            }
        });
        expbtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent t_serializefile = new Intent(getActivity(), Ch13TutorialSerialFiles.class);
                //tutorial.setClassName(in.compsgeek.javafy.MainActivity, in.compsgeek.javafy.tutorials.Ch01TutorialIntroduction);
                startActivity(t_serializefile);
                Toast.makeText(getActivity(), "Now viewing : Serialization & Files", Toast.LENGTH_LONG).show();
            }
        });
        expbtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent t_threads = new Intent(getActivity(), Ch14TutorialThreads.class);
                //tutorial.setClassName(in.compsgeek.javafy.MainActivity, in.compsgeek.javafy.tutorials.Ch01TutorialIntroduction);
                startActivity(t_threads);
                Toast.makeText(getActivity(), "Now viewing : Threads", Toast.LENGTH_LONG).show();
            }
        });
        expbtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent t_numformatter = new Intent(getActivity(), Ch15TutorialNumFormat.class);
                //tutorial.setClassName(in.compsgeek.javafy.MainActivity, in.compsgeek.javafy.tutorials.Ch01TutorialIntroduction);
                startActivity(t_numformatter);
                Toast.makeText(getActivity(), "Now viewing : Number Formatters", Toast.LENGTH_LONG).show();
            }
        });
        expbtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent t_collections = new Intent(getActivity(), Ch16TutorialCollections.class);
                //tutorial.setClassName(in.compsgeek.javafy.MainActivity, in.compsgeek.javafy.tutorials.Ch01TutorialIntroduction);
                startActivity(t_collections);
                Toast.makeText(getActivity(), "Now viewing : Collections and Generics", Toast.LENGTH_LONG).show();
            }
        });
        expbtn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent t_javadeploy = new Intent(getActivity(), Ch17TutorialJavaDeployment.class);
                //tutorial.setClassName(in.compsgeek.javafy.MainActivity, in.compsgeek.javafy.tutorials.Ch01TutorialIntroduction);
                startActivity(t_javadeploy);
                Toast.makeText(getActivity(), "Now viewing : Java Deployment", Toast.LENGTH_LONG).show();
            }
        });
        expbtn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent t_appletgui = new Intent(getActivity(), Ch18TutorialAppletGUI.class);
                //tutorial.setClassName(in.compsgeek.javafy.MainActivity, in.compsgeek.javafy.tutorials.Ch01TutorialIntroduction);
                startActivity(t_appletgui);
                Toast.makeText(getActivity(), "Now viewing : Applets", Toast.LENGTH_LONG).show();
            }
        });
        expbtn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent t_swings = new Intent(getActivity(), Ch19TutorialSwings.class);
                //tutorial.setClassName(in.compsgeek.javafy.MainActivity, in.compsgeek.javafy.tutorials.Ch01TutorialIntroduction);
                startActivity(t_swings);
                Toast.makeText(getActivity(), "Now viewing : Swings", Toast.LENGTH_LONG).show();
            }
        });
        expbtn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent t_network = new Intent(getActivity(), Ch20TutorialNetworking.class);
                //tutorial.setClassName(in.compsgeek.javafy.MainActivity, in.compsgeek.javafy.tutorials.Ch01TutorialIntroduction);
                startActivity(t_network);
                Toast.makeText(getActivity(), "Now viewing : Networking in java", Toast.LENGTH_LONG).show();
            }
        });
        expbtn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent t_jdbc = new Intent(getActivity(), Ch21TutorialJDBC.class);
                //tutorial.setClassName(in.compsgeek.javafy.MainActivity, in.compsgeek.javafy.tutorials.Ch01TutorialIntroduction);
                startActivity(t_jdbc);
                Toast.makeText(getActivity(), "Now viewing : JDBC", Toast.LENGTH_LONG).show();
            }
        });
        expbtn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent t_misc = new Intent(getActivity(), Ch22TutorialMiscellaneous.class);
                //tutorial.setClassName(in.compsgeek.javafy.MainActivity, in.compsgeek.javafy.tutorials.Ch01TutorialIntroduction);
                startActivity(t_misc);
                Toast.makeText(getActivity(), "Now viewing : Forum", Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }



    public class LoadData extends AsyncTask<ImageView,String,String> {

        @Override
        protected String doInBackground(ImageView... imageViews) {

            return null;
        }
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onClick(View view) {

    }




    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}

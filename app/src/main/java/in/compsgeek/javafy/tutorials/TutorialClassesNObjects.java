package in.compsgeek.javafy.tutorials;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import in.compsgeek.javafy.R;
import in.compsgeek.javafy.tutorials.classes.Ch4_10_finalarg;
import in.compsgeek.javafy.tutorials.classes.Ch4_11_varargs;
import in.compsgeek.javafy.tutorials.classes.Ch4_1_objnclasses;
import in.compsgeek.javafy.tutorials.classes.Ch4_2_programs;
import in.compsgeek.javafy.tutorials.classes.Ch4_3_accessspecifier;
import in.compsgeek.javafy.tutorials.classes.Ch4_4_variables;
import in.compsgeek.javafy.tutorials.classes.Ch4_5_mthdoverload;
import in.compsgeek.javafy.tutorials.classes.Ch4_6_recursion;
import in.compsgeek.javafy.tutorials.classes.Ch4_7_constructors;
import in.compsgeek.javafy.tutorials.classes.Ch4_8_static;
import in.compsgeek.javafy.tutorials.classes.Ch4_9_passvariable;
import in.compsgeek.javafy.tutorials.ctrlstmts.Ch3_1_if_else;
import in.compsgeek.javafy.tutorials.ctrlstmts.Ch3_2_while;
import in.compsgeek.javafy.tutorials.ctrlstmts.Ch3_3_dowhile;
import in.compsgeek.javafy.tutorials.ctrlstmts.Ch3_4_for;
import in.compsgeek.javafy.tutorials.ctrlstmts.Ch3_5_foreach;
import in.compsgeek.javafy.tutorials.ctrlstmts.Ch3_6_break;
import in.compsgeek.javafy.tutorials.ctrlstmts.Ch3_7_continue;
import in.compsgeek.javafy.tutorials.ctrlstmts.Ch3_8_return;

public class TutorialClassesNObjects extends AppCompatActivity implements
    Ch4_1_objnclasses.OnFragmentInteractionListener,
        Ch4_2_programs.OnFragmentInteractionListener,
        Ch4_3_accessspecifier.OnFragmentInteractionListener,
        Ch4_4_variables.OnFragmentInteractionListener,
        Ch4_5_mthdoverload.OnFragmentInteractionListener,
        Ch4_6_recursion.OnFragmentInteractionListener,
        Ch4_7_constructors.OnFragmentInteractionListener,
        Ch4_8_static.OnFragmentInteractionListener,
        Ch4_9_passvariable.OnFragmentInteractionListener,
        Ch4_10_finalarg.OnFragmentInteractionListener,
        Ch4_11_varargs.OnFragmentInteractionListener
    {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_classes_n_objects);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        tabLayout.setupWithViewPager(mViewPager);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
//        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
//        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tutorial_classes_n_objects, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

        @Override
        public void onFragmentInteraction(Uri uri) {

        }

        /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_tutorial_classes_n_objects, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            switch (position) {
                case 0:
                    return new Ch4_1_objnclasses();
                case 1:
                    return new Ch4_2_programs();
                case 2:
                    return new Ch4_3_accessspecifier();
                case 3:
                    return new Ch4_4_variables();
                case 4:
                    return new Ch4_5_mthdoverload();
                case 5:
                    return new Ch4_6_recursion();
                case 6:
                    return new Ch4_7_constructors();
                case 7:
                    return new Ch4_8_static();
                case 8:
                    return new Ch4_9_passvariable();
                case 9:
                    return new Ch4_10_finalarg();
                case 10:
                    return new Ch4_11_varargs();



                default:
                    // This should never happen. Always account for each position above
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 11;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Objects & Classes";
                case 1:
                    return "Programs";
                case 2:
                    return "Access Specifiers";
                case 3:
                    return "Variables";
                case 4:
                    return "Method Overloading";
                case 5:
                    return "Recursion";
                case 6:
                    return "Constructors";
                case 7:
                    return "Static Variables & Methods";
                case 8:
                    return "Passing Variables";
                case 9:
                    return "Final Arguments";
                case 10:
                    return "Variable Arguments";




            }
            return null;
        }
    }
}

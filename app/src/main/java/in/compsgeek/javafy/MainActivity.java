package in.compsgeek.javafy;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;
import java.util.List;

import in.compsgeek.javafy.tutorials.TutorialIntroduction;

public class MainActivity extends AppCompatActivity {

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
    //private TabLayout tabs;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

//        ImageView imageView = (ImageView) findViewById(R.id.ctrlstmt);
//
//        Glide.with(this).load("http://api.androidhive.info/images/glide/medium/deadpool.jpg")
//                .thumbnail(0.5f)
//                .crossFade()
//                .diskCacheStrategy(DiskCacheStrategy.ALL)
//                .into(imageView);

//        Button button = (Button) findViewById(R.id.button2);
//            button.setOnClickListener(new View.OnClickListener()
//            {
//                @Override
//                public void onClick(View v)
//                {
//                    // do something
//
//                    Intent i = new Intent(getApplicationContext(), TutorialIntroduction.class);
//                    //tutorial.setClassName(in.compsgeek.javafy.MainActivity, in.compsgeek.javafy.tutorials.TutorialIntroduction);
//                    startActivity(tutorial);
//
//                }
//            });

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
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
        public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            if (getArguments().getInt(ARG_SECTION_NUMBER) == 1) {
                rootView = inflater.inflate(R.layout.fragment_tutorials, container, false);

                return rootView;
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 2) {
                rootView = inflater.inflate(R.layout.fragment_programs, container, false);
                return rootView;
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 3) {
                rootView = inflater.inflate(R.layout.fragment_videos, container, false);
                return rootView;
            }else if (getArguments().getInt(ARG_SECTION_NUMBER) == 4) {
                rootView = inflater.inflate(R.layout.fragment_qna, container, false);
                return rootView;
            }else if (getArguments().getInt(ARG_SECTION_NUMBER) == 5) {
                rootView = inflater.inflate(R.layout.fragment_interviews, container, false);
                return rootView;
            }else if (getArguments().getInt(ARG_SECTION_NUMBER) == 6) {
                rootView = inflater.inflate(R.layout.fragment_misc, container, false);
                return rootView;
            }

//            Button button = (Button) rootView.findViewById(R.id.button2);
//            button.setOnClickListener(new View.OnClickListener()
//            {
//                @Override
//                public void onClick(View v)
//                {
//                    // do something
//
//                    Intent tutorial = new Intent(getActivity(), TutorialIntroduction.class);
//                    //tutorial.setClassName(in.compsgeek.javafy.MainActivity, in.compsgeek.javafy.tutorials.TutorialIntroduction);
//                    startActivity(tutorial);
//
//                }
//            });

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
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 6;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Java Tutorials";
                case 1:
                    return "Programs";
                case 2:
                    return "Videos";
                case 3:
                    return "Q&A";
                case 4:
                    return "Interviews";
                case 5:
                    return "Misc";
            }
            return null;
        }
    }
}

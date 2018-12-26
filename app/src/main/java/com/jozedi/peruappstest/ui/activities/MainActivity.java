package com.jozedi.peruappstest.ui.activities;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.jozedi.peruappstest.R;
import com.jozedi.peruappstest.callbacks.OnFragmentInteractionListener;
import com.jozedi.peruappstest.ui.activities.base.BaseActivity;
import com.jozedi.peruappstest.ui.fragments.ProductsFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements OnFragmentInteractionListener,
        BottomNavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.navigation)
    BottomNavigationView mBottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initEvents();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.nav_home:
                onAddFragmentToStack(null, ProductsFragment.newInstance(),
                        null, true, true, true,
                        ProductsFragment.TAG);
                break;
            case R.id.nav_cart:
                break;
            case R.id.nav_account:
                break;
        }
        return false;
    }

    @Override
    public void onAddFragmentToStack(@Nullable View view, @NonNull Fragment fragment,
                                     CharSequence title, boolean replaceFragment,
                                     boolean addToBackStack, boolean withAnimation,
                                     @Nullable String tag) {

    }

    @Override
    public void onRemoveFragmentToStack(@Nullable View view) {

    }

    private void initEvents() {
        mBottomNavigation.setOnNavigationItemSelectedListener(this);
    }
}

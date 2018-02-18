package com.alfianyusufabdullah.biodatanabi.ui;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alfianyusufabdullah.biodatanabi.R;
import com.alfianyusufabdullah.biodatanabi.datasources.Data;
import com.alfianyusufabdullah.biodatanabi.model.Nabi;
import com.alfianyusufabdullah.biodatanabi.utils.PreferencesApp;
import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetSequence;
import com.getkeepsafe.taptargetview.TapTargetView;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindViews({R.id.textHeaderName, R.id.textHeaderAliasName})
    List<TextView> headerText;

    @BindViews({R.id.textMainUsia, R.id.textMainPeriode})
    List<TextView> mainText;

    @BindViews({R.id.textOtherTempatDiutus, R.id.textOtherDisebutAlquran, R.id.textOtherJumlahKeturunan, R.id.textOtherSebutanKaum, R.id.textOthertempatWafat})
    List<TextView> otherText;

    @BindViews({R.id.rowLayoutJumlahKeturunan, R.id.rowLayoutSebutanKaum})
    List<LinearLayout> rowLayout;

    @BindView(R.id.mainDrawer)
    DrawerLayout mainDrawerLayout;

    @BindView(R.id.mainNavigationView)
    NavigationView mainNavigationView;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.mainCollapsingToolbar)
    CollapsingToolbarLayout mainCollapsingToolbar;

    @OnClick(R.id.buttonGarisKeturunan)
    public void garisKeturunan() {

        if (nabi.getGarisKeturunan().isEmpty()) {
            Snackbar.make(mainDrawerLayout, "Nabi " + nabi.getNama() + " Tidak Mempunyai garis Keturunan", Snackbar.LENGTH_SHORT).show();
        } else {
            GarisKeturunanDialog.newInstance(nabi).show(getSupportFragmentManager(), "KETURUNAN");
        }
    }

    Nabi nabi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        initView();

        if (PreferencesApp.isFirstLaunch()) {
            final TapTargetSequence sequence = new TapTargetSequence(this)
                    .targets(TapTarget.forView(findViewById(R.id.buttonGarisKeturunan),
                            "Garis Keturunan",
                            "Ketuk Untuk Melihat Garis Keturunan Nabi")
                            .tintTarget(true)
                            .cancelable(false)
                            .drawShadow(true)
                            .icon(getResources().getDrawable(R.drawable.ic_group_black_24dp)))
                    .listener(new TapTargetSequence.Listener() {
                        @Override
                        public void onSequenceFinish() {
                            PreferencesApp.hasFirstLaunch();
                        }

                        @Override
                        public void onSequenceStep(TapTarget lastTarget, boolean targetClicked) {

                        }

                        @Override
                        public void onSequenceCanceled(TapTarget lastTarget) {

                        }
                    });

            TapTargetView.showFor(this,
                    TapTarget.forToolbarNavigationIcon(toolbar,
                            "Daftar Nabi",
                            "Ketuk Untuk Melihat Daftar Nabi").tintTarget(true)
                            .cancelable(false)
                            .tintTarget(true)
                            .drawShadow(true)
                            .icon(getResources().getDrawable(R.drawable.ic_menu_black_24dp)), new TapTargetView.Listener() {
                        @Override
                        public void onTargetClick(TapTargetView view) {
                            super.onTargetClick(view);
                            sequence.start();
                        }
                    });
        }

        if (savedInstanceState != null) {
            Nabi outState = savedInstanceState.getParcelable("NABI");
            nabi = bindView(outState);
        } else {
            nabi = bindView(Data.getNabi(0));
        }

        toolbar.inflateMenu(R.menu.menu_main);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.menu_info){
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Disarikan dari");
                    builder.setMessage("Qashash al-Anbiya' Ibn Katsir, Badai' az-Zuhur Imam as-Suyuthi dan selainnya");
                    builder.setPositiveButton("OK" , null);
                    builder.create().show();
                }
                return true;
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putParcelable("NABI", nabi);
        super.onSaveInstanceState(outState);
    }

    private Nabi bindView(Nabi nabi) {
        mainCollapsingToolbar.setTitle(nabi.getNama());

        headerText.get(0).setText(nabi.getNama());
        headerText.get(1).setText(nabi.getAlias());

        int orientation = Resources.getSystem().getConfiguration().orientation;
        switch (orientation) {
            case Configuration.ORIENTATION_PORTRAIT:
                mainText.get(0).setText(nabi.getUsia());
                mainText.get(1).setText(nabi.getPeriode());
                break;
            case Configuration.ORIENTATION_LANDSCAPE:
                mainText.get(0).setText(String.format(getString(R.string.usia), nabi.getUsia()));
                mainText.get(1).setText(String.format(getString(R.string.periode), nabi.getPeriode()));
                break;
        }

        otherText.get(0).setText(nabi.getTempatDiUtus());
        otherText.get(1).setText(nabi.getDisebutDalamAlquran());
        otherText.get(4).setText(nabi.getTempatWafat());

        if (nabi.getJumlahKeturunan().isEmpty()) {
            rowLayout.get(0).setVisibility(View.GONE);
        } else {
            rowLayout.get(0).setVisibility(View.VISIBLE);
            otherText.get(2).setText(nabi.getJumlahKeturunan());
        }

        if (nabi.getSebutanKaum().isEmpty()) {
            rowLayout.get(1).setVisibility(View.GONE);
        } else {
            rowLayout.get(1).setVisibility(View.VISIBLE);
            otherText.get(3).setText(nabi.getSebutanKaum());
        }

        return nabi;
    }

    private void initView() {

        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, mainDrawerLayout, toolbar, R.string.app_name, R.string.app_name);
        mainDrawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();

        mainCollapsingToolbar.setExpandedTitleColor(Color.TRANSPARENT);

        mainNavigationView.getLayoutParams().width = Resources.getSystem().getDisplayMetrics().widthPixels / 2;
        mainNavigationView.requestLayout();
        mainNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                mainDrawerLayout.closeDrawers();

                int id = item.getItemId();
                switch (id) {
                    case R.id.menu_nabi_adam:
                        nabi = bindView(Data.getNabi(0));
                        return true;
                    case R.id.menu_nabi_idris:
                        nabi = bindView(Data.getNabi(1));
                        return true;
                    case R.id.menu_nabi_nuh:
                        nabi = bindView(Data.getNabi(2));
                        return true;
                    case R.id.menu_nabi_hud:
                        nabi = bindView(Data.getNabi(3));
                        return true;
                    case R.id.menu_nabi_shalih:
                        nabi = bindView(Data.getNabi(4));
                        return true;
                    case R.id.menu_nabi_ibrahim:
                        nabi = bindView(Data.getNabi(5));
                        return true;
                    case R.id.menu_nabi_luth:
                        nabi = bindView(Data.getNabi(6));
                        return true;
                    case R.id.menu_nabi_ismail:
                        nabi = bindView(Data.getNabi(7));
                        return true;
                    case R.id.menu_nabi_ishaq:
                        nabi = bindView(Data.getNabi(8));
                        return true;
                    case R.id.menu_nabi_yaqub:
                        nabi = bindView(Data.getNabi(9));
                        return true;
                    case R.id.menu_nabi_yusuf:
                        nabi = bindView(Data.getNabi(10));
                        return true;
                    case R.id.menu_nabi_ayyub:
                        nabi = bindView(Data.getNabi(11));
                        return true;
                    case R.id.menu_nabi_syuaib:
                        nabi = bindView(Data.getNabi(12));
                        return true;
                    case R.id.menu_nabi_musa:
                        nabi = bindView(Data.getNabi(13));
                        return true;
                    case R.id.menu_nabi_harun:
                        nabi = bindView(Data.getNabi(14));
                        return true;
                    case R.id.menu_nabi_dzulkifli:
                        nabi = bindView(Data.getNabi(15));
                        return true;
                    case R.id.menu_nabi_daud:
                        nabi = bindView(Data.getNabi(16));
                        return true;
                    case R.id.menu_nabi_sulaiman:
                        nabi = bindView(Data.getNabi(17));
                        return true;
                    case R.id.menu_nabi_ilyas:
                        nabi = bindView(Data.getNabi(18));
                        return true;
                    case R.id.menu_nabi_ilyasa:
                        nabi = bindView(Data.getNabi(19));
                        return true;
                    case R.id.menu_nabi_yunus:
                        nabi = bindView(Data.getNabi(20));
                        return true;
                    case R.id.menu_nabi_zakaria:
                        nabi = bindView(Data.getNabi(21));
                        return true;
                    case R.id.menu_nabi_yahya:
                        nabi = bindView(Data.getNabi(22));
                        return true;
                    case R.id.menu_nabi_isa:
                        nabi = bindView(Data.getNabi(23));
                        return true;
                    case R.id.menu_nabi_muhammad:
                        nabi = bindView(Data.getNabi(24));
                        return true;
                    default:
                        return false;
                }
            }
        });
    }
}

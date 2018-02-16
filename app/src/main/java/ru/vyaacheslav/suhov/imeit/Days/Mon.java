package ru.vyaacheslav.suhov.imeit.Days;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Calendar;

import ru.vyaacheslav.suhov.imeit.R;

public class Mon extends Fragment {

    public View v;
    LinearLayout m_l_4z, m_l_3z, m_l_2z, m_l_1z, m_l1, m_l2, m_l3, m_l4, m_l5, m_l_4c, m_l_3c, m_l_2c, m_l_1c, m_l_5c;
    LinearLayout mm1, mm2, mm3, mm4, mm5, main_mon, youday;
    private RelativeLayout mk;
    private TextView p1, m_p1_tz, m_p1_kz, p1a, m_p1_t, m_p1_k, p1z, p1az, p2, m_p2_tz, m_p2_kz, p2a, m_p2_t, m_p2_k, p2z, p2az,
            p3, m_p3_tz, m_p3_kz, p3a, m_p3_t, m_p3_k, p3z, p3az, p4, m_p4_tz, m_p4_kz, p4a, m_p4_t, m_p4_k, p4z, p4az,
            p5, m_p5_tz, m_p5_kz, p5a, m_p5_t, m_p5_k, p5az, p5z;

    public Mon() {    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.mon, container, false);
        InitViews();

        loadMethod();
        LoadPreferences();
     /*   MasterDepos();*/
     /* DeposElseAny();*/

        Danger();
        return v;
    }

    // Типа ООП, ну это херня

    public void Less1(String l, String p, String t, String r, String lz,
                      String pz, String tz, String rz, boolean i) {

        if (i) {
            m_l1.setVisibility(View.VISIBLE);
        } else {
            m_l1.setVisibility(View.GONE);
        }


        if (lz == null) {
            p1z.setVisibility(View.INVISIBLE);
        }
        if (pz == null) {
            p1az.setVisibility(View.INVISIBLE);
        }
        if (tz == null) {
            m_p1_tz.setVisibility(View.INVISIBLE);
        }
        if (rz == null) {
            m_p1_kz.setVisibility(View.INVISIBLE);
        }

        p1.setText(l);
        p1a.setText(p);
        m_p1_t.setText(t);
        m_p1_k.setText(r);
        p1z.setText(lz);
        p1az.setText(pz);
        m_p1_tz.setText(tz);
        m_p1_kz.setText(rz);
    }

    public void Less2(String l, String p, String t, String r, String lz,
                      String pz, String tz, String rz, boolean i) {


        if (i) {
            m_l2.setVisibility(View.VISIBLE);
        } else {
            m_l2.setVisibility(View.GONE);
        }


        if (lz == null) {
            p2z.setVisibility(View.INVISIBLE);
        }
        if (pz == null) {
            p2az.setVisibility(View.INVISIBLE);
        }
        if (tz == null) {
            m_p2_tz.setVisibility(View.INVISIBLE);
        }
        if (rz == null) {
            m_p2_kz.setVisibility(View.INVISIBLE);
        }

        if((lz==null)&&(pz==null)&&(tz==null)&&(rz==null)){
            m_l_2z.setVisibility(View.GONE);
        }

        p2.setText(l);
        p2a.setText(p);
        m_p2_t.setText(t);
        m_p2_k.setText(r);
        p2z.setText(lz);
        p2az.setText(pz);
        m_p2_tz.setText(tz);
        m_p2_kz.setText(rz);
    }

    public void Less3(String l, String p, String t, String r, String lz,
                      String pz, String tz, String rz, boolean i) {


        if (i) {
            m_l3.setVisibility(View.VISIBLE);
        } else {
            m_l3.setVisibility(View.GONE);
        }


        if (lz == null) {
            p3z.setVisibility(View.GONE);
        }
        if (pz == null) {
            p3az.setVisibility(View.GONE);
        }
        if (tz == null) {
            m_p3_tz.setVisibility(View.GONE);
        }
        if (rz == null) {
            m_p3_kz.setVisibility(View.GONE);
        }

        if((lz==null)&&(pz==null)&&(tz==null)&&(rz==null)){
            m_l_3z.setVisibility(View.GONE);
        }

        p3.setText(l);
        p3a.setText(p);
        m_p3_t.setText(t);
        m_p3_k.setText(r);
        p3z.setText(lz);
        p3az.setText(pz);
        m_p3_tz.setText(tz);
        m_p3_kz.setText(rz);
    }

    public void Less4(String l, String p, String t, String r, String lz,
                      String pz, String tz, String rz, boolean i) {


        if (i) {
            m_l4.setVisibility(View.VISIBLE);
        } else {
            m_l4.setVisibility(View.GONE);
        }


        if (lz == null) {
            p4z.setVisibility(View.INVISIBLE);
        }
        if (pz == null) {
            p4az.setVisibility(View.INVISIBLE);
        }
        if (tz == null) {
            m_p4_tz.setVisibility(View.INVISIBLE);
        }
        if (rz == null) {
            m_p4_kz.setVisibility(View.INVISIBLE);
        }

        p4.setText(l);
        p4a.setText(p);
        m_p4_t.setText(t);
        m_p4_k.setText(r);
        p4z.setText(lz);
        p4az.setText(pz);
        m_p4_tz.setText(tz);
        m_p4_kz.setText(rz);
    }

    public void Less5(String l, String p, String t, String r, boolean i) {

        if (i) {
            m_l5.setVisibility(View.VISIBLE);
        } else {
            m_l5.setVisibility(View.GONE);
        }

        p5.setText(l);
        p5a.setText(p);
        m_p5_t.setText(t);
        m_p5_k.setText(r);
    }

    // нужно оптимизировать эту херню.
    public void loadMethod() {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getActivity());
        String position = prefs.getString(getString(R.string.pref_style), "");

        switch (position) {
            case "ФМиИ-11":
                FMiI_11();
                break;
            case "ПМ-11":
                Pm_11();
                break;
            case "ИиВТ-12":
                IiVT_12();
                break;
            case "ИСиТ-11":
                ISiT_11();
                break;
            case "МИ-21":
                MI_21();
                break;
            case "МФ-21":
                MF_21();
                break;
            case "ПМ-21":
                PM_21();
                break;
            case "БИ-21":
                BI_21();
                break;
            case "ИиВТ-21":
                IiVT_21();
                break;
            case "ИСиТ-21":
                ISiT_21();
                break;
            case "НЭ-21":
                NE_21();
                break;
            case "БХ-21":
                BX_21();
                break;
            case "ЕГ-21":
                EG_21();
                break;
            case "МФ-31":
                MF_31();
                break;
            case "ПМ-31":
                PM_31();
                break;
            case "ИиВТ-31":
                IiVT_31();
                break;
            case "НЭ-31":
                NE_31();
                break;
            case "М-41":
                M_41();
                break;
            case "ФМ-41":
                YouDay();
                break;
            case "ПМ-41":
                PM_41();
                break;
            case "ИиВТ-41":
                IiVT_41();
                break;
            case "НЭ-41":
                YouDay();
                break;
            case "МиИТм-11":
                MIitM();
                break;
            case "ПМм-11":
                PMm_11();
                break;
            case "ИиВтМ-11":
                IIvtm_11();
                break;
            case "Мм-21":
                Mm_21();
                break;
            case "ПМм-21":
                Pmm_21();
                break;
            case "ИиВТм-21":
                IIvtm_21();
                break;
            case "ХБиГ-11":
                XBiG_11();
                break;
            case "ФС-11":
                FC_11();
                break;
            case "ФР-11":
                FR_11();
                break;
            case "ФР-12":
                FR_12();
                break;
            case "ФС-21":
                FC_21();
                break;
            case "ФР-21":
                FR_21();
                break;
            case "БХ-31":
                BX_31();
                break;
            case "МЕ-31":
                ME_31();
                break;
            case "ФС-31":
                FC_31();
                break;
            case "Р-31":
                FP_31();
                break;
            case "ФС-41":
                FC_41();
                break;
            case "ФР-41":
                FP_41();
                break;
            case "ФСм-11":
                FCm_11();
                break;
            case "ФСм-21":
                FCm_21();
                break;

            default:
                break;
        }
    }

    public void InitViews() {

        mk = v.findViewById(R.id.mk1);
        main_mon = v.findViewById(R.id.main_mon);
        youday = v.findViewById(R.id.you_day);

        m_l_1z = v.findViewById(R.id.m_l_1z);
        m_l_2z = v.findViewById(R.id.m_l_2z);
        m_l_3z = v.findViewById(R.id.m_l_3z);
        m_l_4z = v.findViewById(R.id.m_l_4z);

        m_l_1c = v.findViewById(R.id.m_l_1с);
        m_l_2c = v.findViewById(R.id.m_l_2с);
        m_l_3c = v.findViewById(R.id.m_l_3с);
        m_l_4c = v.findViewById(R.id.m_l_4с);
        m_l_5c = v.findViewById(R.id.m_l_5c);

        p1 = v.findViewById(R.id.m_p1);
        p1a = v.findViewById(R.id.m_p1_a);
        m_p1_t = v.findViewById(R.id.m_p1_t);
        m_p1_k = v.findViewById(R.id.m_p1_k);
        p1z = v.findViewById(R.id.m_p1z);
        p1az = v.findViewById(R.id.m_p1_az);
        m_p1_tz = v.findViewById(R.id.m_p1_tz);
        m_p1_kz = v.findViewById(R.id.m_p1_kz);

        p2 = v.findViewById(R.id.m_p2);
        p2a = v.findViewById(R.id.m_p2_a);
        m_p2_t = v.findViewById(R.id.m_p2_t);
        m_p2_k = v.findViewById(R.id.m_p2_k);
        p2z = v.findViewById(R.id.m_p2z);
        p2az = v.findViewById(R.id.m_p2_az);
        m_p2_tz = v.findViewById(R.id.m_p2_tz);
        m_p2_kz = v.findViewById(R.id.m_p2_kz);

        p3 = v.findViewById(R.id.m_p3);
        p3a = v.findViewById(R.id.m_p3_a);
        m_p3_t = v.findViewById(R.id.m_p3_t);
        m_p3_k = v.findViewById(R.id.m_p3_k);
        p3z = v.findViewById(R.id.m_p3z);
        p3az = v.findViewById(R.id.m_p3_az);
        m_p3_tz = v.findViewById(R.id.m_p3_tz);
        m_p3_kz = v.findViewById(R.id.m_p3_kz);

        p4 = v.findViewById(R.id.m_p4);
        p4a = v.findViewById(R.id.m_p4_a);
        m_p4_t = v.findViewById(R.id.m_p4_t);
        m_p4_k = v.findViewById(R.id.m_p4_k);
        p4z = v.findViewById(R.id.m_p4z);
        p4az = v.findViewById(R.id.m_p4_az);
        m_p4_tz = v.findViewById(R.id.m_p4_tz);
        m_p4_kz = v.findViewById(R.id.m_p4_kz);

        p5 = v.findViewById(R.id.m_p5);
        p5a = v.findViewById(R.id.m_p5a);
        m_p5_t = v.findViewById(R.id.m_p5_t);
        m_p5_k = v.findViewById(R.id.m_p5_k);
        p5z = v.findViewById(R.id.m_p5z);
        p5az = v.findViewById(R.id.m_p5_az);
        m_p5_tz = v.findViewById(R.id.m_p5_tz);
        m_p5_kz = v.findViewById(R.id.m_p5_kz);

        mm1 = v.findViewById(R.id.mm1);
        mm2 = v.findViewById(R.id.mm2);
        mm3 = v.findViewById(R.id.mm3);
        mm4 = v.findViewById(R.id.mm4);
        mm5 = v.findViewById(R.id.mm5);

        m_l1 = v.findViewById(R.id.m_l1);
        m_l2 = v.findViewById(R.id.m_l2);
        m_l3 = v.findViewById(R.id.m_l3);
        m_l4 = v.findViewById(R.id.m_l4);
        m_l5 = v.findViewById(R.id.m_l5);

    }

    // полное удаление строк.
    // полноценно работает только с отображение чс и зн
    // отложу реализацию на более поздний срок

/*    private void MasterDepos() {

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getContext());
        if (prefs.getBoolean(getString(R.string.depos), false)) {
            if ((p1.getText().length() == 0) && (p1z.getText().length() == 0))
                mm1.setVisibility(View.GONE);
            if ((p2.getText().length() == 0) && (p2z.getText().length() == 0))
                mm2.setVisibility(View.GONE);
            if ((p3.getText().length() == 0) && (p3z.getText().length() == 0))
                mm3.setVisibility(View.GONE);
            if ((p4.getText().length() == 0) && (p4z.getText().length() == 0))
                mm4.setVisibility(View.GONE);
            if ((p5.getText().length() == 0) && (p5z.getText().length() == 0))
                mm5.setVisibility(View.GONE);
        } else {
        }
    }

    private void DeposElseAny(){

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getContext());
        Calendar.getInstance().get(Calendar.WEEK_OF_YEAR);
        int weekYear = Calendar.getInstance().get(Calendar.WEEK_OF_YEAR);

        SharedPreferences prefss = PreferenceManager.getDefaultSharedPreferences(getContext());
        String position = prefss.getString(getString(R.string.week_i), "");

        if (prefs.getBoolean(getString(R.string.depos), false)) {
            switch (position) {
                case "Числитель": {
                    if ((weekYear % 2 == 0)) {
                        if ((p1z.getText().length() == 0))
                            mm1.setVisibility(View.GONE);
                        if ((p2z.getText().length() == 0))
                            mm2.setVisibility(View.GONE);
                        if ((p3z.getText().length() == 0))
                            mm3.setVisibility(View.GONE);
                        if ((p4z.getText().length() == 0))
                            mm4.setVisibility(View.GONE);
                        if ((p5z.getText().length() == 0))
                            mm5.setVisibility(View.GONE);
                    } else {
                        if ((p1.getText().length() == 0))
                            mm1.setVisibility(View.GONE);
                        if ((p2.getText().length() == 0))
                            mm2.setVisibility(View.GONE);
                        if ((p3.getText().length() == 0))
                            mm3.setVisibility(View.GONE);
                        if ((p4.getText().length() == 0))
                            mm4.setVisibility(View.GONE);
                        if ((p5.getText().length() == 0))
                            mm5.setVisibility(View.GONE);
                    }
                }
                break;
                case "Знаменатель": {
                    if ((weekYear % 2 == 0)) {
                        if ((p1z.getText().length() == 0))
                            mm1.setVisibility(View.GONE);
                        if ((p2z.getText().length() == 0))
                            mm2.setVisibility(View.GONE);
                        if ((p3z.getText().length() == 0))
                            mm3.setVisibility(View.GONE);
                        if ((p4z.getText().length() == 0))
                            mm4.setVisibility(View.GONE);
                        if ((p5z.getText().length() == 0))
                            mm5.setVisibility(View.GONE);
                    } else {
                        if ((p1z.getText().length() == 0))
                            mm1.setVisibility(View.GONE);
                        if ((p2z.getText().length() == 0))
                            mm2.setVisibility(View.GONE);
                        if ((p3z.getText().length() == 0))
                            mm3.setVisibility(View.GONE);
                        if ((p4z.getText().length() == 0))
                            mm4.setVisibility(View.GONE);
                        if ((p5z.getText().length() == 0))
                            mm5.setVisibility(View.GONE);

                    }
                }
                break;

                case "Авто": {
                    //числитель
                    if ((weekYear % 2 == 0)) {

                        if ((p1z.getText().length() == 0))
                            mm1.setVisibility(View.GONE);
                        if ((p2z.getText().length() == 0))
                            mm2.setVisibility(View.GONE);
                        if ((p3z.getText().length() == 0))
                            mm3.setVisibility(View.GONE);
                        if ((p4z.getText().length() == 0))
                            mm4.setVisibility(View.GONE);
                        if ((p5z.getText().length() == 0))
                            mm5.setVisibility(View.GONE);
                    } else {
                        if ((p1.getText().length() == 0))
                            mm1.setVisibility(View.GONE);
                        if ((p2.getText().length() == 0))
                            mm2.setVisibility(View.GONE);
                        if ((p3.getText().length() == 0))
                            mm3.setVisibility(View.GONE);
                        if ((p4.getText().length() == 0))
                            mm4.setVisibility(View.GONE);
                        if ((p5.getText().length() == 0))
                            mm5.setVisibility(View.GONE);
                    }

                }
                break;
                default:
                    break;
            }
        }
        else {}

    }*/


    // функция кастомизации 1 предмет в ячейке в завсисимости от дня недели
    // Сделано через жопу - переделать

    private void Danger() {

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getContext());

        if (prefs.getBoolean(getString(R.string.danger), false)) {
            Calendar.getInstance().get(Calendar.WEEK_OF_YEAR);
            int weekYear = Calendar.getInstance().get(Calendar.WEEK_OF_YEAR);

            SharedPreferences prefss = PreferenceManager.getDefaultSharedPreferences(getContext());
            String position = prefss.getString(getString(R.string.week_i), "");
            switch (position) {

                case "Числитель": {

                    if ((weekYear % 2 == 0)) {

                        Null_Mon_Z();
                        Null_Mon_Z_2();
                        Null_Mon_Z_3();
                        Null_Mon_Z_4();
                        Null_Mon_Z_5();
                                            }
                    // знаменатель
                    else {
                        Null_Mon_C();
                        Null_Mon_C_2();
                        Null_Mon_C_3();
                        Null_Mon_C_4();
                        Null_Mon_C_5();
                    }

                }
                break;

                case "Знаменатель": {
                    if ((weekYear % 2 == 0)) {
                        Null_Mon_C();
                        Null_Mon_C_2();
                        Null_Mon_C_3();
                        Null_Mon_C_4();
                        Null_Mon_C_5();
                    }
                    // знаменатель
                    else {
                        Null_Mon_Z();
                        Null_Mon_Z_2();
                        Null_Mon_Z_3();
                        Null_Mon_Z_4();
                        Null_Mon_Z_5();
                    }
                }
                break;

                case "Авто": {
                    //числитель
                    if ((weekYear % 2 == 0)) {
                        Null_Mon_C();
                        Null_Mon_C_2();
                        Null_Mon_C_3();
                        Null_Mon_C_4();
                        Null_Mon_C_5();
                    }
                    // знаменатель
                    else {
                        Null_Mon_Z();
                        Null_Mon_Z_2();
                        Null_Mon_Z_3();
                        Null_Mon_Z_4();
                        Null_Mon_Z_5();
                    }
                }
                break;
                default:
                    break;
            }

        }
    }

    // Дальше идет огроменный кусок говнеца который нужно оптимизировать и научить работать с БД
    // Научить работать с БД того кто писал этот ужас.

    // Первый курс
    public void FMiI_11() {
        Less1(getString(R.string.pedagogic), getString(R.string.zaharova), getString(R.string.lk),
                getString(R.string.uk4_28), null, null, null, null, true);
        Less2(getString(R.string.pedagogic), getString(R.string.zaharova), getString(R.string.pz),
                getString(R.string.uk4_28), null, null, null, null, false);

        Fizra_1kurs();
    }

    public void Pm_11() {
        Less1(getString(R.string.physics), getString(R.string.kondakova), getString(R.string.lk),
                getString(R.string.uk4_15), null, null, null, null, true);
        Less2(getString(R.string.physics), getString(R.string.kondakova), getString(R.string.pz),
                getString(R.string.uk4_15), getString(R.string.physics), getString(R.string.kondakova),
                getString(R.string.lb), getString(R.string.uk1_6), false);

        Fizra_1kurs();
    }

    public void IiVT_12() {

        Less1(getString(R.string.log_pro), getString(R.string.igonina), getString(R.string.lk),
                getString(R.string.uk1_2), getString(R.string.log_pro), getString(R.string.igonina), getString(R.string.lb),
                getString(R.string.uk1_2),true);
        Less2(getString(R.string.data_bases), getString(R.string.igonina), getString(R.string.lk),
                getString(R.string.uk1_2), getString(R.string.data_bases), getString(R.string.igonina),
                getString(R.string.lb), getString(R.string.uk1_2), false);

        Fizra_1kurs();

        Less4(getString(R.string.data_bases), getString(R.string.igonina), getString(R.string.pz),
                getString(R.string.uk1_2), getString(R.string.data_bases), getString(R.string.igonina),
                getString(R.string.pz), getString(R.string.uk1_2), false);

    }

    public void ISiT_11() {

        Less1(getString(R.string.physics), getString(R.string.kondakova), getString(R.string.lk),
                getString(R.string.uk4_15), null, null, null, null, true);
        Less2(getString(R.string.physics), getString(R.string.kondakova), getString(R.string.pz),
                getString(R.string.uk4_15), getString(R.string.physics), getString(R.string.kondakova),
                getString(R.string.lb), getString(R.string.uk1_6), false);

        Fizra_1kurs();
    }

    // Второй курс
    public void MI_21() {

        Less1(getString(R.string.pedagogic_his), getString(R.string.povalayeva), getString(R.string.lk), getString(R.string.uk4_24),
                getString(R.string.pedagogic_his), getString(R.string.povalayeva), getString(R.string.pz), getString(R.string.uk4_24), true);

        Fizra_2kurs();

        Less3(getString(R.string.geometry), getString(R.string.padaeva), getString(R.string.lk), getString(R.string.uk4_15),
                getString(R.string.geometry), getString(R.string.padaeva), getString(R.string.pz), getString(R.string.uk4_15), true);

        Less4(getString(R.string.el_mat_pr), getString(R.string.elchinova),  getString(R.string.lk), getString(R.string.uk4_15),
                getString(R.string.el_mat_pr), getString(R.string.elchinova),  getString(R.string.lk), getString(R.string.uk4_15), true);

    }

    public void MF_21() {

        Less1(getString(R.string.pedagogic_his), getString(R.string.povalayeva), getString(R.string.lk), getString(R.string.uk4_24),
                getString(R.string.pedagogic_his), getString(R.string.povalayeva), getString(R.string.pz), getString(R.string.uk4_24), true);

        Fizra_2kurs();

        Less3(getString(R.string.geometry), getString(R.string.padaeva), getString(R.string.lk), getString(R.string.uk4_15),
                getString(R.string.geometry), getString(R.string.padaeva), getString(R.string.pz), getString(R.string.uk4_15), true);

        Less4(getString(R.string.el_mat_pr), getString(R.string.elchinova),  getString(R.string.lk), getString(R.string.uk4_15),
                getString(R.string.el_mat_pr), getString(R.string.elchinova),  getString(R.string.lk), getString(R.string.uk4_15), true);
    }

    public void PM_21() {

        Less1(getString(R.string.mat_mod), getString(R.string.sidorov), getString(R.string.lk), getString(R.string.uk4_26),
                getString(R.string.mat_mod), getString(R.string.sidorov), getString(R.string.lk), getString(R.string.uk4_26), true);

        Fizra_2kurs();

        Less3(getString(R.string.dif_geometry), getString(R.string.padaeva), getString(R.string.lk), getString(R.string.uk4_15),
                getString(R.string.dif_geometry), getString(R.string.padaeva), getString(R.string.pz), getString(R.string.uk4_15), true);

        Less4(getString(R.string.sys_content), getString(R.string.kornienkod),  getString(R.string.pz), getString(R.string.uk3_16),
            null,null,null,null, false);
    }

    public void BI_21() {

        Less1(getString(R.string.razr_sys), getString(R.string.kornienkod), getString(R.string.lk), getString(R.string.uk3_16),
                getString(R.string.razr_sys), getString(R.string.kornienkod), getString(R.string.lb), getString(R.string.uk3_16), true);

        Fizra_2kurs();

        Less3(getResources().getString(R.string.za_ob_d), getResources().getString(R.string.rochupkin), getResources().getString(R.string.lk), getString(R.string.uk16_301a),
                getResources().getString(R.string.za_ob_d), getResources().getString(R.string.rochupkin), getResources().getString(R.string.lb), getString(R.string.uk16_301a), true);
    }

    public void IiVT_21() {

        Less1(null, null, null,null, getString(R.string.log_pro), getString(R.string.igonina), getString(R.string.lb),
                getString(R.string.uk1_2),true);
        Fizra_2kurs();

    }

    public void ISiT_21() {
        Less1(getString(R.string.tex_v_c), getString(R.string.rochupkin), getString(R.string.lk), getString(R.string.uk4_22),
                getString(R.string.tex_v_c), getString(R.string.rochupkin), getString(R.string.lk), getString(R.string.uk4_22), true);

        Fizra_2kurs();

        Less3(getResources().getString(R.string.za_ob_d), getResources().getString(R.string.rochupkin), getResources().getString(R.string.lk), getString(R.string.uk16_301a),
                getResources().getString(R.string.za_ob_d), getResources().getString(R.string.rochupkin), getResources().getString(R.string.lb), getString(R.string.uk16_301a), true);

        Less4(null, null, null, null, getString(R.string.com_tip), getString(R.string.gladkih), getString(R.string.pz), getString(R.string.uk4_21), true);

    }

    public void NE_21() {

        Fizra_2kurs();
        Less3(getResources().getString(R.string.phyz_cond), getResources().getString(R.string.kuznecov), getResources().getString(R.string.lk), getString(R.string.uk4_23),
                getResources().getString(R.string.phyz_cond), getResources().getString(R.string.kuznecov), getResources().getString(R.string.pz), getString(R.string.uk4_23), true);

        Less4(getResources().getString(R.string.phyz_cond), getResources().getString(R.string.kuznecov), getResources().getString(R.string.lb), getString(R.string.uk4_23),
                null, null, null, null, true);

    }

    public void BX_21() {

        Less1(getString(R.string.pedagogic_his), getString(R.string.povalayeva), getString(R.string.lk), getString(R.string.uk4_24),
                getString(R.string.pedagogic_his), getString(R.string.povalayeva), getString(R.string.pz), getString(R.string.uk4_24), true);

        Fizra_2kurs();
    }

    public void EG_21() {

        Less1(getString(R.string.pedagogic_his), getString(R.string.povalayeva), getString(R.string.lk), getString(R.string.uk4_24),
                getString(R.string.pedagogic_his), getString(R.string.povalayeva), getString(R.string.pz), getString(R.string.uk4_24), true);

        Fizra_2kurs();

        Less4(getResources().getString(R.string.ob_soc_geogr), getResources().getString(R.string.melnikov), getResources().getString(R.string.lk), getString(R.string.uk4_26),
                null, null, null, null, true);
    }

    // 3 курс

    public void MF_31() {

        Fizra_3kurs();

        Less2(getString(R.string.vector_isch), getString(R.string.sidorov), getString(R.string.lk), getString(R.string.uk4_27),
                getString(R.string.el_mat_pr), getString(R.string.elchinova), getString(R.string.pz), getString(R.string.uk4_15), true);

        Less3(getString(R.string.vector_isch), getString(R.string.sidorov), getString(R.string.pz), getString(R.string.uk4_27),
                getString(R.string.schol_uche), getString(R.string.simonovskaya), getString(R.string.pz), getString(R.string.uk4_28), true);

        Less4(getString(R.string.vector_isch), getString(R.string.sidorov), getString(R.string.pz), getString(R.string.uk4_27),
                getString(R.string.vector_isch), getString(R.string.sidorov), getString(R.string.pz), getString(R.string.uk4_27), true);

    }

    public void PM_31() {

        Fizra_3kurs();

        Less2(getString(R.string.oper_ish), getString(R.string.rochupkin), getString(R.string.lk), getString(R.string.uk2_113),
                getString(R.string.oper_ish), getString(R.string.rochupkin), getString(R.string.pz), getString(R.string.uk4_22), true);

        Less3(getString(R.string.ur_mat_phy), getString(R.string.cherbatix), getString(R.string.lk), getString(R.string.uk4_13),
                null,null,null,null, true);
    }

    public void IiVT_31() {

        Fizra_3kurs();

        Less2(getString(R.string.pr_bd), getString(R.string.igonina), getString(R.string.lk), getString(R.string.uk1_2),
              null,null,null,null, false);

        Less3(getString(R.string.za_inf), getString(R.string.rochupkin), getString(R.string.lk), getString(R.string.uk16_301a),
                getString(R.string.za_inf), getString(R.string.rochupkin), getString(R.string.pz), getString(R.string.uk16_301a), true);
    }

    public void NE_31() {

        Fizra_3kurs();

        Less2(getString(R.string.pr_comp_base), getString(R.string.kuznecov), getString(R.string.lk), getString(R.string.uk4_24),
                getString(R.string.pr_comp_base), getString(R.string.kuznecov), getString(R.string.lk), getString(R.string.uk4_24), true);

        Less3(null,null,null,null,
                getString(R.string.phys_xim), getString(R.string.pahomova), getString(R.string.lk), getString(R.string.uk12_103), true);
        Less4(null,null,null,null,
                getString(R.string.phys_xim), getString(R.string.pahomova), getString(R.string.pz), getString(R.string.uk12_103), true);

    }

    // 4 курс
    public void M_41() {
        Less1(getString(R.string.schol_uche_ug), getString(R.string.rimanova), getString(R.string.pz), getString(R.string.uk4_13),
                getString(R.string.teo_vuzz), getString(R.string.elchinova), getString(R.string.pz), getString(R.string.uk4_15), true);

        Less2(getString(R.string.schol_uche_ug), getString(R.string.rimanova), getString(R.string.pz), getString(R.string.uk4_13),
                null,null,null,null, false);
    }

    public void PM_41() {
        Less1(getString(R.string.mat_met_ect), getString(R.string.gladkih), getString(R.string.lk), getString(R.string.uk4_21),
                getString(R.string.mat_met_ect), getString(R.string.gladkih), getString(R.string.lb), getString(R.string.uk4_21), true);

        Less2(getString(R.string.prog_1c), getString(R.string.kornienkod), getString(R.string.pz), getString(R.string.uk3_16),
                null,null,null,null, false);

        Less3(getString(R.string.ii), getString(R.string.kornienkod), getString(R.string.lk), getString(R.string.uk3_16),
                getString(R.string.ii), getString(R.string.kornienkod), getString(R.string.lk), getString(R.string.uk3_16), true);
    }

    public void IiVT_41() {
        Less1(getString(R.string.mat_mod_eco), getString(R.string.gladkih), getString(R.string.lk), getString(R.string.uk4_21),
               null,null,null,null, false);

        Less2(getString(R.string.pr_asoi), getString(R.string.gladkih), getString(R.string.lk), getString(R.string.uk4_21),
                null,null,null,null, false);

        Less3(getString(R.string.seti_tv), getString(R.string.igonina), getString(R.string.lk), getString(R.string.uk4_22),
                getString(R.string.seti_tv), getString(R.string.igonina), getString(R.string.pz), getString(R.string.uk4_22), true);
        Less4(getString(R.string.admins), getString(R.string.rochupkin), getString(R.string.lk), getString(R.string.uk16_301a),
                null,null,null,null, false);
        Less5(getString(R.string.admins), getString(R.string.rochupkin), getString(R.string.lk), getString(R.string.uk16_301a),false);
    }



    public void MIitM() {
    }

    public void PMm_11() {

    }

    public void IIvtm_11() {
    }

    public void Mm_21() {
    }

    public void Pmm_21() {

    }

    public void IIvtm_21() {


    }

    //Пустой знаменатель
    public void Null_Mon_Z() {
        p1z.setVisibility(View.GONE);
        p1az.setVisibility(View.GONE);
        m_p1_tz.setVisibility(View.GONE);
        m_p1_kz.setVisibility(View.GONE);
        m_l_1c.setVisibility(View.GONE);
    }

    public void Null_Mon_Z_2() {
        p2z.setVisibility(View.GONE);
        p2az.setVisibility(View.GONE);
        m_p2_tz.setVisibility(View.GONE);
        m_p2_kz.setVisibility(View.GONE);
        m_l_2c.setVisibility(View.GONE);
    }

    public void Null_Mon_Z_3() {
        p3z.setVisibility(View.GONE);
        p3az.setVisibility(View.GONE);
        m_p3_tz.setVisibility(View.GONE);
        m_p3_kz.setVisibility(View.GONE);
        m_l_3c.setVisibility(View.GONE);

    }

    public void Null_Mon_Z_4() {
        p4z.setVisibility(View.GONE);
        p4az.setVisibility(View.GONE);
        m_p4_tz.setVisibility(View.GONE);
        m_p4_kz.setVisibility(View.GONE);
        m_l_4c.setVisibility(View.GONE);
    }

    public void Null_Mon_Z_5() {
        p5z.setVisibility(View.GONE);
        p5az.setVisibility(View.GONE);
        m_p5_tz.setVisibility(View.GONE);
        m_p5_kz.setVisibility(View.GONE);

        m_l_5c.setVisibility(View.GONE);

    }

    public void Null_Mon_C() {
        p1.setVisibility(View.GONE);
        p1a.setVisibility(View.GONE);
        m_p1_t.setVisibility(View.GONE);
        m_p1_k.setVisibility(View.GONE);

        m_l1.setVisibility(View.GONE);
    }

    public void Null_Mon_C_2() {
        p2.setVisibility(View.GONE);
        p2a.setVisibility(View.GONE);
        m_p2_t.setVisibility(View.GONE);
        m_p2_k.setVisibility(View.GONE);

        m_l2.setVisibility(View.GONE);

    }

    public void Null_Mon_C_3() {
        p3.setVisibility(View.GONE);
        p3a.setVisibility(View.GONE);
        m_p3_t.setVisibility(View.GONE);
        m_p3_k.setVisibility(View.GONE);

        m_l3.setVisibility(View.GONE);

    }

    public void Null_Mon_C_4() {
        p4.setVisibility(View.GONE);
        p4a.setVisibility(View.GONE);
        m_p4_t.setVisibility(View.GONE);
        m_p4_k.setVisibility(View.GONE);

        m_l4.setVisibility(View.GONE);
    }

    public void Null_Mon_C_5() {
        p5.setVisibility(View.GONE);
        p5a.setVisibility(View.GONE);
        m_p5_t.setVisibility(View.GONE);
        m_p5_k.setVisibility(View.GONE);

        m_l5.setVisibility(View.GONE);
    }


    //
    public void Fizra_1kurs() {

        Less3(getString(R.string.fkl), null, getString(R.string.pz), getString(R.string.fok), null, null, null, null, false);

    }

    public void Fizra_2kurs() {

        Less2(getString(R.string.fkl), null, getString(R.string.pz),
                getString(R.string.fok), null, null, null, null, false);


    }

    public void Fizra_3kurs() {

        Less1(getString(R.string.fkl), getString(R.string.fkl_inf), getString(R.string.pz),
                getString(R.string.fok), null, null, null, null, true);
    }


    // День для самостоятельной работы
    public void YouDay(){
        youday.setVisibility(View.VISIBLE);
        main_mon.setVisibility(View.GONE);
    }


    // Физико математический факультет

    public void XBiG_11() {


    }

    public void FC_11() {



    }

    public void FR_11() {



    }

    public void FR_12() {

    }

    public void FC_21() {


    }

    public void FR_21() {



    }

    public void BX_31() {


    }

    public void ME_31() {


    }

    public void FC_31() {


    }

    public void FP_31() {


    }

    public void FC_41() {


    }

    public void FP_41() {


    }

    public void FCm_11() {


    }

    public void FCm_21() {


    }

    // загрузка настроек кастыльный

    private void LoadPreferences() {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getActivity());
        String regular = prefs.getString(getString(R.string.pref_theme), "");

        switch (regular) {
            case "Светлая":
                ThemeWrite();
                break;
            case "Темная":
                ThemeDark();
                break;
        }
    }

    public void ThemeWrite() {

        ThemeDark();
/*
        mk.setBackgroundResource(R.color.colorWhitee);
        p1.setTextColor(getResources().getColor(R.color.colorTextBlack));
        m_p1_t.setTextColor(getResources().getColor(R.color.colorTextBlack));
        p1z.setTextColor(getResources().getColor(R.color.colorTextBlack));
        m_p1_tz.setTextColor(getResources().getColor(R.color.colorTextBlack));

        p2.setTextColor(getResources().getColor(R.color.colorTextBlack));
        m_p2_t.setTextColor(getResources().getColor(R.color.colorTextBlack));
        p2z.setTextColor(getResources().getColor(R.color.colorTextBlack));
        m_p2_tz.setTextColor(getResources().getColor(R.color.colorTextBlack));

        p3.setTextColor(getResources().getColor(R.color.colorTextBlack));
        m_p3_t.setTextColor(getResources().getColor(R.color.colorTextBlack));
        p3z.setTextColor(getResources().getColor(R.color.colorTextBlack));
        m_p3_tz.setTextColor(getResources().getColor(R.color.colorTextBlack));

        p4.setTextColor(getResources().getColor(R.color.colorTextBlack));
        m_p4_t.setTextColor(getResources().getColor(R.color.colorTextBlack));
        p4z.setTextColor(getResources().getColor(R.color.colorTextBlack));
        m_p4_tz.setTextColor(getResources().getColor(R.color.colorTextBlack));*/
    }

    public void ThemeDark() {

        mk.setBackgroundResource(R.color.colorT);
        p1.setTextColor(getResources().getColor(R.color.colorWhitee));
        m_p1_t.setTextColor(getResources().getColor(R.color.colorWhitee));
        p1z.setTextColor(getResources().getColor(R.color.colorWhitee));
        m_p1_tz.setTextColor(getResources().getColor(R.color.colorWhitee));

        p2.setTextColor(getResources().getColor(R.color.colorWhitee));
        m_p2_t.setTextColor(getResources().getColor(R.color.colorWhitee));
        p2z.setTextColor(getResources().getColor(R.color.colorWhitee));
        m_p2_tz.setTextColor(getResources().getColor(R.color.colorWhitee));

        p3.setTextColor(getResources().getColor(R.color.colorWhitee));
        m_p3_t.setTextColor(getResources().getColor(R.color.colorWhitee));
        p3z.setTextColor(getResources().getColor(R.color.colorWhitee));
        m_p3_tz.setTextColor(getResources().getColor(R.color.colorWhitee));

        p4.setTextColor(getResources().getColor(R.color.colorWhitee));
        m_p4_t.setTextColor(getResources().getColor(R.color.colorWhitee));
        p4z.setTextColor(getResources().getColor(R.color.colorWhitee));
        m_p4_tz.setTextColor(getResources().getColor(R.color.colorWhitee));

    }
}
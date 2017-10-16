package ru.vyaacheslav.suhov.imeit.Days;

import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import ru.vyaacheslav.suhov.imeit.R;



public class Tue extends Fragment {

    public LinearLayout m_l_4z, m_l_3z, m_l_2z, m_l_1z;
    public LinearLayout m_l1, m_l2, m_l3, m_l4, m_l5, l1, l2, l3, l4;
    public TextView p1, m_p1_tz, m_p1_kz, p1a, m_p1_t, m_p1_k, p1z, p1az, p2, m_p2_tz, m_p2_kz, p2a, m_p2_t, m_p2_k, p2z, p2az,
            p3, m_p3_tz, m_p3_kz, p3a, m_p3_t, m_p3_k, p3z, p3az, p4, m_p4_tz, m_p4_kz, p4a, m_p4_t, m_p4_k, p4z, p4az,
            p5, m_p5_tz, m_p5_kz, p5a, m_p5_t, m_p5_k, p5az, p5z, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10;

    RelativeLayout mk;
    SharedPreferences sp;

    public Tue() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tue, container, false);

        m_l_1z = v.findViewById(R.id.t_l_1z);
        m_l_2z = v.findViewById(R.id.t_l_2z);
        m_l_3z = v.findViewById(R.id.t_l_3z);
        m_l_4z = v.findViewById(R.id.t_l_4z);

        sp = PreferenceManager.getDefaultSharedPreferences(getActivity());

        mk = v.findViewById(R.id.ttr);
        s1 = v.findViewById(R.id.u1);
        s2 = v.findViewById(R.id.u2);
        s3 = v.findViewById(R.id.u3);
        s4 = v.findViewById(R.id.u4);
        s5 = v.findViewById(R.id.u5);
        s6 = v.findViewById(R.id.u6);
        s7 = v.findViewById(R.id.u7);
        s8 = v.findViewById(R.id.u8);
        s9 = v.findViewById(R.id.u9);
        s10 = v.findViewById(R.id.u10);

        l1 = v.findViewById(R.id.z1);
        l2 = v.findViewById(R.id.z2);
        l3 = v.findViewById(R.id.z3);
        l4 = v.findViewById(R.id.z4);

        m_l1 = v.findViewById(R.id.tu_l1);
        m_l2 = v.findViewById(R.id.tu_l2);
        m_l3 = v.findViewById(R.id.tu_l3);
        m_l4 = v.findViewById(R.id.tu_l4);
        m_l5 = v.findViewById(R.id.t_l5);

        p1 = v.findViewById(R.id.t1);
        p1a = v.findViewById(R.id.t_p1_a);
        m_p1_t = v.findViewById(R.id.t_p1_t);
        m_p1_k = v.findViewById(R.id.t_p1_k);
        p1z = v.findViewById(R.id.t_p1z);
        p1az = v.findViewById(R.id.t_p1_az);
        m_p1_tz = v.findViewById(R.id.t_p1_tz);
        m_p1_kz = v.findViewById(R.id.t_p1_kz);

        p2 = v.findViewById(R.id.t_p2);
        p2a = v.findViewById(R.id.t_p2_a);
        m_p2_t = v.findViewById(R.id.t_p2_t);
        m_p2_k = v.findViewById(R.id.t_p2_k);
        p2z = v.findViewById(R.id.t_p2z);
        p2az = v.findViewById(R.id.t_p2_az);
        m_p2_tz = v.findViewById(R.id.t_p2_tz);
        m_p2_kz = v.findViewById(R.id.t_p2_kz);
        m_l2.setVisibility(View.GONE);

        p3 = v.findViewById(R.id.t_p3);
        p3a = v.findViewById(R.id.t_p3_a);
        m_p3_t = v.findViewById(R.id.t_p3_t);
        m_p3_k = v.findViewById(R.id.t_p3_k);
        p3z = v.findViewById(R.id.t_p3z);
        p3az = v.findViewById(R.id.t_p3_az);
        m_p3_tz = v.findViewById(R.id.t_p3_tz);
        m_p3_kz = v.findViewById(R.id.t_p3_kz);

        p4 = v.findViewById(R.id.t_p4);
        p4a = v.findViewById(R.id.t_p4_a);
        m_p4_t = v.findViewById(R.id.t_p4_t);
        m_p4_k = v.findViewById(R.id.t_p4_k);
        p4z = v.findViewById(R.id.t_p4z);
        p4az = v.findViewById(R.id.t_p4_az);
        m_p4_tz = v.findViewById(R.id.t_p4_tz);
        m_p4_kz = v.findViewById(R.id.t_p4_kz);

        p5 = v.findViewById(R.id.t_p5);
        p5a = v.findViewById(R.id.t_p5a);
        m_p5_t = v.findViewById(R.id.t_p5_t);
        m_p5_k = v.findViewById(R.id.t_p5_k);
        p5z = v.findViewById(R.id.t_p5z);
        p5az = v.findViewById(R.id.t_p5_az);
        m_p5_tz = v.findViewById(R.id.t_p5_tz);
        m_p5_kz = v.findViewById(R.id.t_p5_kz);

        loadMethod();
        LoadPreferences();

        return v;
    }

    public void loadMethod() {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getActivity());
        String position = prefs.getString(getString(R.string.pref_style), "");
        layoutVisable();

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
                FM_41();
                break;
            case "ПМ-41":
                PM_41();
                break;
            case "ИиВТ-41":
                IiVT_41();
                break;
            case "НЭ-41":
                NE_41();
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

    public void layoutVisable() {
        m_l1.setVisibility(View.VISIBLE);
        m_l2.setVisibility(View.VISIBLE);
        m_l3.setVisibility(View.VISIBLE);
        m_l4.setVisibility(View.VISIBLE);
        m_l_1z.setVisibility(View.VISIBLE);
        m_l_2z.setVisibility(View.VISIBLE);
        m_l_3z.setVisibility(View.VISIBLE);
        m_l_4z.setVisibility(View.VISIBLE);

    }

    // Первый курс
    public void FMiI_11() {
        p1.setText(getResources().getString(R.string.algebra_a_teoc));
        p1a.setText(getResources().getString(R.string.belix));
        m_p1_t.setText(getResources().getString(R.string.lk));
        m_p1_k.setText(getResources().getString(R.string.uk4_13));
        p1z.setText(getResources().getString(R.string.algebra_a_teoc));
        p1az.setText(getResources().getString(R.string.belix));
        m_p1_tz.setText(getResources().getString(R.string.pz));
        m_p1_kz.setText(getResources().getString(R.string.uk4_13));

        p2.setText(getResources().getString(R.string.pcixol));
        p2a.setText(getResources().getString(R.string.budyakova));
        m_p2_t.setText(getResources().getString(R.string.pz));
        m_p2_k.setText(getResources().getString(R.string.uk1_22));
        p2z.setText(getResources().getString(R.string.pcixol));
        p2az.setText(getResources().getString(R.string.budyakova));
        m_p2_tz.setText(getResources().getString(R.string.lk));
        m_p2_kz.setText(getResources().getString(R.string.uk1_22));

        engL_3p();

        p4.setText(getResources().getString(R.string.bjd));
        p4a.setText(getResources().getString(R.string.sazanov));
        m_p4_t.setText(getResources().getString(R.string.lk));
        m_p4_k.setText(getResources().getString(R.string.uk1_22));
        p4z.setText(getResources().getString(R.string.bjd));
        p4az.setText(getResources().getString(R.string.sazanov));
        m_p4_tz.setText(getResources().getString(R.string.pz));
        m_p4_kz.setText(getResources().getString(R.string.uk1_22));


    }

    public void Pm_11() {

        engL_2p();


        p3.setText(getResources().getString(R.string.mat_zad));
        p3a.setText(getResources().getString(R.string.pomanova));
        m_p3_t.setText(getResources().getString(R.string.dv_pz));
        m_p3_k.setText(getResources().getString(R.string.uk4_22));
        m_l_3z.setVisibility(View.GONE); // знаменатель
        m_l3.setVisibility(View.GONE);  // Линия разделения

        p4.setText(getResources().getString(R.string.bjd));
        p4a.setText(getResources().getString(R.string.sazanov));
        m_p4_t.setText(getResources().getString(R.string.lk));
        m_p4_k.setText(getResources().getString(R.string.uk1_22));
        p4z.setText(getResources().getString(R.string.bjd));
        p4az.setText(getResources().getString(R.string.sazanov));
        m_p4_tz.setText(getResources().getString(R.string.pz));
        m_p4_kz.setText(getResources().getString(R.string.uk1_22));

    }

    public void IiVT_12() {

        p1.setText(getResources().getString(R.string.m_analiso));
        p1a.setText(getResources().getString(R.string.padaev));
        m_p1_t.setText(getResources().getString(R.string.lk));
        m_p1_k.setText(getResources().getString(R.string.uk4_26));
        m_l_1z.setVisibility(View.GONE); // знаменатель
        m_l1.setVisibility(View.GONE);  // Линия разделения
        engL_2p();


        p3.setText(getResources().getString(R.string.his_mat));
        p3a.setText(getResources().getString(R.string.savvina));
        m_p3_t.setText(getResources().getString(R.string.dv_pz));
        m_p3_k.setText(getResources().getString(R.string.uk4_15));
        m_l_3z.setVisibility(View.GONE); // знаменатель
        m_l3.setVisibility(View.GONE);  // Линия разделения



    }

    public void ISiT_11() {

        p1z.setText(getResources().getString(R.string.mat_pra));
        p1az.setText(getResources().getString(R.string.pomanova));
        m_p1_tz.setText(getResources().getString(R.string.dv_pz));
        m_p1_kz.setText(getResources().getString(R.string.uk4_22));

        engL_2p();

        p3.setText(getResources().getString(R.string.eco));
        p3a.setText(getResources().getString(R.string.melnikova));
        m_p3_t.setText(getResources().getString(R.string.lk));
        m_p3_k.setText(getResources().getString(R.string.uk4_26));
        p3z.setText(getResources().getString(R.string.eco));
        p3az.setText(getResources().getString(R.string.melnikova));
        m_p3_tz.setText(getResources().getString(R.string.pz));
        m_p3_kz.setText(getResources().getString(R.string.uk4_26));

        p4.setText(getResources().getString(R.string.bjd));
        p4a.setText(getResources().getString(R.string.sazanov));
        m_p4_t.setText(getResources().getString(R.string.lk));
        m_p4_k.setText(getResources().getString(R.string.uk1_22));
        p4z.setText(getResources().getString(R.string.bjd));
        p4az.setText(getResources().getString(R.string.sazanov));
        m_p4_tz.setText(getResources().getString(R.string.pz));
        m_p4_kz.setText(getResources().getString(R.string.uk1_22));

    }

    // Второй курс
    public void MI_21() {

        decL_1p();

        p2.setText(getResources().getString(R.string.eco_obr));
        p2a.setText(getResources().getString(R.string.nikitina));
        m_p2_t.setText(getResources().getString(R.string.lk));
        m_p2_k.setText(getResources().getString(R.string.uk4_24));
        p2z.setText(getResources().getString(R.string.eco_obr));
        p2az.setText(getResources().getString(R.string.nikitina));
        m_p2_tz.setText(getResources().getString(R.string.pz));
        m_p2_kz.setText(getResources().getString(R.string.uk4_24));


        p3z.setText(getResources().getString(R.string.algebra_a_teoc));
        p3az.setText(getResources().getString(R.string.prokuratova));
        m_p3_tz.setText(getResources().getString(R.string.lk));
        m_p3_kz.setText(getResources().getString(R.string.uk4_28));

    }

    public void MF_21() {

        decL_1p();


        p2.setText(getResources().getString(R.string.eco_obr));
        p2a.setText(getResources().getString(R.string.nikitina));
        m_p2_t.setText(getResources().getString(R.string.lk));
        m_p2_k.setText(getResources().getString(R.string.uk4_24));
        p2z.setText(getResources().getString(R.string.eco_obr));
        p2az.setText(getResources().getString(R.string.nikitina));
        m_p2_tz.setText(getResources().getString(R.string.pz));
        m_p2_kz.setText(getResources().getString(R.string.uk4_24));


        p3z.setText(getResources().getString(R.string.algebra_a_teoc));
        p3az.setText(getResources().getString(R.string.prokuratova));
        m_p3_tz.setText(getResources().getString(R.string.lk));
        m_p3_kz.setText(getResources().getString(R.string.uk4_28));


    }

    public void PM_21() {

        decL_1p();


        p2.setText(getResources().getString(R.string.dif_xz));
        p2a.setText(getResources().getString(R.string.eleckix));
        m_p2_t.setText(getResources().getString(R.string.lk));
        m_p2_k.setText(getResources().getString(R.string.uk1_9));
        p2z.setText(getResources().getString(R.string.dif_xz));
        p2a.setText(getResources().getString(R.string.eleckix));
        m_p2_t.setText(getResources().getString(R.string.pz));
        m_p2_k.setText(getResources().getString(R.string.uk1_9));

        p3.setText(getResources().getString(R.string.econ));
        p3a.setText(getResources().getString(R.string.nikitina));
        m_p3_t.setText(getResources().getString(R.string.lk));
        m_p3_k.setText(getResources().getString(R.string.uk4_24));
        p3z.setText(getResources().getString(R.string.econ));
        p3az.setText(getResources().getString(R.string.nikitina));
        m_p3_tz.setText(getResources().getString(R.string.pz));
        m_p3_kz.setText(getResources().getString(R.string.uk4_24));

        p4.setText(getResources().getString(R.string.po_prog));
        p4a.setText(getResources().getString(R.string.kornienko));
        m_p4_t.setText(getResources().getString(R.string.lk));
        m_p4_k.setText(getResources().getString(R.string.uk3_16));
        p4z.setText(getResources().getString(R.string.po_prog));
        p4az.setText(getResources().getString(R.string.kornienko));
        m_p4_tz.setText(getResources().getString(R.string.pz));
        m_p4_kz.setText(getResources().getString(R.string.uk3_16));


    }

    public void BI_21() {
        decL_1p();

        p2.setText(getResources().getString(R.string.iss_op));
        p2a.setText(getResources().getString(R.string.prokuratova));
        m_p2_t.setText(getResources().getString(R.string.lk));
        m_p2_k.setText(getResources().getString(R.string.uk4_27));
        p2z.setText(getResources().getString(R.string.iss_op));
        p2a.setText(getResources().getString(R.string.prokuratova));
        m_p2_t.setText(getResources().getString(R.string.pz));
        m_p2_k.setText(getResources().getString(R.string.uk4_27));

        p3.setText(getResources().getString(R.string.sociolog));
        p3a.setText(getResources().getString(R.string.korotkix));
        m_p3_t.setText(getResources().getString(R.string.lk));
        m_p3_k.setText(getResources().getString(R.string.uk1_8));
        p3z.setText(getResources().getString(R.string.sociolog));
        p3az.setText(getResources().getString(R.string.korotkix));
        m_p3_tz.setText(getResources().getString(R.string.pz));
        m_p3_kz.setText(getResources().getString(R.string.uk1_8));


    }

    public void IiVT_21() {

        decL_1p();


        p2.setText(getResources().getString(R.string.mat_chis_met));
        p2a.setText(getResources().getString(R.string.kornienko));
        m_p2_t.setText(getResources().getString(R.string.lk));
        m_p2_k.setText(getResources().getString(R.string.uk1_2));
        p2z.setText(getResources().getString(R.string.mat_chis_met));
        p2az.setText(getResources().getString(R.string.kornienko));
        m_p2_tz.setText(getResources().getString(R.string.pz));
        m_p2_kz.setText(getResources().getString(R.string.uk1_2));

        p3.setText(getResources().getString(R.string.econ));
        p3a.setText(getResources().getString(R.string.nikitina));
        m_p3_t.setText(getResources().getString(R.string.lk));
        m_p3_k.setText(getResources().getString(R.string.uk4_24));
        p3z.setText(getResources().getString(R.string.econ));
        p3az.setText(getResources().getString(R.string.nikitina));
        m_p3_tz.setText(getResources().getString(R.string.pz));
        m_p3_kz.setText(getResources().getString(R.string.uk4_24));


    }

    public void ISiT_21() {

        decL_1p();


        p2.setText(getResources().getString(R.string.mat_chis_met));
        p2a.setText(getResources().getString(R.string.kornienko));
        m_p2_t.setText(getResources().getString(R.string.lk));
        m_p2_k.setText(getResources().getString(R.string.uk1_2));
        p2z.setText(getResources().getString(R.string.mat_chis_met));
        p2az.setText(getResources().getString(R.string.kornienko));
        m_p2_tz.setText(getResources().getString(R.string.pz));
        m_p2_kz.setText(getResources().getString(R.string.uk1_2));

        p3.setText(getResources().getString(R.string.econ));
        p3a.setText(getResources().getString(R.string.nikitina));
        m_p3_t.setText(getResources().getString(R.string.lk));
        m_p3_k.setText(getResources().getString(R.string.uk4_24));
        p3z.setText(getResources().getString(R.string.econ));
        p3az.setText(getResources().getString(R.string.nikitina));
        m_p3_tz.setText(getResources().getString(R.string.pz));
        m_p3_kz.setText(getResources().getString(R.string.uk4_24));


    }

    public void NE_21() {

        decL_1p();


        p2.setText(getResources().getString(R.string.dif_ur));
        p2a.setText(getResources().getString(R.string.turtaeva));
        m_p2_t.setText(getResources().getString(R.string.lk));
        m_p2_k.setText(getResources().getString(R.string.gk208));
        p2z.setText(getResources().getString(R.string.dif_ur));
        p2a.setText(getResources().getString(R.string.turtaeva));
        m_p2_t.setText(getResources().getString(R.string.pz));
        m_p2_k.setText(getResources().getString(R.string.gk208));

        p3.setText(getResources().getString(R.string.physics));
        p3a.setText(getResources().getString(R.string.kondakova));
        m_p3_t.setText(getResources().getString(R.string.lk));
        m_p3_k.setText(getResources().getString(R.string.uk1_11));
        p3z.setText(getResources().getString(R.string.physics));
        p3az.setText(getResources().getString(R.string.kondakova));
        m_p3_tz.setText(getResources().getString(R.string.pz));
        m_p3_kz.setText(getResources().getString(R.string.uk1_11));

    }

    public void BX_21() {
        p1.setText(getResources().getString(R.string.inlangAaN));
        p1a.setText(getResources().getString(R.string.leb_sedova));
        m_p1_t.setText(getResources().getString(R.string.pz));
        m_p1_k.setText(getResources().getString(R.string.uk1_8_9));
        Null_Mon_Z();

        p2.setText(getResources().getString(R.string.eco_obr));
        p2a.setText(getResources().getString(R.string.nikitina));
        m_p2_t.setText(getResources().getString(R.string.lk));
        m_p2_k.setText(getResources().getString(R.string.uk4_24));
        p2z.setText(getResources().getString(R.string.eco_obr));
        p2az.setText(getResources().getString(R.string.nikitina));
        m_p2_tz.setText(getResources().getString(R.string.pz));
        m_p2_kz.setText(getResources().getString(R.string.uk4_24));

        p3.setText(getResources().getString(R.string.f_col_che));
        p3a.setText(getResources().getString(R.string.pahomova));
        m_p3_t.setText(getResources().getString(R.string.lk));
        m_p3_k.setText(getResources().getString(R.string.uk12_103));
        p3z.setText(getResources().getString(R.string.f_col_che));
        p3az.setText(getResources().getString(R.string.pahomova));
        m_p3_tz.setText(getResources().getString(R.string.lb));
        m_p3_kz.setText(getResources().getString(R.string.uk12_103));


    }

    public void EG_21() {
        p1.setText(getResources().getString(R.string.inlangAaN));
        p1a.setText(getResources().getString(R.string.leb_sedova));
        m_p1_t.setText(getResources().getString(R.string.pz));
        m_p1_k.setText(getResources().getString(R.string.uk1_8_9));
        Null_Mon_Z();


        p2.setText(getResources().getString(R.string.eco_obr));
        p2a.setText(getResources().getString(R.string.nikitina));
        m_p2_t.setText(getResources().getString(R.string.lk));
        m_p2_k.setText(getResources().getString(R.string.uk4_24));
        p2z.setText(getResources().getString(R.string.eco_obr));
        p2az.setText(getResources().getString(R.string.nikitina));
        m_p2_tz.setText(getResources().getString(R.string.pz));
        m_p2_kz.setText(getResources().getString(R.string.uk4_24));

        p3.setText(getResources().getString(R.string.mat_med_obr));
        p3a.setText(getResources().getString(R.string.safronova));
        m_p3_t.setText(getResources().getString(R.string.pz));
        m_p3_k.setText(getResources().getString(R.string.uk4_13));
        Null_Mon_Z_3();

    }

    public void MF_31() {

        p1.setText(getResources().getString(R.string.teo_inz_obr));
        p1a.setText(getResources().getString(R.string.samsonova));
        m_p1_t.setText(getResources().getString(R.string.lk));
        m_p1_k.setText(getResources().getString(R.string.uk4_27));
        p1z.setText(getResources().getString(R.string.teo_inz_obr));
        p1az.setText(getResources().getString(R.string.samsonova));
        m_p1_tz.setText(getResources().getString(R.string.pz));
        m_p1_kz.setText(getResources().getString(R.string.uk4_27));

        p2.setText(getResources().getString(R.string.vop_dif));
        p2a.setText(getResources().getString(R.string.melnikova));
        m_p2_t.setText(getResources().getString(R.string.dv_pz));
        m_p2_k.setText(getResources().getString(R.string.uk4_26));
        p2z.setText(getResources().getString(R.string.vop_dif));
        p2az.setText(getResources().getString(R.string.melnikova));
        m_p2_tz.setText(getResources().getString(R.string.dv_pz));
        m_p2_kz.setText(getResources().getString(R.string.uk4_26));

        p3.setText(getResources().getString(R.string.algebra_a_teoc));
        p3a.setText(getResources().getString(R.string.prokuratova));
        m_p3_t.setText(getResources().getString(R.string.lk));
        m_p3_k.setText(getResources().getString(R.string.uk4_28));


        p4.setText(getResources().getString(R.string.algebra_a_teoc));
        p4a.setText(getResources().getString(R.string.prokuratova));
        m_p4_t.setText(getResources().getString(R.string.lk));
        m_p4_k.setText(getResources().getString(R.string.uk4_28));


    }

    public void PM_31() {

        p1.setText(getResources().getString(R.string.fun_analis));
        p1a.setText(getResources().getString(R.string.kornienko));
        m_p1_t.setText(getResources().getString(R.string.lk));
        m_p1_k.setText(getResources().getString(R.string.uk1_2));
        Null_Mon_Z();

        p2.setText(getResources().getString(R.string.pro_tipograf));
        p2a.setText(getResources().getString(R.string.kornienko));
        m_p2_t.setText(getResources().getString(R.string.dv_pz));
        m_p2_k.setText(getResources().getString(R.string.uk3_16));
        Null_Mon_Z_2();

        p3.setText(getResources().getString(R.string.sociolog));
        p3a.setText(getResources().getString(R.string.korotkix));
        m_p3_t.setText(getResources().getString(R.string.lk));
        m_p3_k.setText(getResources().getString(R.string.uk1_8));
        p3z.setText(getResources().getString(R.string.sociolog));
        p3az.setText(getResources().getString(R.string.korotkix));
        m_p3_tz.setText(getResources().getString(R.string.pz));
        m_p3_kz.setText(getResources().getString(R.string.uk1_8));


    }

    public void IiVT_31() {

        p1.setText(getResources().getString(R.string.data_bases));
        p1a.setText(getResources().getString(R.string.pachin));
        m_p1_t.setText(getResources().getString(R.string.lk));
        m_p1_k.setText(getResources().getString(R.string.uk2_113));
        p1z.setText(getResources().getString(R.string.data_bases));
        p1az.setText(getResources().getString(R.string.pachin));
        m_p1_tz.setText(getResources().getString(R.string.pz));
        m_p1_kz.setText(getResources().getString(R.string.uk2_113));


        p2z.setText(getResources().getString(R.string.data_bases));
        p2az.setText(getResources().getString(R.string.pachin));
        m_p2_tz.setText(getResources().getString(R.string.lb));
        m_p2_kz.setText(getResources().getString(R.string.uk2_113));


    }

    public void NE_31() {

        p1z.setText(getResources().getString(R.string.phy_osn_el));
        p1az.setText(getResources().getString(R.string.kuznecov));
        m_p1_tz.setText(getResources().getString(R.string.lb));
        m_p1_kz.setText(getResources().getString(R.string.uk1_8));

        p2.setText(getResources().getString(R.string.phy_osn_el));
        p2a.setText(getResources().getString(R.string.kuznecov));
        m_p2_t.setText(getResources().getString(R.string.lb));
        m_p2_k.setText(getResources().getString(R.string.uk1_8));
        p2z.setText(getResources().getString(R.string.phy_osn_el));
        p2az.setText(getResources().getString(R.string.kuznecov));
        m_p2_tz.setText(getResources().getString(R.string.lb));
        m_p2_kz.setText(getResources().getString(R.string.uk1_8));

        p3.setText(getResources().getString(R.string.shemotexnika));
        p3a.setText(getResources().getString(R.string.arnuatov));
        m_p3_t.setText(getResources().getString(R.string.lk));
        m_p3_k.setText(getResources().getString(R.string.uk14_203));
        p3z.setText(getResources().getString(R.string.shemotexnika));
        p3az.setText(getResources().getString(R.string.arnuatov));
        m_p3_tz.setText(getResources().getString(R.string.pz));
        m_p3_kz.setText(getResources().getString(R.string.uk14_203));

        p4z.setText(getResources().getString(R.string.shemotexnika));
        p4az.setText(getResources().getString(R.string.arnuatov));
        m_p4_tz.setText(getResources().getString(R.string.pz));
        m_p4_kz.setText(getResources().getString(R.string.uk14_203));

    }

    // 4 курс
    public void M_41() {

        p1.setText(getResources().getString(R.string.met_mat));
        p1a.setText(getResources().getString(R.string.pomanova));
        m_p1_t.setText(getResources().getString(R.string.lk));
        m_p1_k.setText(getResources().getString(R.string.uk4_22));

        p2.setText(getResources().getString(R.string.met_mat));
        p2a.setText(getResources().getString(R.string.pomanova));
        m_p2_t.setText(getResources().getString(R.string.lb));
        m_p2_k.setText(getResources().getString(R.string.uk4_22));
        p2z.setText(getResources().getString(R.string.met_mat));
        p2az.setText(getResources().getString(R.string.pomanova));
        m_p2_tz.setText(getResources().getString(R.string.pz));
        m_p2_kz.setText(getResources().getString(R.string.uk4_22));


    }

    public void FM_41() {

        p1.setText(getResources().getString(R.string.osn_teo_phy));
        p1a.setText(getResources().getString(R.string.kondakova));
        m_p1_t.setText(getResources().getString(R.string.lk));
        m_p1_k.setText(getResources().getString(R.string.uk1_11));
        Null_Mon_Z();

        p2.setText(getResources().getString(R.string.astrophysic));
        p2a.setText(getResources().getString(R.string.kondakova));
        m_p2_t.setText(getResources().getString(R.string.lk));
        m_p2_k.setText(getResources().getString(R.string.uk1_11));
        p2z.setText(getResources().getString(R.string.astrophysic));
        p2az.setText(getResources().getString(R.string.kondakova));
        m_p2_tz.setText(getResources().getString(R.string.pz));
        m_p2_kz.setText(getResources().getString(R.string.uk1_11));


    }

    public void PM_41() {

        p3.setText(getResources().getString(R.string.sys_po));
        p3a.setText(getResources().getString(R.string.tarov));
        m_p3_t.setText(getResources().getString(R.string.lk));
        m_p3_k.setText(getResources().getString(R.string.uk1_2));
        p3z.setText(getResources().getString(R.string.sys_po));
        p3az.setText(getResources().getString(R.string.tarov));
        m_p3_tz.setText(getResources().getString(R.string.lk));
        m_p3_kz.setText(getResources().getString(R.string.uk1_2));

        p4.setText(getResources().getString(R.string.sys_po));
        p4a.setText(getResources().getString(R.string.tarov));
        m_p4_t.setText(getResources().getString(R.string.lk));
        m_p4_k.setText(getResources().getString(R.string.uk1_2));
        p4z.setText(getResources().getString(R.string.ad_seit));
        p4az.setText(getResources().getString(R.string.tarov));
        m_p4_tz.setText(getResources().getString(R.string.lk));
        m_p4_kz.setText(getResources().getString(R.string.uk1_2));

    }

    public void IiVT_41() {

        p2.setText(getResources().getString(R.string.mat_mod_eco));
        p2a.setText(getResources().getString(R.string.gladkih));
        m_p2_t.setText(getResources().getString(R.string.dv_pz));
        m_p2_k.setText(getResources().getString(R.string.uk4_21));
        Null_Mon_Z_2();

        p3.setText(getResources().getString(R.string.seti_tv));
        p3a.setText(getResources().getString(R.string.pachin));
        m_p3_t.setText(getResources().getString(R.string.lk));
        m_p3_k.setText(getResources().getString(R.string.uk2_113));
        p3z.setText(getResources().getString(R.string.seti_tv));
        p3az.setText(getResources().getString(R.string.pachin));
        m_p3_tz.setText(getResources().getString(R.string.pz));
        m_p3_kz.setText(getResources().getString(R.string.uk2_113));

        p4.setText(getResources().getString(R.string.ad_os));
        p4a.setText(getResources().getString(R.string.pachin));
        m_p4_t.setText(getResources().getString(R.string.lk));
        m_p4_k.setText(getResources().getString(R.string.uk2_113));
        Null_Mon_Z_4();


    }

    public void NE_41() {

        p2z.setText(getResources().getString(R.string.astrophysic));
        p2az.setText(getResources().getString(R.string.kondakova));
        m_p2_tz.setText(getResources().getString(R.string.dv_pz));
        m_p2_kz.setText(getResources().getString(R.string.uk1_11));

        p3.setText(getResources().getString(R.string.galv_polpro));
        p3a.setText(getResources().getString(R.string.kuznecov));
        m_p3_t.setText(getResources().getString(R.string.dv_pz));
        m_p3_k.setText(getResources().getString(R.string.uk1_6));
        Null_Mon_Z_3();

        p4z.setText(getResources().getString(R.string.kvant_el));
        p4az.setText(getResources().getString(R.string.kuznecov));
        m_p4_tz.setText(getResources().getString(R.string.lk));
        m_p4_kz.setText(getResources().getString(R.string.uk1_9));


    }


    public void MIitM() {

        p2.setText(getResources().getString(R.string.str_log_mat));
        p2a.setText(getResources().getString(R.string.chernousova));
        m_p2_t.setText(getResources().getString(R.string.dv_pz));
        m_p2_k.setText(getResources().getString(R.string.uk4_23));
        p2z.setText(getResources().getString(R.string.prob_obr));
        p2az.setText(getResources().getString(R.string.cherbatix));
        m_p2_tz.setText(getResources().getString(R.string.lk));
        m_p2_kz.setText(getResources().getString(R.string.gk208));


        p3.setText(getResources().getString(R.string.acs_geo));
        p3a.setText(getResources().getString(R.string.padaeva));
        m_p3_t.setText(getResources().getString(R.string.dv_pz));
        m_p3_k.setText(getResources().getString(R.string.uk1_10));
        p3z.setText(getResources().getString(R.string.acs_geo));
        p3az.setText(getResources().getString(R.string.padaeva));
        m_p3_tz.setText(getResources().getString(R.string.dv_pz));
        m_p3_kz.setText(getResources().getString(R.string.uk1_10));

        p4.setText(getResources().getString(R.string.metdeo));
        p4a.setText(getResources().getString(R.string.cherbatix));
        m_p4_t.setText(getResources().getString(R.string.lk));
        m_p4_k.setText(getResources().getString(R.string.gk208));
        p4z.setText(getResources().getString(R.string.metdeo));
        p4az.setText(getResources().getString(R.string.cherbatix));
        m_p4_tz.setText(getResources().getString(R.string.pz));
        m_p5_kz.setText(getResources().getString(R.string.gk208));
    }

    public void PMm_11() {


        p1z.setText(getResources().getString(R.string.mat_an_kk));
        p1az.setText(getResources().getString(R.string.eleckix));
        m_p1_tz.setText(getResources().getString(R.string.dv_pz));
        m_p1_kz.setText(getResources().getString(R.string.uk1_10));

        p2z.setText(getResources().getString(R.string.nau_rab));
        p2az.setText(getResources().getString(R.string.padaeva));
        m_p2_tz.setText(getResources().getString(R.string.pz));
        m_p2_kz.setText(getResources().getString(R.string.uk1_10));

        p3.setText(getResources().getString(R.string.mat_an_kk));
        p3a.setText(getResources().getString(R.string.eleckix));
        m_p3_t.setText(getResources().getString(R.string.dv_pz));
        m_p3_k.setText(getResources().getString(R.string.uk1_9));


    }

    public void IIvtm_11() {

        p3.setText(getResources().getString(R.string.sov_prob_iivt));
        p3a.setText(getResources().getString(R.string.gladkih));
        m_p3_t.setText(getResources().getString(R.string.lk));
        m_p3_k.setText(getResources().getString(R.string.uk4_21));
        p3z.setText(getResources().getString(R.string.sov_prob_iivt));
        p3az.setText(getResources().getString(R.string.gladkih));
        m_p3_tz.setText(getResources().getString(R.string.pz));
        m_p3_kz.setText(getResources().getString(R.string.uk4_21));
    }

    public void Mm_21() {
        p2.setText(getResources().getString(R.string.mm_uch_mat_prob));
        p2a.setText(getResources().getString(R.string.cherbatix));
        m_p2_t.setText(getResources().getString(R.string.pz));
        m_p2_k.setText(getResources().getString(R.string.gk300));
        p2z.setText(getResources().getString(R.string.mm_uch_mat_prob));
        p2az.setText(getResources().getString(R.string.padaev));
        m_p2_tz.setText(getResources().getString(R.string.lb));
        m_p2_kz.setText(getResources().getString(R.string.gk300));


        p3.setText(getResources().getString(R.string.teo_ob_mat));
        p3a.setText(getResources().getString(R.string.chernousova));
        m_p3_t.setText(getResources().getString(R.string.pz));
        m_p3_k.setText(getResources().getString(R.string.uk4_23));
        Null_Mon_Z_3();

        p4.setText(getResources().getString(R.string.raz_vich));
        p4a.setText(getResources().getString(R.string.padaeva));
        m_p4_t.setText(getResources().getString(R.string.dv_pz));
        m_p4_k.setText(getResources().getString(R.string.uk1_10));
        Null_Mon_Z_4();

    }

    public void Pmm_21() {
        p1.setText(getResources().getString(R.string.yaz_zap));
        p1a.setText(getResources().getString(R.string.kornienkod));
        m_p1_t.setText(getResources().getString(R.string.dv_pz));
        m_p1_k.setText(getResources().getString(R.string.uk3_16));
        p1z.setText(getResources().getString(R.string.nepr_matmod));
        p1az.setText(getResources().getString(R.string.sidorov));
        m_p1_tz.setText(getResources().getString(R.string.lb));
        m_p1_kz.setText(getResources().getString(R.string.uk4_21));

        p1.setText(getResources().getString(R.string.diskret_matmod));
        p1a.setText(getResources().getString(R.string.masina));
        m_p1_t.setText(getResources().getString(R.string.lk));
        m_p1_k.setText(getResources().getString(R.string.uk4_21));
        p2z.setText(getResources().getString(R.string.nau_rab));
        p2az.setText(getResources().getString(R.string.padaev));
        m_p2_tz.setText(getResources().getString(R.string.pz));
        m_p2_kz.setText(getResources().getString(R.string.uk1_10));


        p3.setText(getResources().getString(R.string.yaz_zap));
        p3a.setText(getResources().getString(R.string.kornienkod));
        m_p3_t.setText(getResources().getString(R.string.dv_pz));
        m_p3_k.setText(getResources().getString(R.string.uk3_16));
        p3z.setText(getResources().getString(R.string.yaz_zap));
        p3az.setText(getResources().getString(R.string.kornienkod));
        m_p3_tz.setText(getResources().getString(R.string.lb));
        m_p3_kz.setText(getResources().getString(R.string.uk3_16));

        p4.setText(getResources().getString(R.string.nepr_matmod));
        p4a.setText(getResources().getString(R.string.sidorov));
        m_p4_t.setText(getResources().getString(R.string.lk));
        m_p4_k.setText(getResources().getString(R.string.uk15_305));
        p1z.setText(getResources().getString(R.string.nepr_matmod));
        p1az.setText(getResources().getString(R.string.sidorov));
        m_p1_tz.setText(getResources().getString(R.string.pz));
        m_p1_kz.setText(getResources().getString(R.string.uk15_305));
    }

    public void IIvtm_21() {

        p3.setText(getResources().getString(R.string.prish_neop));
        p3a.setText(getResources().getString(R.string.masina));
        m_p3_t.setText(getResources().getString(R.string.lb));
        m_p3_k.setText(getResources().getString(R.string.uk4_21));
        Null_Mon_Z_3();
        p4.setText(getResources().getString(R.string.el_kon_iivt));
        p4a.setText(getResources().getString(R.string.gladkih));
        m_p4_t.setText(getResources().getString(R.string.lk));
        m_p4_k.setText(getResources().getString(R.string.uk4_21));
        p4z.setText(getResources().getString(R.string.el_kon_iivt));
        p4az.setText(getResources().getString(R.string.gladkih));
        m_p4_tz.setText(getResources().getString(R.string.lk));
        m_p4_kz.setText(getResources().getString(R.string.uk4_21));

        p5.setText(getResources().getString(R.string.cif_obr_data));
        p5a.setText(getResources().getString(R.string.gladkih));
        m_p5_t.setText(getResources().getString(R.string.dv_pz));
        m_p5_k.setText(getResources().getString(R.string.uk4_21));
        p5z.setText(getResources().getString(R.string.cif_obr_data));
        p5az.setText(getResources().getString(R.string.gladkih));
        m_p5_tz.setText(getResources().getString(R.string.dv_pz));
        m_p5_kz.setText(getResources().getString(R.string.uk4_21));
    }

    //Пустой знаменатель
    public void Null_Mon_Z() {
        p1z.setVisibility(View.GONE);
        p1az.setVisibility(View.GONE);
        m_p1_tz.setVisibility(View.GONE);
        m_p1_kz.setVisibility(View.GONE);
        m_l1.setVisibility(View.GONE);
        m_l_1z.setVisibility(View.GONE);

    }

    public void Null_Mon_Z_2() {
        p2z.setVisibility(View.GONE);
        p2az.setVisibility(View.GONE);
        m_p2_tz.setVisibility(View.GONE);
        m_p2_kz.setVisibility(View.GONE);
        m_l2.setVisibility(View.GONE);
        m_l_2z.setVisibility(View.GONE);

    }

    public void Null_Mon_Z_3() {
        p3z.setVisibility(View.GONE);
        p3az.setVisibility(View.GONE);
        m_p3_tz.setVisibility(View.GONE);
        m_p3_kz.setVisibility(View.GONE);
        m_l3.setVisibility(View.GONE);
        m_l_3z.setVisibility(View.GONE);

    }

    public void Null_Mon_Z_4() {
        p4z.setVisibility(View.GONE);
        p4az.setVisibility(View.GONE);
        m_p4_tz.setVisibility(View.GONE);
        m_p4_kz.setVisibility(View.GONE);
        m_l4.setVisibility(View.GONE);
        m_l_4z.setVisibility(View.GONE);
    }

    public void decL_1p() {
        SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(getActivity());
        // читаем установленное значение из CheckBoxPreference
        if (prefs.getBoolean(getString(R.string.pref_chek2), false)) {
            p1.setText(getResources().getString(R.string.inlangN));
            p1a.setText(getResources().getString(R.string.sedova));
            m_p1_t.setText(getResources().getString(R.string.pz));
            m_p1_k.setText(getResources().getString(R.string.uk4_24));
            m_l_1z.setVisibility(View.GONE); // знаменатель
            m_l1.setVisibility(View.GONE);  // Линия разделения
            m_l1.setVisibility(View.VISIBLE);

        } else {

            m_l1.setVisibility(View.VISIBLE);
        }

    }

    public void engL_2p() {
        SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(getActivity());
        // читаем установленное значение из CheckBoxPreference
        if (prefs.getBoolean(getString(R.string.pref_chek1), false)) {

            p2.setText(getResources().getString(R.string.inlang));
            p2a.setText(getResources().getString(R.string.lebedeva));
            m_p2_t.setText(getResources().getString(R.string.pz));
            m_p2_k.setText(getResources().getString(R.string.uk4_24));
            m_l_2z.setVisibility(View.GONE); // знаменатель
            m_l2.setVisibility(View.GONE);  // Линия разделения

        } else {
            m_l2.setVisibility(View.VISIBLE);
        }

    }

    public void engL_3p() {

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getContext());
        if (prefs.getBoolean(getString(R.string.pref_chek1), false)) {
            p3.setText(getResources().getString(R.string.inlang));
            p3a.setText(getResources().getString(R.string.lebedeva));
            m_p3_t.setText(getResources().getString(R.string.pz));
            m_p3_k.setText(getResources().getString(R.string.uk4_24));
            m_l_3z.setVisibility(View.GONE); // знаменатель
            m_l3.setVisibility(View.GONE);  // Линия разделени.
        } else {
            m_l2.setVisibility(View.VISIBLE);
        }

    }


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
        m_p4_tz.setTextColor(getResources().getColor(R.color.colorTextBlack));

        s1.setTextColor(getResources().getColor(R.color.colorTextBlack));
        s2.setTextColor(getResources().getColor(R.color.colorTextBlack));
        s3.setTextColor(getResources().getColor(R.color.colorTextBlack));
        s4.setTextColor(getResources().getColor(R.color.colorTextBlack));
        s5.setTextColor(getResources().getColor(R.color.colorTextBlack));
        s6.setTextColor(getResources().getColor(R.color.colorTextBlack));
        s7.setTextColor(getResources().getColor(R.color.colorTextBlack));
        s8.setTextColor(getResources().getColor(R.color.colorTextBlack));
        s9.setTextColor(getResources().getColor(R.color.colorTextBlack));
        s10.setTextColor(getResources().getColor(R.color.colorTextBlack));

        l1.setBackgroundResource(R.color.colorNewstitle);
        l2.setBackgroundResource(R.color.colorNewstitle);
        l3.setBackgroundResource(R.color.colorNewstitle);
        l4.setBackgroundResource(R.color.colorNewstitle);

        m_l1.setBackgroundResource(R.color.colorNewstitle);
        m_l2.setBackgroundResource(R.color.colorNewstitle);
        m_l3.setBackgroundResource(R.color.colorNewstitle);
        m_l4.setBackgroundResource(R.color.colorNewstitle);
        m_l5.setBackgroundResource(R.color.colorNewstitle);


    }

    public void ThemeDark() {

        mk.setBackgroundResource(R.color.colorPrimaryF);
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

        s1.setTextColor(getResources().getColor(R.color.colorWhitee));
        s2.setTextColor(getResources().getColor(R.color.colorWhitee));
        s3.setTextColor(getResources().getColor(R.color.colorWhitee));
        s4.setTextColor(getResources().getColor(R.color.colorWhitee));
        s5.setTextColor(getResources().getColor(R.color.colorWhitee));
        s6.setTextColor(getResources().getColor(R.color.colorWhitee));
        s7.setTextColor(getResources().getColor(R.color.colorWhitee));
        s8.setTextColor(getResources().getColor(R.color.colorWhitee));
        s9.setTextColor(getResources().getColor(R.color.colorWhitee));
        s10.setTextColor(getResources().getColor(R.color.colorWhitee));

        m_l1.setBackgroundResource(R.drawable.side_nav_bar);
        m_l2.setBackgroundResource(R.drawable.side_nav_bar);
        m_l3.setBackgroundResource(R.drawable.side_nav_bar);
        m_l4.setBackgroundResource(R.drawable.side_nav_bar);
        m_l5.setBackgroundResource(R.drawable.side_nav_bar);


        l1.setBackgroundResource(R.color.colorSigma);
        l2.setBackgroundResource(R.color.colorSigma);
        l3.setBackgroundResource(R.color.colorSigma);
        l4.setBackgroundResource(R.color.colorSigma);

    }

    public void XBiG_11() {

        p1.setText(getResources().getString(R.string.el_vis_mat));
        p1a.setText(getResources().getString(R.string.safronova));
        m_p1_t.setText(getResources().getString(R.string.lk));
        m_p1_k.setText(getResources().getString(R.string.uk4_28));
        p1z.setText(getResources().getString(R.string.el_vis_mat));
        p1az.setText(getResources().getString(R.string.safronova));
        m_p1_tz.setText(getResources().getString(R.string.lk));
        m_p1_kz.setText(getResources().getString(R.string.uk4_28));

        p2.setText(getResources().getString(R.string.pcixol));
        p2a.setText(getResources().getString(R.string.budyakova));
        m_p2_t.setText(getResources().getString(R.string.pz));
        m_p2_k.setText(getResources().getString(R.string.uk2_110));
        p2z.setText(getResources().getString(R.string.pcixol));
        p2az.setText(getResources().getString(R.string.budyakova));
        m_p2_tz.setText(getResources().getString(R.string.lk));
        m_p2_kz.setText(getResources().getString(R.string.uk2_110));

        p3.setText(getResources().getString(R.string.history));
        p3a.setText(getResources().getString(R.string.nekrilova));
        m_p3_t.setText(getResources().getString(R.string.lk));
        m_p3_k.setText(getResources().getString(R.string.uk14_218));
        p3z.setText(getResources().getString(R.string.history));
        p3az.setText(getResources().getString(R.string.nekrilova));
        m_p3_tz.setText(getResources().getString(R.string.pz));
        m_p3_kz.setText(getResources().getString(R.string.uk14_218));

        p4.setText(getResources().getString(R.string.bjd));
        p4a.setText(getResources().getString(R.string.sazanov));
        m_p4_t.setText(getResources().getString(R.string.lk));
        m_p4_k.setText(getResources().getString(R.string.uk1_22));
        p4z.setText(getResources().getString(R.string.bjd));
        p4az.setText(getResources().getString(R.string.sazanov));
        m_p4_tz.setText(getResources().getString(R.string.pz));
        m_p4_kz.setText(getResources().getString(R.string.uk1_22));


    }

    public void FC_11() {


        p3.setText(getResources().getString(R.string.history));
        p3a.setText(getResources().getString(R.string.nekrilova));
        m_p3_t.setText(getResources().getString(R.string.lk));
        m_p3_k.setText(getResources().getString(R.string.uk14_218));
        p3z.setText(getResources().getString(R.string.history));
        p3az.setText(getResources().getString(R.string.nekrilova));
        m_p3_tz.setText(getResources().getString(R.string.pz));
        m_p3_kz.setText(getResources().getString(R.string.uk14_218));

        p4.setText(getResources().getString(R.string.bjd));
        p4a.setText(getResources().getString(R.string.sazanov));
        m_p4_t.setText(getResources().getString(R.string.lk));
        m_p4_k.setText(getResources().getString(R.string.uk1_22));
        p4z.setText(getResources().getString(R.string.bjd));
        p4az.setText(getResources().getString(R.string.sazanov));
        m_p4_tz.setText(getResources().getString(R.string.pz));
        m_p4_kz.setText(getResources().getString(R.string.uk1_22));


    }

    public void FR_11() {

        p2.setText(getResources().getString(R.string.vu_i_sys));
        p2a.setText(getResources().getString(R.string.pachin));
        m_p2_t.setText(getResources().getString(R.string.lk));
        m_p2_k.setText(getResources().getString(R.string.uk2_113));

        p3.setText(getResources().getString(R.string.history));
        p3a.setText(getResources().getString(R.string.nekrilova));
        m_p3_t.setText(getResources().getString(R.string.lk));
        m_p3_k.setText(getResources().getString(R.string.uk14_218));
        p3z.setText(getResources().getString(R.string.history));
        p3az.setText(getResources().getString(R.string.nekrilova));
        m_p3_tz.setText(getResources().getString(R.string.pz));
        m_p3_kz.setText(getResources().getString(R.string.uk14_218));

        p4.setText(getResources().getString(R.string.bjd));
        p4a.setText(getResources().getString(R.string.sazanov));
        m_p4_t.setText(getResources().getString(R.string.lk));
        m_p4_k.setText(getResources().getString(R.string.uk1_22));
        p4z.setText(getResources().getString(R.string.bjd));
        p4az.setText(getResources().getString(R.string.sazanov));
        m_p4_tz.setText(getResources().getString(R.string.pz));
        m_p4_kz.setText(getResources().getString(R.string.uk1_22));
    }

    public void FR_12() {

        p2.setText(getResources().getString(R.string.teo_osn_el));
        p2a.setText(getResources().getString(R.string.zaiceva));
        m_p2_t.setText(getResources().getString(R.string.lb));
        m_p2_k.setText(getResources().getString(R.string.uk14_211));

        p3.setText(getResources().getString(R.string.osn_phy_polpr));
        p3a.setText(getResources().getString(R.string.sidorov));
        m_p3_t.setText(getResources().getString(R.string.lk));
        m_p3_k.setText(getResources().getString(R.string.uk14_216));
        p3z.setText(getResources().getString(R.string.osn_phy_polpr));
        p3az.setText(getResources().getString(R.string.sidorov));
        m_p3_tz.setText(getResources().getString(R.string.pz));
        m_p3_kz.setText(getResources().getString(R.string.uk14_216));

    }

    public void FC_21() {

        p1.setText(getResources().getString(R.string.inlangAaN));
        p1a.setText(getResources().getString(R.string.leb_sedova));
        m_p1_t.setText(getResources().getString(R.string.pz));
        m_p1_k.setText(getResources().getString(R.string.uk1_8_9));
        Null_Mon_Z();

        p2.setText(getResources().getString(R.string.teo_osn_el));
        p2a.setText(getResources().getString(R.string.zaiceva));
        m_p2_t.setText(getResources().getString(R.string.lb));
        m_p2_k.setText(getResources().getString(R.string.uk14_211));
        p2z.setText(getResources().getString(R.string.pl_prib));
        p2az.setText(getResources().getString(R.string.zaicev));
        m_p2_tz.setText(getResources().getString(R.string.lk));
        m_p2_kz.setText(getResources().getString(R.string.uk14_216));

        p3.setText(getResources().getString(R.string.cob_sys));
        p3a.setText(getResources().getString(R.string.zaicev));
        m_p3_t.setText(getResources().getString(R.string.lk));
        m_p3_k.setText(getResources().getString(R.string.uk14_216));

        p3z.setText(getResources().getString(R.string.fc21_zam));
        p3az.setText(getResources().getString(R.string.fc21_zam2));


        p3az.setTextColor(getResources().getColor(R.color.colorTextBlack));

        p3az.setTextSize(12);
        p3az.setTypeface(Typeface.DEFAULT_BOLD);


    }

    public void FR_21() {

        p1.setText(getResources().getString(R.string.inlangAaN));
        p1a.setText(getResources().getString(R.string.leb_sedova));
        m_p1_t.setText(getResources().getString(R.string.pz));
        m_p1_k.setText(getResources().getString(R.string.uk1_8_9));
        Null_Mon_Z();

        p2.setText(getResources().getString(R.string.teo_osn_el));
        p2a.setText(getResources().getString(R.string.zaiceva));
        m_p2_t.setText(getResources().getString(R.string.lb));
        m_p2_k.setText(getResources().getString(R.string.uk14_211));
        p2z.setText(getResources().getString(R.string.pl_prib));
        p2az.setText(getResources().getString(R.string.zaicev));
        m_p2_tz.setText(getResources().getString(R.string.lk));
        m_p2_kz.setText(getResources().getString(R.string.uk14_216));

        p3.setText(getResources().getString(R.string.osn_phy_polpr));
        p3a.setText(getResources().getString(R.string.sidorov));
        m_p3_t.setText(getResources().getString(R.string.lk));
        m_p3_k.setText(getResources().getString(R.string.uk14_216));
        p3z.setText(getResources().getString(R.string.osn_phy_polpr));
        p3az.setText(getResources().getString(R.string.sidorov));
        m_p3_tz.setText(getResources().getString(R.string.lk));
        m_p3_kz.setText(getResources().getString(R.string.uk14_216));

        p4.setText(getResources().getString(R.string.fc21_zam));
        p4a.setText(getResources().getString(R.string.fc21_zam2));
        p4a.setTextSize(12);
        p4a.setTypeface(Typeface.DEFAULT_BOLD);
        p4a.setTextColor(getResources().getColor(R.color.colorTextBlack));

    }

    public void BX_31() {

        p1.setText(getResources().getString(R.string.teo_pr_incluziv));
        p1a.setText(getResources().getString(R.string.samsonova));
        m_p1_t.setText(getResources().getString(R.string.lk));
        m_p1_k.setText(getResources().getString(R.string.uk4_27));
        p1z.setText(getResources().getString(R.string.teo_pr_incluziv));
        p1az.setText(getResources().getString(R.string.samsonova));
        m_p1_tz.setText(getResources().getString(R.string.pz));
        m_p1_kz.setText(getResources().getString(R.string.uk4_27));

        p2.setText(getResources().getString(R.string.kvant_che));
        p2a.setText(getResources().getString(R.string.pahomova));
        m_p2_t.setText(getResources().getString(R.string.lk));
        m_p2_k.setText(getResources().getString(R.string.uk12_103));
        p2z.setText(getResources().getString(R.string.kvant_che));
        p2az.setText(getResources().getString(R.string.pahomova));
        m_p2_tz.setText(getResources().getString(R.string.lb));
        m_p2_kz.setText(getResources().getString(R.string.uk12_103));

        p3.setText(getResources().getString(R.string.met_ob_biolog));
        p3a.setText(getResources().getString(R.string.morgaceva));
        m_p3_t.setText(getResources().getString(R.string.lk));
        m_p3_k.setText(getResources().getString(R.string.uk12_220));
        p3z.setText(getResources().getString(R.string.met_ob_biolog));
        p3az.setText(getResources().getString(R.string.morgaceva));
        m_p3_tz.setText(getResources().getString(R.string.pz));
        m_p3_kz.setText(getResources().getString(R.string.uk12_220));

        p4z.setText(getResources().getString(R.string.chool_obr));
        p4az.setText(getResources().getString(R.string.morgaceva));
        m_p4_tz.setText(getResources().getString(R.string.pz));
        m_p4_kz.setText(getResources().getString(R.string.uk12_220));


    }

    public void ME_31() {

        p1.setText(getResources().getString(R.string.teo_pr_incluziv));
        p1a.setText(getResources().getString(R.string.samsonova));
        m_p1_t.setText(getResources().getString(R.string.lk));
        m_p1_k.setText(getResources().getString(R.string.uk4_27));
        p1z.setText(getResources().getString(R.string.teo_pr_incluziv));
        p1az.setText(getResources().getString(R.string.samsonova));
        m_p1_tz.setText(getResources().getString(R.string.pz));
        m_p1_kz.setText(getResources().getString(R.string.uk4_27));

        p2.setText(getResources().getString(R.string.new_ob_tex_ectect));
        p2a.setText(getResources().getString(R.string.morgaceva));
        m_p2_t.setText(getResources().getString(R.string.pz));
        m_p2_k.setText(getResources().getString(R.string.uk12_220));
        Null_Mon_Z_2();

        p3.setText(getResources().getString(R.string.mat_met_ect));
        p3a.setText(getResources().getString(R.string.safronova));
        m_p3_t.setText(getResources().getString(R.string.pz));
        m_p3_k.setText(getResources().getString(R.string.uk4_13));
        Null_Mon_Z_3();
    }

    public void FC_31() {

        p1.setText(getResources().getString(R.string.el_sx));
        p1a.setText(getResources().getString(R.string.arnuatov));
        m_p1_t.setText(getResources().getString(R.string.lk));
        m_p1_k.setText(getResources().getString(R.string.uk14_216));
        Null_Mon_Z();

        p2.setText(getResources().getString(R.string.el_sx));
        p2a.setText(getResources().getString(R.string.arnuatov));
        m_p2_t.setText(getResources().getString(R.string.pz));
        m_p2_k.setText(getResources().getString(R.string.uk14_216));
        Null_Mon_Z_2();

    }

    public void FP_31() {

        p1.setText(getResources().getString(R.string.el_sx));
        p1a.setText(getResources().getString(R.string.arnuatov));
        m_p1_t.setText(getResources().getString(R.string.lk));
        m_p1_k.setText(getResources().getString(R.string.uk14_216));
        Null_Mon_Z();

        p2.setText(getResources().getString(R.string.el_sx));
        p2a.setText(getResources().getString(R.string.arnuatov));
        m_p2_t.setText(getResources().getString(R.string.pz));
        m_p2_k.setText(getResources().getString(R.string.uk14_216));
        Null_Mon_Z_2();


        p3.setText(getResources().getString(R.string.term_peobr));
        p3a.setText(getResources().getString(R.string.zaicev));
        m_p3_t.setText(getResources().getString(R.string.lk));
        m_p3_k.setText(getResources().getString(R.string.uk14_207));
        p3z.setText(getResources().getString(R.string.term_peobr));
        p3az.setText(getResources().getString(R.string.zaicev));
        m_p3_tz.setText(getResources().getString(R.string.lk));
        m_p3_kz.setText(getResources().getString(R.string.uk14_207));

    }

    public void FC_41() {
    }

    public void FP_41() {

        p1z.setText(getResources().getString(R.string.rad_avtom));
        p1az.setText(getResources().getString(R.string.zaiceva));
        m_p1_tz.setText(getResources().getString(R.string.lk));
        m_p1_kz.setText(getResources().getString(R.string.uk14_206));

        p2z.setText(getResources().getString(R.string.rad_avtom));
        p2az.setText(getResources().getString(R.string.zaiceva));
        m_p2_tz.setText(getResources().getString(R.string.lk));
        m_p2_kz.setText(getResources().getString(R.string.uk14_206));

        p3.setText(getResources().getString(R.string.rad_ustr));
        p3a.setText(getResources().getString(R.string.zaiceva));
        m_p3_t.setText(getResources().getString(R.string.lb));
        m_p3_k.setText(getResources().getString(R.string.uk14_206));
        p3z.setText(getResources().getString(R.string.rad_avtom));
        p3az.setText(getResources().getString(R.string.zaiceva));
        m_p3_tz.setText(getResources().getString(R.string.lk));
        m_p3_kz.setText(getResources().getString(R.string.uk14_206));

        p4.setText(getResources().getString(R.string.rad_ustr));
        p4a.setText(getResources().getString(R.string.zaiceva));
        m_p4_t.setText(getResources().getString(R.string.lb));
        m_p4_k.setText(getResources().getString(R.string.uk14_206));
        p4z.setText(getResources().getString(R.string.rad_avtom));
        p4az.setText(getResources().getString(R.string.zaiceva));
        m_p4_tz.setText(getResources().getString(R.string.lb));
        m_p4_kz.setText(getResources().getString(R.string.uk14_206));

    }

    public void FCm_11() {

    }

    public void FCm_21() {
        p1.setText(getResources().getString(R.string.ser_opt_vol));
        p1a.setText(getResources().getString(R.string.pechkov));
        m_p1_t.setText(getResources().getString(R.string.lk));
        m_p1_k.setText(getResources().getString(R.string.uk14_205));
        p1z.setText(getResources().getString(R.string.ser_opt_vol));
        p1az.setText(getResources().getString(R.string.pechkov));
        m_p1_tz.setText(getResources().getString(R.string.lb));
        m_p1_kz.setText(getResources().getString(R.string.uk14_205));

        p2.setText(getResources().getString(R.string.sys_bez_serv));
        p2a.setText(getResources().getString(R.string.petrichenko));
        m_p2_t.setText(getResources().getString(R.string.lk));
        m_p2_k.setText(getResources().getString(R.string.uk14_218));
        p2z.setText(getResources().getString(R.string.sys_bez_serv));
        p2az.setText(getResources().getString(R.string.petrichenko));
        m_p2_tz.setText(getResources().getString(R.string.lk));
        m_p2_kz.setText(getResources().getString(R.string.uk14_218));

        p3.setText(getResources().getString(R.string.ser_opt_vol));
        p3a.setText(getResources().getString(R.string.pechkov));
        m_p3_t.setText(getResources().getString(R.string.pz));
        m_p3_k.setText(getResources().getString(R.string.uk14_205));
        Null_Mon_Z_3();


    }
}
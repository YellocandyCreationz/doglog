package team16.doglog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ShotsMedication extends AppCompatActivity {
    public EditText distemperMonthId;
    public EditText distemperDayId;
    public EditText distemperYearId;

    public EditText rabiesMonthId;
    public EditText rabiesDayId;
    public EditText rabiesYearId;

    public EditText parvoMonthId;
    public EditText parvoDayId;
    public EditText parvoYearId;

    public EditText hepatitisMonthId;
    public EditText hepatitisDayId;
    public EditText hepatitisYearId;

    public EditText otherShotsNameId;
    public EditText otherShotsMonthId;
    public EditText otherShotsDayId;
    public EditText otherShotsYearId;

    public EditText medicationId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shots_medication);
        Log.d(String.valueOf(this),"Oncreate");
        
        //add distemper shot date to shared preferences
        distemperMonthId =  (EditText) findViewById(R.id.distemper_shot_month);
        distemperDayId = (EditText)findViewById(R.id.distemper_shot_day);
        distemperYearId = (EditText)findViewById(R.id.distemper_shot_year);

        //add rabies shot date to shared preferences
        rabiesMonthId =  (EditText) findViewById(R.id.rabies_shot_month);
        rabiesDayId = (EditText)findViewById(R.id.rabies_shot_day);
        rabiesYearId = (EditText)findViewById(R.id.rabies_shot_year);

        //add parvo shot date to shared preferences
        parvoMonthId =  (EditText) findViewById(R.id.parvo_shot_month);
        parvoDayId = (EditText)findViewById(R.id.parvo_shot_day);
        parvoYearId= (EditText)findViewById(R.id.parvo_shot_year);

        //add hepatitis shot date to shared preferences
        hepatitisMonthId =  (EditText) findViewById(R.id.hepatitis_shot_month);
        hepatitisDayId = (EditText)findViewById(R.id.hepatitis_shot_day);
        hepatitisYearId= (EditText)findViewById(R.id.hepatitis_shot_year);

        //add other shot name and date to shared preferences
        otherShotsNameId = (EditText)findViewById(R.id.other_shot_name);
        otherShotsMonthId =  (EditText) findViewById(R.id.other_shot_month);
        otherShotsDayId = (EditText)findViewById(R.id.other_shot_day);
        otherShotsYearId = (EditText)findViewById(R.id.other_shot_year);

        //add medicine to shared preferences
        medicationId = (EditText)findViewById(R.id.medical_info);
    }
    
//    load function call it in oncreate after all findview by
//    public void loadShotsMedication(View view) {
//        // load from saved preferences
//        SharedPreferences sp = getSharedPreferences(
//                "ShotsMedication.txt", Context.MODE_PRIVATE);
//        SharedPreferences.Editor myEdit = sp.edit();
//
//        myEdit.putString("DISTEMPER_MONTH", distemperMonth));
//        myEdit.putString("DISTEMPER_DAY", distemperDay);
//        myEdit.putString("DISTEMPER_YEAR", distemperYear);
//
//        myEdit.putString("RABIES_MONTH", rabiesMonth);
//        myEdit.putString("RABIES_DAY", rabiesDay);
//        myEdit.putString("RABIES_YEAR", rabiesYear);
//
//        myEdit.putString("PARVO_MONTH", parvoMonth);
//        myEdit.putString("PARVO_DAY", parvoDay);
//        myEdit.putString("PARVO_YEAR", parvoYear);
//
//        myEdit.putString("HEPATITIS_MONTH", hepatitisMonth);
//        myEdit.putString("HEPATITIS_DAY", hepatitisDay);
//        myEdit.putString("HEPATITIS_YEAR", hepatitisYear);
//
//        myEdit.putString("OTHER_SHOTS_NAME", otherShotsName);
//        myEdit.putString("OTHER_SHOTS_MONTH", otherShotsMonth);
//        myEdit.putString("OTHER_SHOTS_DAY", otherShotsDay);
//        myEdit.putString("OTHER_SHOTS_YEAR", otherShotsYear);
//
//        myEdit.putString("MEDICATION", medication);
//    }




    public void saveShotsMedication(View view) {

        //pulling strings out of objects
        String distemperMonth =  distemperMonthId.getText().toString();
        String distemperDay = distemperDayId.getText().toString();
        String distemperYear = distemperYearId.getText().toString();

        String rabiesMonth = rabiesMonthId.getText().toString();
        String rabiesDay = rabiesDayId.getText().toString();
        String rabiesYear = rabiesYearId.getText().toString();

        String parvoMonth = parvoMonthId.getText().toString();
        String parvoDay = parvoDayId.getText().toString();
        String parvoYear = parvoYearId.getText().toString();

        String hepatitisMonth = hepatitisMonthId.getText().toString();
        String hepatitisDay = hepatitisDayId.getText().toString();
        String hepatitisYear = hepatitisYearId.getText().toString();

        String otherShotsName = otherShotsNameId.getText().toString();
        String otherShotsMonth = otherShotsMonthId.getText().toString();
        String otherShotsDay = otherShotsDayId.getText().toString();
        String otherShotsYear = otherShotsYearId.getText().toString();

        String medication = medicationId.getText().toString();


        SharedPreferences sharedPref = getSharedPreferences(
                "ShotsMedication.txt", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();

        editor.putString("DISTEMPER_MONTH", distemperMonth);
        editor.putString("DISTEMPER_DAY", distemperDay);
        editor.putString("DISTEMPER_YEAR", distemperYear);

        editor.putString("RABIES_MONTH", rabiesMonth);
        editor.putString("RABIES_DAY", rabiesDay);
        editor.putString("RABIES_YEAR", rabiesYear);

        editor.putString("PARVO_MONTH", parvoMonth);
        editor.putString("PARVO_DAY", parvoDay);
        editor.putString("PARVO_YEAR", parvoYear);

        editor.putString("HEPATITIS_MONTH", hepatitisMonth);
        editor.putString("HEPATITIS_DAY", hepatitisDay);
        editor.putString("HEPATITIS_YEAR", hepatitisYear);

        editor.putString("OTHER_SHOTS_NAME", otherShotsName);
        editor.putString("OTHER_SHOTS_MONTH", otherShotsMonth);
        editor.putString("OTHER_SHOTS_DAY", otherShotsDay);
        editor.putString("OTHER_SHOTS_YEAR", otherShotsYear);

        editor.putString("MEDICATION", medication);
        editor.apply();

        Toast.makeText(this, "Shots & medication saved", Toast.LENGTH_SHORT).show();
        Log.d(getClass().getName(),"Received Toast");
    }
}

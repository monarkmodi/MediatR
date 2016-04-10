package com.ljcapps.middleman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.firebase.client.Firebase;

public class EditProfileActivity extends AppCompatActivity {

    EditText firstName;
    EditText lastName;
    EditText ccNumber;
    EditText expDate;
    EditText cvv;
    EditText email;
    EditText cellPhone;
    Firebase ref;
    final static String KEY = "MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        Firebase.setAndroidContext(this);
        ref = new Firebase("https://meediatr.firebaseio.com/");
    }

    public void onClickSubmit(View view) {
        firstName = (EditText) findViewById(R.id.firstname);
        lastName = (EditText) findViewById(R.id.lastname);
        ccNumber = (EditText) findViewById(R.id.ccnumber);
        expDate = (EditText) findViewById(R.id.expnumber);
        cvv = (EditText) findViewById(R.id.cvv);
        email = (EditText) findViewById(R.id.email);
        cellPhone = (EditText) findViewById(R.id.phone);

        Firebase profileRef = ref.child("user");
        Profile newUser = new Profile(firstName.getText().toString(),
                lastName.getText().toString(),
                Integer.parseInt(ccNumber.getText().toString()),
                Integer.parseInt(expDate.getText().toString()),
                email.getText().toString(),
                Integer.parseInt(cvv.getText().toString()),
                Long.parseLong(cellPhone.getText().toString()));
        profileRef.setValue(newUser);

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(KEY, "Profile successfully updated!");
        startActivity(intent);
    }


}

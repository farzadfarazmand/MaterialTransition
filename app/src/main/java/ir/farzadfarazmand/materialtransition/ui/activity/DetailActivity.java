package ir.farzadfarazmand.materialtransition.ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import ir.farzadfarazmand.materialtransition.R;
import ir.farzadfarazmand.materialtransition.model.User;

/**
 * Created by Farzad Farazmand on 16,July,2017
 * farzad.farazmand@gmail.com
 */

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_CONTACT_KEY = "contact_key";

    private TextView txtName, txtPhone, txtEmail, txtCity;
    private ImageView avatar;
    private View background;

    private User user;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);
        getContactFromIntent();
        initView();

    }

    public void getContactFromIntent() {
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey(EXTRA_CONTACT_KEY))
            user = (User) extras.getSerializable(EXTRA_CONTACT_KEY);
    }

    private void initView() {
        txtName = (TextView) findViewById(R.id.detail_name);
        txtPhone = (TextView) findViewById(R.id.detail_phone);
        txtEmail = (TextView) findViewById(R.id.detail_email);
        txtCity = (TextView) findViewById(R.id.detail_city);
        background = findViewById(R.id.detail_color);
        avatar = (ImageView) findViewById(R.id.detail_avatar);

        if (user != null) {
            txtName.setText(user.getName());
            txtPhone.setText(user.getPhone());
            txtEmail.setText(user.getEmail());
            txtCity.setText(user.getCity());
            avatar.setImageResource(user.getImage());
            background.setBackgroundColor(Color.parseColor(user.getColor()));
        }
    }
}

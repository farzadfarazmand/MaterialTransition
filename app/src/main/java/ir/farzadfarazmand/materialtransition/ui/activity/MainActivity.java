package ir.farzadfarazmand.materialtransition.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import ir.farzadfarazmand.materialtransition.R;
import ir.farzadfarazmand.materialtransition.listener.ContactClickListener;
import ir.farzadfarazmand.materialtransition.model.Contact;
import ir.farzadfarazmand.materialtransition.ui.adapter.ContactListAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initContactListView();
    }

    private void initContactListView() {
        RecyclerView contactList = (RecyclerView) findViewById(R.id.contact_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        contactList.setLayoutManager(linearLayoutManager);
        contactList.setHasFixedSize(true);
        ContactListAdapter adapter = new ContactListAdapter(this, Contact.createContactList(), new ContactClickListener() {
            @Override
            public void onItemClicked(View view, Contact contact) {
                showDetailActivity(view, contact);
            }
        });
        contactList.setAdapter(adapter);
    }

    private void showDetailActivity(View view, Contact contact) {
        Intent showDetail = new Intent(this, DetailActivity.class);
        showDetail.putExtra(DetailActivity.EXTRA_CONTACT_KEY, contact);

        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                // the context of the activity
                MainActivity.this,

                // For each shared element, add to this method a new Pair item,
                // which contains the reference of the view we are transitioning *from*,
                // and the value of the transitionName attribute
                new Pair<View, String>(view.findViewById(R.id.contact_circle),
                        getString(R.string.transition_name_circle)),
                new Pair<View, String>(view.findViewById(R.id.contact_name),
                        getString(R.string.transition_name_name)),
                new Pair<View, String>(view.findViewById(R.id.contact_phone),
                        getString(R.string.transition_name_phone))
        );
        ActivityCompat.startActivity(MainActivity.this, showDetail, options.toBundle());

    }
}

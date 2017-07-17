package ir.farzadfarazmand.materialtransition.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ir.farzadfarazmand.materialtransition.R;
import ir.farzadfarazmand.materialtransition.listener.ContactClickListener;
import ir.farzadfarazmand.materialtransition.model.User;

/**
 * Created by Farzad Farazmand on 16,July,2017
 * farzad.farazmand@gmail.com
 */

public class ContactListAdapter extends RecyclerView.Adapter<ContactListAdapter.ContactListViewHolder> {

    private Context context;
    private LayoutInflater layoutInflater;
    private ContactClickListener itemClickListener;
    private List<User> userList = new ArrayList<>();

    public ContactListAdapter(Context context, List<User> userList, ContactClickListener itemClickListener) {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
        this.userList = userList;
        this.itemClickListener = itemClickListener;
    }

    @Override
    public ContactListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ContactListViewHolder(layoutInflater.inflate(R.layout.row_contact_list, parent, false));
    }

    @Override
    public void onBindViewHolder(final ContactListViewHolder holder, int position) {
        final User item = userList.get(position);

        holder.txtName.setText(item.getName());
        holder.txtPhone.setText(item.getPhone());
        holder.avatar.setImageResource(item.getImage());

        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (itemClickListener != null)
                    itemClickListener.onItemClicked(holder.itemView, item);
            }
        });
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ContactListViewHolder extends RecyclerView.ViewHolder {

        public RelativeLayout parent;
        public TextView txtName, txtPhone;
        public ImageView avatar;

        public ContactListViewHolder(View itemView) {
            super(itemView);

            parent = (RelativeLayout) itemView.findViewById(R.id.contact_parent);
            txtName = (TextView) itemView.findViewById(R.id.contact_name);
            txtPhone = (TextView) itemView.findViewById(R.id.contact_phone);
            avatar = (ImageView) itemView.findViewById(R.id.contact_avatar);
        }
    }

}
